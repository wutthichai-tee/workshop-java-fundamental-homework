package dev.homework.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneController {

    // URI compoents
	// scheme://host:port/path/{id}?query#fragment
	// http://localhost:8080/accumulate/1234?id=aaaaa

    @GetMapping("/phonenumber/{phoneNumber}")
    public PhoneNumber getPhoneNumber(@PathVariable("phoneNumber") String phoneNumber) {
        System.out.println("Path phoneNumber: " + phoneNumber);

        PhoneNumber pn = new PhoneNumber(phoneNumber);
        System.out.println("Processed phone number: " + pn.getNumber());

        return pn;
    }

}
