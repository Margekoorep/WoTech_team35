DatoriumAPIApplication.java 

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
