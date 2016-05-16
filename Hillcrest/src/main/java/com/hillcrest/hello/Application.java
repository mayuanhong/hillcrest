package com.hillcrest.hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hillcrest.objects.utils.*;

@ClassPreamble(author = "Jusitn Ma", date = "3/17/2016", currentRevision = 6, lastModified = "4/12/016", lastModifiedBy = "Justin Ma"

)
// Have to add @Configuration sometimes, when it doesn't work.
// @Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(Application.class, args);

	}
}
