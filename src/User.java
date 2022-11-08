//Users must have unique ID, list of followers, list of followings
//news feed list containing list of twitter messsges
//Visitor Pattern

import java.util.*;

public class User implements CompositeUser
{
    //Unique user id
    private int userID;

    //List of followers
    private Set<Integer> followers = new HashSet<Integer>();

    //List of following
    private Set<Integer> following = new HashSet<Integer>();

    private String username;
    private String message;

    //Accessor methods
    @Override public void setID(int id)
    {
        userID = id;
    }

    @Override public int getID()
    {
        return userID;
    }

    public void addFollower(int userID)
    {
        followers.add(userID);
    }

    public Set<Integer> getFollowers()
    {
        return followers;
    }

    public void addFollowing(int userID)
    {
        following.add(userID);
    }

    public Set<Integer> getFollowing()
    {
        return following;
    }

    @Override public void setName(String name)
    {
        username = name;
    }

    @Override public String getName()
    {
        return username;
    }

    public void setMessage(String mess)
    {
        message = mess;
    }

    public String getMessage()
    {
        return message;
    }
}
