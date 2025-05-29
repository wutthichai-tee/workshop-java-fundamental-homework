package dev.homework.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeapController {
    
    @GetMapping("/leap/{year}")
    public Leap getLeap(@PathVariable("year") String year) {
        System.out.println("Path year: " + year);

        Leap leap = new Leap(); 
        int yearInt = Integer.parseInt(year);
        System.out.println("Is leap year: " + leap.isLeapYear(yearInt));

        return leap;
    }
}
