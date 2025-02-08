package store.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountResource {

    @GetMapping("/hello")
    public String hello() {
        return "To vivo!";
    }
    
}
