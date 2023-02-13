package com.christopherrivera.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MainController {
	
	@RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String name, 
    		@RequestParam(value="last_name", required =false) String lastName,
    		@RequestParam(value="times", required =false) String times) {
        if(name != null) {
        	String message = "Hello " + name + " ";
        	if(lastName != null) {
        		message += lastName + " ";
        	}
        	if(times != null) {
        		String oneMessage = message;
        		for(Integer i = 2; i <= Integer.parseInt(times); i++) {
        			message += oneMessage;
        		}
        	}
        	return message; 
        }
        else {
        	return "Hello Human";
        }
    }
	
	
	
}
