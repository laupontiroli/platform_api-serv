package store.auth;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {

    private static final String issuer = "Insper";
    private static final String secretKey = "yrBBgYlvJQeslzFlgX9MFZccToI2fjRFqualquercoisa";

    public String create(String id, Date notBefore, Date expiration) {
        SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretKey));
        String jwt = Jwts.builder()
            .header()
            .and()
            .id(id)
            .issuer(issuer)
            .signWith(key)
            .notBefore(notBefore)
            .expiration(expiration)
            .compact();
        return jwt;
    }    
    
}
