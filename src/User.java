//Users must have unique ID, list of followers, list of followings
//news feed list containing list of twitter messsges
//Visitor Pattern

import java.util.*;

public class User implements CompositeUser
{
    //Unique user id
    private String userID;

    //List of following
    private ArrayList<User> following;
    
    private List<String> message;
    private List<Message> newsFeed;
    
    public User(String id)
    {
        this.userID = id;
        this.following = new ArrayList<User>();
        this.message = new ArrayList<String>();
        this.newsFeed = new ArrayList<Message>();
    }

    //Accessor methods
    @Override 
    public void setID(String id)
    {
        userID = id;
    }

    @Override 
    public String getID()
    {
        return userID;
    }

    public void addFollowing(User userID)
    {
        following.add(userID);
    }

    public ArrayList<User> getFollowing()
    {
        return following;
    }

    public void addMessage(String mess)
    {
        message.add(mess);
    }

    public String getMessage(int pos)
    {
        return message.get(pos);
    }
    
    //Used to allow method to read name
    @Override
    public String toString()
    {
        return userID;
    }
}
