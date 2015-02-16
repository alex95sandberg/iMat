package imat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kakan
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layoutPanel = new javax.swing.JPanel();
        footerPlaceholder = new javax.swing.JLabel();
        navigationTabbedPane = new javax.swing.JTabbedPane();
        welcomePanel = new javax.swing.JPanel();
        welcomePlaceholder = new javax.swing.JLabel();
        headerPlaceholder = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        undo = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        navigate = new javax.swing.JMenu();
        view = new javax.swing.JMenu();
        zoomIn = new javax.swing.JMenuItem();
        zoomOut = new javax.swing.JMenuItem();
        fullscreen = new javax.swing.JCheckBoxMenuItem();
        minimize = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        layoutPanel.setLayout(new java.awt.BorderLayout());

        footerPlaceholder.setText("Footer");
        layoutPanel.add(footerPlaceholder, java.awt.BorderLayout.PAGE_END);

        welcomePanel.setPreferredSize(new java.awt.Dimension(100, 100));
        welcomePanel.setLayout(new java.awt.CardLayout());

        welcomePlaceholder.setText("Välkommen [namn]");
        welcomePanel.add(welcomePlaceholder, "card2");

        navigationTabbedPane.addTab("Välkommen", welcomePanel);

        layoutPanel.add(navigationTabbedPane, java.awt.BorderLayout.CENTER);

        headerPlaceholder.setText("[logga] [sök] [min profil]");
        layoutPanel.add(headerPlaceholder, java.awt.BorderLayout.PAGE_START);

        menu.setName("iMat"); // NOI18N

        file.setText("Arkiv");

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exit.setText("Avsluta");
        file.add(exit);

        menu.add(file);

        edit.setText("Redigera");

        undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        undo.setText("Ångra");
        edit.add(undo);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Gör om");
        edit.add(jMenuItem5);

        menu.add(edit);

        navigate.setText("Navigera");
        menu.add(navigate);

        view.setText("Vy");

        zoomIn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_PLUS, java.awt.event.InputEvent.CTRL_MASK));
        zoomIn.setText("Zooma in");
        view.add(zoomIn);

        zoomOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_MINUS, java.awt.event.InputEvent.CTRL_MASK));
        zoomOut.setText("Zooma ut");
        view.add(zoomOut);

        fullscreen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        fullscreen.setText("Fullskärm");
        view.add(fullscreen);

        minimize.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, java.awt.event.InputEvent.ALT_MASK));
        minimize.setText("Minimera");
        view.add(minimize);

        menu.add(view);

        about.setText("Om oss");

        jMenuItem1.setText("Kontakt");
        about.add(jMenuItem1);

        jMenuItem4.setText("iMat");
        about.add(jMenuItem4);

        menu.add(about);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu about;
    private javax.swing.JMenu edit;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JLabel footerPlaceholder;
    private javax.swing.JCheckBoxMenuItem fullscreen;
    private javax.swing.JLabel headerPlaceholder;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel layoutPanel;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem minimize;
    private javax.swing.JMenu navigate;
    private javax.swing.JTabbedPane navigationTabbedPane;
    private javax.swing.JMenuItem undo;
    private javax.swing.JMenu view;
    private javax.swing.JPanel welcomePanel;
    private javax.swing.JLabel welcomePlaceholder;
    private javax.swing.JMenuItem zoomIn;
    private javax.swing.JMenuItem zoomOut;
    // End of variables declaration//GEN-END:variables
}
