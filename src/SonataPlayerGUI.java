import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;


public class SonataPlayerGUI extends JFrame {

    private MidiPlayer player;
    private JButton playButton;
    private JButton stopButton;
    private JLabel statusLabel;
    private Timer statusTimer;

    public SonataPlayerGUI() {
        super("Лунна соната – MIDI Плеър");
        player = new MidiPlayer();

        setupUI();
        loadScore();


        statusTimer = new Timer(500, e -> checkIfFinished());
        statusTimer.start();

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                player.close();
                statusTimer.stop();
                System.exit(0);
            }
        });
    }

    private void setupUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setBackground(new Color(30, 30, 40));


        JLabel title = new JLabel("<html><center>"
                + "<b style='font-size:15px; color:#C0C0C0;'>Лунна соната</b><br>"
                + "<span style='font-size:11px; color:#808080;'>Бетховен – Op. 27, No. 2</span>"
                + "</center></html>");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(title, BorderLayout.NORTH);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        buttons.setOpaque(false);

        playButton = new JButton("  Play");
        playButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        playButton.setForeground(Color.WHITE);
        playButton.setBackground(new Color(50, 120, 80));
        playButton.setPreferredSize(new Dimension(180, 45));
        playButton.setFocusPainted(false);

        stopButton = new JButton("  Stop");
        stopButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        stopButton.setForeground(Color.WHITE);
        stopButton.setBackground(new Color(150, 50, 50));
        stopButton.setPreferredSize(new Dimension(180, 45));
        stopButton.setFocusPainted(false);
        stopButton.setEnabled(false);

        playButton.addActionListener(e -> onPlay());
        stopButton.addActionListener(e -> onStop());

        buttons.add(playButton);
        buttons.add(stopButton);
        panel.add(buttons, BorderLayout.CENTER);

        statusLabel = new JLabel("Готово");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        statusLabel.setForeground(new Color(120, 180, 120));
        statusLabel.setFont(new Font("SansSerif", Font.ITALIC, 13));
        panel.add(statusLabel, BorderLayout.SOUTH);

        setContentPane(panel);
    }

    private void loadScore() {
        List<List<Note>> score = MoonlightSonata.getFullScore();
        player.createMultiTrackSequence(score);
        statusLabel.setText("Натиснете Play за възпроизвеждане.");
    }

    private void onPlay() {
        player.play();
        playButton.setEnabled(false);
        stopButton.setEnabled(true);
        statusLabel.setText("Възпроизвежда се...");
        statusLabel.setForeground(new Color(100, 200, 100));
    }

    private void onStop() {
        player.stop();
        playButton.setEnabled(true);
        stopButton.setEnabled(false);
        statusLabel.setText("Спряно.");
        statusLabel.setForeground(new Color(200, 200, 100));
    }

    private void checkIfFinished() {
        if (!player.isPlaying() && !playButton.isEnabled()) {
            playButton.setEnabled(true);
            stopButton.setEnabled(false);
            statusLabel.setText("Готово.");
            statusLabel.setForeground(new Color(120, 180, 120));
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) { }

        SwingUtilities.invokeLater(() -> {
            new SonataPlayerGUI().setVisible(true);
        });
    }
}
