package com.banksimulator;

import com.banksimulator.contracts.IBank;

public class Bank implements IBank {

    private Account _account;

    public Bank(Account account) {
         _account = account;
    }

    public Account getAccount() {
        return _account;
    }
}
