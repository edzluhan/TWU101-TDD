package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){

        Account account = new Account(100.00);
        account.deposit(50.0);
        assertThat(account.getBalance(), is(150.00));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

        Account account = new Account(100.00);
        account.withdraw(50.0);
        assertThat(account.getBalance(), is(50.00));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

        Account account = new Account(50.00);
        account.withdraw(100.0);
        assertThat(account.getBalance(), is(50.0));
    }
}
