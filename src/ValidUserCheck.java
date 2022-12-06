/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Laurence Garcia
 */
import java.util.*;

//Assignment 3 #1
public class ValidUserCheck implements VisitorInterface
{
    
    private Set<CompositeUser> invalidUser = new HashSet<CompositeUser>();
    
    public void visitUser(User user)
    {
        invalidUser.add(user);
    }
    
    public void visitGroup(UserGroup group)
    {
        invalidUser.add(group);
    }
    
    public String getListOfUsers()
    {
        String userList = invalidUser.toString();
        
        return userList;
    }
}
