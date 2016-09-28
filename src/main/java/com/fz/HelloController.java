package com.fz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private static final String template = "Merhaba, %s!";
	
    @RequestMapping("/")
    public String index() {
        return "Furkan Zayimoğlu ile Spring Boot web uygulaması!";
    }
    
    @RequestMapping("/karsila")
    public String greeting(@RequestParam(value="name", defaultValue="Furkan") String name) {
        return String.format(template, name);
    }
}
