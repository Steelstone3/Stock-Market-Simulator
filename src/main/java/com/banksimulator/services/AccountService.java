package com.banksimulator.services;

import com.banksimulator.contracts.IAccount;
import com.banksimulator.contracts.IAccountService;

public class AccountService implements IAccountService {
    private IAccount _account;

    public AccountService(IAccount account) {
        _account = account;
    }

    public void deposit(int amount){
        _account.setValue(_account.getValue() + amount);
    }

    public void withdraw(int amount){
        _account.setValue(_account.getValue() - amount);
    }
}
