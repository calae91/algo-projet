import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Algo {
	Statement statement = null;
	ResultSet resultat = null;
	ResultSet resultat2=null;
	
	public void algo(Connection connexion) throws SQLException{
		try{
			statement = connexion.createStatement();
			/*executeQuery() ==> lecture de donnée via une requète de type SELECT
			 *executeUpdate()==> ecriture/suppression  ... de type INSERT/UPDATE/DELETE*/
			//resultat effectue un requête sur la table pistes et demande les noms	 
			resultat = statement.executeQuery( "SELECT ID, TIME, START, FINISH FROM pistes;" );
			
			Scanner sc = new Scanner(System.in);
			System.out.println("le depart");
			String str = sc.nextLine();
			int depart = Integer.parseInt(str);
			System.out.println("arrivee");
			str = sc.nextLine();
			int arrivee=Integer.parseInt(str);
			List<Piste> pistes = new ArrayList<Piste>(); //Contient les données des pistes
			//List<String> aFaire = new ArrayList<String>(); //convertion de string en int Integer.parseInt(String)
			
			while(resultat.next()){
				pistes.add(new Piste(resultat.getInt("ID"),resultat.getInt("TIME"),resultat.getInt("START"),resultat.getInt("FINISH")));
			}
			System.out.println(pistes.size());
			
			/*START ==> sommet actuel
			 *FINISH ==> sommet de destination
			 */
			
		/*	resultat = statement.executeQuery( "SELECT ID FROM sommet;" );
			while(resultat.next()){
				aFaire.add(Integer.toString(resultat.getInt("ID"))); //Contient les sommets non traités
			}
			System.out.println(aFaire.size());*/
			
			Sommet sommet = new Sommet(depart,0,0);
		}
		catch(Exception e){
			System.out.println(e);
		}
			finally{
				if(resultat!=null)
						resultat.close();
				if(statement!=null)
					statement.close();
			}
	}
	
	public void recherchePlusCourtChemin(){
		
	}
	
}
