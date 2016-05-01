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
			int depart = Integer.parseInt(str);
			System.out.println("arrivee");
			str = sc.nextLine();
			int arrivee=Integer.parseInt(str);
			List<Piste> pistes = new ArrayList<Piste>(); //Contient les données des pistes
			//List<String> aFaire = new ArrayList<String>(); //convertion de string en int Integer.parseInt(String)
			List<Sommet> aTraiter = new ArrayList<Sommet>();
			List<Sommet> marquer = new ArrayList<Sommet>();
			List<String> chemin=new ArrayList<String>();
			
			while(resultat.next()){
				pistes.add(new Piste(resultat.getInt("ID"),resultat.getString("NAME"),resultat.getInt("TIME"),resultat.getInt("START"),resultat.getInt("FINISH")));
			}
			System.out.println(pistes.size());
			
			marquer.add(new Sommet(depart,0,0,0));
			aTraiter.add(new Sommet(depart,0,0,0));
			
			rechercheChemin(aTraiter,marquer,pistes);
			
			plusCourtChemin(depart,arrivee,marquer,pistes,chemin);
			System.out.println("Nombre de pistes "+ chemin.size());
			System.out.println(chemin.get(0));
			
			/*int a=chemin.size()-1;
			String nom;
			while(a>=0){
				int z=0;
				while(nom=pistes.get(z).getID() != Integer.parseInt(chemin.get(a)))
					z++;
					
				System.out.println(nom);
				a--;
			}*/
			
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
	
	public void rechercheChemin(List<Sommet> aTraiter,List<Sommet> marquer, List<Piste> pistes){
		if(aTraiter.size()==0) return;
		int n=marquer.size()-1;
		int i=0;
		
		while(i<pistes.size()){
			if(marquer.get(n).getID() == pistes.get(i).getStart()) {
				int a=0;
			
				while(a<marquer.size()){
					if(marquer.get(a).getID() == pistes.get(i).getFinish())
						break;
					a++;
				}
				if(a==marquer.size()){
					a=0;
					while(a<aTraiter.size()){
						if(aTraiter.get(a).getID() == pistes.get(i).getFinish()){
							if(aTraiter.get(a).getDuree() > (pistes.get(i).getTime() + marquer.get(n).getDuree())){
								aTraiter.get(a).modIDaccess(pistes.get(i).getID());
								aTraiter.get(a).modDuree(pistes.get(i).getTime() + marquer.get(n).getDuree());
								aTraiter.get(a).modSpere(marquer.get(n).getID());
							}
							break;
						}
						a++;
					}
					if(a==aTraiter.size())
						aTraiter.add(new Sommet(pistes.get(i).getFinish(),pistes.get(i).getTime() + marquer.get(n).getDuree(),pistes.get(i).getID(),marquer.get(n).getID()));
				}
			}
			i++;
		}
		//On cherche la plus courte duree
		i=1;
		int a=0;
		
		while(i<aTraiter.size()){
			if(aTraiter.get(a).getDuree() > aTraiter.get(i).getDuree())
				a=i;
			i++;
		}
		marquer.add(aTraiter.get(a));
		aTraiter.remove(a);
		rechercheChemin(aTraiter,marquer,pistes);
	}
	
	public void plusCourtChemin(int depart,int arrivee,List<Sommet> marquer, List<Piste> pistes,List<String> chemin){
		if(depart==arrivee) return;
		int i=0;
		while(i<marquer.size()){
			if(arrivee == marquer.get(i).getID())
					break;
			i++;
		}
		if(i==marquer.size()){
			System.out.println("Impossible d'aller à la destination.");
			return;
		}
		chemin.add(Integer.toString(marquer.get(i).getIDaccess()));
		System.out.println("ici"+marquer.get(i).getIDaccess());
		plusCourtChemin(depart,marquer.get(i).getSommetP(),marquer,pistes,chemin);
	}
}