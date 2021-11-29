package com.bolet.backend_account_bolet_dev.repositories;

import com.bolet.backend_account_bolet_dev.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository<String> extends MongoRepository<Account, String> {
    
    
}
