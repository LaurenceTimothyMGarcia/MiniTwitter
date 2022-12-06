/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Laurence Garcia
 */

//Assignment 3 #4
public class MostRecentUser implements VisitorInterface
{
    private User mostRecentUser;
    
    public void visitUser(User user)
    {
        mostRecentUser = user;
    }
    
    public void visitGroup(UserGroup group)
    {
        //Do nothing here
    }
    
    public String getRecentUser()
    {
        return mostRecentUser.getID();
    }
}
