package com.hillcrest.hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.hillcrest.objects.NurcingRoom;


@Controller
@EnableAutoConfiguration
public class HelloController {
	@RequestMapping("/")
    @ResponseBody
    String home() {
		
		NurcingRoom nr = new NurcingRoom("this", "that");
		
        return "Hello World!" + nr.toString();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloController.class, args);
    }
}
