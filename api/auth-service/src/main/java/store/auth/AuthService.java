package store.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import store.account.AccountController;
import store.account.AccountIn;
import store.account.AccountOut;

@Service
public class AuthService {

    @Autowired
    private AccountController accountController;

    public String register(Register register) {
        AccountIn accountIn = AccountIn.builder()
            .email(register.email())
            .name(register.name())
            .password(register.password())
            .build();
        // registrar no account
        // aqui estou substituindo o RestTemplate
        ResponseEntity<AccountOut> response = accountController.create(accountIn);
        AccountOut accountOut = response.getBody();

        // gerar o token
        String token = accountOut.id();
        return token;
    }

    public String login(String email, String password) {
        return null;
    }

}
