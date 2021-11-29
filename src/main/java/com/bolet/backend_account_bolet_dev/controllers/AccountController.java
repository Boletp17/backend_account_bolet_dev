package com.bolet.backend_account_bolet_dev.controllers;

import com.bolet.backend_account_bolet_dev.models.Account;
import com.bolet.backend_account_bolet_dev.repositories.AccountRepository;
import com.bolet.backend_account_bolet_dev.exceptions.AccountNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController //Trabajara como una red para servicios rest
public class AccountController {
    private final AccountRepository<String> accountRepository;
    
    public AccountController(AccountRepository<String> accountRepository){
        this.accountRepository = accountRepository;
    }
    
    @GetMapping("/accounts/{username}")
    Account getAccount(@PathVariable String username){
        return this.accountRepository.findById(username).orElseThrow(() -> new AccountNotFoundException("No existe esta cuenta de usuario"));
        
    }
    
    @PostMapping("/accounts")
    Account createAccount(@RequestBody Account account){
        return (Account) accountRepository.save(account);
    }
    
    @DeleteMapping("/accounts/delete/{username}")
    String deleteAccount(@PathVariable String username){
        Account account = (Account) accountRepository.findById(username).orElse(null);
        if(account == null){
            throw new AccountNotFoundException("La cuenta a eliminar no existe");
        }
        this.accountRepository.delete(account);//eliminar objeto completo
        this.accountRepository.deleteById(username);
        return "Eliminación completa";
    }
    
    
}
