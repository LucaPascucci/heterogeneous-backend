package it.lucapascucci.heterogeneousBackend.rest;

import it.lucapascucci.heterogeneousBackend.model.Greeting;
import it.lucapascucci.heterogeneousBackend.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingRestAPI {

    private final GreetingService greetingService = new GreetingService();

    @GetMapping("/greeting")
    public Greeting getGreeting(@RequestParam(value = "name", defaultValue = "Luca") String name) {
        return greetingService.getGreeting(name);
    }

    @GetMapping("/greeting-impe")
    public Greeting getGreeting() {
        return greetingService.getGreeting("impe");
    }

}
