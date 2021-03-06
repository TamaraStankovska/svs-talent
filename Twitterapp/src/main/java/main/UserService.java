package main;

import com.google.common.collect.Lists;
import main.repository.UserRepository;
import main.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }

    public List<User> findUsers(){
        return Lists.newArrayList(userRepository.findAll());
    }

    public  void addUser(User user)
    {
        if(!exists(user))
            userRepository.save(user);
    }


    public User findByEmail(String email)
    {

        return userRepository.findByEmail(email);
    }

    public boolean exists(User user)
    {
        Iterable<User> users=findUsers();
        for(User u: users)
            if(user.equals(u))
                return true;
        return false;
    }
}
