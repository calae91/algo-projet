import java.sql.Statement;
import java.util.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Algo {
	Statement statement = null;
	ResultSet resultat = null;
	ResultSet resultat2=null;
	
	public void algo(Connection connexion) throws SQLException{
		try{
			//Connection a la bdd
			
			statement = connexion.createStatement();
			/*executeQuery() ==> lecture de donnée via une requète de type SELECT
			 *executeUpdate()==> ecriture/suppression  ... de type INSERT/UPDATE/DELETE*/
			//resultat effectue un requête sur la table pistes et demande les noms	 
<<<<<<< HEAD
			int level = -1;
			level = getLevel(level);
			//table de hachage avec clé id de la piste
			
			HashMap<Integer,Piste> pistes = new HashMap<Integer, Piste>();
			//on remplit
			resultat = statement.executeQuery( "SELECT ID, NAME, TIME, START, FINISH, COLOR FROM pistes;" );
			pistes = rempPisteId( pistes, statement, resultat);
			System.out.println(pistes.get(1).getNom());
			// table de Hashage des sommets avec clé ID des sommets
			HashMap<Integer, Sommet> SommetId = new HashMap<Integer, Sommet>();
			//on remplit
			resultat = statement.executeQuery("SELECT ID, NAME, ACTIVE_IN_APPLI, ALTITUDE FROM sommet");
			SommetId = rempSommetId(level, SommetId, statement, resultat, pistes);
			// on demande le level du user
		
			
			ArrayList<Integer> pistesFinal = new ArrayList<Integer>(); //Contient les données des pistes
			ArrayList<Integer> aTraiter = new ArrayList<Integer>();//Sommet à traiter
			
			int depart; 
			int arrivee;
			
			depart = 1;
			arrivee = 128;
			System.out.println("try to remember :" + SommetId.get(37).getSt().get(3).getNom());
			// on cherhe a savoir si le chemin est possible
=======
			/*resultat = statement.executeQuery( "SELECT ID,NAME FROM sommet;" );
			List<Nom> nom = new ArrayList<Nom>();
			
			while(resultat.next()){
				nom.add(new Nom(resultat.getString("NAME"),resultat.getString("ID")));
			}
			
			Scanner sc = new Scanner(System.in);
			affichage(nom);
			System.out.println("Où êtes vous ?");
			String str = sc.nextLine();
			String depart =str;
			System.out.println("Où voulez-vous aller ?");
			str = sc.nextLine();
			String arrivee = str;
			System.out.println("Quelle type de pistes voulez-vous emprunter ?");
			System.out.println("4 pour toutes les pistes.");
			System.out.println("3 pour toutes les pistes sauf la noire.");
			System.out.println("2 pour les pistes vertes et bleues.");
			System.out.println("1 pour seulement les pistes verte.");
			str = sc.nextLine();
			int couleur = Integer.parseInt(str);
			if(couleur<1 || couleur >4){
				System.out.println("Le type de pistes choisi n'est pas valide.");
				return;
			}
			
			resultat = statement.executeQuery( "SELECT ID, NAME, TIME, START, FINISH FROM pistes;" );
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
			/*Sommet sommet[]=new Sommet[S.size()];
			int i=0;
			while(i<S.size()){
				sommet[i]=new Sommet(S.get(i),-1,0);
				i++;
			}/*
			
			while (verifydepart(depart, arrivee,level, SommetId) == 0){
				depart = 1;
				arrivee = 37;
			}
			// on modifie manuellement le depart
			Sommet j = SommetId.get(depart);
			 j.modDuree(0);
			 j.modIDaccess(0);
			aTraiter.add(depart);
			SommetId.put(depart, j);
			// on commence l'algo
		SommetId.putAll(rechercherChemin(level, depart, pistes, SommetId, aTraiter));
		pistesFinal.add(SommetId.get(arrivee).getIDaccess());
		System.out.println(SommetId.get(depart).getIDaccess());
		pistesFinal = chercheCheminFinal(pistesFinal, depart, arrivee, pistes, SommetId);
		afficherPiste(pistesFinal, SommetId, pistes);
			System.out.println("La duree est : "+sommet[a].getDuree());*/
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
	
<<<<<<< HEAD
// fonction principale permettant la recherche du plus cours chemin
	public HashMap<Integer, Sommet> rechercherChemin(int level,int current, HashMap<Integer, Piste> pistes, HashMap<Integer, Sommet> sommets, ArrayList<Integer> aTraiter){
		// on s'arrete si on a plus rien a traiter
		if(aTraiter.isEmpty()){
			return sommets;
		}
		// sinon pour chaques sommets ou on est (current) on prend la liste des pistes qui partent de ce sommet via la HashMap pisteSt
		// evite de reecrire sommets.get(current) 1 000 000 000 de fois
		Sommet s = sommets.get(current);
		Sommet j;
		int i=0;
		for (Piste p1 : s.getSt()){
			if ((sommets.get(p1.getFinish()).getDuree() > s.getDuree() + p1.getTime() ) ||( sommets.get(p1.getFinish()).getDuree() == -1)){
				 j = sommets.get(p1.getFinish());
				 j.modDuree(p1.getTime() + s.getDuree());
				 j.modIDaccess(p1.getID());
				sommets.put(p1.getFinish(), j);
				for (int k: aTraiter){
					if (k == p1.getFinish()){
						i = 1;
					}
				}
				if (i==0){
					aTraiter.add(p1.getFinish());
				}
				i=0;
			}
		}
		aTraiter.remove(0);
		if(aTraiter.isEmpty()){
			return sommets;
		}
		return rechercherChemin(level,aTraiter.get(0), pistes, sommets, aTraiter);
	}
	
	
//on cherche le chemin qu'on a obtenu
	public ArrayList<Integer> chercheCheminFinal (ArrayList<Integer> fin, int depart, int arrivee, HashMap<Integer, Piste> pistes, HashMap<Integer, Sommet> sommets){
		int current = arrivee;	
		while (sommets.get(current).getID() != depart){
				fin.add(0, pistes.get(sommets.get(current).getIDaccess()).getID());
				current = pistes.get(fin.get(0)).getStart();
			}
			return fin;
		}
	
	
// on affiche notre chemin :
	public void afficherPiste(ArrayList<Integer> pif, HashMap<Integer, Sommet> sommets, HashMap<Integer, Piste> pistes){
		for(Integer i : pif){
			System.out.println("Partir de " + sommets.get(pistes.get(i).getStart()).getName() + "Temps écoulé (environ) : " + sommets.get(pistes.get(i).getStart()).getDuree() + " min(s)");
			System.out.println("Prendre la piste :" + pistes.get(i).getNom() + " Couleur : " + pistes.get(i).getColor());
		}
	}
	
	
	public HashMap<Integer, Piste> rempPisteId(HashMap<Integer, Piste> pistes, Statement statement, ResultSet resultat){
		try{
			while(resultat.next()){
				pistes.put(resultat.getInt("ID"), new Piste(resultat.getInt("ID"), resultat.getString("NAME"), resultat.getInt("TIME"), resultat.getInt("START"), resultat.getInt("FINISH"), resultat.getString("COLOR")) );
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return pistes;
	}
	//plan B
	/*public void affichage(List<Nom> nom){
		int n=0;
		while(n<nom.size()){
			System.out.println("Tapez " + nom.get(n).getID() + " pour "+ nom.get(n).getNom());
			n++;
		}
	}
	
	public void rechercherChemin(Sommet sommet[],List<String> aTraiter,List<Piste> piste,String depart,int Pdepart,String arrivee,List<String> S){
		int a=0;
		if(aTraiter.size() ==0)return;*/
		
	public HashMap<Integer, Sommet> rempSommetId(int level, HashMap<Integer, Sommet> SommetId, Statement statement, ResultSet resultat, HashMap<Integer, Piste> pistes){
		try {
			while (resultat.next()){
				ArrayList<Piste> piSt = new ArrayList<Piste>();
				ArrayList<Piste> piFi = new ArrayList<Piste>();
				
				Iterator<Integer> setkey = pistes.keySet().iterator();
				while (setkey.hasNext()){
					 Integer key = setkey.next();
					if ( pistes.get(key).getStart() == resultat.getInt("ID"))
						piSt.add(pistes.get(key));
					if ( pistes.get(key).getFinish() == resultat.getInt("ID"))
						piFi.add( pistes.get(key));
				}
				
				piSt = supprBadColors(piSt, level);
				piFi = supprBadColors(piFi, level);
				SommetId.put(resultat.getInt("ID"), new Sommet(resultat.getInt("ID"), -1, 0, resultat.getInt("ACTIVE_IN_APPLI"), resultat.getString("NAME"), resultat.getInt("Altitude"), piSt, piFi));
				}
				
			}
			catch( Exception e){
				System.out.println(e);
			}
				return SommetId;
	}
	
	
// on s'occupe de faire sauter les pistes trop dures pour l'utilisateur
	public ArrayList<Piste> supprBadColors(ArrayList<Piste> p, int level){
		//on a un compteur qui sert a savoir la position de l'element a supprimer dans la liste p
		int i = 0;
		for (Piste p1 : p){
			if (p1.getColor().contains("Red") == true && level == 1 )
				p.remove(i);
			if(p1.getColor().contains("Black") == true && ( level == 1 || level == 2))
				p.remove(i);
			i++;
		}
		return p;
	}
	
//vérification de depart et arrivee 
	public int verifydepart(int arrivee, int depart, int level, HashMap<Integer, Sommet> sommets){
		ArrayList<Piste> p = new ArrayList<Piste>();
		if (level == 3 ){
			System.out.println("toutes pistes comprise : isOkay");
			return 1;
		}
		int comptpist = 0;
		p = sommets.get(depart).getSt();
		if (sommets.get(depart).getActive() == 0){
			System.out.println("Sommet non valable pour un depart");
			return 0;
		}
		if (sommets.get(arrivee).getActive() == 0){
			System.out.println("Sommet d'arrivee non valable pour une arrivee");
			return 0;
		}
			
		// on cherche si on a une piste de bonne couleur au debut et a la fin et selon le niveau pour qu'un chemin soit possible 
		for (Piste p1 : p){
			if(p1.getColor().contains("Red") && level == 1){
				comptpist ++;
			}
			else if(p1.getColor().contains("Black") && level < 3){
				comptpist ++;
			}
		}
		if (p.size() == comptpist){
			System.out.println("Aie aie aie erreur ce sommet est trop dur pour que vous y commenciez, entrainez vous avant de passer par la  :/ ");
			return 0;
		}
			
		// si on a au moins une piste que l'on peut faire alors on a le droit de verifier le somme t d'arrivée
		p.clear();
		
		p = sommets.get(depart).getFi();
		for (Piste p1 : p){
			if(p1.getColor().contains("Red") && level == 1){
				comptpist ++;
				
			}
			else if(p1.getColor().contains("Black") && level < 3){
				comptpist ++;
			}
		}
		if (p.size() == comptpist){
			System.out.println("Aie aie aie erreur ce sommet est trop dur a atteindre pour vous, entrainez vous avant de passer par la  :/ ");
			return 0;
		}
		System.out.println("Notre programme a un chemin pour vous car vous avez fait un bon choix :D ");
		return 1;
	}
	
//fonctions de gestion de l'utilisateur
//on prend le level de l'utilisateur 
	public int getLevel(int level){
		String str;
		Scanner sc = new Scanner(System.in);
		while (level > 3 || level < 1){
			System.out.println("votre niveau de ski : (1) Débutant, (2) Niveau Moyen, (3) EXPERT de la glisse ;) ");
			str= sc.nextLine();
			level = Integer.parseInt(str);
		}
		sc.close();
		return level;
	}
	
}
