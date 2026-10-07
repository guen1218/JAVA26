package test;

import java.util.List;

import bank.account.Account;
import bank.account.AccountDao;
import bank.account.AccountListDao;

public class TestAccount {
	public static void main(String[] args) {
		testAccountDao();
	}
	
	public static void testAccountDao() {
		AccountDao adao = new AccountListDao();
		// 계좌 추가
		System.out.println(">>계좌 추가 및 계좌 목록");
		adao.save(new Account(1001, "yar", "123"));
		adao.save(new Account(1002, "curi", "321"));
		// 계좌 모두 찾기
		List<Account> alist = adao.findAll();
		// 계좌 출력
		printAccountList(alist);
		
		System.out.println(">>계좌 찾기");
		Account a = adao.findByNo(1002);
		System.out.println(a);
		
		System.out.println(">>비번 변경");
		a.setPassword("444");
		adao.update(a);
		alist = adao.findAll();
		printAccountList(alist);
		
		System.out.println(">>계좌 삭제");
		adao.delete(adao.findByNo(1002));
		alist = adao.findAll();
		printAccountList(alist);
	}
	
	public static void printAccountList(List<Account> alist) {
		for (Account a : alist) {
			System.out.println(a);
		}
	}
}
