package com.cssys.dao;

import com.cssys.domain.Account;

public interface AccountDao {
     public boolean createAccount(Account account);
     public boolean updateAccount(Account account);
     public boolean verifyLogin(Account account);
     public boolean existsUsername(Integer username);
     public Account getAccountByUsername(Integer username);
     public boolean deleteAccount(Account account);
}
