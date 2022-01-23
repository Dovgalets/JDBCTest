package Spring;

import Hibernate.City;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetingController {

    private GreetingService greetingService = new GreetingService();

    @GetMapping("/list")
    public List<City> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return greetingService.getCities();
    }
}
