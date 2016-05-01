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
			resultat = statement.executeQuery( "SELECT ID, NAME, TIME, START, FINISH FROM pistes;" );
			
			Scanner sc = new Scanner(System.in);
			System.out.println("le depart");
			String str = sc.nextLine();
			String depart =str;
			System.out.println("arrivee");
			str = sc.nextLine();
			String arrivee = str;
			
			List<Piste> pistes = new ArrayList<Piste>(); //Contient les données des pistes
			//List<String> aFaire = new ArrayList<String>(); //convertion de string en int Integer.parseInt(String)
			List<String> aTraiter = new ArrayList<String>();//Sommet à traiter
			List<String> S = new ArrayList<String>();
			
			while(resultat.next()){
				pistes.add(new Piste(resultat.getInt("ID"),resultat.getString("NAME"),resultat.getInt("TIME"),resultat.getString("START"),resultat.getString("FINISH")));
			}
			resultat = statement.executeQuery("SELECT ID FROM sommet;");
			while(resultat.next()){
				S.add(resultat.getString("ID"));
			}
			
			Sommet sommet[]=new Sommet[S.size()];
			int i=0;
			while(i<S.size()){
				System.out.println("ici");
				sommet[i].modID(S.get(i));
				System.out.println("ici");
				sommet[i].modDuree(-1);
				sommet[i].modIDaccess(0);
				i++;
			}
			
			System.out.println("ici");
			aTraiter.add(depart);
			
			int a=0;
			while(a<S.size()){
				if(depart == sommet[a].getID())
					break;
				a++;
			}
			//public void rechercherChemin(Sommet[] sommet,List<String> aTraiter,List<Piste> piste,String depart,int Pdepart,String arrivee,List<String> S)
			rechercherChemin(sommet,aTraiter,pistes,depart,a,arrivee,S);
			
			a=0;
			while(a<S.size()){
				if(arrivee == sommet[a].getID())
					break;
				a++;
			}
			System.out.println("La duree est : "+sommet[a].getDuree());
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
	
	public void rechercherChemin(Sommet sommet[],List<String> aTraiter,List<Piste> piste,String depart,int Pdepart,String arrivee,List<String> S){
		int a=0;
		if(aTraiter.size() ==0)return;
		
		while(a<piste.size()){
			if(depart == piste.get(a).getStart()){
				int z =0;
				while(z<aTraiter.size()){
					if(aTraiter.get(z) == piste.get(a).getFinish())
						break;
					z++;
				}
				if(z==aTraiter.size())
					aTraiter.add(piste.get(a).getFinish());
				
				int i=0;
				while(i<S.size()){
					if(piste.get(a).getFinish() == sommet[i].getID()){
						if(sommet[i].getDuree() > piste.get(a).getTime()+sommet[Pdepart].getDuree()){
							sommet[i].modDuree(piste.get(a).getTime() + sommet[Pdepart].getDuree());
							sommet[i].modIDaccess(piste.get(a).getID());
						}
						break;
					}
					i++;
				}
			}
			a++;
		}
		aTraiter.remove(Pdepart);
		if(aTraiter.size()==0)return;
		a=0;
		int min=0;
		while(a<S.size()){
			if(aTraiter.get(0) == sommet[a].getID()){
				min=sommet[a].getDuree();
				break;
			}
			a++;
		}
		a=1;
		while(a<S.size()){
			if(sommet[a].getDuree() < min)
				min = sommet[a].getDuree();
			a++;
		}
		//public void rechercherChemin(Sommet[] sommet,List<String> aTraiter,List<Piste> piste,String depart,int Pdepart,String arrivee,List<String> S)
		rechercherChemin(sommet,aTraiter,piste,sommet[a].getID(),a,arrivee,S);
	}
}