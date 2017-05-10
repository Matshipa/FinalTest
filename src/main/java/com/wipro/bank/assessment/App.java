package com.wipro.bank.assessment;
import com.wipro.bank.entity.Account;

import java.util.*;

public class App 
{
    
	
		
	public static List<Account> accounts = new ArrayList<Account>();
	
	public static List<Account> getAccounts() {
		return accounts;
	}

  
    public Account getAccountDetailsByID(int id){
    	
    	Account account = null;
    	
    	if(accounts!=null)
    	{
    		for(Account acc: accounts)
    		{
    			if(acc.getAccountID()==id)
    			{
    				account = acc;
    				break;
    			}
    			
    		}
    	}
    
    	
    	return account;
    }
    public List<Account> getAccountDetailsByBalance(double amount)
    {
    	List<Account> accountBalance = new ArrayList<Account>();
    	boolean flag = true;
    	
    		for(Account acc: accounts)
    		{
    			
    			if(acc.getBalance()>=amount)
    			{	
    				accountBalance.add(acc);
    				flag = false;
    				
    			}
    			
    		}
    		
    	if(flag)
    		return null;
    	else   	
    		return accountBalance;
    }

}
