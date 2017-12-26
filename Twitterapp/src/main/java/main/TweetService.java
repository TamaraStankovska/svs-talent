package main;
import com.google.common.collect.Lists;
import main.repository.TweetRepository;
import main.tweet.Tweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.List;



@Service
public class TweetService {

    private TweetRepository tweetRepository;

    @Autowired
    public TweetService(TweetRepository tweetRepository)
    {
        this.tweetRepository=tweetRepository;
    }

    public List<Tweet> findTweets(){

        return Lists.newArrayList(tweetRepository.findAll());
    }


    public void createTweet(Tweet t)
    {
        if (!exists(t)) {
            tweetRepository.save(t);
        }
    }

    private boolean exists(Tweet t)
    {
        Iterable<Tweet> tweets=findTweets();
        for(Tweet tweet:tweets)
            if(tweet.equals(t)) return true;
        return false;
    }

}

