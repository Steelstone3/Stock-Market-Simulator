package com.banksimulator;

import com.banksimulator.contracts.IAccount;

public class Account implements IAccount {

    private int _value;

    public void setValue(int value) {
        _value = value;
    }

    public int getValue() {
        return _value;
    }
}
