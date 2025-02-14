package store.account;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AccountController {

    @PostMapping("/account")
    public ResponseEntity<AccountOut> create(
        @RequestBody AccountIn accountIn
    );

    @GetMapping("/account")
    public ResponseEntity<List<AccountOut>> findAll();
    
}
