package com.tecacet.multisource.secondary.repository;

import com.tecacet.multisource.secondary.entity.Account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
