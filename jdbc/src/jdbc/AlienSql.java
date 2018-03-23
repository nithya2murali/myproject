package jdbc;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.sql.*;

public class AlienSql {
	Connection con = null;

	public AlienSql() {
		try {
			String url = "jdbc:mysql://localhost:3306/world";
			String username = "root";
			String password = "cts-9090";
			Class.forName("com.mysql.jdbc.Driver");

			// con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restdb\",\"root\",\"cts-9090");
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	

	public List<Alien> getAliens() {

		List<Alien> aliens = new ArrayList<>();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from city LIMIT 2");
			while (rs.next()) {
				Alien a = new Alien();

				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));

				aliens.add(a);
			}
		} catch ( Exception e) {
			System.out.println(e);
		} 
		return aliens;
	}

	public Alien getAlien(int id)

	{
		Alien a = new Alien();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from alien where id" + id);
			if (rs.next()) {
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));

				// Alien.add(a);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return a;
	}

	public Alien create(Alien a1) {
		String sql = "insert into alien values(?,?)";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, a1.getName());

			st.setInt(2, a1.getId());

			// st.setInt(2,a1.setId());
			st.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return a1;
	}
}
