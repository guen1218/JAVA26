package bank.app.menu;

import bank.account.AccountService;
import bank.app.console.ConsoleMenu;
import bank.member.MemberService;

public class MyInfoMenu extends ConsoleMenu{

	protected MyInfoMenu(AccountService as, MemberService ms) {
		super(as, ms);
        this.menuList = new String[]{"비밀번호 수정", "회원탈퇴", "돌아가기"};
	}

	@Override
	public void run() {
		System.out.println("::: 내 정보 :::");
        while(true) {
            int menu = selectMenu();
            switch(menu) {
            case 1 -> updatePassword();
            case 2 -> deleteMember();
            case 0 -> {back(); return;}
            default -> System.out.println("!! 메뉴에 있는 번호를 선택 !!");
            }
        }
	}
	
	private void updatePassword() {
        System.out.println("::: 비밀번호 수정 :::");
    }

    private void deleteMember() {
        System.out.println("::: 회원탈퇴 :::");
    }

    private void back() {
        System.out.println("::: 돌아가기 :::");
    }

}
