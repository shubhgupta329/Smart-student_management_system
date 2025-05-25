// // import javax.swing.*;
// // import java.awt.*;
// // import java.awt.event.ActionListener;
// // import java.util.ArrayList;
// // import java.util.List;

// // public class Dashboard extends JFrame {
// //     private JPanel contentPanel;
// //     private JMenuBar menuBar;

// //     // Sample data structures
// //     private List<Student> students = new ArrayList<>();
// //     private List<Course> courses = new ArrayList<>();
// //     private List<FeeRecord> feeRecords = new ArrayList<>();

// //     public Dashboard() {
// //         setTitle("Smart Student Management System - Dashboard");
// //         setSize(900, 600);
// //         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// //         setLocationRelativeTo(null);

// //         initSampleData();  // Load sample data
// //         initComponents();
// //     }

// //     private void initSampleData() {
// //         // Sample Students
// //         students.add(new Student("S001", "Ninja Hattori", "Computer Science"));
// //         students.add(new Student("S002", "Don the John", "Mechanical Engineering"));
// //         students.add(new Student("S003", "Ravan", "Electrical Engineering"));

// //         // Sample Courses
// //         courses.add(new Course("C001", "Data Structures", "Computer Science"));
// //         courses.add(new Course("C002", "Thermodynamics", "Mechanical Engineering"));
// //         courses.add(new Course("C003", "Circuit Analysis", "Electrical Engineering"));

// //         // Sample Fee Records
// //         feeRecords.add(new FeeRecord("S001", 5000, "Paid"));
// //         feeRecords.add(new FeeRecord("S002", 4500, "Due"));
// //         feeRecords.add(new FeeRecord("S003", 5200, "maaf"));
// //     }

// //     private void initComponents() {
// //         createMenuBar();

// //         contentPanel = new JPanel();
// //         contentPanel.setLayout(new BorderLayout());

// //         JPanel dashboardPanel = new JPanel(new GridBagLayout());
// //         dashboardPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

// //         GridBagConstraints gbc = new GridBagConstraints();
// //         gbc.fill = GridBagConstraints.BOTH;
// //         gbc.insets = new Insets(10, 10, 10, 10);
// //         gbc.weightx = 1.0;
// //         gbc.weighty = 1.0;

// //         gbc.gridx = 0;
// //         gbc.gridy = 0;
// //         dashboardPanel.add(createDashboardCard("Student Management", "Manage student records",
// //                 null, e -> openStudentManagement()), gbc);

// //         gbc.gridx = 1;
// //         dashboardPanel.add(createDashboardCard("Course Management", "Manage courses and subjects",
// //                 null, e -> openCourseManagement()), gbc);

// //         gbc.gridx = 0;
// //         gbc.gridy = 1;
// //         dashboardPanel.add(createDashboardCard("Fee Management", "Track student fees and payments",
// //                 null, e -> openFeeManagement()), gbc);

// //         gbc.gridx = 1;
// //         dashboardPanel.add(createDashboardCard("Reports", "Generate and view reports",
// //                 null, e -> openReports()), gbc);

// //         contentPanel.add(dashboardPanel, BorderLayout.CENTER);

// //         JPanel statusBar = new JPanel(new BorderLayout());
// //         statusBar.setBorder(BorderFactory.createEtchedBorder());
// //         JLabel statusLabel = new JLabel(" System Ready | User: Administrator");
// //         statusBar.add(statusLabel, BorderLayout.WEST);

// //         add(contentPanel, BorderLayout.CENTER);
// //         add(statusBar, BorderLayout.SOUTH);
// //     }

// //     private JPanel createDashboardCard(String title, String description, Icon icon, ActionListener listener) {
// //         JPanel card = new JPanel();
// //         card.setLayout(new BorderLayout(10, 10));
// //         card.setBorder(BorderFactory.createCompoundBorder(
// //                 BorderFactory.createLineBorder(new Color(200, 200, 200), 1),
// //                 BorderFactory.createEmptyBorder(15, 15, 15, 15)));
// //         card.setBackground(Color.WHITE);

// //         JLabel titleLabel = new JLabel(title);
// //         titleLabel.setFont(new Font("Arial", Font.BOLD, 16));

// //         JPanel headerPanel = new JPanel(new BorderLayout());
// //         headerPanel.setOpaque(false);

// //         if (icon != null) {
// //             headerPanel.add(new JLabel(icon), BorderLayout.WEST);
// //         }
// //         headerPanel.add(titleLabel, BorderLayout.CENTER);

// //         JLabel descLabel = new JLabel(description);
// //         descLabel.setForeground(Color.GRAY);

// //         JButton openButton = new JButton("Open");
// //         openButton.addActionListener(listener);

// //         card.add(headerPanel, BorderLayout.NORTH);
// //         card.add(descLabel, BorderLayout.CENTER);
// //         card.add(openButton, BorderLayout.SOUTH);

// //         card.addMouseListener(new java.awt.event.MouseAdapter() {
// //             public void mouseEntered(java.awt.event.MouseEvent evt) {
// //                 card.setBackground(new Color(240, 240, 250));
// //                 card.setCursor(new Cursor(Cursor.HAND_CURSOR));
// //             }

// //             public void mouseExited(java.awt.event.MouseEvent evt) {
// //                 card.setBackground(Color.WHITE);
// //                 card.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
// //             }
// //         });

// //         return card;
// //     }

// //     private void createMenuBar() {
// //         menuBar = new JMenuBar();

// //         JMenu fileMenu = new JMenu("File");
// //         JMenuItem settingsItem = new JMenuItem("Settings");
// //         JMenuItem logoutItem = new JMenuItem("Logout");
// //         JMenuItem exitItem = new JMenuItem("Exit");

// //         logoutItem.addActionListener(e -> logout());
// //         exitItem.addActionListener(e -> System.exit(0));

// //         fileMenu.add(settingsItem);
// //         fileMenu.addSeparator();
// //         fileMenu.add(logoutItem);
// //         fileMenu.add(exitItem);

// //         JMenu managementMenu = new JMenu("Management");
// //         JMenuItem studentItem = new JMenuItem("Student Management");
// //         JMenuItem courseItem = new JMenuItem("Course Management");
// //         JMenuItem feeItem = new JMenuItem("Fee Management");

// //         studentItem.addActionListener(e -> openStudentManagement());
// //         courseItem.addActionListener(e -> openCourseManagement());
// //         feeItem.addActionListener(e -> openFeeManagement());

// //         managementMenu.add(studentItem);
// //         managementMenu.add(courseItem);
// //         managementMenu.add(feeItem);

// //         JMenu reportsMenu = new JMenu("Reports");
// //         JMenuItem studentReportItem = new JMenuItem("Student Reports");
// //         JMenuItem feeReportItem = new JMenuItem("Fee Reports");
// //         JMenuItem academicReportItem = new JMenuItem("Academic Reports");

// //         studentReportItem.addActionListener(e -> showStudentReport());
// //         feeReportItem.addActionListener(e -> showFeeReport());
// //         academicReportItem.addActionListener(e -> showAcademicReport());

// //         reportsMenu.add(studentReportItem);
// //         reportsMenu.add(feeReportItem);
// //         reportsMenu.add(academicReportItem);

// //         JMenu helpMenu = new JMenu("Help");
// //         JMenuItem helpContentsItem = new JMenuItem("Help Contents");
// //         JMenuItem aboutItem = new JMenuItem("About");

// //         aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(Dashboard.this,
// //                 "Smart Student Management System v1.0\n© 2025 Your Organization",
// //                 "About", JOptionPane.INFORMATION_MESSAGE));

// //         helpMenu.add(helpContentsItem);
// //         helpMenu.add(aboutItem);

// //         menuBar.add(fileMenu);
// //         menuBar.add(managementMenu);
// //         menuBar.add(reportsMenu);
// //         menuBar.add(helpMenu);

// //         setJMenuBar(menuBar);
// //     }

// //     private void logout() {
// //         int option = JOptionPane.showConfirmDialog(this,
// //                 "Are you sure you want to logout?",
// //                 "Logout Confirmation", JOptionPane.YES_NO_OPTION);

// //         if (option == JOptionPane.YES_OPTION) {
// //             dispose();
// //             new LoginForm().setVisible(true);
// //         }
// //     }

// //     // Sample module implementations showing data

// //     private void openStudentManagement() {
// //         StringBuilder sb = new StringBuilder("Students List:\n\n");
// //         for (Student s : students) {
// //             sb.append(s).append("\n");
// //         }
// //         JOptionPane.showMessageDialog(this, sb.toString(), "Student Management", JOptionPane.INFORMATION_MESSAGE);
// //     }

// //     private void openCourseManagement() {
// //         StringBuilder sb = new StringBuilder("Courses List:\n\n");
// //         for (Course c : courses) {
// //             sb.append(c).append("\n");
// //         }
// //         JOptionPane.showMessageDialog(this, sb.toString(), "Course Management", JOptionPane.INFORMATION_MESSAGE);
// //     }

// //     private void openFeeManagement() {
// //         StringBuilder sb = new StringBuilder("Fee Records:\n\n");
// //         for (FeeRecord f : feeRecords) {
// //             sb.append(f).append("\n");
// //         }
// //         JOptionPane.showMessageDialog(this, sb.toString(), "Fee Management", JOptionPane.INFORMATION_MESSAGE);
// //     }

// //     private void openReports() {
// //         JOptionPane.showMessageDialog(this, "Reports module will be implemented soon.");
// //     }

// //     private void showStudentReport() {
// //         JOptionPane.showMessageDialog(this, "Student Reports:\nTotal students: " + students.size());
// //     }

// //     private void showFeeReport() {
// //         long paidCount = feeRecords.stream().filter(f -> f.status.equalsIgnoreCase("Paid")).count();
// //         long dueCount = feeRecords.size() - paidCount;
// //         JOptionPane.showMessageDialog(this,
// //                 "Fee Reports:\nPaid: " + paidCount + "\nDue: " + dueCount);
// //     }

// //     private void showAcademicReport() {
// //         JOptionPane.showMessageDialog(this, "Academic Reports:\nFeature coming soon!");
// //     }

// //     // Data classes
// //     static class Student {
// //         String id;
// //         String name;
// //         String department;

// //         Student(String id, String name, String department) {
// //             this.id = id;
// //             this.name = name;
// //             this.department = department;
// //         }

// //         public String toString() {
// //             return id + " | " + name + " | Dept: " + department;
// //         }
// //     }

// //     static class Course {
// //         String id;
// //         String name;
// //         String department;

// //         Course(String id, String name, String department) {
// //             this.id = id;
// //             this.name = name;
// //             this.department = department;
// //         }

// //         public String toString() {
// //             return id + " | " + name + " | Dept: " + department;
// //         }
// //     }

// //     static class FeeRecord {
// //         String studentId;
// //         double amount;
// //         String status; // Paid or Due

// //         FeeRecord(String studentId, double amount, String status) {
// //             this.studentId = studentId;
// //             this.amount = amount;
// //             this.status = status;
// //         }

// //         public String toString() {
// //             return "StudentID: " + studentId + " | Amount: $" + amount + " | Status: " + status;
// //         }
// //     }
// // }

























































// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionListener;
// import java.util.ArrayList;
// import java.util.List;
// import java.net.URL;

// public class Dashboard extends JFrame {
//     private JPanel contentPanel;
//     private JMenuBar menuBar;
    
//     // Custom fonts
//     private Font titleFont;
//     private Font subtitleFont;
//     private Font bodyFont;
//     private Font menuFont;
    
//     // Custom colors
//     private final Color PRIMARY_COLOR = new Color(41, 128, 185);
//     private final Color SECONDARY_COLOR = new Color(52, 152, 219);
//     private final Color ACCENT_COLOR = new Color(231, 76, 60);
//     private final Color BACKGROUND_COLOR = new Color(236, 240, 241);
//     private final Color CARD_COLOR = Color.WHITE;
//     private final Color TEXT_PRIMARY = new Color(44, 62, 80);
//     private final Color TEXT_SECONDARY = new Color(127, 140, 141);

//     // Sample data structures
//     private List<Student> students = new ArrayList<>();
//     private List<Course> courses = new ArrayList<>();
//     private List<FeeRecord> feeRecords = new ArrayList<>();

//     public Dashboard() {
//         setTitle("Smart Student Management System - Dashboard");
//         setSize(1000, 700);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLocationRelativeTo(null);
        
//         initFonts();
//         initSampleData();
//         initComponents();
        
//         // Set background color
//         getContentPane().setBackground(BACKGROUND_COLOR);
//     }
    
//     private void initFonts() {
//         try {
//             // Try to use system fonts or fallback to default
//             titleFont = new Font("Segoe UI", Font.BOLD, 18);
//             subtitleFont = new Font("Segoe UI", Font.PLAIN, 14);
//             bodyFont = new Font("Segoe UI", Font.PLAIN, 12);
//             menuFont = new Font("Segoe UI", Font.PLAIN, 13);
            
//             // Fallback if Segoe UI is not available
//             if (!isSystemFontAvailable("Segoe UI")) {
//                 titleFont = new Font("Arial", Font.BOLD, 18);
//                 subtitleFont = new Font("Arial", Font.PLAIN, 14);
//                 bodyFont = new Font("Arial", Font.PLAIN, 12);
//                 menuFont = new Font("Arial", Font.PLAIN, 13);
//             }
//         } catch (Exception e) {
//             // Default fonts
//             titleFont = new Font(Font.SANS_SERIF, Font.BOLD, 18);
//             subtitleFont = new Font(Font.SANS_SERIF, Font.PLAIN, 14);
//             bodyFont = new Font(Font.SANS_SERIF, Font.PLAIN, 12);
//             menuFont = new Font(Font.SANS_SERIF, Font.PLAIN, 13);
//         }
//     }
    
//     private boolean isSystemFontAvailable(String fontName) {
//         Font[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
//         for (Font font : fonts) {
//             if (font.getFontName().equals(fontName)) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     private void initSampleData() {
//         // Sample Students
//         students.add(new Student("S001", "Ninja Hattori", "Computer Science"));
//         students.add(new Student("S002", "Don the John", "Mechanical Engineering"));
//         students.add(new Student("S003", "Ravan", "Electrical Engineering"));

//         // Sample Courses
//         courses.add(new Course("C001", "Data Structures", "Computer Science"));
//         courses.add(new Course("C002", "Thermodynamics", "Mechanical Engineering"));
//         courses.add(new Course("C003", "Circuit Analysis", "Electrical Engineering"));

//         // Sample Fee Records
//         feeRecords.add(new FeeRecord("S001", 5000, "Paid"));
//         feeRecords.add(new FeeRecord("S002", 4500, "Due"));
//         feeRecords.add(new FeeRecord("S003", 5200, "Pending"));
//     }

//     private void initComponents() {
//         createMenuBar();

//         contentPanel = new JPanel();
//         contentPanel.setLayout(new BorderLayout());
//         contentPanel.setBackground(BACKGROUND_COLOR);

//         // Create header panel
//         JPanel headerPanel = createHeaderPanel();
//         contentPanel.add(headerPanel, BorderLayout.NORTH);

//         // Create dashboard panel
//         JPanel dashboardPanel = new JPanel(new GridBagLayout());
//         dashboardPanel.setBackground(BACKGROUND_COLOR);
//         dashboardPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

//         GridBagConstraints gbc = new GridBagConstraints();
//         gbc.fill = GridBagConstraints.BOTH;
//         gbc.insets = new Insets(15, 15, 15, 15);
//         gbc.weightx = 1.0;
//         gbc.weighty = 1.0;

//         // Row 1
//         gbc.gridx = 0;
//         gbc.gridy = 0;
//         dashboardPanel.add(createDashboardCard("Student Management", "Manage student records and information",
//                 createStudentIcon(), e -> openStudentManagement()), gbc);

//         gbc.gridx = 1;
//         dashboardPanel.add(createDashboardCard("Course Management", "Manage courses and academic subjects",
//                 createCourseIcon(), e -> openCourseManagement()), gbc);

//         // Row 2
//         gbc.gridx = 0;
//         gbc.gridy = 1;
//         dashboardPanel.add(createDashboardCard("Fee Management", "Track student fees and payment records",
//                 createFeeIcon(), e -> openFeeManagement()), gbc);

//         gbc.gridx = 1;
//         dashboardPanel.add(createDashboardCard("Reports", "Generate comprehensive reports and analytics",
//                 createReportIcon(), e -> openReports()), gbc);

//         contentPanel.add(dashboardPanel, BorderLayout.CENTER);

//         // Create status bar
//         JPanel statusBar = createStatusBar();
//         contentPanel.add(statusBar, BorderLayout.SOUTH);

//         add(contentPanel, BorderLayout.CENTER);
//     }
    
//     private JPanel createHeaderPanel() {
//         JPanel headerPanel = new JPanel();
//         headerPanel.setLayout(new BorderLayout());
//         headerPanel.setBackground(PRIMARY_COLOR);
//         headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        
//         // Create logo/icon
//         JLabel logoLabel = new JLabel(createLogoIcon());
        
//         // Create title
//         JLabel titleLabel = new JLabel("Smart Student Management System");
//         titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
//         titleLabel.setForeground(Color.WHITE);
        
//         // Create subtitle
//         JLabel subtitleLabel = new JLabel("Dashboard - Manage your institution efficiently");
//         subtitleLabel.setFont(subtitleFont);
//         subtitleLabel.setForeground(new Color(230, 230, 230));
        
//         // Create text panel
//         JPanel textPanel = new JPanel();
//         textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
//         textPanel.setOpaque(false);
//         textPanel.add(titleLabel);
//         textPanel.add(Box.createVerticalStrut(5));
//         textPanel.add(subtitleLabel);
        
//         // Create user info panel
//         JPanel userPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
//         userPanel.setOpaque(false);
        
//         JLabel userIcon = new JLabel(createUserIcon());
//         JLabel userLabel = new JLabel("Administrator");
//         userLabel.setFont(bodyFont);
//         userLabel.setForeground(Color.WHITE);
        
//         userPanel.add(userIcon);
//         userPanel.add(Box.createHorizontalStrut(8));
//         userPanel.add(userLabel);
        
//         headerPanel.add(logoLabel, BorderLayout.WEST);
//         headerPanel.add(textPanel, BorderLayout.CENTER);
//         headerPanel.add(userPanel, BorderLayout.EAST);
        
//         return headerPanel;
//     }

//     private JPanel createDashboardCard(String title, String description, ImageIcon icon, ActionListener listener) {
//         JPanel card = new JPanel();
//         card.setLayout(new BorderLayout(15, 15));
//         card.setBorder(BorderFactory.createCompoundBorder(
//                 BorderFactory.createLineBorder(new Color(220, 220, 220), 1),
//                 BorderFactory.createEmptyBorder(25, 25, 25, 25)));
//         card.setBackground(CARD_COLOR);
//         card.setPreferredSize(new Dimension(300, 180));

//         // Create icon panel
//         JPanel iconPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//         iconPanel.setOpaque(false);
//         JLabel iconLabel = new JLabel(icon);
//         iconPanel.add(iconLabel);

//         // Create title label
//         JLabel titleLabel = new JLabel(title, JLabel.CENTER);
//         titleLabel.setFont(titleFont);
//         titleLabel.setForeground(TEXT_PRIMARY);

//         // Create description label
//         JLabel descLabel = new JLabel("<html><div style='text-align: center;'>" + description + "</div></html>");
//         descLabel.setFont(subtitleFont);
//         descLabel.setForeground(TEXT_SECONDARY);
//         descLabel.setHorizontalAlignment(JLabel.CENTER);

//         // Create button
//         JButton openButton = new JButton("Open Module");
//         openButton.setFont(bodyFont);
//         openButton.setBackground(PRIMARY_COLOR);
//         openButton.setForeground(Color.WHITE);
//         openButton.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));
//         openButton.setFocusPainted(false);
//         openButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
//         openButton.addActionListener(listener);
        
//         // Button hover effect
//         openButton.addMouseListener(new java.awt.event.MouseAdapter() {
//             public void mouseEntered(java.awt.event.MouseEvent evt) {
//                 openButton.setBackground(SECONDARY_COLOR);
//             }
//             public void mouseExited(java.awt.event.MouseEvent evt) {
//                 openButton.setBackground(PRIMARY_COLOR);
//             }
//         });

//         // Create content panel
//         JPanel contentPanel = new JPanel();
//         contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
//         contentPanel.setOpaque(false);
//         contentPanel.add(titleLabel);
//         contentPanel.add(Box.createVerticalStrut(8));
//         contentPanel.add(descLabel);

//         // Create button panel
//         JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//         buttonPanel.setOpaque(false);
//         buttonPanel.add(openButton);

//         card.add(iconPanel, BorderLayout.NORTH);
//         card.add(contentPanel, BorderLayout.CENTER);
//         card.add(buttonPanel, BorderLayout.SOUTH);

//         // Card hover effect
//         card.addMouseListener(new java.awt.event.MouseAdapter() {
//             public void mouseEntered(java.awt.event.MouseEvent evt) {
//                 card.setBackground(new Color(248, 249, 250));
//                 card.setBorder(BorderFactory.createCompoundBorder(
//                         BorderFactory.createLineBorder(PRIMARY_COLOR, 2),
//                         BorderFactory.createEmptyBorder(24, 24, 24, 24)));
//                 card.setCursor(new Cursor(Cursor.HAND_CURSOR));
//             }

//             public void mouseExited(java.awt.event.MouseEvent evt) {
//                 card.setBackground(CARD_COLOR);
//                 card.setBorder(BorderFactory.createCompoundBorder(
//                         BorderFactory.createLineBorder(new Color(220, 220, 220), 1),
//                         BorderFactory.createEmptyBorder(25, 25, 25, 25)));
//                 card.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
//             }
//         });

//         return card;
//     }
    
//     private JPanel createStatusBar() {
//         JPanel statusBar = new JPanel(new BorderLayout());
//         statusBar.setBackground(new Color(52, 73, 94));
//         statusBar.setBorder(BorderFactory.createEmptyBorder(8, 15, 8, 15));
        
//         JLabel statusLabel = new JLabel("System Ready | Connected | Last Login: Today 09:30 AM");
//         statusLabel.setFont(bodyFont);
//         statusLabel.setForeground(Color.WHITE);
        
//         JLabel timeLabel = new JLabel("Current Time: " + java.time.LocalTime.now().toString().substring(0, 5));
//         timeLabel.setFont(bodyFont);
//         timeLabel.setForeground(new Color(189, 195, 199));
        
//         statusBar.add(statusLabel, BorderLayout.WEST);
//         statusBar.add(timeLabel, BorderLayout.EAST);
        
//         return statusBar;
//     }

//     // Icon creation methods
//     private ImageIcon createStudentIcon() {
//         return createColoredIcon(64, 64, new Color(52, 152, 219), "👨‍🎓");
//     }
    
//     private ImageIcon createCourseIcon() {
//         return createColoredIcon(64, 64, new Color(46, 204, 113), "📚");
//     }
    
//     private ImageIcon createFeeIcon() {
//         return createColoredIcon(64, 64, new Color(241, 196, 15), "💰");
//     }
    
//     private ImageIcon createReportIcon() {
//         return createColoredIcon(64, 64, new Color(155, 89, 182), "📊");
//     }
    
//     private ImageIcon createLogoIcon() {
//         return createColoredIcon(40, 40, Color.WHITE, "🎓");
//     }
    
//     private ImageIcon createUserIcon() {
//         return createColoredIcon(20, 20, Color.WHITE, "👤");
//     }
    
//     private ImageIcon createColoredIcon(int width, int height, Color bgColor, String emoji) {
//         java.awt.image.BufferedImage img = new java.awt.image.BufferedImage(width, height, java.awt.image.BufferedImage.TYPE_INT_ARGB);
//         Graphics2D g2 = img.createGraphics();
//         g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
//         // Create circular background
//         g2.setColor(bgColor);
//         g2.fillOval(2, 2, width-4, height-4);
        
//         // Add emoji/text
//         g2.setColor(Color.WHITE);
//         g2.setFont(new Font("Segoe UI Emoji", Font.PLAIN, width/3));
//         FontMetrics fm = g2.getFontMetrics();
//         int x = (width - fm.stringWidth(emoji)) / 2;
//         int y = ((height - fm.getHeight()) / 2) + fm.getAscent();
//         g2.drawString(emoji, x, y);
        
//         g2.dispose();
//         return new ImageIcon(img);
//     }

//     private void createMenuBar() {
//         menuBar = new JMenuBar();
//         menuBar.setBackground(new Color(52, 73, 94));
//         menuBar.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

//         JMenu fileMenu = createStyledMenu("File");
//         JMenuItem settingsItem = createStyledMenuItem("Settings");
//         JMenuItem logoutItem = createStyledMenuItem("Logout");
//         JMenuItem exitItem = createStyledMenuItem("Exit");

//         logoutItem.addActionListener(e -> logout());
//         exitItem.addActionListener(e -> System.exit(0));

//         fileMenu.add(settingsItem);
//         fileMenu.addSeparator();
//         fileMenu.add(logoutItem);
//         fileMenu.add(exitItem);

//         JMenu managementMenu = createStyledMenu("Management");
//         JMenuItem studentItem = createStyledMenuItem("Student Management");
//         JMenuItem courseItem = createStyledMenuItem("Course Management");
//         JMenuItem feeItem = createStyledMenuItem("Fee Management");

//         studentItem.addActionListener(e -> openStudentManagement());
//         courseItem.addActionListener(e -> openCourseManagement());
//         feeItem.addActionListener(e -> openFeeManagement());

//         managementMenu.add(studentItem);
//         managementMenu.add(courseItem);
//         managementMenu.add(feeItem);

//         JMenu reportsMenu = createStyledMenu("Reports");
//         JMenuItem studentReportItem = createStyledMenuItem("Student Reports");
//         JMenuItem feeReportItem = createStyledMenuItem("Fee Reports");
//         JMenuItem academicReportItem = createStyledMenuItem("Academic Reports");

//         studentReportItem.addActionListener(e -> showStudentReport());
//         feeReportItem.addActionListener(e -> showFeeReport());
//         academicReportItem.addActionListener(e -> showAcademicReport());

//         reportsMenu.add(studentReportItem);
//         reportsMenu.add(feeReportItem);
//         reportsMenu.add(academicReportItem);

//         JMenu helpMenu = createStyledMenu("Help");
//         JMenuItem helpContentsItem = createStyledMenuItem("Help Contents");
//         JMenuItem aboutItem = createStyledMenuItem("About");

//         aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(Dashboard.this,
//                 "Smart Student Management System v1.0\n© 2025 Your Organization\n\nA modern, intuitive solution for educational institutions.",
//                 "About", JOptionPane.INFORMATION_MESSAGE));

//         helpMenu.add(helpContentsItem);
//         helpMenu.add(aboutItem);

//         menuBar.add(fileMenu);
//         menuBar.add(managementMenu);
//         menuBar.add(reportsMenu);
//         menuBar.add(helpMenu);

//         setJMenuBar(menuBar);
//     }
    
//     private JMenu createStyledMenu(String text) {
//         JMenu menu = new JMenu(text);
//         menu.setFont(menuFont);
//         menu.setForeground(Color.WHITE);
//         return menu;
//     }
    
//     private JMenuItem createStyledMenuItem(String text) {
//         JMenuItem item = new JMenuItem(text);
//         item.setFont(bodyFont);
//         return item;
//     }

//     private void logout() {
//         int option = JOptionPane.showConfirmDialog(this,
//                 "Are you sure you want to logout?",
//                 "Logout Confirmation", JOptionPane.YES_NO_OPTION);

//         if (option == JOptionPane.YES_OPTION) {
//             dispose();
//             // new LoginForm().setVisible(true); // Uncomment when LoginForm is available
//         }
//     }

//     // Module implementations with enhanced dialogs
//     private void openStudentManagement() {
//         StringBuilder sb = new StringBuilder("<html><body style='font-family: Segoe UI; padding: 10px;'>");
//         sb.append("<h2 style='color: #2980b9; margin-bottom: 15px;'>📚 Students List</h2>");
//         sb.append("<table border='0' cellpadding='5'>");
//         for (Student s : students) {
//             sb.append("<tr>");
//             sb.append("<td style='font-weight: bold; color: #34495e;'>").append(s.id).append("</td>");
//             sb.append("<td style='padding: 0 15px; color: #2c3e50;'>").append(s.name).append("</td>");
//             sb.append("<td style='color: #7f8c8d;'>").append(s.department).append("</td>");
//             sb.append("</tr>");
//         }
//         sb.append("</table></body></html>");
        
//         JOptionPane.showMessageDialog(this, sb.toString(), "Student Management", JOptionPane.INFORMATION_MESSAGE);
//     }

//     private void openCourseManagement() {
//         StringBuilder sb = new StringBuilder("<html><body style='font-family: Segoe UI; padding: 10px;'>");
//         sb.append("<h2 style='color: #27ae60; margin-bottom: 15px;'>📖 Courses List</h2>");
//         sb.append("<table border='0' cellpadding='5'>");
//         for (Course c : courses) {
//             sb.append("<tr>");
//             sb.append("<td style='font-weight: bold; color: #34495e;'>").append(c.id).append("</td>");
//             sb.append("<td style='padding: 0 15px; color: #2c3e50;'>").append(c.name).append("</td>");
//             sb.append("<td style='color: #7f8c8d;'>").append(c.department).append("</td>");
//             sb.append("</tr>");
//         }
//         sb.append("</table></body></html>");
        
//         JOptionPane.showMessageDialog(this, sb.toString(), "Course Management", JOptionPane.INFORMATION_MESSAGE);
//     }

//     private void openFeeManagement() {
//         StringBuilder sb = new StringBuilder("<html><body style='font-family: Segoe UI; padding: 10px;'>");
//         sb.append("<h2 style='color: #f39c12; margin-bottom: 15px;'>💳 Fee Records</h2>");
//         sb.append("<table border='0' cellpadding='5'>");
//         for (FeeRecord f : feeRecords) {
//             String statusColor = f.status.equalsIgnoreCase("Paid") ? "#27ae60" : 
//                                f.status.equalsIgnoreCase("Due") ? "#e74c3c" : "#f39c12";
//             sb.append("<tr>");
//             sb.append("<td style='font-weight: bold; color: #34495e;'>").append(f.studentId).append("</td>");
//             sb.append("<td style='padding: 0 15px; color: #2c3e50;'>$").append(f.amount).append("</td>");
//             sb.append("<td style='color: ").append(statusColor).append("; font-weight: bold;'>").append(f.status).append("</td>");
//             sb.append("</tr>");
//         }
//         sb.append("</table></body></html>");
        
//         JOptionPane.showMessageDialog(this, sb.toString(), "Fee Management", JOptionPane.INFORMATION_MESSAGE);
//     }

//     private void openReports() {
//         JOptionPane.showMessageDialog(this, 
//             "<html><body style='font-family: Segoe UI; padding: 20px; text-align: center;'>" +
//             "<h2 style='color: #9b59b6;'>📊 Reports Module</h2>" +
//             "<p style='color: #7f8c8d;'>Advanced reporting features will be available soon!</p>" +
//             "</body></html>", 
//             "Reports", JOptionPane.INFORMATION_MESSAGE);
//     }

//     private void showStudentReport() {
//         JOptionPane.showMessageDialog(this, 
//             "<html><body style='font-family: Segoe UI; padding: 15px;'>" +
//             "<h3 style='color: #2980b9;'>👨‍🎓 Student Reports</h3>" +
//             "<p><strong>Total Students:</strong> " + students.size() + "</p>" +
//             "<p><strong>Departments:</strong> " + students.stream().map(s -> s.department).distinct().count() + "</p>" +
//             "</body></html>");
//     }

//     private void showFeeReport() {
//         long paidCount = feeRecords.stream().filter(f -> f.status.equalsIgnoreCase("Paid")).count();
//         long dueCount = feeRecords.stream().filter(f -> f.status.equalsIgnoreCase("Due")).count();
//         long pendingCount = feeRecords.size() - paidCount - dueCount;
        
//         JOptionPane.showMessageDialog(this,
//             "<html><body style='font-family: Segoe UI; padding: 15px;'>" +
//             "<h3 style='color: #f39c12;'>💰 Fee Reports</h3>" +
//             "<p><span style='color: #27ae60;'>✓ Paid:</span> " + paidCount + "</p>" +
//             "<p><span style='color: #e74c3c;'>✗ Due:</span> " + dueCount + "</p>" +
//             "<p><span style='color: #f39c12;'>⏳ Pending:</span> " + pendingCount + "</p>" +
//             "</body></html>");
//     }

//     private void showAcademicReport() {
//         JOptionPane.showMessageDialog(this, 
//             "<html><body style='font-family: Segoe UI; padding: 15px;'>" +
//             "<h3 style='color: #9b59b6;'>📈 Academic Reports</h3>" +
//             "<p style='color: #7f8c8d;'>Feature coming soon with detailed analytics!</p>" +
//             "</body></html>");
//     }

//     // Data classes remain the same
//     static class Student {
//         String id;
//         String name;
//         String department;

//         Student(String id, String name, String department) {
//             this.id = id;
//             this.name = name;
//             this.department = department;
//         }

//         public String toString() {
//             return id + " | " + name + " | Dept: " + department;
//         }
//     }

//     static class Course {
//         String id;
//         String name;
//         String department;

//         Course(String id, String name, String department) {
//             this.id = id;
//             this.name = name;
//             this.department = department;
//         }

//         public String toString() {
//             return id + " | " + name + " | Dept: " + department;
//         }
//     }

//     static class FeeRecord {
//         String studentId;
//         double amount;
//         String status;

//         FeeRecord(String studentId, double amount, String status) {
//             this.studentId = studentId;
//             this.amount = amount;
//             this.status = status;
//         }

//         public String toString() {
//             return "StudentID: " + studentId + " | Amount: $" + amount + " | Status: " + status;
//         }
//     }
    
//     // Main method for testing
//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> {
//             try {
//                 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//             new Dashboard().setVisible(true);
//         });
//     }
// }





// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionListener;
// import java.util.ArrayList;
// import java.util.List;
// import java.awt.geom.RoundRectangle2D;

// public class Dashboard extends JFrame {
//     private JPanel contentPanel;
//     private JMenuBar menuBar;
    
//     // Enhanced fonts
//     private Font titleFont;
//     private Font subtitleFont;
//     private Font bodyFont;
//     private Font menuFont;
//     private Font headerFont;
    
//     // Modern color palette
//     private final Color PRIMARY_COLOR = new Color(30, 39, 46);        // Dark slate
//     private final Color SECONDARY_COLOR = new Color(45, 52, 54);      // Charcoal
//     private final Color ACCENT_COLOR = new Color(255, 107, 107);      // Coral red
//     private final Color SUCCESS_COLOR = new Color(85, 239, 196);      // Mint green
//     private final Color WARNING_COLOR = new Color(255, 177, 66);      // Orange
//     private final Color INFO_COLOR = new Color(116, 185, 255);        // Sky blue
//     private final Color BACKGROUND_COLOR = new Color(245, 246, 250);  // Light gray
//     private final Color CARD_COLOR = Color.WHITE;
//     private final Color CARD_HOVER_COLOR = new Color(250, 251, 255);
//     private final Color TEXT_PRIMARY = new Color(33, 37, 41);
//     private final Color TEXT_SECONDARY = new Color(108, 117, 125);
//     private final Color TEXT_LIGHT = new Color(173, 181, 189);
//     private final Color SHADOW_COLOR = new Color(0, 0, 0, 20);

//     // Sample data structures
//     private List<Student> students = new ArrayList<>();
//     private List<Course> courses = new ArrayList<>();
//     private List<FeeRecord> feeRecords = new ArrayList<>();

//     public Dashboard() {
//         setTitle("Smart Student Management System - Dashboard");
//         setSize(1200, 800);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLocationRelativeTo(null);
        
//         initFonts();
//         initSampleData();
//         initComponents();
        
//         // Set background with gradient effect
//         getContentPane().setBackground(BACKGROUND_COLOR);
//     }
    
//     private void initFonts() {
//         try {
//             headerFont = new Font("Segoe UI", Font.BOLD, 28);
//             titleFont = new Font("Segoe UI", Font.BOLD, 20);
//             subtitleFont = new Font("Segoe UI", Font.PLAIN, 16);
//             bodyFont = new Font("Segoe UI", Font.PLAIN, 14);
//             menuFont = new Font("Segoe UI", Font.PLAIN, 14);
            
//             if (!isSystemFontAvailable("Segoe UI")) {
//                 headerFont = new Font("Arial", Font.BOLD, 28);
//                 titleFont = new Font("Arial", Font.BOLD, 20);
//                 subtitleFont = new Font("Arial", Font.PLAIN, 16);
//                 bodyFont = new Font("Arial", Font.PLAIN, 14);
//                 menuFont = new Font("Arial", Font.PLAIN, 14);
//             }
//         } catch (Exception e) {
//             headerFont = new Font(Font.SANS_SERIF, Font.BOLD, 28);
//             titleFont = new Font(Font.SANS_SERIF, Font.BOLD, 20);
//             subtitleFont = new Font(Font.SANS_SERIF, Font.PLAIN, 16);
//             bodyFont = new Font(Font.SANS_SERIF, Font.PLAIN, 14);
//             menuFont = new Font(Font.SANS_SERIF, Font.PLAIN, 14);
//         }
//     }
    
//     private boolean isSystemFontAvailable(String fontName) {
//         Font[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
//         for (Font font : fonts) {
//             if (font.getFontName().equals(fontName)) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     private void initSampleData() {
//         students.add(new Student("S001", "Ninja Hattori", "Computer Science"));
//         students.add(new Student("S002", "Don the John", "Mechanical Engineering"));
//         students.add(new Student("S003", "Ravan", "Electrical Engineering"));
//         students.add(new Student("S004", "Alex Johnson", "Computer Science"));
//         students.add(new Student("S005", "Sarah Connor", "Biotechnology"));

//         courses.add(new Course("C001", "Data Structures", "Computer Science"));
//         courses.add(new Course("C002", "Thermodynamics", "Mechanical Engineering"));
//         courses.add(new Course("C003", "Circuit Analysis", "Electrical Engineering"));
//         courses.add(new Course("C004", "Machine Learning", "Computer Science"));

//         feeRecords.add(new FeeRecord("S001", 5000, "Paid"));
//         feeRecords.add(new FeeRecord("S002", 4500, "Due"));
//         feeRecords.add(new FeeRecord("S003", 5200, "Pending"));
//         feeRecords.add(new FeeRecord("S004", 4800, "Paid"));
//         feeRecords.add(new FeeRecord("S005", 5500, "Due"));
//     }

//     private void initComponents() {
//         createMenuBar();

//         contentPanel = new JPanel() {
//             @Override
//             protected void paintComponent(Graphics g) {
//                 super.paintComponent(g);
//                 Graphics2D g2d = (Graphics2D) g;
//                 g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                
//                 // Create subtle gradient background
//                 GradientPaint gradient = new GradientPaint(0, 0, BACKGROUND_COLOR, 
//                     0, getHeight(), new Color(240, 242, 247));
//                 g2d.setPaint(gradient);
//                 g2d.fillRect(0, 0, getWidth(), getHeight());
//             }
//         };
//         contentPanel.setLayout(new BorderLayout());

//         // Create enhanced header panel
//         JPanel headerPanel = createEnhancedHeaderPanel();
//         contentPanel.add(headerPanel, BorderLayout.NORTH);

//         // Create main dashboard with stats
//         JPanel mainPanel = new JPanel(new BorderLayout());
//         mainPanel.setOpaque(false);
//         mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));

//         // Add stats cards
//         JPanel statsPanel = createStatsPanel();
//         mainPanel.add(statsPanel, BorderLayout.NORTH);

//         // Create dashboard grid
//         JPanel dashboardPanel = new JPanel(new GridBagLayout());
//         dashboardPanel.setOpaque(false);
//         dashboardPanel.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));

//         GridBagConstraints gbc = new GridBagConstraints();
//         gbc.fill = GridBagConstraints.BOTH;
//         gbc.insets = new Insets(20, 20, 20, 20);
//         gbc.weightx = 1.0;
//         gbc.weighty = 1.0;

//         // Row 1
//         gbc.gridx = 0; gbc.gridy = 0;
//         dashboardPanel.add(createEnhancedDashboardCard("Student Management", 
//             "Manage student records, enrollment, and academic information",
//             createModernStudentIcon(), INFO_COLOR, e -> openStudentManagement()), gbc);

//         gbc.gridx = 1;
//         dashboardPanel.add(createEnhancedDashboardCard("Course Management", 
//             "Organize courses, subjects, and academic curriculum",
//             createModernCourseIcon(), SUCCESS_COLOR, e -> openCourseManagement()), gbc);

//         // Row 2
//         gbc.gridx = 0; gbc.gridy = 1;
//         dashboardPanel.add(createEnhancedDashboardCard("Fee Management", 
//             "Track payments, dues, and financial records",
//             createModernFeeIcon(), WARNING_COLOR, e -> openFeeManagement()), gbc);

//         gbc.gridx = 1;
//         dashboardPanel.add(createEnhancedDashboardCard("Reports & Analytics", 
//             "Generate insights and comprehensive institutional reports",
//             createModernReportIcon(), ACCENT_COLOR, e -> openReports()), gbc);

//         mainPanel.add(dashboardPanel, BorderLayout.CENTER);
//         contentPanel.add(mainPanel, BorderLayout.CENTER);

//         // Enhanced status bar
//         JPanel statusBar = createEnhancedStatusBar();
//         contentPanel.add(statusBar, BorderLayout.SOUTH);

//         add(contentPanel, BorderLayout.CENTER);
//     }
    
//     private JPanel createEnhancedHeaderPanel() {
//         JPanel headerPanel = new JPanel() {
//             @Override
//             protected void paintComponent(Graphics g) {
//                 super.paintComponent(g);
//                 Graphics2D g2d = (Graphics2D) g;
//                 g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                
//                 // Create gradient background
//                 GradientPaint gradient = new GradientPaint(0, 0, PRIMARY_COLOR, 
//                     getWidth(), getHeight(), SECONDARY_COLOR);
//                 g2d.setPaint(gradient);
//                 g2d.fillRect(0, 0, getWidth(), getHeight());
                
//                 // Add subtle pattern overlay
//                 g2d.setColor(new Color(255, 255, 255, 10));
//                 for (int i = 0; i < getWidth(); i += 40) {
//                     for (int j = 0; j < getHeight(); j += 40) {
//                         g2d.fillOval(i, j, 2, 2);
//                     }
//                 }
//             }
//         };
//         headerPanel.setLayout(new BorderLayout());
//         headerPanel.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));
//         headerPanel.setPreferredSize(new Dimension(0, 120));
        
//         // Logo with modern styling
//         JLabel logoLabel = new JLabel(createModernLogoIcon());
        
//         // Enhanced title section
//         JPanel titleSection = new JPanel();
//         titleSection.setLayout(new BoxLayout(titleSection, BoxLayout.Y_AXIS));
//         titleSection.setOpaque(false);
        
//         JLabel titleLabel = new JLabel("Smart Student Management");
//         titleLabel.setFont(headerFont);
//         titleLabel.setForeground(Color.WHITE);
        
//         JLabel subtitleLabel = new JLabel("Comprehensive Dashboard for Educational Excellence");
//         subtitleLabel.setFont(subtitleFont);
//         subtitleLabel.setForeground(new Color(200, 210, 220));
        
//         titleSection.add(titleLabel);
//         titleSection.add(Box.createVerticalStrut(5));
//         titleSection.add(subtitleLabel);
        
//         // Enhanced user panel
//         JPanel userPanel = createUserPanel();
        
//         headerPanel.add(logoLabel, BorderLayout.WEST);
//         headerPanel.add(titleSection, BorderLayout.CENTER);
//         headerPanel.add(userPanel, BorderLayout.EAST);
        
//         return headerPanel;
//     }

//     private JPanel createUserPanel() {
//         JPanel userPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 0));
//         userPanel.setOpaque(false);
        
//         // Notification icon
//         JLabel notificationIcon = new JLabel(createNotificationIcon());
//         notificationIcon.setToolTipText("3 new notifications");
        
//         // User info with avatar
//         JPanel userInfo = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
//         userInfo.setOpaque(false);
        
//         JLabel userAvatar = new JLabel(createUserAvatarIcon());
        
//         JPanel userDetails = new JPanel();
//         userDetails.setLayout(new BoxLayout(userDetails, BoxLayout.Y_AXIS));
//         userDetails.setOpaque(false);
        
//         JLabel userName = new JLabel("Administrator");
//         userName.setFont(new Font("Segoe UI", Font.BOLD, 14));
//         userName.setForeground(Color.WHITE);
//         userName.setAlignmentX(Component.RIGHT_ALIGNMENT);
        
//         JLabel userRole = new JLabel("System Admin");
//         userRole.setFont(new Font("Segoe UI", Font.PLAIN, 12));
//         userRole.setForeground(new Color(180, 190, 200));
//         userRole.setAlignmentX(Component.RIGHT_ALIGNMENT);
        
//         userDetails.add(userName);
//         userDetails.add(userRole);
        
//         userInfo.add(userDetails);
//         userInfo.add(userAvatar);
        
//         userPanel.add(notificationIcon);
//         userPanel.add(userInfo);
        
//         return userPanel;
//     }

//     private JPanel createStatsPanel() {
//         JPanel statsPanel = new JPanel(new GridLayout(1, 4, 25, 0));
//         statsPanel.setOpaque(false);
//         statsPanel.setPreferredSize(new Dimension(0, 100));
        
//         // Calculate stats
//         long totalStudents = students.size();
//         long totalCourses = courses.size();
//         long paidFees = feeRecords.stream().filter(f -> f.status.equalsIgnoreCase("Paid")).count();
//         long dueFees = feeRecords.stream().filter(f -> f.status.equalsIgnoreCase("Due")).count();
        
//         statsPanel.add(createStatCard("Total Students", String.valueOf(totalStudents), "👥", INFO_COLOR));
//         statsPanel.add(createStatCard("Active Courses", String.valueOf(totalCourses), "📚", SUCCESS_COLOR));
//         statsPanel.add(createStatCard("Fees Paid", String.valueOf(paidFees), "✅", SUCCESS_COLOR));
//         statsPanel.add(createStatCard("Fees Due", String.valueOf(dueFees), "⏰", ACCENT_COLOR));
        
//         return statsPanel;
//     }

//     private JPanel createStatCard(String title, String value, String icon, Color accentColor) {
//         JPanel card = new JPanel() {
//             @Override
//             protected void paintComponent(Graphics g) {
//                 Graphics2D g2d = (Graphics2D) g;
//                 g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
//                 // Draw shadow
//                 g2d.setColor(SHADOW_COLOR);
//                 g2d.fillRoundRect(2, 2, getWidth()-2, getHeight()-2, 15, 15);
                
//                 // Draw card background
//                 g2d.setColor(CARD_COLOR);
//                 g2d.fillRoundRect(0, 0, getWidth()-2, getHeight()-2, 15, 15);
                
//                 // Draw accent line
//                 g2d.setColor(accentColor);
//                 g2d.fillRoundRect(0, 0, 4, getHeight()-2, 2, 2);
//             }
//         };
        
//         card.setLayout(new BorderLayout(15, 10));
//         card.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
//         card.setOpaque(false);
        
//         // Icon
//         JLabel iconLabel = new JLabel(icon);
//         iconLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 24));
//         iconLabel.setHorizontalAlignment(JLabel.CENTER);
        
//         // Value and title
//         JPanel textPanel = new JPanel();
//         textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
//         textPanel.setOpaque(false);
        
//         JLabel valueLabel = new JLabel(value);
//         valueLabel.setFont(new Font("Segoe UI", Font.BOLD, 28));
//         valueLabel.setForeground(TEXT_PRIMARY);
//         valueLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
//         JLabel titleLabel = new JLabel(title);
//         titleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
//         titleLabel.setForeground(TEXT_SECONDARY);
//         titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
//         textPanel.add(valueLabel);
//         textPanel.add(Box.createVerticalStrut(5));
//         textPanel.add(titleLabel);
        
//         card.add(iconLabel, BorderLayout.WEST);
//         card.add(textPanel, BorderLayout.CENTER);
        
//         return card;
//     }

//     private JPanel createEnhancedDashboardCard(String title, String description, ImageIcon icon, 
//                                              Color accentColor, ActionListener listener) {
//         JPanel card = new JPanel() {
//             private boolean isHovered = false;
            
//             @Override
//             protected void paintComponent(Graphics g) {
//                 Graphics2D g2d = (Graphics2D) g;
//                 g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
//                 // Draw shadow
//                 if (isHovered) {
//                     g2d.setColor(new Color(0, 0, 0, 40));
//                     g2d.fillRoundRect(4, 4, getWidth()-4, getHeight()-4, 20, 20);
//                 } else {
//                     g2d.setColor(SHADOW_COLOR);
//                     g2d.fillRoundRect(2, 2, getWidth()-2, getHeight()-2, 20, 20);
//                 }
                
//                 // Draw card background
//                 g2d.setColor(isHovered ? CARD_HOVER_COLOR : CARD_COLOR);
//                 g2d.fillRoundRect(0, 0, getWidth()-2, getHeight()-2, 20, 20);
                
//                 // Draw accent border
//                 if (isHovered) {
//                     g2d.setColor(accentColor);
//                     g2d.setStroke(new BasicStroke(2));
//                     g2d.drawRoundRect(1, 1, getWidth()-4, getHeight()-4, 20, 20);
//                 }
//             }
            
//             public void setHovered(boolean hovered) {
//                 this.isHovered = hovered;
//                 repaint();
//             }
//         };
        
        
//         card.setLayout(new BorderLayout(20, 20));
//         card.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
//         card.setOpaque(false);
//         card.setPreferredSize(new Dimension(350, 220));

//         // Icon panel with colored background
//         JPanel iconPanel = new JPanel() {
//             @Override
//             protected void paintComponent(Graphics g) {
//                 Graphics2D g2d = (Graphics2D) g;
//                 g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//                 g2d.setColor(new Color(accentColor.getRed(), accentColor.getGreen(), accentColor.getBlue(), 30));
//                 g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
//             }
//         };
//         iconPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
//         iconPanel.setOpaque(false);
//         iconPanel.setPreferredSize(new Dimension(80, 80));
//         iconPanel.add(new JLabel(icon));

//         // Content panel
//         JPanel contentPanel = new JPanel();
//         contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
//         contentPanel.setOpaque(false);
        
//         JLabel titleLabel = new JLabel(title);
//         titleLabel.setFont(titleFont);
//         titleLabel.setForeground(TEXT_PRIMARY);
//         titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

//         JLabel descLabel = new JLabel("<html><div style='text-align: center; line-height: 1.4;'>" 
//             + description + "</div></html>");
//         descLabel.setFont(subtitleFont);
//         descLabel.setForeground(TEXT_SECONDARY);
//         descLabel.setHorizontalAlignment(JLabel.CENTER);
        
//         contentPanel.add(titleLabel);
//         contentPanel.add(Box.createVerticalStrut(10));
//         contentPanel.add(descLabel);

//         // Enhanced button
//         JButton actionButton = createModernButton("Open Module", accentColor);
//         actionButton.addActionListener(listener);

//         JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//         buttonPanel.setOpaque(false);
//         buttonPanel.add(actionButton);

//         card.add(iconPanel, BorderLayout.NORTH);
//         card.add(contentPanel, BorderLayout.CENTER);
//         card.add(buttonPanel, BorderLayout.SOUTH);

//         // Enhanced hover effects
//         card.addMouseListener(new java.awt.event.MouseAdapter() {
//             public void mouseEntered(java.awt.event.MouseEvent evt) {
//                 ((JPanel)card).setHovered(true);
//                 card.setCursor(new Cursor(Cursor.HAND_CURSOR));
//             }

//             public void mouseExited(java.awt.event.MouseEvent evt) {
//                 ((JPanel)card).setHovered(false);
//                 card.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
//             }
//         });

//         return card;
//     }

//     private JButton createModernButton(String text, Color accentColor) {
//         JButton button = new JButton(text) {
//             @Override
//             protected void paintComponent(Graphics g) {
//                 Graphics2D g2d = (Graphics2D) g;
//                 g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
//                 // Button background
//                 if (getModel().isPressed()) {
//                     g2d.setColor(PRIMARY_COLOR.darker());
//                 } else if (getModel().isRollover()) {
//                     g2d.setColor(SECONDARY_COLOR);
//                 } else {
//                     g2d.setColor(PRIMARY_COLOR);
//                 }
                
//                 g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25);
                
//                 // Button text
//                 g2d.setColor(Color.WHITE);
//                 g2d.setFont(getFont());
//                 FontMetrics fm = g2d.getFontMetrics();
//                 int x = (getWidth() - fm.stringWidth(getText())) / 2;
//                 int y = (getHeight() + fm.getAscent() - fm.getDescent()) / 2;
//                 g2d.drawString(getText(), x, y);
//             }
//         };
        
//         button.setFont(new Font("Segoe UI", Font.BOLD, 14));
//         button.setForeground(Color.WHITE);
//         button.setPreferredSize(new Dimension(140, 40));
//         button.setBorderPainted(false);
//         button.setContentAreaFilled(false);
//         button.setFocusPainted(false);
//         button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
//         return button;
//     }
    
//     private JPanel createEnhancedStatusBar() {
//         JPanel statusBar = new JPanel() {
//             @Override
//             protected void paintComponent(Graphics g) {
//                 Graphics2D g2d = (Graphics2D) g;
//                 g2d.setColor(new Color(248, 249, 250));
//                 g2d.fillRect(0, 0, getWidth(), getHeight());
                
//                 // Top border
//                 g2d.setColor(new Color(220, 225, 230));
//                 g2d.drawLine(0, 0, getWidth(), 0);
//             }
//         };
//         statusBar.setLayout(new BorderLayout());
//         statusBar.setBorder(BorderFactory.createEmptyBorder(12, 20, 12, 20));
//         statusBar.setPreferredSize(new Dimension(0, 45));
        
//         // Status info
//         JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
//         leftPanel.setOpaque(false);
        
//         JLabel statusIcon = new JLabel("🟢");
//         JLabel statusLabel = new JLabel("System Online • Database Connected • Last Login: Today 09:30 AM");
//         statusLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
//         statusLabel.setForeground(TEXT_SECONDARY);
        
//         leftPanel.add(statusIcon);
//         leftPanel.add(Box.createHorizontalStrut(8));
//         leftPanel.add(statusLabel);
        
//         // Time and version
//         JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 0));
//         rightPanel.setOpaque(false);
        
//         JLabel versionLabel = new JLabel("v2.0.1");
//         versionLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
//         versionLabel.setForeground(TEXT_LIGHT);
        
//         JLabel timeLabel = new JLabel("🕐 " + java.time.LocalTime.now().toString().substring(0, 5));
//         timeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
//         timeLabel.setForeground(TEXT_SECONDARY);
        
//         rightPanel.add(versionLabel);
//         rightPanel.add(timeLabel);
        
//         statusBar.add(leftPanel, BorderLayout.WEST);
//         statusBar.add(rightPanel, BorderLayout.EAST);
        
//         return statusBar;
//     }

//     // Enhanced icon creation methods
//     private ImageIcon createModernStudentIcon() {
//         return createModernIcon(48, 48, INFO_COLOR, "👨‍🎓");
//     }
    
//     private ImageIcon createModernCourseIcon() {
//         return createModernIcon(48, 48, SUCCESS_COLOR, "📚");
//     }
    
//     private ImageIcon createModernFeeIcon() {
//         return createModernIcon(48, 48, WARNING_COLOR, "💳");
//     }
    
//     private ImageIcon createModernReportIcon() {
//         return createModernIcon(48, 48, ACCENT_COLOR, "📊");
//     }
    
//     private ImageIcon createModernLogoIcon() {
//         return createModernIcon(50, 50, Color.WHITE, "🎓");
//     }
    
//     private ImageIcon createUserAvatarIcon() {
//         return createModernIcon(35, 35, new Color(255, 255, 255, 200), "👤");
//     }
    
//     private ImageIcon createNotificationIcon() {
//         return createModernIcon(24, 24, WARNING_COLOR, "🔔");
//     }
    
//     private ImageIcon createModernIcon(int width, int height, Color bgColor, String emoji) {
//         java.awt.image.BufferedImage img = new java.awt.image.BufferedImage(width, height, 
//             java.awt.image.BufferedImage.TYPE_INT_ARGB);
//         Graphics2D g2 = img.createGraphics();
//         g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
//         // Create modern circular background with gradient
//         GradientPaint gradient = new GradientPaint(0, 0, bgColor, width, height, 
//             new Color(bgColor.getRed(), bgColor.getGreen(), bgColor.getBlue(), 180));
//         g2.setPaint(gradient);
//         g2.fillOval(2, 2, width-4, height-4);
        
//         // Add subtle border
//         g2.setColor(new Color(255, 255, 255, 100));
//         g2.setStroke(new BasicStroke(1.5f));
//         g2.drawOval(2, 2, width-4, height-4);
        
//         // Add emoji
//         g2.setColor(Color.WHITE);
//         g2.setFont(new Font("Segoe UI Emoji", Font.PLAIN, width/2));
//         FontMetrics fm = g2.getFontMetrics();
//         int x = (width - fm.stringWidth(emoji)) / 2;
//         int y = ((height - fm.getHeight()) / 2) + fm.getAscent();
//         g2.drawString(emoji, x, y);
        
//         g2.dispose();
//         return new ImageIcon(img);
//     }

//     private void createMenuBar() {
//         menuBar = new JMenuBar() {
//             @Override
//             protected void paintComponent(Graphics g) {
//                 Graphics2D g2d = (Graphics2D) g;
//                 g2d.setColor(SECONDARY_COLOR);
//                 g2d.fillRect(0, 0, getWidth(), getHeight());
//             }
//         };
//         menuBar.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

//         JMenu fileMenu = createStyledMenu("File");
//         JMenuItem settingsItem = createStyledMenuItem("Settings");
//         JMenuItem logoutItem = createStyledMenuItem("Logout");
//         JMenuItem exitItem = createStyledMenuItem("Exit");

//         logoutItem.addActionListener(e -> logout());
//         exitItem.addActionListener(e -> System.exit(0));

//         fileMenu.add(settingsItem);
//         fileMenu.addSeparator();
//         fileMenu.add(logoutItem);
//         fileMenu.add(exitItem);

//         JMenu managementMenu = createStyledMenu("Management");
//         JMenuItem studentItem = createStyledMenuItem("Student Management");
//         JMenuItem courseItem = createStyledMenuItem("Course Management");
//         JMenuItem feeItem = createStyledMenuItem("Fee Management");

//         studentItem.addActionListener(e -> openStudentManagement());
//         courseItem.addActionListener(e -> openCourseManagement());
//         feeItem.addActionListener(e -> openFeeManagement());

//         managementMenu.add(studentItem);
//         managementMenu.add(courseItem);
//         managementMenu.add(feeItem);

//         JMenu reportsMenu = createStyledMenu("Reports");
//         JMenuItem studentReportItem = createStyledMenuItem("Student Reports");
//         JMenuItem feeReportItem = createStyledMenuItem("Fee Reports");
//         JMenuItem academicReportItem = createStyledMenuItem("Academic Reports");

//         studentReportItem.addActionListener(e -> showStudentReport());
//         feeReportItem.addActionListener(e -> showFeeReport());
//         academicReportItem.addActionListener(e -> showAcademicReport());

//         reportsMenu.add(studentReportItem);
//         reportsMenu.add(feeReportItem);
//         reportsMenu.add(academicReportItem);

//         JMenu helpMenu = createStyledMenu("Help");
//         JMenuItem helpContentsItem = createStyledMenuItem("Help Contents");
//         JMenuItem aboutItem = createStyledMenuItem("About");

//         aboutItem.addActionListener(e -> showEnhancedAboutDialog());

//         helpMenu.add(helpContentsItem);
//         helpMenu.add(aboutItem);

//         menuBar.add(fileMenu);
//         menuBar.add(managementMenu);
//         menuBar.add(reportsMenu);
//         menuBar.add(helpMenu);

//         setJMenuBar(menuBar);
//     }

//     private JMenu createStyledMenu(String text) {
//         JMenu menu = new JMenu(text);
//         menu.setFont(menuFont);
//         menu.setForeground(Color.WHITE);
//         menu.setOpaque(false);
//         return menu;
//     }

//     private JMenuItem createStyledMenuItem(String text) {
//         JMenuItem item = new JMenuItem(text);
//         item.setFont(bodyFont);
//         item.setBackground(CARD_COLOR);
//         item.setForeground(TEXT_PRIMARY);
//         item.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));
//         return item;
//     }

//     // Action methods for menu items and dashboard cards
//     private void openStudentManagement() {
//         showInfoDialog("Student Management", 
//             "Opening Student Management Module...\n\nFeatures:\n" +
//             "• Add/Edit/Delete Students\n" +
//             "• View Student Records\n" +
//             "• Manage Enrollment\n" +
//             "• Academic Progress Tracking");
//     }

//     private void openCourseManagement() {
//         showInfoDialog("Course Management", 
//             "Opening Course Management Module...\n\nFeatures:\n" +
//             "• Create and Manage Courses\n" +
//             "• Assign Instructors\n" +
//             "• Set Course Schedules\n" +
//             "• Manage Prerequisites");
//     }

//     private void openFeeManagement() {
//         showInfoDialog("Fee Management", 
//             "Opening Fee Management Module...\n\nFeatures:\n" +
//             "• Process Fee Payments\n" +
//             "• Generate Receipts\n" +
//             "• Track Due Amounts\n" +
//             "• Send Payment Reminders");
//     }

//     private void openReports() {
//         showInfoDialog("Reports & Analytics", 
//             "Opening Reports Module...\n\nAvailable Reports:\n" +
//             "• Student Performance Analytics\n" +
//             "• Financial Reports\n" +
//             "• Attendance Statistics\n" +
//             "• Custom Report Builder");
//     }

//     private void showStudentReport() {
//         StringBuilder report = new StringBuilder();
//         report.append("=== STUDENT REPORT ===\n\n");
//         report.append("Total Students: ").append(students.size()).append("\n\n");
        
//         report.append("Students by Department:\n");
//         java.util.Map<String, Long> deptCount = students.stream()
//             .collect(java.util.stream.Collectors.groupingBy(
//                 s -> s.department, java.util.stream.Collectors.counting()));
        
//         deptCount.forEach((dept, count) -> 
//             report.append("• ").append(dept).append(": ").append(count).append(" students\n"));
        
//         report.append("\nStudent Details:\n");
//         for (Student student : students) {
//             report.append("• ").append(student.name)
//                   .append(" (").append(student.id).append(") - ")
//                   .append(student.department).append("\n");
//         }
        
//         showReportDialog("Student Report", report.toString());
//     }

//     private void showFeeReport() {
//         StringBuilder report = new StringBuilder();
//         report.append("=== FEE MANAGEMENT REPORT ===\n\n");
        
//         double totalAmount = feeRecords.stream().mapToDouble(f -> f.amount).sum();
//         double paidAmount = feeRecords.stream()
//             .filter(f -> f.status.equalsIgnoreCase("Paid"))
//             .mapToDouble(f -> f.amount).sum();
//         double dueAmount = totalAmount - paidAmount;
        
//         report.append("Financial Summary:\n");
//         report.append("• Total Fee Amount: $").append(String.format("%.2f", totalAmount)).append("\n");
//         report.append("• Amount Paid: $").append(String.format("%.2f", paidAmount)).append("\n");
//         report.append("• Amount Due: $").append(String.format("%.2f", dueAmount)).append("\n\n");
        
//         report.append("Fee Status Summary:\n");
//         java.util.Map<String, Long> statusCount = feeRecords.stream()
//             .collect(java.util.stream.Collectors.groupingBy(
//                 f -> f.status, java.util.stream.Collectors.counting()));
        
//         statusCount.forEach((status, count) -> 
//             report.append("• ").append(status).append(": ").append(count).append(" records\n"));
        
//         report.append("\nDetailed Fee Records:\n");
//         for (FeeRecord fee : feeRecords) {
//             report.append("• Student ").append(fee.studentId)
//                   .append(": $").append(fee.amount)
//                   .append(" - ").append(fee.status).append("\n");
//         }
        
//         showReportDialog("Fee Report", report.toString());
//     }

//     private void showAcademicReport() {
//         StringBuilder report = new StringBuilder();
//         report.append("=== ACADEMIC REPORT ===\n\n");
        
//         report.append("Course Summary:\n");
//         report.append("• Total Courses: ").append(courses.size()).append("\n\n");
        
//         report.append("Courses by Department:\n");
//         java.util.Map<String, Long> courseDeptCount = courses.stream()
//             .collect(java.util.stream.Collectors.groupingBy(
//                 c -> c.department, java.util.stream.Collectors.counting()));
        
//         courseDeptCount.forEach((dept, count) -> 
//             report.append("• ").append(dept).append(": ").append(count).append(" courses\n"));
        
//         report.append("\nCourse Details:\n");
//         for (Course course : courses) {
//             report.append("• ").append(course.name)
//                   .append(" (").append(course.id).append(") - ")
//                   .append(course.department).append("\n");
//         }
        
//         report.append("\nEnrollment Analysis:\n");
//         report.append("• Average students per department: ")
//                .append(String.format("%.1f", (double)students.size() / 
//                    students.stream().map(s -> s.department).distinct().count()))
//                .append("\n");
        
//         showReportDialog("Academic Report", report.toString());
//     }

//     private void logout() {
//         int option = JOptionPane.showConfirmDialog(this,
//             "Are you sure you want to logout?",
//             "Confirm Logout",
//             JOptionPane.YES_NO_OPTION,
//             JOptionPane.QUESTION_MESSAGE);
        
//         if (option == JOptionPane.YES_OPTION) {
//             JOptionPane.showMessageDialog(this,
//                 "Logged out successfully!",
//                 "Logout",
//                 JOptionPane.INFORMATION_MESSAGE);
//             System.exit(0);
//         }
//     }

//     private void showEnhancedAboutDialog() {
//         JDialog aboutDialog = new JDialog(this, "About Smart Student Management System", true);
//         aboutDialog.setSize(500, 400);
//         aboutDialog.setLocationRelativeTo(this);
        
//         JPanel mainPanel = new JPanel() {
//             @Override
//             protected void paintComponent(Graphics g) {
//                 Graphics2D g2d = (Graphics2D) g;
//                 GradientPaint gradient = new GradientPaint(0, 0, PRIMARY_COLOR, 
//                     0, getHeight(), SECONDARY_COLOR);
//                 g2d.setPaint(gradient);
//                 g2d.fillRect(0, 0, getWidth(), getHeight());
//             }
//         };
//         mainPanel.setLayout(new BorderLayout());
//         mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        
//         // Header with logo
//         JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//         headerPanel.setOpaque(false);
//         headerPanel.add(new JLabel(createModernLogoIcon()));
        
//         // Content
//         JPanel contentPanel = new JPanel();
//         contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
//         contentPanel.setOpaque(false);
//         contentPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        
//         JLabel titleLabel = new JLabel("Smart Student Management System");
//         titleLabel.setFont(titleFont);
//         titleLabel.setForeground(Color.WHITE);
//         titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
//         JLabel versionLabel = new JLabel("Version 2.0.1");
//         versionLabel.setFont(subtitleFont);
//         versionLabel.setForeground(new Color(200, 210, 220));
//         versionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
//         JLabel descLabel = new JLabel("<html><div style='text-align: center; color: #C8D2DC;'>" +
//             "A comprehensive solution for educational institutions<br>" +
//             "to manage students, courses, and financial records.<br><br>" +
//             "Developed with modern UI/UX principles<br>" +
//             "Built with Java Swing</div></html>");
//         descLabel.setFont(bodyFont);
//         descLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
//         contentPanel.add(titleLabel);
//         contentPanel.add(Box.createVerticalStrut(10));
//         contentPanel.add(versionLabel);
//         contentPanel.add(Box.createVerticalStrut(20));
//         contentPanel.add(descLabel);
        
//         // Close button
//         JButton closeButton = createModernButton("Close", SUCCESS_COLOR);
//         closeButton.addActionListener(e -> aboutDialog.dispose());
        
//         JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//         buttonPanel.setOpaque(false);
//         buttonPanel.add(closeButton);
        
//         mainPanel.add(headerPanel, BorderLayout.NORTH);
//         mainPanel.add(contentPanel, BorderLayout.CENTER);
//         mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        
//         aboutDialog.add(mainPanel);
//         aboutDialog.setVisible(true);
//     }

//     private void showInfoDialog(String title, String message) {
//         JDialog dialog = new JDialog(this, title, true);
//         dialog.setSize(400, 300);
//         dialog.setLocationRelativeTo(this);
        
//         JPanel panel = new JPanel(new BorderLayout());
//         panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
//         panel.setBackground(BACKGROUND_COLOR);
        
//         JTextArea textArea = new JTextArea(message);
//         textArea.setFont(bodyFont);
//         textArea.setBackground(CARD_COLOR);
//         textArea.setForeground(TEXT_PRIMARY);
//         textArea.setEditable(false);
//         textArea.setLineWrap(true);
//         textArea.setWrapStyleWord(true);
//         textArea.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        
//         JScrollPane scrollPane = new JScrollPane(textArea);
//         scrollPane.setBorder(BorderFactory.createLineBorder(new Color(220, 225, 230)));
        
//         JButton okButton = createModernButton("OK", INFO_COLOR);
//         okButton.addActionListener(e -> dialog.dispose());
        
//         JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//         buttonPanel.setBackground(BACKGROUND_COLOR);
//         buttonPanel.add(okButton);
        
//         panel.add(scrollPane, BorderLayout.CENTER);
//         panel.add(buttonPanel, BorderLayout.SOUTH);
        
//         dialog.add(panel);
//         dialog.setVisible(true);
//     }

//     private void showReportDialog(String title, String report) {
//         JDialog dialog = new JDialog(this, title, true);
//         dialog.setSize(600, 500);
//         dialog.setLocationRelativeTo(this);
        
//         JPanel panel = new JPanel(new BorderLayout());
//         panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
//         panel.setBackground(BACKGROUND_COLOR);
        
//         JTextArea textArea = new JTextArea(report);
//         textArea.setFont(new Font("Courier New", Font.PLAIN, 12));
//         textArea.setBackground(CARD_COLOR);
//         textArea.setForeground(TEXT_PRIMARY);
//         textArea.setEditable(false);
//         textArea.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        
//         JScrollPane scrollPane = new JScrollPane(textArea);
//         scrollPane.setBorder(BorderFactory.createLineBorder(new Color(220, 225, 230)));
        
//         JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
//         buttonPanel.setBackground(BACKGROUND_COLOR);
        
//         JButton printButton = createModernButton("Print", SUCCESS_COLOR);
//         JButton closeButton = createModernButton("Close", ACCENT_COLOR);
        
//         printButton.addActionListener(e -> {
//             try {
//                 textArea.print();
//             } catch (Exception ex) {
//                 JOptionPane.showMessageDialog(dialog, "Printing failed: " + ex.getMessage());
//             }
//         });
//         closeButton.addActionListener(e -> dialog.dispose());
        
//         buttonPanel.add(printButton);
//         buttonPanel.add(closeButton);
        
//         panel.add(scrollPane, BorderLayout.CENTER);
//         panel.add(buttonPanel, BorderLayout.SOUTH);
        
//         dialog.add(panel);
//         dialog.setVisible(true);
//     }

//     // Data classes
//     public static class Student {
//         public String id;
//         public String name;
//         public String department;
        
//         public Student(String id, String name, String department) {
//             this.id = id;
//             this.name = name;
//             this.department = department;
//         }
//     }

//     public static class Course {
//         public String id;
//         public String name;
//         public String department;
        
//         public Course(String id, String name, String department) {
//             this.id = id;
//             this.name = name;
//             this.department = department;
//         }
//     }

//     public static class FeeRecord {
//         public String studentId;
//         public double amount;
//         public String status;
        
//         public FeeRecord(String studentId, double amount, String status) {
//             this.studentId = studentId;
//             this.amount = amount;
//             this.status = status;
//         }
//     }

//     // Main method to run the application
//     public static void main(String[] args) {
//         // Set system look and feel
//         try {
//             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

//         } catch (Exception e) {
//             e.printStackTrace();
//         }
        
//         // Enable anti-aliasing for better text rendering
//         System.setProperty("awt.useSystemAAFontSettings", "on");
//         System.setProperty("swing.aatext", "true");
        
//         // Run on Event Dispatch Thread
//         SwingUtilities.invokeLater(() -> {
//             try {
//                 new Dashboard().setVisible(true);
//             } catch (Exception e) {
//                 e.printStackTrace();
//                 JOptionPane.showMessageDialog(null, 
//                     "Error starting application: " + e.getMessage(),
//                     "Application Error", 
//                     JOptionPane.ERROR_MESSAGE);
//             }
//         });
//     }
// }








import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dashboard extends JFrame {
    private JPanel contentPanel;
    private JMenuBar menuBar;
    
    // Enhanced custom fonts
    private Font titleFont;
    private Font subtitleFont;
    private Font bodyFont;
    private Font menuFont;
    private Font headerFont;
    
    // Modern color palette
    private final Color PRIMARY_COLOR = new Color(30, 58, 138);      // Deep blue
    private final Color SECONDARY_COLOR = new Color(59, 130, 246);   // Bright blue
    private final Color ACCENT_COLOR = new Color(239, 68, 68);       // Red accent
    private final Color SUCCESS_COLOR = new Color(34, 197, 94);      // Green
    private final Color WARNING_COLOR = new Color(245, 158, 11);     // Orange
    private final Color BACKGROUND_COLOR = new Color(248, 250, 252); // Light gray
    private final Color CARD_COLOR = Color.WHITE;
    private final Color TEXT_PRIMARY = new Color(15, 23, 42);        // Dark slate
    private final Color TEXT_SECONDARY = new Color(100, 116, 139);   // Medium slate
    private final Color BORDER_COLOR = new Color(226, 232, 240);     // Light border

    // Sample data structures
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<FeeRecord> feeRecords = new ArrayList<>();

    public Dashboard() {
        setTitle("Smart Student Management System - Dashboard");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        initFonts();
        initSampleData();
        initComponents();
        
        // Set background color
        getContentPane().setBackground(BACKGROUND_COLOR);
        
        // Add window icon
        setIconImage(createWindowIcon().getImage());
    }
    
    private void initFonts() {
        try {
            // Try to use modern system fonts
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            String[] fontNames = ge.getAvailableFontFamilyNames();
            
            String preferredFont = "Segoe UI";
            boolean hasSegoeUI = false;
            
            for (String fontName : fontNames) {
                if (fontName.equals("Segoe UI")) {
                    hasSegoeUI = true;
                    break;
                }
            }
            
            if (!hasSegoeUI) {
                // Try other modern fonts
                for (String fontName : fontNames) {
                    if (fontName.contains("Arial") || fontName.contains("Helvetica")) {
                        preferredFont = fontName;
                        break;
                    }
                }
            }
            
            headerFont = new Font(preferredFont, Font.BOLD, 28);
            titleFont = new Font(preferredFont, Font.BOLD, 18);
            subtitleFont = new Font(preferredFont, Font.PLAIN, 14);
            bodyFont = new Font(preferredFont, Font.PLAIN, 13);
            menuFont = new Font(preferredFont, Font.PLAIN, 13);
            
        } catch (Exception e) {
            // Fallback fonts
            headerFont = new Font(Font.SANS_SERIF, Font.BOLD, 28);
            titleFont = new Font(Font.SANS_SERIF, Font.BOLD, 18);
            subtitleFont = new Font(Font.SANS_SERIF, Font.PLAIN, 14);
            bodyFont = new Font(Font.SANS_SERIF, Font.PLAIN, 13);
            menuFont = new Font(Font.SANS_SERIF, Font.PLAIN, 13);
        }
    }

    private void initSampleData() {
        // Sample Students
        students.add(new Student("STU001", "Alexander Johnson", "Computer Science", "alex.johnson@email.com"));
        students.add(new Student("STU002", "Emma Rodriguez", "Mechanical Engineering", "emma.rodriguez@email.com"));
        students.add(new Student("STU003", "Michael Chen", "Electrical Engineering", "michael.chen@email.com"));
        students.add(new Student("STU004", "Sophia Williams", "Data Science", "sophia.williams@email.com"));
        students.add(new Student("STU005", "James Thompson", "Civil Engineering", "james.thompson@email.com"));

        // Sample Courses
        courses.add(new Course("CS101", "Introduction to Programming", "Computer Science", 4));
        courses.add(new Course("ME201", "Thermodynamics", "Mechanical Engineering", 3));
        courses.add(new Course("EE301", "Circuit Analysis", "Electrical Engineering", 4));
        courses.add(new Course("DS101", "Statistics and Probability", "Data Science", 3));
        courses.add(new Course("CE201", "Structural Engineering", "Civil Engineering", 4));

        // Sample Fee Records
        feeRecords.add(new FeeRecord("STU001", 5000, "Paid", "2024-01-15"));
        feeRecords.add(new FeeRecord("STU002", 4500, "Due", "2024-02-01"));
        feeRecords.add(new FeeRecord("STU003", 5200, "Pending", "2024-01-20"));
        feeRecords.add(new FeeRecord("STU004", 4800, "Paid", "2024-01-10"));
        feeRecords.add(new FeeRecord("STU005", 5100, "Overdue", "2023-12-15"));
    }

    private void initComponents() {
        createMenuBar();

        contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setBackground(BACKGROUND_COLOR);

        // Create header panel
        JPanel headerPanel = createHeaderPanel();
        contentPanel.add(headerPanel, BorderLayout.NORTH);

        // Create main content with stats and dashboard
        JPanel mainPanel = new JPanel(new BorderLayout(0, 20));
        mainPanel.setBackground(BACKGROUND_COLOR);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));

        // Add statistics panel
        JPanel statsPanel = createStatsPanel();
        mainPanel.add(statsPanel, BorderLayout.NORTH);

        // Create dashboard panel
        JPanel dashboardPanel = new JPanel(new GridBagLayout());
        dashboardPanel.setBackground(BACKGROUND_COLOR);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(15, 15, 15, 15);
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        // Row 1
        gbc.gridx = 0; gbc.gridy = 0;
        dashboardPanel.add(createDashboardCard("Student Management", 
            "Manage student records, enrollment, and academic information",
            "👨‍🎓", PRIMARY_COLOR, e -> openStudentManagement()), gbc);

        gbc.gridx = 1;
        dashboardPanel.add(createDashboardCard("Course Management", 
            "Organize courses, schedules, and academic curriculum",
            "📚", new Color(16, 185, 129), e -> openCourseManagement()), gbc);

        // Row 2
        gbc.gridx = 0; gbc.gridy = 1;
        dashboardPanel.add(createDashboardCard("Fee Management", 
            "Track payments, dues, and financial records",
            "💰", WARNING_COLOR, e -> openFeeManagement()), gbc);

        gbc.gridx = 1;
        dashboardPanel.add(createDashboardCard("Reports & Analytics", 
            "Generate insights and comprehensive reports",
            "📊", new Color(139, 92, 246), e -> openReports()), gbc);

        mainPanel.add(dashboardPanel, BorderLayout.CENTER);
        contentPanel.add(mainPanel, BorderLayout.CENTER);

        // Create enhanced status bar
        JPanel statusBar = createStatusBar();
        contentPanel.add(statusBar, BorderLayout.SOUTH);

        add(contentPanel, BorderLayout.CENTER);
    }
    
    private JPanel createHeaderPanel() {
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BorderLayout());
        headerPanel.setBackground(PRIMARY_COLOR);
        headerPanel.setBorder(BorderFactory.createEmptyBorder(25, 40, 25, 40));
        
        // Create logo/icon with better styling
        JPanel logoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        logoPanel.setOpaque(false);
        
        JLabel logoIcon = new JLabel(createHeaderIcon());
        logoPanel.add(logoIcon);
        
        // Create title section
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
        titlePanel.setOpaque(false);
        titlePanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        
        JLabel titleLabel = new JLabel("Student Management System");
        titleLabel.setFont(headerFont);
        titleLabel.setForeground(Color.WHITE);
        
        JLabel subtitleLabel = new JLabel("Streamlined Academic Administration");
        subtitleLabel.setFont(subtitleFont);
        subtitleLabel.setForeground(new Color(203, 213, 225));
        
        titlePanel.add(titleLabel);
        titlePanel.add(Box.createVerticalStrut(5));
        titlePanel.add(subtitleLabel);
        
        // Create user info panel with better design
        JPanel userPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        userPanel.setOpaque(false);
        
        // User avatar
        JLabel userAvatar = new JLabel(createUserAvatar());
        
        // User info
        JPanel userInfoPanel = new JPanel();
        userInfoPanel.setLayout(new BoxLayout(userInfoPanel, BoxLayout.Y_AXIS));
        userInfoPanel.setOpaque(false);
        userInfoPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
        
        JLabel userNameLabel = new JLabel("Administrator");
        userNameLabel.setFont(new Font(bodyFont.getName(), Font.BOLD, 14));
        userNameLabel.setForeground(Color.WHITE);
        userNameLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
        
        JLabel userRoleLabel = new JLabel("System Admin");
        userRoleLabel.setFont(bodyFont);
        userRoleLabel.setForeground(new Color(203, 213, 225));
        userRoleLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
        
        userInfoPanel.add(userNameLabel);
        userInfoPanel.add(userRoleLabel);
        
        userPanel.add(userInfoPanel);
        userPanel.add(userAvatar);
        
        headerPanel.add(logoPanel, BorderLayout.WEST);
        headerPanel.add(titlePanel, BorderLayout.CENTER);
        headerPanel.add(userPanel, BorderLayout.EAST);
        
        return headerPanel;
    }

    private JPanel createStatsPanel() {
        JPanel statsPanel = new JPanel(new GridLayout(1, 4, 20, 0));
        statsPanel.setBackground(BACKGROUND_COLOR);
        statsPanel.setPreferredSize(new Dimension(0, 100));

        // Total Students
        statsPanel.add(createStatCard("Total Students", String.valueOf(students.size()), 
            "👥", new Color(59, 130, 246)));

        // Total Courses
        statsPanel.add(createStatCard("Active Courses", String.valueOf(courses.size()), 
            "📖", new Color(16, 185, 129)));

        // Pending Fees
        long pendingFees = feeRecords.stream()
            .filter(f -> !f.status.equalsIgnoreCase("Paid"))
            .count();
        statsPanel.add(createStatCard("Pending Fees", String.valueOf(pendingFees), 
            "⏰", new Color(245, 158, 11)));

        // Revenue
        double totalRevenue = feeRecords.stream()
            .filter(f -> f.status.equalsIgnoreCase("Paid"))
            .mapToDouble(f -> f.amount)
            .sum();
        statsPanel.add(createStatCard("Revenue", "$" + String.format("%.0f", totalRevenue), 
            "💸", new Color(34, 197, 94)));

        return statsPanel;
    }

    private JPanel createStatCard(String title, String value, String icon, Color accentColor) {
        JPanel card = new JPanel();
        card.setLayout(new BorderLayout(10, 5));
        card.setBackground(CARD_COLOR);
        card.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BORDER_COLOR, 1),
            BorderFactory.createEmptyBorder(15, 20, 15, 20)
        ));

        // Icon
        JLabel iconLabel = new JLabel(icon);
        iconLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 24));
        iconLabel.setForeground(accentColor);

        // Content
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setOpaque(false);

        JLabel valueLabel = new JLabel(value);
        valueLabel.setFont(new Font(titleFont.getName(), Font.BOLD, 24));
        valueLabel.setForeground(TEXT_PRIMARY);

        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(bodyFont);
        titleLabel.setForeground(TEXT_SECONDARY);

        contentPanel.add(valueLabel);
        contentPanel.add(titleLabel);

        card.add(iconLabel, BorderLayout.WEST);
        card.add(contentPanel, BorderLayout.CENTER);

        return card;
    }

    private JPanel createDashboardCard(String title, String description, String icon, 
                                     Color accentColor, ActionListener listener) {
        JPanel card = new JPanel();
        card.setLayout(new BorderLayout(0, 15));
        card.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(BORDER_COLOR, 1),
                BorderFactory.createEmptyBorder(30, 30, 30, 30)));
        card.setBackground(CARD_COLOR);
        card.setPreferredSize(new Dimension(350, 200));

        // Create icon panel
        JPanel iconPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        iconPanel.setOpaque(false);
        
        JLabel iconBg = new JLabel();
        iconBg.setOpaque(true);
        iconBg.setBackground(new Color(accentColor.getRed(), accentColor.getGreen(), 
                                     accentColor.getBlue(), 30));
        iconBg.setHorizontalAlignment(SwingConstants.CENTER);
        iconBg.setVerticalAlignment(SwingConstants.CENTER);
        iconBg.setPreferredSize(new Dimension(80, 80));
        iconBg.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        
        JLabel iconLabel = new JLabel(icon);
        iconLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 32));
        iconLabel.setHorizontalAlignment(SwingConstants.CENTER);
        iconLabel.setVerticalAlignment(SwingConstants.CENTER);
        
        iconBg.setLayout(new BorderLayout());
        iconBg.add(iconLabel, BorderLayout.CENTER);
        iconPanel.add(iconBg);

        // Create content panel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setOpaque(false);

        JLabel titleLabel = new JLabel(title, JLabel.CENTER);
        titleLabel.setFont(titleFont);
        titleLabel.setForeground(TEXT_PRIMARY);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel descLabel = new JLabel("<html><div style='text-align: center; width: 280px;'>" + 
                                    description + "</div></html>");
        descLabel.setFont(subtitleFont);
        descLabel.setForeground(TEXT_SECONDARY);
        descLabel.setHorizontalAlignment(JLabel.CENTER);
        descLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        contentPanel.add(titleLabel);
        contentPanel.add(Box.createVerticalStrut(10));
        contentPanel.add(descLabel);

        // Enhanced button
        JButton openButton = new JButton("Access Module");
        openButton.setFont(new Font(bodyFont.getName(), Font.BOLD, 13));
        openButton.setBackground(accentColor);
        openButton.setForeground(Color.WHITE);
        openButton.setBorder(BorderFactory.createEmptyBorder(12, 24, 12, 24));
        openButton.setFocusPainted(false);
        openButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        openButton.addActionListener(listener);
        
        // Button hover effect
        openButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                openButton.setBackground(new Color(accentColor.getRed() - 20, 
                                                 accentColor.getGreen() - 20, 
                                                 accentColor.getBlue() - 20));
            }
            public void mouseExited(MouseEvent evt) {
                openButton.setBackground(accentColor);
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setOpaque(false);
        buttonPanel.add(openButton);

        card.add(iconPanel, BorderLayout.NORTH);
        card.add(contentPanel, BorderLayout.CENTER);
        card.add(buttonPanel, BorderLayout.SOUTH);

        // Enhanced card hover effect
        card.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                card.setBackground(new Color(249, 250, 251));
                card.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(accentColor, 2),
                        BorderFactory.createEmptyBorder(29, 29, 29, 29)));
                card.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            public void mouseExited(MouseEvent evt) {
                card.setBackground(CARD_COLOR);
                card.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(BORDER_COLOR, 1),
                        BorderFactory.createEmptyBorder(30, 30, 30, 30)));
                card.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        return card;
    }
    
    private JPanel createStatusBar() {
        JPanel statusBar = new JPanel(new BorderLayout());
        statusBar.setBackground(new Color(51, 65, 85));
        statusBar.setBorder(BorderFactory.createEmptyBorder(12, 20, 12, 20));
        
        // Left status info
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        leftPanel.setOpaque(false);
        
        JLabel statusDot = new JLabel("●");
        statusDot.setForeground(SUCCESS_COLOR);
        statusDot.setFont(new Font(bodyFont.getName(), Font.BOLD, 16));
        
        JLabel statusLabel = new JLabel("System Online | Database Connected");
        statusLabel.setFont(bodyFont);
        statusLabel.setForeground(Color.WHITE);
        statusLabel.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        
        leftPanel.add(statusDot);
        leftPanel.add(statusLabel);
        
        // Right time info
        LocalTime now = LocalTime.now();
        String currentTime = now.format(DateTimeFormatter.ofPattern("HH:mm"));
        
        JLabel timeLabel = new JLabel("🕐 " + currentTime + " | Last Updated: Just now");
        timeLabel.setFont(bodyFont);
        timeLabel.setForeground(new Color(203, 213, 225));
        
        statusBar.add(leftPanel, BorderLayout.WEST);
        statusBar.add(timeLabel, BorderLayout.EAST);
        
        return statusBar;
    }

    // Enhanced icon creation methods
    private ImageIcon createHeaderIcon() {
        return createGradientIcon(50, 50, PRIMARY_COLOR, SECONDARY_COLOR, "🎓");
    }
    
    private ImageIcon createUserAvatar() {
        return createGradientIcon(40, 40, new Color(99, 102, 241), new Color(168, 85, 247), "👤");
    }
    
    private ImageIcon createWindowIcon() {
        return createGradientIcon(32, 32, PRIMARY_COLOR, SECONDARY_COLOR, "🎓");
    }
    
    private ImageIcon createGradientIcon(int width, int height, Color color1, Color color2, String emoji) {
        java.awt.image.BufferedImage img = new java.awt.image.BufferedImage(
            width, height, java.awt.image.BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Create gradient background
        GradientPaint gradient = new GradientPaint(0, 0, color1, width, height, color2);
        g2.setPaint(gradient);
        g2.fillOval(2, 2, width-4, height-4);
        
        // Add emoji
        g2.setColor(Color.WHITE);
        try {
            g2.setFont(new Font("Segoe UI Emoji", Font.PLAIN, width/2));
        } catch (Exception e) {
            g2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, width/2));
        }
        FontMetrics fm = g2.getFontMetrics();
        int x = (width - fm.stringWidth(emoji)) / 2;
        int y = ((height - fm.getHeight()) / 2) + fm.getAscent();
        g2.drawString(emoji, x, y);
        
        g2.dispose();
        return new ImageIcon(img);
    }

    private void createMenuBar() {
        menuBar = new JMenuBar();
        menuBar.setBackground(new Color(51, 65, 85));
        menuBar.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createMatteBorder(0, 0, 1, 0, BORDER_COLOR),
            BorderFactory.createEmptyBorder(8, 15, 8, 15)
        ));

        // File Menu
        JMenu fileMenu = createStyledMenu("File");
        fileMenu.add(createStyledMenuItem("Settings", e -> showSettings()));
        fileMenu.addSeparator();
        fileMenu.add(createStyledMenuItem("Logout", e -> logout()));
        fileMenu.add(createStyledMenuItem("Exit", e -> System.exit(0)));

        // Management Menu
        JMenu managementMenu = createStyledMenu("Management");
        managementMenu.add(createStyledMenuItem("Students", e -> openStudentManagement()));
        managementMenu.add(createStyledMenuItem("Courses", e -> openCourseManagement()));
        managementMenu.add(createStyledMenuItem("Fees", e -> openFeeManagement()));

        // Reports Menu
        JMenu reportsMenu = createStyledMenu("Reports");
        reportsMenu.add(createStyledMenuItem("Student Reports", e -> showStudentReport()));
        reportsMenu.add(createStyledMenuItem("Fee Reports", e -> showFeeReport()));
        reportsMenu.add(createStyledMenuItem("Academic Reports", e -> showAcademicReport()));

        // Tools Menu
        JMenu toolsMenu = createStyledMenu("Tools");
        toolsMenu.add(createStyledMenuItem("Import Data", e -> showImportDialog()));
        toolsMenu.add(createStyledMenuItem("Export Data", e -> showExportDialog()));
        toolsMenu.add(createStyledMenuItem("Backup", e -> showBackupDialog()));

        // Help Menu
        JMenu helpMenu = createStyledMenu("Help");
        helpMenu.add(createStyledMenuItem("User Guide", e -> showUserGuide()));
        helpMenu.add(createStyledMenuItem("About", e -> showAbout()));

        menuBar.add(fileMenu);
        menuBar.add(managementMenu);
        menuBar.add(reportsMenu);
        menuBar.add(toolsMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);
    }
    
    private JMenu createStyledMenu(String text) {
        JMenu menu = new JMenu(text);
        menu.setFont(menuFont);
        menu.setForeground(Color.WHITE);
        menu.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        return menu;
    }
    
    private JMenuItem createStyledMenuItem(String text, ActionListener listener) {
        JMenuItem item = new JMenuItem(text);
        item.setFont(bodyFont);
        item.addActionListener(listener);
        return item;
    }

    // Enhanced dialog methods
    private void showSettings() {
        JOptionPane.showMessageDialog(this,
            "<html><body style='font-family: Segoe UI; padding: 20px; width: 300px;'>" +
            "<h2 style='color: #1e40af; margin-bottom: 15px;'>⚙️ System Settings</h2>" +
            "<p style='margin: 10px 0;'><b>Theme:</b> Modern Light</p>" +
            "<p style='margin: 10px 0;'><b>Language:</b> English</p>" +
            "<p style='margin: 10px 0;'><b>Auto-save:</b> Enabled</p>" +
            "<p style='margin: 10px 0;'><b>Notifications:</b> On</p>" +
            "<hr style='margin: 15px 0;'>" +
            "<p style='color: #64748b;'><i>Settings panel coming soon!</i></p>" +
            "</body></html>",
            "Settings", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showImportDialog() {
        JOptionPane.showMessageDialog(this,
            "<html><body style='font-family: Segoe UI; padding: 20px; width: 280px;'>" +
            "<h2 style='color: #059669; margin-bottom: 15px;'>📥 Import Data</h2>" +
            "<p>Supported formats:</p>" +
            "<ul><li>CSV files</li><li>Excel spreadsheets</li><li>JSON data</li></ul>" +
            "<p style='color: #64748b; margin-top: 15px;'><i>Import functionality coming soon!</i></p>" +
            "</body></html>",
            "Import Data", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showExportDialog() {
        JOptionPane.showMessageDialog(this,
            "<html><body style='font-family: Segoe UI; padding: 20px; width: 280px;'>" +
            "<h2 style='color: #7c3aed; margin-bottom: 15px;'>📤 Export Data</h2>" +
            "<p>Export options:</p>" +
            "<ul><li>Student records</li><li>Course information</li><li>Fee reports</li></ul>" +
            "<p style='color: #64748b; margin-top: 15px;'><i>Export functionality coming soon!</i></p>" +
            "</body></html>",
            "Export Data", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showBackupDialog() {
        JOptionPane.showMessageDialog(this,
            "<html><body style='font-family: Segoe UI; padding: 20px; width: 280px;'>" +
            "<h2 style='color: #dc2626; margin-bottom: 15px;'>💾 System Backup</h2>" +
            "<p><b>Last Backup:</b> Today, 08:00 AM</p>" +
            "<p><b>Status:</b> <span style='color: #059669;'>✓ Up to date</span></p>" +
            "<p><b>Size:</b> 125.6 MB</p>" +
            "<hr style='margin: 15px 0;'>" +
            "<p style='color: #64748b;'><i>Automated backup active</i></p>" +
            "</body></html>",
            "System Backup", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showUserGuide() {
        JOptionPane.showMessageDialog(this,
            "<html><body style='font-family: Segoe UI; padding: 20px; width: 320px;'>" +
            "<h2 style='color: #1e40af; margin-bottom: 15px;'>📖 User Guide</h2>" +
            "<p><b>Quick Start:</b></p>" +
            "<ol>" +
            "<li>Navigate using the dashboard cards</li>" +
            "<li>Use the menu bar for advanced features</li>" +
            "<li>Check the status bar for system info</li>" +
            "</ol>" +
            "<p><b>Need Help?</b></p>" +
            "<p>Contact support: <a href='mailto:admin@sms.edu'>admin@sms.edu</a></p>" +
            "</body></html>",
            "User Guide", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showAbout() {
        JOptionPane.showMessageDialog(this,
            "<html><body style='font-family: Segoe UI; padding: 25px; width: 350px; text-align: center;'>" +
            "<h1 style='color: #1e40af; margin-bottom: 10px;'>🎓 Student Management System</h1>" +
            "<p style='font-size: 16px; color: #64748b; margin-bottom: 20px;'>Version 2.0.0</p>" +
            "<div style='background: #f8fafc; padding: 15px; border-radius: 8px; margin: 15px 0;'>" +
            "<p style='margin: 5px 0;'><b>Modern Academic Management</b></p>" +
            "<p style='margin: 5px 0; color: #64748b;'>Streamlined • Efficient • Intuitive</p>" +
            "</div>" +
            "<p style='color: #64748b; font-size: 12px;'>© 2025 Educational Solutions Inc.</p>" +
            "<p style='color: #64748b; font-size: 12px;'>Built with Java Swing & Modern UI</p>" +
            "</body></html>",
            "About SMS", JOptionPane.INFORMATION_MESSAGE);
    }

    private void logout() {
        int option = JOptionPane.showConfirmDialog(this,
                "<html><body style='font-family: Segoe UI; padding: 15px;'>" +
                "<h3 style='color: #dc2626; margin-bottom: 10px;'>🚪 Logout Confirmation</h3>" +
                "<p>Are you sure you want to logout from the system?</p>" +
                "<p style='color: #64748b; font-size: 12px; margin-top: 15px;'>" +
                "All unsaved changes will be preserved.</p>" +
                "</body></html>",
                "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (option == JOptionPane.YES_OPTION) {
            // Show logout animation/message
            JOptionPane.showMessageDialog(this,
                "<html><body style='font-family: Segoe UI; padding: 20px; text-align: center;'>" +
                "<h2 style='color: #059669;'>✅ Logged Out Successfully</h2>" +
                "<p>Thank you for using Student Management System!</p>" +
                "</body></html>",
                "Goodbye", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    // Enhanced module implementations
    private void openStudentManagement() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body style='font-family: Segoe UI; padding: 20px; width: 500px;'>");
        sb.append("<h2 style='color: #1e40af; margin-bottom: 20px; text-align: center;'>👨‍🎓 Student Management</h2>");
        
        sb.append("<div style='background: linear-gradient(135deg, #dbeafe 0%, #eff6ff 100%); " +
                 "padding: 15px; border-radius: 10px; margin-bottom: 20px;'>");
        sb.append("<h3 style='color: #1e40af; margin: 0 0 10px 0;'>📊 Quick Stats</h3>");
        sb.append("<p style='margin: 5px 0;'><b>Total Students:</b> " + students.size() + "</p>");
        sb.append("<p style='margin: 5px 0;'><b>Departments:</b> " + 
                 students.stream().map(s -> s.department).distinct().count() + "</p>");
        sb.append("</div>");
        
        sb.append("<h3 style='color: #374151; margin-bottom: 15px;'>📋 Student Directory</h3>");
        sb.append("<div style='max-height: 300px; overflow-y: auto;'>");
        
        for (Student s : students) {
            sb.append("<div style='background: white; border: 1px solid #e5e7eb; " +
                     "border-radius: 8px; padding: 15px; margin-bottom: 10px;'>");
            sb.append("<div style='display: flex; justify-content: space-between; align-items: center;'>");
            sb.append("<div>");
            sb.append("<h4 style='color: #1f2937; margin: 0 0 5px 0;'>").append(s.name).append("</h4>");
            sb.append("<p style='color: #6b7280; margin: 0; font-size: 13px;'>")
                     .append("ID: ").append(s.id).append(" | ").append(s.department).append("</p>");
            if (s.email != null) {
                sb.append("<p style='color: #3b82f6; margin: 5px 0 0 0; font-size: 12px;'>📧 ")
                         .append(s.email).append("</p>");
            }
            sb.append("</div>");
            sb.append("<div style='background: #dbeafe; color: #1e40af; padding: 5px 10px; " +
                     "border-radius: 20px; font-size: 12px; font-weight: bold;'>Active</div>");
            sb.append("</div>");
            sb.append("</div>");
        }
        
        sb.append("</div>");
        sb.append("<div style='text-align: center; margin-top: 20px; color: #6b7280;'>");
        sb.append("<i>💡 Click 'Add Student' to register new students</i>");
        sb.append("</div>");
        sb.append("</body></html>");
        
        JOptionPane.showMessageDialog(this, sb.toString(), "Student Management", 
                                    JOptionPane.INFORMATION_MESSAGE);
    }

    private void openCourseManagement() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body style='font-family: Segoe UI; padding: 20px; width: 500px;'>");
        sb.append("<h2 style='color: #059669; margin-bottom: 20px; text-align: center;'>📚 Course Management</h2>");
        
        sb.append("<div style='background: linear-gradient(135deg, #d1fae5 0%, #ecfdf5 100%); " +
                 "padding: 15px; border-radius: 10px; margin-bottom: 20px;'>");
        sb.append("<h3 style='color: #059669; margin: 0 0 10px 0;'>📈 Course Overview</h3>");
        sb.append("<p style='margin: 5px 0;'><b>Active Courses:</b> " + courses.size() + "</p>");
        sb.append("<p style='margin: 5px 0;'><b>Total Credits:</b> " + 
                 courses.stream().mapToInt(c -> c.credits).sum() + "</p>");
        sb.append("</div>");
        
        sb.append("<h3 style='color: #374151; margin-bottom: 15px;'>📖 Course Catalog</h3>");
        sb.append("<div style='max-height: 300px; overflow-y: auto;'>");
        
        for (Course c : courses) {
            sb.append("<div style='background: white; border: 1px solid #e5e7eb; " +
                     "border-radius: 8px; padding: 15px; margin-bottom: 10px;'>");
            sb.append("<div style='display: flex; justify-content: space-between; align-items: center;'>");
            sb.append("<div>");
            sb.append("<h4 style='color: #1f2937; margin: 0 0 5px 0;'>").append(c.name).append("</h4>");
            sb.append("<p style='color: #6b7280; margin: 0; font-size: 13px;'>")
                     .append("Code: ").append(c.id).append(" | ").append(c.department).append("</p>");
            sb.append("<p style='color: #f59e0b; margin: 5px 0 0 0; font-size: 12px;'>🎯 ")
                     .append(c.credits).append(" Credits</p>");
            sb.append("</div>");
            sb.append("<div style='background: #d1fae5; color: #059669; padding: 5px 10px; " +
                     "border-radius: 20px; font-size: 12px; font-weight: bold;'>Available</div>");
            sb.append("</div>");
            sb.append("</div>");
        }
        
        sb.append("</div>");
        sb.append("<div style='text-align: center; margin-top: 20px; color: #6b7280;'>");
        sb.append("<i>💡 Manage course schedules and enrollment</i>");
        sb.append("</div>");
        sb.append("</body></html>");
        
        JOptionPane.showMessageDialog(this, sb.toString(), "Course Management", 
                                    JOptionPane.INFORMATION_MESSAGE);
    }

    private void openFeeManagement() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body style='font-family: Segoe UI; padding: 20px; width: 550px;'>");
        sb.append("<h2 style='color: #d97706; margin-bottom: 20px; text-align: center;'>💰 Fee Management</h2>");
        
        // Financial Summary
        double totalRevenue = feeRecords.stream()
            .filter(f -> f.status.equalsIgnoreCase("Paid"))
            .mapToDouble(f -> f.amount).sum();
        double pendingAmount = feeRecords.stream()
            .filter(f -> !f.status.equalsIgnoreCase("Paid"))
            .mapToDouble(f -> f.amount).sum();
        
        sb.append("<div style='background: linear-gradient(135deg, #fef3c7 0%, #fffbeb 100%); " +
                 "padding: 15px; border-radius: 10px; margin-bottom: 20px;'>");
        sb.append("<h3 style='color: #d97706; margin: 0 0 10px 0;'>💼 Financial Summary</h3>");
        sb.append("<div style='display: flex; justify-content: space-between;'>");
        sb.append("<div><p style='margin: 5px 0;'><b>Total Revenue:</b> $").append(String.format("%.2f", totalRevenue)).append("</p></div>");
        sb.append("<div><p style='margin: 5px 0;'><b>Pending:</b> $").append(String.format("%.2f", pendingAmount)).append("</p></div>");
        sb.append("</div>");
        sb.append("</div>");
        
        sb.append("<h3 style='color: #374151; margin-bottom: 15px;'>📋 Fee Records</h3>");
        sb.append("<div style='max-height: 300px; overflow-y: auto;'>");
        
        for (FeeRecord f : feeRecords) {
            String statusColor, statusBg, statusIcon;
            switch (f.status.toLowerCase()) {
                case "paid":
                    statusColor = "#059669"; statusBg = "#d1fae5"; statusIcon = "✅";
                    break;
                case "due":
                    statusColor = "#dc2626"; statusBg = "#fee2e2"; statusIcon = "⚠️";
                    break;
                case "overdue":
                    statusColor = "#dc2626"; statusBg = "#fecaca"; statusIcon = "🚨";
                    break;
                default:
                    statusColor = "#d97706"; statusBg = "#fef3c7"; statusIcon = "⏳";
            }
            
            sb.append("<div style='background: white; border: 1px solid #e5e7eb; " +
                     "border-radius: 8px; padding: 15px; margin-bottom: 10px;'>");
            sb.append("<div style='display: flex; justify-content: space-between; align-items: center;'>");
            sb.append("<div>");
            sb.append("<h4 style='color: #1f2937; margin: 0 0 5px 0;'>Student ID: ").append(f.studentId).append("</h4>");
            sb.append("<p style='color: #6b7280; margin: 0; font-size: 13px;'>Amount: <b>$")
                     .append(String.format("%.2f", f.amount)).append("</b></p>");
            if (f.dueDate != null) {
                sb.append("<p style='color: #6b7280; margin: 5px 0 0 0; font-size: 12px;'>📅 Due: ")
                         .append(f.dueDate).append("</p>");
            }
            sb.append("</div>");
            sb.append("<div style='background: ").append(statusBg).append("; color: ").append(statusColor)
                     .append("; padding: 5px 12px; border-radius: 20px; font-size: 12px; font-weight: bold;'>")
                     .append(statusIcon).append(" ").append(f.status).append("</div>");
            sb.append("</div>");
            sb.append("</div>");
        }
        
        sb.append("</div>");
        sb.append("<div style='text-align: center; margin-top: 20px; color: #6b7280;'>");
        sb.append("<i>💡 Track payments and send reminders</i>");
        sb.append("</div>");
        sb.append("</body></html>");
        
        JOptionPane.showMessageDialog(this, sb.toString(), "Fee Management", 
                                    JOptionPane.INFORMATION_MESSAGE);
    }

    private void openReports() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body style='font-family: Segoe UI; padding: 25px; width: 450px;'>");
        sb.append("<h2 style='color: #7c3aed; margin-bottom: 20px; text-align: center;'>📊 Reports & Analytics</h2>");
        
        sb.append("<div style='background: linear-gradient(135deg, #ede9fe 0%, #f3f4f6 100%); " +
                 "padding: 20px; border-radius: 12px; margin-bottom: 25px;'>");
        sb.append("<h3 style='color: #7c3aed; margin: 0 0 15px 0; text-align: center;'>📈 Available Reports</h3>");
        
        String[] reports = {
            "📚 Academic Performance Reports",
            "💰 Financial Analysis & Trends", 
            "👥 Student Demographics",
            "📅 Attendance Analytics",
            "🎯 Department Performance",
            "📋 Custom Report Builder"
        };
        
        for (String report : reports) {
            sb.append("<div style='background: white; border-radius: 8px; padding: 12px; " +
                     "margin-bottom: 8px; border-left: 4px solid #7c3aed;'>");
            sb.append("<p style='margin: 0; color: #374151; font-weight: 500;'>").append(report).append("</p>");
            sb.append("</div>");
        }
        
        sb.append("</div>");
        
        sb.append("<div style='text-align: center; background: #f8fafc; padding: 15px; border-radius: 8px;'>");
        sb.append("<p style='color: #6b7280; margin: 0; font-style: italic;'>");
        sb.append("🔧 Advanced reporting features coming soon!<br>");
        sb.append("Export to PDF, Excel, and interactive dashboards.</p>");
        sb.append("</div>");
        
        sb.append("</body></html>");
        
        JOptionPane.showMessageDialog(this, sb.toString(), "Reports & Analytics", 
                                    JOptionPane.INFORMATION_MESSAGE);
    }

    private void showStudentReport() {
        long totalStudents = students.size();
        long departments = students.stream().map(s -> s.department).distinct().count();
        
        JOptionPane.showMessageDialog(this,
            "<html><body style='font-family: Segoe UI; padding: 20px; width: 350px;'>" +
            "<h2 style='color: #1e40af; margin-bottom: 15px; text-align: center;'>👨‍🎓 Student Analytics</h2>" +
            "<div style='background: #f0f9ff; padding: 15px; border-radius: 8px; margin-bottom: 15px;'>" +
            "<h3 style='color: #1e40af; margin: 0 0 10px 0;'>📊 Key Metrics</h3>" +
            "<p style='margin: 5px 0;'><b>Total Students:</b> " + totalStudents + "</p>" +
            "<p style='margin: 5px 0;'><b>Active Departments:</b> " + departments + "</p>" +
            "<p style='margin: 5px 0;'><b>Average per Dept:</b> " + 
            String.format("%.1f", (double)totalStudents/departments) + "</p>" +
            "</div>" +
            "<div style='text-align: center;'>" +
            "<p style='color: #64748b; font-size: 12px;'>📈 Growth trending upward</p>" +
            "</div>" +
            "</body></html>",
            "Student Report", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showFeeReport() {
        long paidCount = feeRecords.stream().filter(f -> f.status.equalsIgnoreCase("Paid")).count();
        long dueCount = feeRecords.stream().filter(f -> f.status.equalsIgnoreCase("Due")).count();
        long overdueCount = feeRecords.stream().filter(f -> f.status.equalsIgnoreCase("Overdue")).count();
        long pendingCount = feeRecords.size() - paidCount - dueCount - overdueCount;
        
        double totalRevenue = feeRecords.stream()
            .filter(f -> f.status.equalsIgnoreCase("Paid"))
            .mapToDouble(f -> f.amount).sum();
        
        JOptionPane.showMessageDialog(this,
            "<html><body style='font-family: Segoe UI; padding: 20px; width: 380px;'>" +
            "<h2 style='color: #d97706; margin-bottom: 15px; text-align: center;'>💰 Financial Report</h2>" +
            "<div style='background: #fffbeb; padding: 15px; border-radius: 8px; margin-bottom: 15px;'>" +
            "<h3 style='color: #d97706; margin: 0 0 10px 0;'>💼 Payment Status</h3>" +
            "<p style='margin: 5px 0;'><span style='color: #059669;'>✅ Paid:</span> " + paidCount + "</p>" +
            "<p style='margin: 5px 0;'><span style='color: #dc2626;'>⚠️ Due:</span> " + dueCount + "</p>" +
            "<p style='margin: 5px 0;'><span style='color: #dc2626;'>🚨 Overdue:</span> " + overdueCount + "</p>" +
            "<p style='margin: 5px 0;'><span style='color: #d97706;'>⏳ Pending:</span> " + pendingCount + "</p>" +
            "<hr style='margin: 10px 0;'>" +
            "<p style='margin: 5px 0; font-size: 16px;'><b>Total Revenue: $" + 
            String.format("%.2f", totalRevenue) + "</b></p>" +
            "</div>" +
            "<div style='text-align: center;'>" +
            "<p style='color: #64748b; font-size: 12px;'>💡 Collection rate: " + 
            String.format("%.1f", (double)paidCount/feeRecords.size()*100) + "%</p>" +
            "</div>" +
            "</body></html>",
            "Fee Report", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showAcademicReport() {
        JOptionPane.showMessageDialog(this,
            "<html><body style='font-family: Segoe UI; padding: 25px; width: 350px; text-align: center;'>" +
            "<h2 style='color: #7c3aed; margin-bottom: 20px;'>📈 Academic Analytics</h2>" +
            "<div style='background: #faf5ff; padding: 20px; border-radius: 10px; margin-bottom: 20px;'>" +
            "<h3 style='color: #7c3aed; margin: 0 0 15px 0;'>🎯 Coming Soon</h3>" +
            "<p style='color: #6b7280; margin: 5px 0;'>• Grade distribution analysis</p>" +
            "<p style='color: #6b7280; margin: 5px 0;'>• Performance trends</p>" +
            "<p style='color: #6b7280; margin: 5px 0;'>• Attendance correlations</p>" +
            "<p style='color: #6b7280; margin: 5px 0;'>• Predictive analytics</p>" +
            "</div>" +
            "<p style='color: #64748b; font-style: italic;'>🔬 Advanced analytics in development</p>" +
            "</body></html>",
            "Academic Report", JOptionPane.INFORMATION_MESSAGE);
    }

    // Enhanced data classes
    static class Student {
        String id;
        String name;
        String department;
        String email;

        Student(String id, String name, String department, String email) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.email = email;
        }

        @Override
        public String toString() {
            return String.format("%s | %s | %s", id, name, department);
        }
    }

    static class Course {
        String id;
        String name;
        String department;
        int credits;

        Course(String id, String name, String department, int credits) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.credits = credits;
        }

        @Override
        public String toString() {
            return String.format("%s | %s | %d credits", id, name, credits);
        }
    }

    static class FeeRecord {
        String studentId;
        double amount;
        String status;
        String dueDate;

        FeeRecord(String studentId, double amount, String status, String dueDate) {
            this.studentId = studentId;
            this.amount = amount;
            this.status = status;
            this.dueDate = dueDate;
        }

        @Override
        public String toString() {
            return String.format("ID: %s | $%.2f | %s", studentId, amount, status);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                // Set system look and feel for better integration
                 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                
                // Enable anti-aliasing for better text rendering
                System.setProperty("awt.useSystemAAFontSettings", "on");
                System.setProperty("swing.aatext", "true");
                
            } catch (Exception e) {
                System.err.println("Could not set look and feel: " + e.getMessage());
            }
            
            // Create and display the dashboard
            new Dashboard().setVisible(true);
        });
    }
}





