package dev.homework.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {
    	
    // URI compoents
	// scheme://host:port/path/{id}?query#fragment
	// http://localhost:8080/greet/tee+

 
 	@GetMapping("/greet/{msg}")
	public Greeter getGreet(@PathVariable("msg") String msg) {
		System.out.println("Path msg: " + msg);

		Greeter gt = new Greeter();
		gt.setGreeting("Tee+");
        
        return gt;
	}
}
