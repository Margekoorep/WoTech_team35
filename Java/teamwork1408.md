Controller
```java@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController() {
         userService = new UserService();
    }

    @GetMapping()
    public String getUser(){
        return"Test";
    }
    @PostMapping("/add")
    public int getUser(@RequestBody  User user) {
        return userService.add(user);
    }

    @GetMapping("/get")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}

```
Service

```java
import com.datorium.Datorium.API.DTOs.User;
import com.datorium.Datorium.API.Repositories.UserRepository;

import java.util.List;

public class UserService {

    private  UserRepository repository;

    public UserService() {
        repository = new UserRepository();
    }

    public int add(User user) {
        return repository.add(user);

    }

    public List<User> getUsers() {

        return repository.getUsers();
    }
}
```
Repository
```java
package com.datorium.Datorium.API.Repositories;

import com.datorium.Datorium.API.DTOs.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
private List<User> users = new ArrayList<>();

    public int add(User user) {
        users.add(user);
        return users.size();
    }

    public List<User> getUsers() {
        return users;
    }
}
```



