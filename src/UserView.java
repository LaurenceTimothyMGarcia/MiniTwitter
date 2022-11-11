
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * Observer Pattern updating news feed
 */
public class UserView extends javax.swing.JFrame {

    /**
     * Creates new form UserView
     */
    private User user;
    private DefaultListModel followModel = new DefaultListModel();
    private DefaultListModel tweetModel = new DefaultListModel();
    private Message messageTrack = new Message();
    
    //Initalize User
    public UserView(User user) {
        this.user = user;
        initComponents();
        
        UserName.setText(user.getID());
        currentFollows.setModel(followModel);
        newsFeed.setModel(tweetModel);
        this.user.setFeed(newsFeed);
        
        for (User u : user.getFollowing())
        {
            followModel.addElement(u);
        }
        
        this.setVisible(true);
    }
    
    public JList feed()
    {
        return newsFeed;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        followUser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        currentFollows = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tweetMessage = new javax.swing.JTextArea();
        postTweet = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        newsFeed = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        userID = new javax.swing.JTextArea();
        UserName = new javax.swing.JLabel();
        FollowingLabel = new javax.swing.JLabel();
        NewsFeedLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        followUser.setText("Follow User");
        followUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                followUserMouseClicked(evt);
            }
        });

        currentFollows.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(currentFollows);

        tweetMessage.setColumns(20);
        tweetMessage.setRows(5);
        tweetMessage.setText("Tweet Message");
        jScrollPane2.setViewportView(tweetMessage);

        postTweet.setText("Post Tweet");
        postTweet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                postTweetMouseClicked(evt);
            }
        });

        newsFeed.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(newsFeed);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        userID.setColumns(20);
        userID.setRows(5);
        userID.setText("User ID");
        jScrollPane4.setViewportView(userID);

        UserName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        UserName.setText("Name");

        FollowingLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FollowingLabel.setText("Following");

        NewsFeedLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewsFeedLabel.setText("News Feed");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(postTweet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(followUser, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FollowingLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NewsFeedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(followUser, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FollowingLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewsFeedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(postTweet, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Follow user button
    private void followUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_followUserMouseClicked

        // TODO add your handling code here:
        //Probably pull from list to verify
        if (userID != null)
        {
            String userValid = userID.getText();
            
            if(user.getFollowing().indexOf(userValid) < 0 && AdminControlPanel.userExist(userValid))
            {
                User newUser = AdminControlPanel.getUser(userValid);
                
                followModel.addElement(newUser);
                user.addFollowing(newUser);
                newUser.addFollower(user);
            }
        }
        
    }//GEN-LAST:event_followUserMouseClicked

    //Post Tweet Button
    private void postTweetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postTweetMouseClicked
        
        // TODO add your handling code here:
        if (tweetMessage != null)
        {
            String tweet = tweetMessage.getText();
            
            user.addMessage(tweet); //Adds tweet to user's message
            messageTrack.addTweet(user, tweet); //User tweet array
            messageTrack.printTweets(newsFeed, user.getFollowing(), user);  //Update current user
            
            //Ideally updates the followers of the user
            user.updateFollowers();
            
        }
    }//GEN-LAST:event_postTweetMouseClicked

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
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new UserView(new User("Larry")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FollowingLabel;
    private javax.swing.JLabel NewsFeedLabel;
    private javax.swing.JLabel UserName;
    private javax.swing.JList<String> currentFollows;
    private javax.swing.JButton followUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> newsFeed;
    private javax.swing.JButton postTweet;
    private javax.swing.JTextArea tweetMessage;
    private javax.swing.JTextArea userID;
    // End of variables declaration//GEN-END:variables
}
