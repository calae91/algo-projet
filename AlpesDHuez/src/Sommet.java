import java.util.ArrayList;
import java.util.List;

public class Sommet {
	
	private String id;
	private	int duree=0;
	private int idaccess=0; //id de la piste d'accès (FINISH)
	
	
	public Sommet(String id,int duree,int idaccess){
		this.id=id;
		this.duree=duree;
		this.idaccess=idaccess;
	}
	
	public String getID(){
		return this.id;
	}
	
	public int getDuree(){
		return this.duree;
	}
	
	public void modID(String id){
		 this.id = id;
	}
	
	public void modDuree(int duree){
		this.duree=duree;
	}
	
	public void modIDaccess(int idaccess){
		this.idaccess = idaccess;
	}
}
