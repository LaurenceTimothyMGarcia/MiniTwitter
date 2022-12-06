//Composite Pattern - holds user and groups

import java.util.*;

public class UserGroup implements CompositeUser
{
    //Unique group id
    private String groupID;

    //Holds group of users
    private ArrayList<CompositeUser> groupUsers;
    
    //Assignment 3 #2
    private long timeCreated;
    
    public UserGroup(String id, long timeCreate)
    {
        groupID = id;
        groupUsers = new ArrayList<CompositeUser>();
        this.timeCreated = timeCreate;
    }
    
    //Accessor Methods
    @Override 
    public void setID(String id)
    {
        groupID = id;
    }

    @Override //Get Group ID
    public String getID()
    {
        return groupID;
    }

    //Adds user to a group
    public void addUserToGroup(User userID)
    {
        groupUsers.add(userID);
    }

    //Returns the users in a group
    public ArrayList<CompositeUser> getGroup()
    {
        return groupUsers;
    }
    
    //Assignment 3
    public long getTimeCreated()
    {
        return timeCreated;
    }
    
    //Used to allow method to read
    @Override
    public String toString()
    {
        return groupID;
    }
}
