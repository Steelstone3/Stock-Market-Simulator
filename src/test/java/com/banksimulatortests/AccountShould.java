package com.banksimulatortests;

import com.banksimulator.Account;
import com.banksimulator.contracts.IAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountShould {

    private IAccount _account;

    @BeforeEach
    public void setup() {
        _account = new Account();
    }

    @Test
    public void haveAAccountValue() {
        _account.setValue(2000);

        Assertions.assertEquals(2000, _account.getValue());
    }
}
