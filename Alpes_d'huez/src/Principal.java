import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		    Class.forName( "com.mysql.jdbc.Driver" );
		    System.out.println("le driver est chargé");

		} catch ( ClassNotFoundException e ) {System.out.println(e);}
		
		String url = "jdbc:mysql://localhost:3306/bdd_sdzee";
		String utilisateur = "nom";
		String motDePasse = "MdP";
		Connection connection = null;
		
		try{
			connection = (Connection) DriverManager.getConnection(url, utilisateur, motDePasse);
			System.out.println("Connection effectué");
		}
		catch(SQLException e) {System.out.println(e); }
	}

}
