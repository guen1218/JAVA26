package bank.app;

import bank.account.AccountListDao;
import bank.account.AccountService;
import bank.account.GHAccountService;
import bank.app.menu.StartMenu;
import bank.member.GHMemberService;
import bank.member.MemberListDao;
import bank.member.MemberService;

public class GHConsoleBankApp {
	public static void main(String[] args) {
		MemberService ms = new GHMemberService(new MemberListDao());
		AccountService as = new GHAccountService(new AccountListDao());
		new StartMenu(as, ms).run();
	}
	
}
