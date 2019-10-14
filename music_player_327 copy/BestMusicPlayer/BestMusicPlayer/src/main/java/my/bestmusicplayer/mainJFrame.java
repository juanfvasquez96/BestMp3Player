/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.bestmusicplayer;

import com.google.gson.Gson; 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author stevenchung,
 */
public class mainJFrame extends javax.swing.JFrame {

    Mp3 player;   
    String songFile;
    String email = "";
    String password = "";
    String search = "";   
    
    /** Creates new form mainJFrame */
    public mainJFrame() {
        initComponents();
        
        songFile = "imperial.mp3";
        player = new Mp3(songFile);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        main = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        loginTitle = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        success = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        songListPane = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        playButton = new javax.swing.JLabel();
        pauseButton = new javax.swing.JLabel();
        stopButton = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        searchResult = new javax.swing.JScrollPane();
        searchButton = new javax.swing.JButton();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(51, 51, 255));
        main.setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(51, 255, 102));

        loginTitle.setText("Spotify Login");

        emailLabel.setText("Email:");

        passwordLabel.setText("Password:");

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addComponent(passwordLabel)
                        .addGap(18, 18, 18)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginButton)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addComponent(emailLabel)
                        .addGap(43, 43, 43)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginTitle)
                            .addComponent(emailField))))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(loginTitle)
                .addGap(63, 63, 63)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(loginButton)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        main.add(login, "card2");

        success.setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setText("View All Songs");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("All Songs");

        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playButtonMouseClicked(evt);
            }
        });

        pauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pause.png"))); // NOI18N
        pauseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pauseButtonMouseClicked(evt);
            }
        });

        stopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stop.png"))); // NOI18N
        stopButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopButtonMouseClicked(evt);
            }
        });

        searchBar.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                searchBarInputMethodTextChanged(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout successLayout = new javax.swing.GroupLayout(success);
        success.setLayout(successLayout);
        successLayout.setHorizontalGroup(
            successLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(successLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(successLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(successLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(successLayout.createSequentialGroup()
                            .addComponent(pauseButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(searchBar)
                        .addComponent(searchResult))
                    .addComponent(searchButton))
                .addGroup(successLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(successLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(103, 103, 103))
                    .addGroup(successLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stopButton)
                        .addGap(126, 126, 126)
                        .addGroup(successLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(successLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(successLayout.createSequentialGroup()
                                .addComponent(songListPane, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addGap(21, 21, 21))))))
        );
        successLayout.setVerticalGroup(
            successLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(successLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(successLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(successLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(successLayout.createSequentialGroup()
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchResult, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(successLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pauseButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(playButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stopButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(successLayout.createSequentialGroup()
                        .addComponent(songListPane, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        main.add(success, "card3");

        getContentPane().add(main, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        email = emailField.getText();
        password = String.valueOf(passwordField.getPassword());
        
        if(email.equals("email") && password.equals("password"))
        {
            // Alerts user
            JOptionPane.showMessageDialog(null, "Login Successful");
            
            // Using card layout, switches panels when login successful
            main.removeAll();
            main.add(success);
            main.repaint();
            main.revalidate();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Login Failure");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void stopButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopButtonMouseClicked
        player.stop();
    }//GEN-LAST:event_stopButtonMouseClicked

    private void pauseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pauseButtonMouseClicked
        player.pause();
    }//GEN-LAST:event_pauseButtonMouseClicked

    private void playButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseClicked
        player.mp3play();
    }//GEN-LAST:event_playButtonMouseClicked

    // button on Success Page, will display songs
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            //br = new BufferedReader(new FileReader("/Users/stevenchung/Documents/cecs_327/MusicPlayer/src/my/musicplayer/music.json"));
            br = new BufferedReader(new FileReader("music.json"));
            JsonPojo[] array = gson.fromJson(br, JsonPojo[].class);

            //           JsonPojo firstEl = array[0];
            //           System.out.println("first element release: " + firstEl.release.name);
            //           System.out.println("first element artist: " + firstEl.artist);
            //           System.out.println("first element song: " + firstEl.song);
            DefaultListModel listModel;
            listModel = new DefaultListModel();

            ArrayList<String> songs = new ArrayList<String>();
            for(JsonPojo obj : array) {

                listModel.addElement(obj.song.title + " - " + obj.artist.name);
                //               System.out.println("Release: " + obj.release.name);
            }

            JList list = new JList(listModel);
            songListPane.setViewportView(list);

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchBarInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_searchBarInputMethodTextChanged
        
    }//GEN-LAST:event_searchBarInputMethodTextChanged

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        search = searchBar.getText();
        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            //br = new BufferedReader(new FileReader("/Users/stevenchung/Documents/cecs_327/MusicPlayer/src/my/musicplayer/music.json"));
            br = new BufferedReader(new FileReader("music.json"));
            JsonPojo[] array = gson.fromJson(br, JsonPojo[].class);

            //           JsonPojo firstEl = array[0];
            //           System.out.println("first element release: " + firstEl.release.name);
            //           System.out.println("first element artist: " + firstEl.artist);
            //           System.out.println("first element song: " + firstEl.song);
            DefaultListModel listModel;
            listModel = new DefaultListModel();

            ArrayList<String> songs = new ArrayList<String>();
            for(JsonPojo obj : array) {
                if (search.equals(obj.song.title) || search.equals(obj.artist.name) || search.equals(obj.release.name))
                {
                    listModel.addElement(obj.song.title + " - " + obj.artist.name);
                }
            }

            JList list = new JList(listModel);
            searchResult.setViewportView(list);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchButtonMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel login;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JPanel main;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel pauseButton;
    private javax.swing.JLabel playButton;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    private javax.swing.JScrollPane searchResult;
    private javax.swing.JScrollPane songListPane;
    private javax.swing.JLabel stopButton;
    private javax.swing.JPanel success;
    // End of variables declaration//GEN-END:variables
}
