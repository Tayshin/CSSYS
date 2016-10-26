package com.cssys.serviceImpl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.cssys.dao.AccountDao;
import com.cssys.dao.StudentDao;
import com.cssys.domain.Account;
import com.cssys.domain.Student;
import com.cssys.service.AccountService;

public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountDao accountDao;
	private StudentDao studentDao;

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public boolean createAccount(Integer username, String password, Integer accType) {
		try{
		   if(accType==0){
			   if(!accountDao.existsUsername(username)){
			   Account account=new Account();
			   account.setUsername(username);
			   account.setPassword(password);
			   account.setAccount_type(accType);
			   accountDao.createAccount(account);
			   Student student=new Student();
			   student.setStudent_id(username);
			   studentDao.createStudent(student);
			   return true;
			   }
		   }
		   else if(accType==1){
			   if(!accountDao.existsUsername(username)){
			   Account account=new Account();
			   account.setUsername(username);
			   account.setPassword(password);
			   account.setAccount_type(accType);
			   accountDao.createAccount(account);
			   return true;
		       }
		   }
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	
	@Override
	public boolean studentLogin(Integer username, String password, Integer accType,HttpSession session) {
		try{
			if(accType==0){
			Account account=new Account();
			account.setUsername(username);
			account.setPassword(password);
			account.setAccount_type(accType);
			if(accountDao.verifyLogin(account)==true){
				Student student=studentDao.getStudentByStudentId(username);
				//System.out.print(student.getStudent_id());
				session.setAttribute("student",student);
				Account studentAccount=accountDao.getAccountByUsername(username);
				session.setAttribute("studentAccount",studentAccount);
				return true;
			}
			return false;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean adminLogin(Integer username, String password, Integer accType,HttpSession session) {
		try{
		   if(accType==1){
		   Account account=new Account();
		   account.setUsername(username);
		   account.setPassword(password);
		   account.setAccount_type(accType);
		   if(accountDao.verifyLogin(account)==true){
			   Account admin=accountDao.getAccountByUsername(username);
			   session.setAttribute("admin",admin);
			   return true;
		   }
		   return false;
		   }
		}   
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean changePassword(Account account,String newPassword){
		try{
			account.setPassword(newPassword);
			return accountDao.updateAccount(account);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean createAccount(Account account) {
		try{
			return accountDao.createAccount(account);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public boolean existsUsername(Integer username) {
		return accountDao.existsUsername(username);
	}

	@Override
	public boolean deleteAccountByUsername(Integer username) {
		Account account=accountDao.getAccountByUsername(username);
		return accountDao.deleteAccount(account);
	}
}
