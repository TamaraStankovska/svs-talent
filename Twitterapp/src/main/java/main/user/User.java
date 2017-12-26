package main.user;

import main.tweet.Tweet;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String email;

    @OneToMany(mappedBy = "user")
   // @JoinTable(name="USER_TWEETS",joinColumns = @JoinColumn(name="USER_ID"), inverseJoinColumns =@JoinColumn(name="TWEET_ID"))
    private Collection<Tweet> tweets=new ArrayList<Tweet>();

    public Collection<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(Collection<Tweet> tweets) {
        this.tweets = tweets;
    }

    public User(String email)
    {
        this.email=email;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public String getEmail()
    {
        return email;
    }


    @Override
    public String toString(){
        return email;
    }

}
