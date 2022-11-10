/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * Must be singleton
 */

import java.util.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class AdminControlPanel extends javax.swing.JFrame 
{
    /*
     * Created singleton
     */
    private static AdminControlPanel instance = null;
    private static UserGroup root = null;
    private static DefaultTreeModel tree = null;
    
    public static AdminControlPanel getInstance()
    {
        if (instance == null)
        {
            instance = new AdminControlPanel();
        }
        
        instance.setVisible(true);
        
        return instance;
    }

    /**
     * Creates new form AdminControlPanel
     */
    private AdminControlPanel() 
    {
        root = new UserGroup("Root");
        initComponents();
        LoadTree();
    }
    
    private DefaultMutableTreeNode rootView = new DefaultMutableTreeNode(root);
    
    private HashMap<UserGroup, UserGroup> listGroup = new HashMap<UserGroup, UserGroup>();
    private HashMap<User, UserGroup> listUser = new HashMap<User, UserGroup>();
    
    private CompositeUser currentSelected;
    private User userSelected;
    private String addUserText;
    private UserGroup groupSelected;
    
    private int userCount = 0;
    private int groupCount = 0;
    
    private void LoadTree()
    {
        System.out.println("Run");
        System.out.println(root);
        
        //Need to automate the loading of root
        
        //Adding all groups to tree
        tree = (DefaultTreeModel) rootTree.getModel();
        tree.setRoot(rootView);
        rootTree.setModel(tree);
    }
    
    public void AddUser(DefaultMutableTreeNode rootNode, CompositeUser u)
    {
        //rootNode.add(new DefaultMutableTreeNode(u));
        DefaultMutableTreeNode newUser = new DefaultMutableTreeNode(u);
        
        tree.insertNodeInto(newUser, rootNode, 0);
        rootTree.setModel(tree);
    }
    
    //Adds a user group to the tree
    public void AddGroup(DefaultMutableTreeNode parNode, UserGroup group)
    {
        DefaultMutableTreeNode newGroup = new DefaultMutableTreeNode(group);
        
        //parNode.add(newGroup);
        
        tree.insertNodeInto(newGroup, parNode, 0);
        rootTree.setModel(tree);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addUser = new javax.swing.JButton();
        addGroup = new javax.swing.JButton();
        openUserView = new javax.swing.JButton();
        showUserTotal = new javax.swing.JButton();
        showMessageTotal = new javax.swing.JButton();
        showGroupTotal = new javax.swing.JButton();
        showPosPercent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        userID = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        groupID = new javax.swing.JTextArea();
        TreeView = new javax.swing.JScrollPane();
        rootTree = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addUser.setText("Add User");
        addUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addUserMouseClicked(evt);
            }
        });

        addGroup.setText("Add Group");
        addGroup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addGroupMouseClicked(evt);
            }
        });

        openUserView.setText("Open User View");

        showUserTotal.setText("Show User Total");

        showMessageTotal.setText("Show Messages Total");

        showGroupTotal.setText("Show Group Total");

        showPosPercent.setText("Show Positive Percentage");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        userID.setColumns(20);
        userID.setRows(5);
        userID.setText("User ID");
        jScrollPane2.setViewportView(userID);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        groupID.setColumns(20);
        groupID.setRows(5);
        groupID.setText("Group ID");
        jScrollPane3.setViewportView(groupID);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        rootTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        rootTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rootTreeMouseClicked(evt);
            }
        });
        TreeView.setViewportView(rootTree);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TreeView, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(openUserView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addComponent(addUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(showUserTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(showMessageTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(showGroupTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(showPosPercent, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TreeView)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addUser, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(openUserView, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showGroupTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(showUserTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showMessageTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(showPosPercent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //This method should set up if the user clicks on the group it is current group
    private void rootTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rootTreeMouseClicked
        
        // TODO add your handling code here:
        System.out.println("Clicked on Tree");
        
        //Getting last value you clicked
        rootView = (DefaultMutableTreeNode) rootTree.getSelectionPath().getLastPathComponent();
        currentSelected = (CompositeUser) rootView.getUserObject();
        
        //Selects an option, if user is selected, userview can be viewed
        //if group is selected, any user/group added will be under that group.
        if (currentSelected instanceof User user)
        {
            System.out.println("User Selected");
            userSelected = user;
            groupSelected = null;
        }
        else if (currentSelected instanceof UserGroup group)
        {
            System.out.println("Group Selected");
            userSelected = null;
            groupSelected = group;
        }
    }//GEN-LAST:event_rootTreeMouseClicked

    //If add user from text area if button is pressed
    private void addUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUserMouseClicked

        // TODO add your handling code here:
        System.out.println("Add User Button Pressed");
        
        if (groupSelected != null)
        {
            DefaultMutableTreeNode currGroup = new DefaultMutableTreeNode(groupSelected);
            User newUser = new User(userID.getText());
            
            AddUser(currGroup, newUser);
            groupSelected.addUserToGroup(newUser);
            userCount++;
            //LoadTree();
        }
    }//GEN-LAST:event_addUserMouseClicked

    //If add group from text area if button is pressed
    private void addGroupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addGroupMouseClicked
        
        // TODO add your handling code here:
        System.out.println("Add Group Button Pressed");
        
        if (groupSelected != null)
        {
            DefaultMutableTreeNode currGroup = new DefaultMutableTreeNode(groupSelected);
            UserGroup newGroup = new UserGroup(groupID.getText());
            
            AddGroup(currGroup, newGroup);
            groupCount++;
            //LoadTree();
        }
    }//GEN-LAST:event_addGroupMouseClicked

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
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminControlPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TreeView;
    private javax.swing.JButton addGroup;
    private javax.swing.JButton addUser;
    private javax.swing.JTextArea groupID;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton openUserView;
    private javax.swing.JTree rootTree;
    private javax.swing.JButton showGroupTotal;
    private javax.swing.JButton showMessageTotal;
    private javax.swing.JButton showPosPercent;
    private javax.swing.JButton showUserTotal;
    private javax.swing.JTextArea userID;
    // End of variables declaration//GEN-END:variables
}
