package eclipssql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
	
	private static conexao conexao;
	
	public static conexao getInstance() {
		if (conexao == null) {
			conexao = new conexao();
		}
		return conexao;
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("Local instance MySQL801");
		
		return DriverManager.getConnection("jdbc:MySQL801//localhost:3306/cadastros","root","1234567");
	}
		public static void main(String[]args) {
			try {
				System.out.println(getInstance().getConnection());
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	
	}

}
