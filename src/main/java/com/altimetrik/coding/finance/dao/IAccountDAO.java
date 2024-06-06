package com.altimetrik.coding.finance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altimetrik.coding.finance.model.Account;


public interface IAccountDAO extends JpaRepository<Account, Long> {}