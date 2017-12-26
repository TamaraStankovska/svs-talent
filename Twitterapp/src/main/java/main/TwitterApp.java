package main;

import main.consoleinput.ConsoleReadInput;
import main.consoleinput.ReadInput;
import main.repository.CollectionTweets;
import main.repository.TweetRepository;
import main.repository.UserRepository;
import main.tweet.Tweet;
import main.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Scanner;

@SpringBootApplication

public class TwitterApp {


    public static void Menu() {
        System.out.println("Sign in:");
        System.out.println("Enter 1-'Tweet a message!', 2-'List all tweets', 0-'Exit'.");


    }

  /*  @Bean
    CommandLineRunner runner(UserRepository userRepository) {
        return args -> {
            userRepository.save(new User("stankovska@yahoo.com"));
            userRepository.save(new User("chris4@gmail.com"));
            userRepository.save(new User("desp_23@hotmail.com"));
            userRepository.save(new User("david12@hotmail.com"));
        userRepository.save(new User("kristoferK@yahoo.com"));

    //    };

  //  }   */


    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(TwitterApp.class, args);
      //  SpringApplication.run(TweetService.class,args);

        //  TweetRepository tweets = ctx.getBean(CollectionTweets.class);

      /*  ReadInput inputConsole = ctx.getBean(ConsoleReadInput.class);


        UserService userService = ctx.getBean(UserService.class);
        String input = inputConsole.readInput();


        while (!input.equals("0")) {
            if (input.equals("1")) {
                System.out.println("Tweet a message:");
                String message = inputConsole.readInput();
            //    tweets.createTweet(new Tweet(message));
                System.out.println("Your message is saved!");
            } else if (input.equals("2")) {
                System.out.println("List all of your tweets:");
            //    System.out.println(tweets);
            } else {

                System.out.println("Your option isn't valid.Please choose -1- or -2-");
            }

            System.out.println("Press any key to go back to the menu.");
            input = inputConsole.readInput();
            Menu();


            input = inputConsole.readInput();
        }
        System.exit(-1);
    }
*/
    }
}