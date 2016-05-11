import java.util.ArrayList;
import java.util.List;

public class Sommet {
	
	private int id;
	private	int duree;
	private int active;
	private int idaccess; //id de la piste d'accès (FINISH)
	private String name;
	private int altitude;
	private ArrayList<Piste> pidep = new ArrayList<Piste>();
	private ArrayList<Piste> pifi = new ArrayList<Piste>();
	
	public Sommet(int id,int duree,int idaccess, int active, String name, int altitude, ArrayList<Piste> piSt, ArrayList<Piste> piFi){
		this.id=id;
		this.name = name;
		this.duree=duree;
		this.idaccess= idaccess;
		this.active = active;
		this.altitude  = altitude;
		this.pidep = piSt;
		this.pifi = piFi;
		
	}
	
	public int getID(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public int getIDaccess(){
		return this.idaccess;
	}
	public int getDuree(){
		return this.duree;
	}
	public int getActive(){
		return this.active;
	}
	public int getAltitude(){
		return this.altitude;
	}
	public int modID(int id){
		return this.id = id;
	}
	public ArrayList<Piste> getSt(){
		return this.pidep;
	}
	public ArrayList<Piste> getFi(){
		return this.pifi;
	}
	public int modDuree(int duree){
		return this.duree=duree;
	}
	public int modIDaccess(int idaccess){
		return this.idaccess = idaccess;
	}
}
