package bank.member;

import java.util.Iterator;
import java.util.List;

// 이 서비스는 이근휘가 구현하였습니다. ㄹㅇ이가 ;;;;;;;;;;;;;;;;;;;;;;;;
public class GHMemberService implements MemberService, AuthService{

	final String ADMIN_ID = "admin";
	final String ADMIN_PWD = "1234";
	
	private MemberDao dao;
	private Member loggedMember;
	
	public GHMemberService(MemberDao dao) {
		super();
		this.dao = dao;
		this.dao.save(new Member(ADMIN_ID, ADMIN_PWD, ADMIN_ID, null, null, Member.ADMIN));
	}

	@Override
	public boolean join(String id, String password, String name) {
		if(dao.findById(id) != null) return false;
		return dao.save(new Member(id, password, name, null, null, Member.USER));
	}

	@Override
	public boolean login(String id, String password) {
		Member m = dao.findById(id);
		if(m != null && m.getPassword().equals(password)) {
			loggedMember = m;
			return true;
		}
		return false;
	}

	@Override
	public Member getLoggedMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout() {
		if(loggedMember != null) {
			loggedMember = null;
			return true;
		}
		return false;
	}

	@Override
	public List<Member> getAllMembers() {
		List<Member> mlist = dao.findAll();
		
		//관리자를 제외한 목록 반환
		mlist.removeIf(member -> member.getType() == Member.ADMIN);
		
//		Iterator<Member> iter = mlist.iterator();
//		while(iter.hasNext()) {
//			if(iter.next().getType() == Member.ADMIN) {
//				iter.remove();
//			}
//		}
		return mlist;
	}

	@Override
	public Member getMemberInfo(String id) {
		if (loggedMember == null) return null;
		// 로그인한 회원정보만 볼 수 있게
		if(loggedMember.getId().equals(id)) {
			return dao.findById(id);
		}
		// 관리자만 볼 수 있게
		if (loggedMember.getType() == Member.ADMIN) {
			return dao.findById(id);
		}
		
		return null;
	}
	
		
	

	@Override
	public boolean changePassword(String id, String curPassword, String newPassword) {
		
		//로그인한 회원의 비밀번호만 바꿀 수 있도록 조건 체크
		if(loggedMember == null) return false;
		Member m = dao.findById(id);
		
		//관리자일 경우 무조건 비밀번호 변경
		if(m != null && loggedMember.getType() == Member.ADMIN) {
			m.setPassword(newPassword);
			return dao.update(m);
		}
		
		if(m != null && loggedMember.getId().equals(id)) {
			if(m!=null && m.getPassword().equals(curPassword)) {
				m.setPassword(newPassword);
				return dao.update(m);
			}
		}
		
		
		return false;
	}

	@Override
	public boolean addMemberInfo(String id, String email, String mogile) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean withdrawMembership(String id, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
