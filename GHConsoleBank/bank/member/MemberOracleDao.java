package bank.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bank.util.ConnectionFactory;
import bank.util.JDBCClose;


public class MemberOracleDao implements MemberDao {

    @Override
    public boolean save(Member m) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int result = 0;

        String sql = "INSERT INTO member (id, password, name, email, mobile, type) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            conn = new ConnectionFactory().getConnection();
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, m.getId());
            pstmt.setString(2, m.getPassword());
            pstmt.setString(3, m.getName());
            pstmt.setString(4, m.getEmail());
            pstmt.setString(5, m.getMobile());
            pstmt.setString(6, String.valueOf(m.getType()));

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCClose.close(conn, pstmt);
        }

        return result > 0;
    }

    @Override
    public List<Member> findAll() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Member> members = new ArrayList<>();

        String sql = "SELECT id, password, name, email, mobile, type FROM member";

        try {
            conn = new ConnectionFactory().getConnection();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Member m = new Member(
                    rs.getString("id"),
                    rs.getString("password"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("mobile"),
                    rs.getString("type").charAt(0)
                );
                members.add(m);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
            }
            JDBCClose.close(conn, pstmt);
        }

        return members.isEmpty() ? null : members;
    }

    @Override
    public Member findById(String id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Member member = null;

        String sql = "SELECT id, password, name, email, mobile, type FROM member WHERE id = ?";

        try {
            conn = new ConnectionFactory().getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                member = new Member(
                    rs.getString("id"),
                    rs.getString("password"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("mobile"),
                    rs.getString("type").charAt(0)
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
            }
            JDBCClose.close(conn, pstmt);
        }

        return member;
    }

    @Override
    public boolean update(Member m) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int result = 0;

        String sql = "UPDATE member SET password = ?, name = ?, email = ?, mobile = ?, type = ? WHERE id = ?";

        try {
            conn = new ConnectionFactory().getConnection();
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, m.getPassword());
            pstmt.setString(2, m.getName());
            pstmt.setString(3, m.getEmail());
            pstmt.setString(4, m.getMobile());
            pstmt.setString(5, String.valueOf(m.getType()));
            pstmt.setString(6, m.getId());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCClose.close(conn, pstmt);
        }

        return result > 0;
    }

    @Override
    public boolean delete(Member m) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int result = 0;

        String sql = "DELETE FROM member WHERE id = ?";

        try {
            conn = new ConnectionFactory().getConnection();
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, m.getId());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCClose.close(conn, pstmt);
        }

        return result > 0;
    }
}