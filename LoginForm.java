// import javax.swing.*;
// import java.awt.*;

// public class LoginForm extends JFrame {
//     private JTextField usernameField;
//     private JPasswordField passwordField;
//     private JButton loginButton;
//     private JButton cancelButton;

//     public LoginForm() {
//         setTitle("Smart Student Management System - Login");
//         setSize(400, 300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLocationRelativeTo(null);
//         setResizable(false);

//         JPanel mainPanel = new JPanel(new GridBagLayout());
//         mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

//         GridBagConstraints gbc = new GridBagConstraints();
//         gbc.fill = GridBagConstraints.HORIZONTAL;
//         gbc.insets = new Insets(5, 5, 5, 5);

//         JLabel titleLabel = new JLabel("Administrator Login");
//         titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
//         gbc.gridx = 0;
//         gbc.gridy = 0;
//         gbc.gridwidth = 2;
//         gbc.anchor = GridBagConstraints.CENTER;
//         mainPanel.add(titleLabel, gbc);

//         JLabel usernameLabel = new JLabel("Username:");
//         gbc.gridx = 0;
//         gbc.gridy = 1;
//         gbc.gridwidth = 1;
//         gbc.anchor = GridBagConstraints.WEST;
//         mainPanel.add(usernameLabel, gbc);

//         usernameField = new JTextField(15);
//         gbc.gridx = 1;
//         gbc.gridy = 1;
//         mainPanel.add(usernameField, gbc);

//         JLabel passwordLabel = new JLabel("Password:");
//         gbc.gridx = 0;
//         gbc.gridy = 2;
//         mainPanel.add(passwordLabel, gbc);

//         passwordField = new JPasswordField(15);
//         gbc.gridx = 1;
//         gbc.gridy = 2;
//         mainPanel.add(passwordField, gbc);

//         JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

//         loginButton = new JButton("Login");
//         loginButton.addActionListener(e -> authenticateUser());
//         buttonPanel.add(loginButton);

//         cancelButton = new JButton("Cancel");
//         cancelButton.addActionListener(e -> System.exit(0));
//         buttonPanel.add(cancelButton);

//         gbc.gridx = 0;
//         gbc.gridy = 3;
//         gbc.gridwidth = 2;
//         gbc.anchor = GridBagConstraints.CENTER;
//         mainPanel.add(buttonPanel, gbc);

//         add(mainPanel);
//     }

//     private void authenticateUser() {
//         String username = usernameField.getText();
//         String password = new String(passwordField.getPassword());

//         if (username.equals("admin") && password.equals("admin123")) {
//             JOptionPane.showMessageDialog(this, "Login Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
//             openDashboard();
//         } else {
//             JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
//         }
//     }

//     private void openDashboard() {
//         this.dispose();  // Close login window
//         Dashboard dashboard = new Dashboard();
//         dashboard.setVisible(true);
//     }

//     public static void main(String[] args) {
//         try {
//             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//         } catch (Exception e) {
//             e.printStackTrace();
//         }

//         SwingUtilities.invokeLater(() -> new LoginForm().setVisible(true));
//     }
// }


import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.net.URL;
import java.awt.image.BufferedImage;


public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton cancelButton;
    
    public LoginForm() {
        setTitle("Smart Student Management System - Login");
        setSize(450, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        
        // Create main panel with gradient background
        JPanel mainPanel = new GradientPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);
        
        // Logo/Icon Panel
        JPanel logoPanel = createLogoPanel();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(logoPanel, gbc);
        
        // Title Label
        JLabel titleLabel = new JLabel("Administrator Login");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(new Color(44, 62, 80));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(20, 10, 30, 10);
        mainPanel.add(titleLabel, gbc);
        
        // Username Panel
        JPanel usernamePanel = createInputPanel("Username:", createUsernameField());
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 10, 10, 10);
        mainPanel.add(usernamePanel, gbc);
        
        // Password Panel
        JPanel passwordPanel = createInputPanel("Password:", createPasswordField());
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        mainPanel.add(passwordPanel, gbc);
        
        // Button Panel
        JPanel buttonPanel = createButtonPanel();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(30, 10, 10, 10);
        mainPanel.add(buttonPanel, gbc);
        
        add(mainPanel);
    }
    
    private JPanel createLogoPanel() {
        JPanel logoPanel = new JPanel();
        logoPanel.setOpaque(false);
        logoPanel.setLayout(new BorderLayout());
        
        // Create a custom icon/logo
        JLabel logoLabel = new JLabel();
        logoLabel.setIcon(createCustomIcon());
        logoLabel.setHorizontalAlignment(JLabel.CENTER);
        
        logoPanel.add(logoLabel, BorderLayout.CENTER);
        logoPanel.setPreferredSize(new Dimension(120, 120));
        
        return logoPanel;
    }
    
    private ImageIcon createCustomIcon() {
        // Create a custom graduation cap icon
        int size = 80;
        BufferedImage image = new BufferedImage(size, size, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Draw graduation cap
        g2d.setColor(new Color(52, 152, 219));
        
        // Cap base
        g2d.fillOval(15, 35, 50, 20);
        
        // Cap top
        int[] xPoints = {10, 70, 65, 5};
        int[] yPoints = {30, 30, 35, 35};
        g2d.fillPolygon(xPoints, yPoints, 4);
        
        // Tassel
        g2d.setStroke(new BasicStroke(2));
        g2d.drawLine(55, 25, 65, 15);
        g2d.fillOval(63, 12, 6, 6);
        
        // Add some books
        g2d.setColor(new Color(231, 76, 60));
        g2d.fillRect(20, 50, 35, 5);
        g2d.setColor(new Color(46, 204, 113));
        g2d.fillRect(22, 45, 31, 5);
        
        g2d.dispose();
        return new ImageIcon(image);
    }
    
    private JPanel createInputPanel(String labelText, JComponent inputField) {
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JLabel label = new JLabel(labelText);
        label.setFont(new Font("Segoe UI", Font.BOLD, 14));
        label.setForeground(new Color(44, 62, 80));
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        inputField.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        panel.add(label);
        panel.add(Box.createVerticalStrut(5));
        panel.add(inputField);
        
        return panel;
    }
    
    private JTextField createUsernameField() {
        usernameField = new JTextField(20);
        styleInputField(usernameField);
        
        // Add user icon
        JLabel userIcon = new JLabel(createUserIcon());
        usernameField.setLayout(new BorderLayout());
        JPanel iconPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        iconPanel.setOpaque(false);
        iconPanel.add(userIcon);
        usernameField.add(iconPanel, BorderLayout.WEST);
        
        return usernameField;
    }
    
    private JPasswordField createPasswordField() {
        passwordField = new JPasswordField(20);
        styleInputField(passwordField);
        
        // Add lock icon
        JLabel lockIcon = new JLabel(createLockIcon());
        passwordField.setLayout(new BorderLayout());
        JPanel iconPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        iconPanel.setOpaque(false);
        iconPanel.add(lockIcon);
        passwordField.add(iconPanel, BorderLayout.WEST);
        
        return passwordField;
    }
    
    private void styleInputField(JTextField field) {
        field.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        field.setPreferredSize(new Dimension(300, 40));
        field.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(189, 195, 199), 1),
            BorderFactory.createEmptyBorder(8, 35, 8, 8)
        ));
        field.setBackground(Color.WHITE);
        
        // Add focus border
        field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(52, 152, 219), 2),
                    BorderFactory.createEmptyBorder(7, 34, 7, 7)
                ));
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                field.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(189, 195, 199), 1),
                    BorderFactory.createEmptyBorder(8, 35, 8, 8)
                ));
            }
        });
    }
    
    private ImageIcon createUserIcon() {
        return createIcon(16, new Color(127, 140, 141), "user");
    }
    
    private ImageIcon createLockIcon() {
        return createIcon(16, new Color(127, 140, 141), "lock");
    }
    
    private ImageIcon createIcon(int size, Color color, String type) {
        BufferedImage image = new BufferedImage(size, size, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(color);
        
        if ("user".equals(type)) {
            // Draw user icon
            g2d.fillOval(4, 2, 8, 8);
            g2d.fillRoundRect(2, 9, 12, 6, 6, 6);
        } else if ("lock".equals(type)) {
            // Draw lock icon
            g2d.setStroke(new BasicStroke(1.5f));
            g2d.drawRoundRect(3, 6, 10, 8, 2, 2);
            g2d.drawArc(5, 2, 6, 6, 0, 180);
            g2d.fillOval(7, 9, 2, 2);
        }
        
        g2d.dispose();
        return new ImageIcon(image);
    }
    
    private JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 0));
        
        loginButton = createStyledButton("Login", new Color(46, 204, 113), Color.WHITE);
        loginButton.addActionListener(e -> authenticateUser());
        
        cancelButton = createStyledButton("Cancel", new Color(231, 76, 60), Color.WHITE);
        cancelButton.addActionListener(e -> System.exit(0));
        
        buttonPanel.add(loginButton);
        buttonPanel.add(cancelButton);
        
        return buttonPanel;
    }
    
    private JButton createStyledButton(String text, Color bgColor, Color textColor) {
        JButton button = new JButton(text) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                if (getModel().isPressed()) {
                    g2d.setColor(bgColor.darker());
                } else if (getModel().isRollover()) {
                    g2d.setColor(bgColor.brighter());
                } else {
                    g2d.setColor(bgColor);
                }
                
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 8, 8);
                g2d.dispose();
                
                super.paintComponent(g);
            }
        };
        
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setForeground(textColor);
        button.setPreferredSize(new Dimension(120, 40));
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        return button;
    }
    
    // Custom panel with gradient background
    class GradientPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            GradientPaint gradient = new GradientPaint(
                0, 0, new Color(236, 240, 241),
                0, getHeight(), new Color(255, 255, 255)
            );
            g2d.setPaint(gradient);
            g2d.fillRect(0, 0, getWidth(), getHeight());
        }
    }
    
    private void authenticateUser() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        
        if (username.equals("admin") && password.equals("admin123")) {
            // Success animation could be added here
            JOptionPane.showMessageDialog(this, 
                "Login Successful!\nWelcome to the Student Management System", 
                "Success", 
                JOptionPane.INFORMATION_MESSAGE);
            openDashboard();
        } else {
            // Error animation could be added here
            JOptionPane.showMessageDialog(this, 
                "Invalid username or password.\nPlease try again.", 
                "Login Failed", 
                JOptionPane.ERROR_MESSAGE);
            
            // Clear password field and focus username
            passwordField.setText("");
            usernameField.requestFocus();
            usernameField.selectAll();
        }
    }
    
    private void openDashboard() {
        this.dispose();  // Close login window
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
    }
    
    public static void main(String[] args) {
        try {
            // Set system look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
    }
}