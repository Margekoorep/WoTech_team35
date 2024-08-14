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
}```
