import javax.swing.*;
import java.awt.*;

/**
 * Main application class for Smart Student Management System
 * Now simplified to remove database dependency.
 */
public class smart_student_management {

    public static void main(String[] args) {
        // Set look and feel to system default
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Show splash screen
        SplashScreen splashScreen = new SplashScreen();
        splashScreen.setVisible(true);

        // Timer to close splash screen after 2 seconds and open login form
        Timer timer = new Timer(2000, e -> {
            splashScreen.dispose();
            SwingUtilities.invokeLater(() -> {
                LoginForm loginForm = new LoginForm();
                loginForm.setVisible(true);
            });
        });
        timer.setRepeats(false); // Run timer only once
        timer.start();
    }

    /**
     * Splash Screen displayed when application starts
     */
    static class SplashScreen extends JWindow {

        public SplashScreen() {
            // Size and center the splash screen
            setSize(500, 300);
            setLocationRelativeTo(null);

            // Create panel with border
            JPanel panel = new JPanel(new BorderLayout());
            panel.setBorder(BorderFactory.createLineBorder(new Color(50, 50, 50), 1));

            // Create content panel with gradient background
            JPanel contentPanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g;

                    // Create gradient background
                    GradientPaint gradient = new GradientPaint(
                            0, 0, new Color(60, 100, 180),
                            0, getHeight(), new Color(30, 50, 90));
                    g2d.setPaint(gradient);
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                }
            };
            contentPanel.setLayout(new BorderLayout());

            // Add title
            JLabel titleLabel = new JLabel("Smart Student Management System");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setForeground(Color.WHITE);
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            titleLabel.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));
            contentPanel.add(titleLabel, BorderLayout.NORTH);

            // Add loading text
            JLabel loadingLabel = new JLabel("Starting Application...");
            loadingLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            loadingLabel.setForeground(Color.WHITE);
            loadingLabel.setHorizontalAlignment(SwingConstants.CENTER);
            loadingLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
            contentPanel.add(loadingLabel, BorderLayout.SOUTH);

            // Add progress indicator
            JProgressBar progressBar = new JProgressBar();
            progressBar.setIndeterminate(true);
            progressBar.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 50));
            contentPanel.add(progressBar, BorderLayout.CENTER);

            // Version label
            JLabel versionLabel = new JLabel("Version 1.0");
            versionLabel.setForeground(new Color(200, 200, 200));
            versionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            versionLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
            contentPanel.add(versionLabel, BorderLayout.PAGE_END);

            // Add content panel to main panel
            panel.add(contentPanel, BorderLayout.CENTER);

            // Set content pane
            setContentPane(panel);
        }
    }
}
