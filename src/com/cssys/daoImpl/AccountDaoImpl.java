package com.cssys.daoImpl;

import com.cssys.dao.AccountDao;
import com.cssys.domain.Account;
import com.cssys.Utils.HibernateUtils;
public class AccountDaoImpl extends HibernateUtils<Account> implements AccountDao{

	@Override
	public boolean createAccount(Account account) {
		return save(account);
	}

	@Override
	public boolean updateAccount(Account account) {
		return update(account);
	}

	public Account getAccountByUsername(Integer username){
		Account account=(Account) findByHql("from Account a where a.username=?",new Object[]{username});
		if(account==null){
			return null;
		}
		return account;
	}
	@Override
	public boolean verifyLogin(Account account) {
		Object acc= findByHql("from Account a where a.username=? and a.password=? and a.account_type=?",
				new Object[]{account.getUsername(),account.getPassword(),account.getAccount_type()});
		if(acc==null){
			return false;
		}
		return true;
	}

	@Override
	public boolean existsUsername(Integer username) {
		Object acc=findByHql("from Account a where a.username=?",new Object[]{username});
		if(acc==null){
		return false;
	}
		return true;
    }

	public boolean deleteAccount(Account account) {
		return delete(account);
	}
}
