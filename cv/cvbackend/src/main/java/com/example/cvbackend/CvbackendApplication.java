package com.example.cvbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.cvbackend.api.Greeting;

@SpringBootApplication
public class CvbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvbackendApplication.class, args);
    System.out.println("Hello, This is coming from the backend!");
	}

@RestController
@RequestMapping("/api")
class GreetingController {

    @GetMapping("/greet")
    public Greeting greet() {
        return new Greeting("Hello, this is your API greeting!");
    }
}



  Function 
}
