package master.DAO;

import java.sql.*;
import java.util.ArrayList;

import master.DTO.userA_DTO;
import master.connection.connectionfactory;

public class userA_DAO {
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	
	String insert = "insert into userA values(?,?,?)";
	
	public void insertUSER(userA_DTO udto) {
		try {
			connectionfactory cf = new connectionfactory();
			con = cf.getcon();
			ps = con.prepareStatement(insert);
			ps.setString(1, udto.getName());
			ps.setString(2, udto.getPassword());
			ps.setString(3, udto.getPhone());
			ps.executeUpdate();
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean fetch(String x, String y) {
		ArrayList ar = new ArrayList();
		String pull = "select * from userA where PHONE_NO="+x+" and PASSWORD="+y;
		try {
			connectionfactory cf = new connectionfactory();
			con = cf.getcon();
			st = con.createStatement();
			rs = st.executeQuery(pull);
			
			while(rs.next()) {
				userA_DTO cdto = new userA_DTO();
				cdto.setPassword(rs.getString(2));
				cdto.setPhone(rs.getString(3));
				ar.add(cdto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(ar.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
}
