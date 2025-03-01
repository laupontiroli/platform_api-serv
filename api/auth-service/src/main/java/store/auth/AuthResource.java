package store.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthResource implements AuthController {

    @Autowired
    private AuthService authService;

    @Override
    public ResponseEntity<TokenOut> register(RegisterIn registerIn) {
        String token = authService.register(AuthParser.to(registerIn));
        return ResponseEntity.ok().body(AuthParser.to(token));
    }

    @Override
    public ResponseEntity<TokenOut> login(LoginIn loginIn) {
        // TODO Auto-generated method stub
        return null;
    }

}
