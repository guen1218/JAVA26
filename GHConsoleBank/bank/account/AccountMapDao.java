package bank.account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountMapDao implements AccountDao {

	Map<Integer, Account> AccountDB = new HashMap<Integer, Account>();
	
	@Override
	public boolean save(Account a) {
		AccountDB.put(a.getNo(), a);
		return true;
	}

	@Override
	public List<Account> findAll() {
		if(AccountDB.isEmpty()) return null;
		List<Account> Accounts = new ArrayList<>();
		for(Account a : AccountDB.values()) {
			Accounts.add(a);
		}
		return Accounts;
	}

	@Override
	public List<Account> findByMemberId(String id) {
		if(AccountDB.isEmpty()) return null;
		List<Account> Accounts = new ArrayList<>();
		for (Account a : AccountDB.values()) {
			if(a.getMemberId().equals(id)) {
				Accounts.add(a);
			}
		}
		return Accounts;
	}

	@Override
	public Account findByNo(int no) {
		return AccountDB.get(no);
	}

	@Override
	public boolean update(Account a) {
		AccountDB.put(a.getNo(), a);
		return true;
	}

	@Override
	public boolean delete(Account a) {
		AccountDB.remove(a.getNo());
		return true;
	}

}
