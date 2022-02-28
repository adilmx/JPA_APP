package com.adilmx.jpaApp;

import com.adilmx.jpaApp.constants.AccountType;
import com.adilmx.jpaApp.model.Account;
import com.adilmx.jpaApp.model.User;
import com.adilmx.jpaApp.service.AccountService;
import com.adilmx.jpaApp.service.UserService;
import com.adilmx.jpaApp.service.impl.AccountServiceImpl;
import com.adilmx.jpaApp.service.impl.UserServiceImpl;

import java.util.Date;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        AccountService accountService = new AccountServiceImpl();
        UserService userService = new UserServiceImpl();
        User user1 = new User("ADIL","0601020304");
        User user2 = new User("ADIL","0601020304");
        User user3 = new User("ADIL","0601020304");
        userService.saveUser(user1);
        accountService.saveAccount(new Account(null, AccountType.ACTIVATED,new Date(),user1));
        userService.saveUser(user2);
        accountService.saveAccount(new Account(null, AccountType.CLOSED,new Date(),user2));
        userService.saveUser(user3);
        accountService.saveAccount(new Account(null, AccountType.CLOSED,new Date(),user3));
        System.out.println("getting closed accounts");
        List<Account> accounts = accountService.findByType(AccountType.CLOSED);
        System.out.println("CLOSED ACCOUNTS :"+accounts);
        Long id = 6L;
        System.out.println("ACCOUNT WITH ID "+id+" IS "+accountService.findById(id));
    }
}
