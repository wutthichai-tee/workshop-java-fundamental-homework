package dev.homework.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AccumulateController {

	// URI compoents
	// scheme://host:port/path/{id}?query#fragment
	// http://localhost:8080/accumulate/1234?id=aaaaa

 
 	@GetMapping("/accumulate/{id}")
	public Accumulate getAccumulate(@PathVariable("id") String id) {
		System.out.println("Path id: " + id);

		Accumulate acc = new Accumulate();
		acc.setId(id);

        List<String> result = Accumulate.accumulate(Arrays.asList("hello", "world"), String::toUpperCase);
        for (String item : result) {
            System.out.println("Accumulated item: " + item);
        }

        return acc;
	}
}
