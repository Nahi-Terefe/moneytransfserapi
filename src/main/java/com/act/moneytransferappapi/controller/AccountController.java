package com.act.moneytransferappapi.controller;

import com.act.moneytransferappapi.domain.Account;
import com.act.moneytransferappapi.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping(value = "/create", produces = "application/json")
    public Account createAccount(@RequestBody Account accountRequest) throws Exception {
        return accountService.createAccount(accountRequest);
    }

}
