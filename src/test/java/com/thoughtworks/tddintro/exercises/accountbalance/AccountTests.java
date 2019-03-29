package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){

        Account account = new Account();
        assertThat(account.getBalance(), is(0.0));
        account.deposit(50.0);
        assertThat(account.getBalance(), is(50.0));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){

        Account account = new Account();
        account.deposit(600.0);
        account.withdraw(500.0);
        assertThat(account.getBalance(), is(100.0));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){

        Account account = new Account();
        account.deposit(500.0);
        account.withdraw(600.0);
        assertThat(account.getBalance(), is(500.0));
    }
}
