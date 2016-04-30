import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class plusCourtChemin {
	Statement statement = null;
	ResultSet resultat = null;
	
	public void algo(Connection connexion) throws SQLException{
		try{
			statement = connexion.createStatement();
			/*executeQuery() ==> lecture de donnée via une requète de type SELECT
			 *executeUpdate()==> ecriture/suppression  ... de type INSERT/UPDATE/DELETE*/
			//resultat effectue un requête sur la table pistes et demande les noms	 
			resultat = statement.executeQuery( "SELECT ID, NAME FROM sommet;" );
			
			while(resultat.next()){
				int id=resultat.getInt("ID");
				String nom=resultat.getString("NAME");
				System.out.println(id);
				System.out.println(nom);
			}
		}
			finally{
				if(statement!=null)
						statement.close();
				if(resultat!=null)
					resultat.close();
			}
	}
}
