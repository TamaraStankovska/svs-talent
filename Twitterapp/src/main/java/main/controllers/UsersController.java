package main.controllers;

import main.UserService;
import main.repository.UserRepository;
import main.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/users")
public class UsersController  {

    @Autowired
    private UserService userService;

    public UsersController(UserService userService)
    {
        this.userService=userService;
    }

    @GetMapping
    @ResponseBody
    public List<User> findUsers(){
        return userService.findUsers();
    }


    @PostMapping
    @ResponseBody
    public void addUser(@RequestBody User user)
    {
        userService.addUser(user);
    }
  // @GetMapping(value = "/all")
   // public List<User> findAll(){
     //  return userRepository.findAll();
   //}

   //@GetMapping(value= "/{email}")
     //      public User findByEmail(@PathVariable final String email)
  // {
    //   return userRepository.findByEmail(email);
   //}

   //@PostMapping
    //public User load(@RequestBody final User user){
      // userRepository.save(user);
       //return userRepository.findByEmail(user.getEmail());



   }


