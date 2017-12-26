package main.repository;

import main.tweet.Tweet;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.Collections;

@Component
public class CollectionTweets {

    private ArrayList<Tweet> tweets;

    public CollectionTweets(){
        tweets=new ArrayList<>();
    }



    public void addTweet(Tweet t) {
        tweets.add(t);
    }

    @Override
    public String toString(){
        Collections.sort(tweets,Collections.reverseOrder());
        StringBuilder sb=new StringBuilder();
        for(Tweet t:tweets) {
            sb.append(t.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

}
