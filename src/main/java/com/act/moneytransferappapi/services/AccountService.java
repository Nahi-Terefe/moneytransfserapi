package com.act.moneytransferappapi.services;

import com.act.moneytransferappapi.domain.Account;
import com.act.moneytransferappapi.repositeries.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) throws Exception {
        return accountRepository.save(account);
    }
}
