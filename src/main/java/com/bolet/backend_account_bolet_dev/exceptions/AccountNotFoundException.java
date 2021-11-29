package com.bolet.backend_account_bolet_dev.exceptions;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(String message){
        super(message);
    }
    
}
