package main.tweet;



import main.user.User;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Tweet  {

    String message;
    Date time;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id")

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tweet()
    {
        message="";
        time=new Date();
    }

    public Tweet(String message)
    {
        this.message=message;
        //this.time=new Date();
    }



    public String getMessage() {
        return message;
    }

    public void setMessage(String message){
        this.message=message;
    }
    public Date getTime()
    {
        return time;
    }

    public void setTime(Date time)
    {
        this.time=time;

    }


    @Override
    public String toString(){
        return "User write the message:"+message;
    }



}
