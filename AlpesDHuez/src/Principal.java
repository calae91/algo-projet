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
			System.out.println("Le driver est charg�.");
			
			//Connexion a la base SQL
			connexion = DriverManager.getConnection(url,utilisateur,motDePasse);
			System.out.println("Base de donn�e connect�e.");
			
			Algo c = new Algo();
			c.algo(connexion);
		}
		catch(ClassNotFoundException e){
			System.out.println("Le driver ne s'est pas charg�");
			System.out.println("Assurez-vous d'avoir bien mis le driver MySQL dans le java build path du projet");
		}
		catch(SQLException e){
			System.out.println(e);
		}
		finally{
			if(connexion !=null)
					connexion.close();
			
		}
	}

}
