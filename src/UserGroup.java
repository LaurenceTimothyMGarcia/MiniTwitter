//each group must have unique id, contain any # of users, groups can hold other groups
//Make this composite

import java.util.*;

public class UserGroup implements CompositeUser
{
    //Unique group id
    private int groupID;

    //Holds group of users
    private Set<Integer> groupUsers = new HashSet<Integer>();

    private String groupName;

    //Accessor Methods
    @Override public void setID(int id)
    {
        groupID = id;
    }

    @Override public int getID()
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
    
    @Override public void setName(String name)
    {
        groupName = name;
    }
    
    @Override public String getName()
    {
        return groupName;
    }
}
