package com.tecacet.multisource.secondary.repository;

import static org.junit.jupiter.api.Assertions.*;

import com.tecacet.multisource.secondary.entity.Account;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import javax.annotation.Resource;

@SpringBootTest
class AccountRepositoryTest {

    @Resource
    AccountRepository accountRepository;

    @Test
    void test() {
        Optional<Account> account = accountRepository.findById(3L);
        assertTrue(account.isPresent());
    }
}
