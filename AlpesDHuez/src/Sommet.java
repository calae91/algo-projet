import java.util.ArrayList;
import java.util.List;

public class Sommet {
	
	private String id="";
	private	int duree=0;
	private int idaccess=0; //id de la piste d'accès (FINISH)
	
	
	public Sommet(String id,int duree,int idaccessn){
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
	
	public String modID(String id){
		return this.id = id;
	}
	
	public int modDuree(int duree){
		return this.duree=duree;
	}
	
	public int modIDaccess(int idaccess){
		return this.idaccess = idaccess;
	}
}
