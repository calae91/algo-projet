import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {
	
private static String url = "jdbc:mysql://localhost:3306/skiway";
private static String utilisateur = "root";
private static String motDePasse = "";

	public static void main(String[] args) throws SQLException {
		Connection connexion = null;
		Statement statement = null;
		ResultSet resultat = null;
		
		try{
			//Chargement du driver pour MySQL
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Le driver est chargé.");
			
			//Connexion a la base SQL
			connexion = DriverManager.getConnection(url,utilisateur,motDePasse);
			System.out.println("Base de donnée connectée.");
			
			//Création de l'objet pour traiter les requètes
			statement = connexion.createStatement();
				/*executeQuery() ==> lecture de donnée via une requète de type SELECT
				 *executeUpdate()==> ecriture/suppression  ... de type INSERT/UPDATE/DELETE*/
			//resultat effectue un requête sur la table pistes et demande les noms	 
			resultat = statement.executeQuery( "SELECT NAME FROM pistes;" );
			
			while(resultat.next()){
				String nom=resultat.getString("NAME");
				System.out.println(nom);
			}
		}
		catch(ClassNotFoundException e){
			System.out.println("Le driver ne s'est pas chargé");
			System.out.println("Assurez-vous d'avoir bien mis le driver MySQL dans le java build path du projet");
		}
		catch(SQLException e){
			System.out.println("Connexion échouée.");
		}
		finally{
			if(connexion !=null)
					connexion.close();
			if(statement!=null)
					statement.close();
			if(resultat!=null)
					resultat.close();
			
		}

	}

}
