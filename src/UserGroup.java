//each group must have unique id, contain any # of users, groups can hold other groups
//Make this composite

import java.util.*;

public class UserGroup 
{
    //Unique group id
    private int groupID;

    //Holds group of users
    private Set<Integer> groupUsers = new HashSet<Integer>();

    private String groupName;

    //Accessor Methods
    public void setGroupID(int id)
    {
        groupID = id;
    }

    public int getGroupID()
    {
        return groupID;
    }

    public void addUserToGroup(int userID)
    {
        groupUsers.add(userID);
    }

    public Set<Integer> getGroup()
    {
        return groupUsers;
    }
    
    public void setGroupName(String name)
    {
        groupName = name;
    }
    
    public String getGroupName()
    {
        return groupName;
    }
}
