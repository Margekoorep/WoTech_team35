
package com.datorium.Datorium.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Random.
  
@SpringBootApplication
@RestController
@CrossOrigin

public class DatoriumApiApplication {

	public static void main(String[] args) {
		System.out.println("asd");
		SpringApplication.run(DatoriumApiApplication.class, args);
	}


	@GetMapping("/ping")
	public String ping() {
		return "It works";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/sum")
	public int sum(@RequestParam(value = "number1") int number1, @RequestParam(value = "number2") int number2){
		return  number1 + number2;
	}
	@GetMapping("/multiply")
	public int multiply(@RequestParam(value = "number1") int number1, @RequestParam(value = "number2") int number2) {
		return number1 * number2;
	}


  // Create an array in the endpoint, fill the array with data and access it from the URL
  // example 1: 
	@GetMapping("/farmanimals")
	public ArrayList<String> farmAnimals(){

		ArrayList<String> farmAnimals = new ArrayList<String>();
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("horse");
		farmAnimals.add("goat");
		return  farmAnimals;
	}

  // example 2: 
  @GetMapping("/array")
    public int[] array() {
        Random random = new Random();
        int[] randomNumbers = new int[5];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(1000);
        }
        return randomNumbers;
    }

 //  2. Create an object (new class, cheese or wine or whatever) in the endpoint, fill the object, access it from the URL

  // example 1: 
	@GetMapping("/cat")
	public Cat cat() {
		String name = "Nala";
		int age = 1;
		String colour = "multicolour";
		var cat = new Cat(name, age, colour);

		return cat;
	}

  // ADDED a new class Cat.java
  package com.datorium.Datorium.API;

public class Cat {

        public String name;
        public int age;
        public String colour;

    public Cat (String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }
    }

// EXAMPLE 2: 
@GetMapping("/dog")
    public Dog dog() {
        Dog dog = new Dog("Rocky", 8, "Beagle");
        return dog;
    }

    public class Dog {
        public String name;
        public int age;
        public String breed;

        public Dog(String name, int age, String breed){
            this.name = name;
            this.age = age;
            this.breed = breed;
        }
    

// Aditional task: Generate 2 dimensional array in endpoint
// it's a maze ... or something like it
  
	@GetMapping("/draw")
	public int[][] draw(){
		return new int[][]{
				new int[]{1, 1, 1, 1, 1, 1, 0, 1},
				new int[]{1, 0, 1, 0, 1, 0, 0, 1},
				new int[]{1, 0, 1, 0, 0, 0, 1, 1},
				new int[]{1, 0, 0, 0, 1, 1, 1, 1},
				new int[]{1, 1, 1, 0, 0, 1, 1, 1},
				new int[]{1, 0, 1, 1, 0, 1, 0, 1},
				new int[]{1, 0, 0, 0, 0, 1, 0, 1},
				new int[]{1, 1, 0, 1, 1, 1, 0, 1},
				new int[]{1, 1, 0, 0, 0, 0, 0, 1},
				new int[]{1, 0, 0, 1, 1, 1, 1, 1},
				new int[]{1, 1, 0, 0, 0, 0, 0, 1},
				new int[]{1, 1, 0, 1, 0, 1, 0, 1},
				new int[]{1, 1, 1, 1, 0, 1, 1, 1}};
	}
}

