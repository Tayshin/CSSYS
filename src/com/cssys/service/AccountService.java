package com.cssys.service;

import javax.servlet.http.HttpSession;

import com.cssys.domain.Account;

public interface AccountService {
    public boolean createAccount(Integer username,String password,Integer accType);
    public boolean studentLogin(Integer username,String password,Integer accType,HttpSession session);
    public boolean adminLogin(Integer username,String password,Integer accType,HttpSession session);
    public boolean changePassword(Account account,String newPassword);
    public boolean createAccount(Account account);
    public boolean existsUsername(Integer username);
    public boolean deleteAccountByUsername(Integer username);
}
