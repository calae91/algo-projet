import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Principal {
	
private static String url = "jdbc:mysql://localhost:3306/skiway";
private static String utilisateur = "root";
private static String motDePasse = "";

	public static void main(String[] args) throws SQLException {
		Connection connexion = null;
		try{
			//Chargement du driver pour MySQL
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Le driver est chargé.");
			
			connexion = DriverManager.getConnection(url,utilisateur,motDePasse);
			System.out.println("Base de donnée connectée.");
		}
		catch(ClassNotFoundException e){
			System.out.println("Le driver n'est pas charger");
		}
		catch(SQLException e){
			System.out.println("Connexion echouée");
		}
		finally{
			if(connexion !=null)
					connexion.close();
			
		}

	}

}
