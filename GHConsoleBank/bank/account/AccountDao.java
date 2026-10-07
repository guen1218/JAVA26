package bank.account;

import java.util.List;

public interface AccountDao {
	boolean save(Account m);
	List<Account> findAll();
	List<Account> findByMemberId(String id);
	Account findByNo(int no);
	boolean update(Account m);
	boolean delete(Account m);
}
