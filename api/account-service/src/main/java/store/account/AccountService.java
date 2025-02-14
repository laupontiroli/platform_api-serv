package store.account;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private static List<Account> accounts = new ArrayList<>();

    public Account create(Account account) {
        account.id(UUID.randomUUID().toString());
        accounts.add(account);
        return account;
    }

    public List<Account> findAll() {
        return accounts;
    }
    
}
