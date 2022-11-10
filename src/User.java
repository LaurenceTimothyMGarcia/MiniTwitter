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
    
    //User messages
    private List<String> message;
    private Message newsFeed;
    
    public User(String id)
    {
        this.userID = id;
        this.following = new ArrayList<User>();
        this.message = new ArrayList<String>();
        this.newsFeed = new Message();
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

    //Adds followers to list
    public void addFollowing(User userID)
    {
        following.add(userID);
    }

    //Gets list of followers
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
    
    public void update()
    {
        //newsFeed.printTweets(newsFeed, following, this);
    }
    
    //Used to allow method to read name
    @Override
    public String toString()
    {
        return userID;
    }
}
