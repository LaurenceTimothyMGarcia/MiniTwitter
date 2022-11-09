//each group must have unique id, contain any # of users, groups can hold other groups
//Make this composite

import java.util.*;

public class UserGroup implements CompositeUser
{
    //Unique group id
    private String groupID;

    //Holds group of users
    private ArrayList<CompositeUser> groupUsers;
    
    public UserGroup(String id)
    {
        groupID = id;
        groupUsers = new ArrayList<CompositeUser>();
    }
    
    //Accessor Methods
    @Override 
    public void setID(String id)
    {
        groupID = id;
    }

    @Override 
    public String getID()
    {
        return groupID;
    }

    public void addUserToGroup(User userID)
    {
        groupUsers.add(userID);
    }

    public ArrayList<CompositeUser> getGroup()
    {
        return groupUsers;
    }
}
