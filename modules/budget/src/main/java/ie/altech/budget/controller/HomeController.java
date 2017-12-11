package ie.altech.budget.controller;

import ie.altech.budget.pages.Home;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public Home home(){
        return new Home("123456", "You are in the \'Home\' page.");
    }
}
