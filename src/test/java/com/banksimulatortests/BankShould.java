package com.banksimulatortests;

import com.banksimulator.Account;
import com.banksimulator.Bank;
import com.banksimulator.contracts.IBank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankShould {

    IBank _bank;

    @BeforeEach
    public void setup() {
        _bank = new Bank(new Account());
    }

    @Test
    public void haveAnAccount() {
        Assertions.assertNotNull(_bank.getAccount());
    }
}
