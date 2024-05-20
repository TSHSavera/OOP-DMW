package Cards;
import Utilities.*;
import Resources.*;

public class SignUp extends javax.swing.JFrame {

   
    public SignUp() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignUpPanel = new javax.swing.JPanel();
        signUpInfo = new javax.swing.JPanel();
        reminderEN = new javax.swing.JLabel();
        reminderFIL = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        lastNamePanel = new javax.swing.JPanel();
        lastNameField = new Components.PlaceHolderTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailPanel = new javax.swing.JPanel();
        emailField = new Components.PlaceHolderTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        middleNamePanel = new javax.swing.JPanel();
        middleNameField = new Components.PlaceHolderTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        suffixPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        suffixField = new Components.PlaceHolderTextField();
        genderPanel = new javax.swing.JPanel();
        genderBox = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        firstNamePanel1 = new javax.swing.JPanel();
        firstNameField = new Components.PlaceHolderTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        emailPanel1 = new javax.swing.JPanel();
        yearField = new Components.PlaceHolderTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        signUpTitleBar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        poeaLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SignUpPanel.setBackground(ThemeColors.BACKGROUND);
        SignUpPanel.setForeground(ThemeColors.ON_SURFACE);
        SignUpPanel.setPreferredSize(new java.awt.Dimension(800, 500));

        signUpInfo.setBackground(ThemeColors.BACKGROUND);

        reminderEN.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        reminderEN.setForeground(ThemeColors.ON_BACKGROUND);
        reminderEN.setText("Please enter details that appear to your passport.");

        reminderFIL.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        reminderFIL.setForeground(ThemeColors.ON_BACKGROUND);
        reminderFIL.setText("(Maaring ilagay ang mga detalye na makikita sa iyong passport.)");

        signUpButton.setBackground(ThemeColors.PRIMARY);
        signUpButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signUpButton.setForeground(ThemeColors.ON_PRIMARY);
        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        lastNamePanel.setBackground(ThemeColors.BACKGROUND);

        lastNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastNameField.setPlaceHolder("Huling Pangalan");
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });

        jLabel12.setForeground(ThemeColors.ON_BACKGROUND);
        jLabel12.setText("(Huling Pangalan)");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(ThemeColors.ON_BACKGROUND);
        jLabel4.setText("Last Name");

        javax.swing.GroupLayout lastNamePanelLayout = new javax.swing.GroupLayout(lastNamePanel);
        lastNamePanel.setLayout(lastNamePanelLayout);
        lastNamePanelLayout.setHorizontalGroup(
            lastNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lastNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lastNamePanelLayout.createSequentialGroup()
                        .addGroup(lastNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel4))
                        .addGap(0, 120, Short.MAX_VALUE)))
                .addContainerGap())
        );
        lastNamePanelLayout.setVerticalGroup(
            lastNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lastNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        emailPanel.setBackground(ThemeColors.BACKGROUND);

        emailField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailField.setPlaceHolder("Email");

        jLabel14.setForeground(ThemeColors.ON_BACKGROUND);
        jLabel14.setText("(Email)");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(ThemeColors.ON_BACKGROUND);
        jLabel5.setText("Email");

        javax.swing.GroupLayout emailPanelLayout = new javax.swing.GroupLayout(emailPanel);
        emailPanel.setLayout(emailPanelLayout);
        emailPanelLayout.setHorizontalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(emailPanelLayout.createSequentialGroup()
                        .addGroup(emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        emailPanelLayout.setVerticalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        middleNamePanel.setBackground(ThemeColors.BACKGROUND);

        middleNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        middleNameField.setPlaceHolder("Gitnang Pangalan");

        jLabel13.setForeground(ThemeColors.ON_BACKGROUND);
        jLabel13.setText("(Gitnang Pangalan)");

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(ThemeColors.ON_BACKGROUND);
        jLabel6.setText("Middle Name");

        javax.swing.GroupLayout middleNamePanelLayout = new javax.swing.GroupLayout(middleNamePanel);
        middleNamePanel.setLayout(middleNamePanelLayout);
        middleNamePanelLayout.setHorizontalGroup(
            middleNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middleNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(middleNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(middleNameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(middleNamePanelLayout.createSequentialGroup()
                        .addGroup(middleNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel6))
                        .addGap(0, 120, Short.MAX_VALUE)))
                .addContainerGap())
        );
        middleNamePanelLayout.setVerticalGroup(
            middleNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, middleNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(middleNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel15.setForeground(ThemeColors.ON_BACKGROUND);
        jLabel15.setText("(Suffix)");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setForeground(ThemeColors.ON_BACKGROUND);
        jLabel7.setText("Suffix");

        suffixField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        suffixField.setPlaceHolder("Dugtong");
        suffixField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suffixFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout suffixPanelLayout = new javax.swing.GroupLayout(suffixPanel);
        suffixPanel.setLayout(suffixPanelLayout);
        suffixPanelLayout.setHorizontalGroup(
            suffixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suffixPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(suffixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(suffixPanelLayout.createSequentialGroup()
                        .addGroup(suffixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(suffixField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap())
        );
        suffixPanelLayout.setVerticalGroup(
            suffixPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, suffixPanelLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(5, 5, 5)
                .addComponent(suffixField, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        genderPanel.setBackground(ThemeColors.BACKGROUND);

        genderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        genderBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderBoxActionPerformed(evt);
            }
        });

        jLabel17.setForeground(ThemeColors.ON_BACKGROUND);
        jLabel17.setText("(Kasarian)");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setForeground(ThemeColors.ON_BACKGROUND);
        jLabel8.setText("Gender");

        javax.swing.GroupLayout genderPanelLayout = new javax.swing.GroupLayout(genderPanel);
        genderPanel.setLayout(genderPanelLayout);
        genderPanelLayout.setHorizontalGroup(
            genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(genderPanelLayout.createSequentialGroup()
                        .addGroup(genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        genderPanelLayout.setVerticalGroup(
            genderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        firstNamePanel1.setBackground(ThemeColors.BACKGROUND);

        firstNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstNameField.setPlaceHolder("Unang Pangalan");

        jLabel16.setForeground(ThemeColors.ON_BACKGROUND);
        jLabel16.setText("(Unang Pangalan)");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setForeground(ThemeColors.ON_BACKGROUND);
        jLabel9.setText("First Name");

        javax.swing.GroupLayout firstNamePanel1Layout = new javax.swing.GroupLayout(firstNamePanel1);
        firstNamePanel1.setLayout(firstNamePanel1Layout);
        firstNamePanel1Layout.setHorizontalGroup(
            firstNamePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstNamePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firstNamePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(firstNamePanel1Layout.createSequentialGroup()
                        .addGroup(firstNamePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel9))
                        .addGap(0, 120, Short.MAX_VALUE)))
                .addContainerGap())
        );
        firstNamePanel1Layout.setVerticalGroup(
            firstNamePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firstNamePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        emailPanel1.setBackground(ThemeColors.BACKGROUND);

        yearField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yearField.setPlaceHolder("mm/dd/yyyy");
        yearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFieldActionPerformed(evt);
            }
        });

        jLabel18.setBackground(ThemeColors.ON_BACKGROUND);
        jLabel18.setForeground(ThemeColors.ON_BACKGROUND);
        jLabel18.setText("(Kaarawan)");

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setForeground(ThemeColors.ON_BACKGROUND);
        jLabel10.setText("Birthday");

        javax.swing.GroupLayout emailPanel1Layout = new javax.swing.GroupLayout(emailPanel1);
        emailPanel1.setLayout(emailPanel1Layout);
        emailPanel1Layout.setHorizontalGroup(
            emailPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(emailPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(emailPanel1Layout.createSequentialGroup()
                        .addGroup(emailPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        emailPanel1Layout.setVerticalGroup(
            emailPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emailPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearField, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout signUpInfoLayout = new javax.swing.GroupLayout(signUpInfo);
        signUpInfo.setLayout(signUpInfoLayout);
        signUpInfoLayout.setHorizontalGroup(
            signUpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(453, 453, 453))
            .addGroup(signUpInfoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(signUpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signUpInfoLayout.createSequentialGroup()
                        .addGroup(signUpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNamePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(113, 113, 113)
                        .addGroup(signUpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(middleNamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(118, 118, 118)
                        .addGroup(signUpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastNamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(107, 107, 107)
                        .addComponent(suffixPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(signUpInfoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(signUpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reminderEN)
                            .addComponent(reminderFIL))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        signUpInfoLayout.setVerticalGroup(
            signUpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpInfoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(reminderEN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reminderFIL)
                .addGap(43, 43, 43)
                .addGroup(signUpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signUpInfoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(genderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(signUpInfoLayout.createSequentialGroup()
                        .addGroup(signUpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(middleNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suffixPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNamePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addGroup(signUpInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(97, 97, 97)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        signUpTitleBar.setBackground(ThemeColors.SURFACE_BRIGHT);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(ThemeColors.ON_SURFACE);
        jLabel2.setText("New Account Registration ");

        poeaLogo.setText("logo");

        javax.swing.GroupLayout signUpTitleBarLayout = new javax.swing.GroupLayout(signUpTitleBar);
        signUpTitleBar.setLayout(signUpTitleBarLayout);
        signUpTitleBarLayout.setHorizontalGroup(
            signUpTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpTitleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(poeaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        signUpTitleBarLayout.setVerticalGroup(
            signUpTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpTitleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(signUpTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poeaLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        javax.swing.GroupLayout SignUpPanelLayout = new javax.swing.GroupLayout(SignUpPanel);
        SignUpPanel.setLayout(SignUpPanelLayout);
        SignUpPanelLayout.setHorizontalGroup(
            SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(signUpTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(signUpInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SignUpPanelLayout.setVerticalGroup(
            SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpPanelLayout.createSequentialGroup()
                .addComponent(signUpTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(signUpInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1270, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genderBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderBoxActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void suffixFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suffixFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suffixFieldActionPerformed

    private void yearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearFieldActionPerformed

    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SignUpPanel;
    private Components.PlaceHolderTextField emailField;
    private javax.swing.JPanel emailPanel;
    private javax.swing.JPanel emailPanel1;
    private Components.PlaceHolderTextField firstNameField;
    private javax.swing.JPanel firstNamePanel1;
    private javax.swing.JComboBox<String> genderBox;
    private javax.swing.JPanel genderPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private Components.PlaceHolderTextField lastNameField;
    private javax.swing.JPanel lastNamePanel;
    private Components.PlaceHolderTextField middleNameField;
    private javax.swing.JPanel middleNamePanel;
    private javax.swing.JLabel poeaLogo;
    private javax.swing.JLabel reminderEN;
    private javax.swing.JLabel reminderFIL;
    private javax.swing.JButton signUpButton;
    private javax.swing.JPanel signUpInfo;
    private javax.swing.JPanel signUpTitleBar;
    private Components.PlaceHolderTextField suffixField;
    private javax.swing.JPanel suffixPanel;
    private Components.PlaceHolderTextField yearField;
    // End of variables declaration//GEN-END:variables
}
