package com.banksimulatortests;

import com.banksimulator.Account;
import com.banksimulator.contracts.IAccount;
import com.banksimulator.contracts.IAccountService;
import com.banksimulator.services.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountServiceShould {

    private IAccountService _accountService;

    private IAccount _account;

    @BeforeEach
    public void setup() {
        _account = new Account();
        _accountService = new AccountService(_account);
        _account.setValue(1000);
    }

    @Test
    public void makesADeposit() {
        _accountService.deposit(500);
        Assertions.assertEquals(1500, _account.getValue() );
    }

    @Test
    public void makesAWithdrawal() {
        _accountService.withdraw(500);
        Assertions.assertEquals(500, _account.getValue() );
    }
}
