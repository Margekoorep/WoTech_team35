DatoriumApiApplication.java 

```java

package com.datorium.Datorium.API;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;



@SpringBootApplication
@RestController
@CrossOrigin

public class DatoriumApiApplication { // this is the Main class!

	public static void main(String[] args) { //This needs to be here
		SpringApplication.run(DatoriumApiApplication.class, args);
	}

}

```

MessageController.java
```java
package com.datorium.Datorium.API.Controllers;
import com.datorium.Datorium.API.DTOs.Message;
import com.datorium.Datorium.API.Services.MessageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {
    private MessageService messageService;
    public MessageController(){
        messageService = new MessageService();
    }
    @PostMapping("/add")
    public String message (@RequestBody Message message) {
        if (message.text.equals("Hello")) {
            return "World";
        } else {
            return messageService.add(message);
        }
    }
}
```

MessageService.java
```java
package com.datorium.Datorium.API.Services;
import com.datorium.Datorium.API.DTOs.Message;


public class MessageService {
    public String add(Message message){
       return "Hello World";
    }

}
```

Message.java
```java
package com.datorium.Datorium.API.DTOs;

public class Message {
    public String text;
}
´´´


