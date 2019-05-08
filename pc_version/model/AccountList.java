package model;

import java.util.ArrayList;

public class AccountList {
	ArrayList<Account> accountlist;

	public ArrayList<Account> getAccountlist() {
		return accountlist;
	}

	public ArrayList<Account> addAccount(Account account) {
		this.accountlist.add(account);
		return accountlist;
	}

	public AccountList() {
		super();
		this.accountlist = new ArrayList<Account>();
	}
}
