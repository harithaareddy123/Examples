package Example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class example {

	public static void main(String[] args) throws Exception {
		example ex = new example();
		ex.addRow();
		ex.fetchAndDisplay();
	}

	Connection createConnection() throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection connection = DriverManager.getConnection(url, "scott", "tiger");
		return connection;
	}

	public void addRow() {
		try {
			Connection connection = createConnection();
			Statement statement = connection.createStatement();
			String sql = "insert into employees(id,name) values(16,'krish')";
			int count = statement.executeUpdate(sql);
			System.out.println("no. of rows : " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fetchAndDisplay() {
		try {
			Connection connection = createConnection();
			Statement statement = connection.createStatement();
			ResultSet resultset = statement.executeQuery("select * from Employees");
			while (resultset.next()) {
				int id = resultset.getInt("id");
				String name = resultset.getString("name");
				System.out.println("id : " + id + " name : " + name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
