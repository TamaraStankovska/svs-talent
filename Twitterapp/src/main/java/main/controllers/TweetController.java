package main.controllers;

import main.TweetService;
import main.tweet.Tweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/tweets")
public class TweetController {
    private TweetService tweetService;

    @Autowired
    public TweetController(TweetService tweetService)
    {
        this.tweetService=tweetService;
    }

    @GetMapping
    @ResponseBody
    public List<Tweet> findTweets(){
        return tweetService.findTweets();
    }

    @PostMapping
    @ResponseBody
    public void createTweet(@RequestBody Tweet tweet)
    {
        tweetService.createTweet(tweet);
    }

}
