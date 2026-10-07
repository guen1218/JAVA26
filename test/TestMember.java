package test;

import java.util.List;

import bank.member.Member;
import bank.member.MemberDao;
import bank.member.MemberListDao;

public class TestMember {
	public static void main(String[] args) {
		testMemberDao();
	}
	
	public static void testMemberDao() {
		MemberDao mdao = new MemberListDao();
		// 회원 추가
		System.out.println(">>회원 추가 및 회원 목");
		mdao.save(new Member("yar", "11", "김야르"));
		mdao.save(new Member("curi", "1122", "박큐리"));
		// 회원 모두 찾기
		List<Member> mlist = mdao.findAll();
		// 회원 출력
		printMemberList(mlist);
		
		System.out.println(">>회원 찾기");
		Member m = mdao.findById("curi");
		System.out.println(m);
		
		System.out.println(">>비번 변경");
		m.setPassword("1234");
		mdao.update(m);
		printMemberList(mlist);
		
		System.out.println(">>회원 삭제");
		mdao.delete(mdao.findById("curi"));
		mlist = mdao.findAll();
		printMemberList(mlist);
		
		
	}
	
	public static void printMemberList(List<Member> mlist) {
		for(Member m : mlist) {
			System.out.println(m);
		}
	}
}
