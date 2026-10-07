package bank.account;

import java.util.ArrayList;
import java.util.List;

public class AccountListDao implements AccountDao {

	List<Account> AccountDB = new ArrayList<>();
	
	@Override
	public boolean save(Account a) {
		return AccountDB.add(a);
	}

	@Override
	public List<Account> findAll() {
		if(AccountDB.size() == 0) return null;
		List<Account> Accounts = new ArrayList<>();
		for(Account a : AccountDB) {
			Accounts.add(a);
		}
		return Accounts;
	}
	@Override
	public List<Account> findByMemberId(String id) {
		if(AccountDB.size() == 0) return null;
		List<Account> Accounts = new ArrayList<>();
		for (Account a : AccountDB) {
			if(a.getMemberId().equals(id)) {
				Accounts.add(a);
			}
		}
		return Accounts;
	}
	
	@Override
	public Account findByNo(int no) {
		for (Account a : AccountDB) {
			if(a.getNo() == no) return a;
		}
		return null;
	}

	

	@Override
	public boolean update(Account a) {
		Account target = findByNo(a.getNo());
		if(target == null) return false;
		AccountDB.remove(target);
		return AccountDB.add(a);
	}

	@Override
	public boolean delete(Account a) {
		Account target = findByNo(a.getNo());
		if(target == null) return false;
		return AccountDB.remove(target);
	}

}
