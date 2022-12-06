/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Laurence Garcia
 */
import java.util.*;

public class ValidUserCheck implements VisitorInterface
{
    
    private Set<User> invalidUser;
    
    public void visitUser(User user)
    {
        invalidUser.add(user);
    }
    
    public void visitGroup(UserGroup group)
    {
        //Do nothing here
    }
    
    public String getListOfUsers()
    {
        String userList = "";
        
        Iterator value = invalidUser.iterator();
        while (value.hasNext())
        {
            userList += (", " + value.next().toString());
        }
        
        return userList;
    }
}
