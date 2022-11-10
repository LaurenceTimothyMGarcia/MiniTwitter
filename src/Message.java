
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Laurence
 */
public class Message 
{
    private String[] positiveWords = {"happy", "positive", "cute", "good", "great", "excellent"};
    
    private ArrayList<String> allTweets = new ArrayList<String>();
    
    public float CalculatePosWord()
    {
        float percentPos;
        float posTweet = 0;
        float overallTweet = allTweets.size();
        
        for(int i = 0; i < overallTweet; i++)
        {
            String tweet = allTweets.get(i);
            
            for(int j = 0; j < positiveWords.length; j++)
            {
                if (tweet.contains(positiveWords[j]))
                {
                    posTweet++;
                }
            }
        }
        
        percentPos = posTweet / overallTweet * 100;
        
        return percentPos;
    }
    
    public void addTweet(String tweet)
    {
        allTweets.add(tweet);
    }
}
