package ch.yarox.invoiceManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Welcome !!!");
//		Person p = new Customer("name", "surname");
//		System.out.println("hello");
		
		//DeleteDbFiles.execute(".", "invoiceDB", true);
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:./invoiceDB", "admin", "pass");
		
		Statement stat = conn.createStatement();
		
		try {
			stat.execute("create table test(id int primary key, name varchar(255))");
		} catch (Exception e) {
			System.out.println("table already exist");
		}
        //stat.execute("insert into test values(1, 'PrimoNome')");
        ResultSet rs;
        rs = stat.executeQuery("select * from test");
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }
		
		stat.close();
		conn.close();
	}
}
