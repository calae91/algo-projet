import java.util.ArrayList;
import java.util.List;

public class Sommet {
	private int id;
	private	int duree;
	private int idaccess;//id de la piste d'accès (FINISH)
	private int sommetP;
	
	public Sommet(int id,int duree,int idaccessn,int sommetP){
		this.id=id;
		this.duree=duree;
		this.idaccess=idaccess;
		this.sommetP=sommetP;
	}
	
	public int getID(){
		return this.id;
	}
	
	public int getDuree(){
		return this.duree;
	}
	
	public int getIDaccess(){
		return this.idaccess;
	}
	
	public int getSommetP(){
		return this.sommetP;
	}
	
	public void modIDaccess(int a){
		this.idaccess = a;
	}
	
	public void modDuree(int a){
		this.duree = a;
	}
	
	public void modSpere(int a){
		this.sommetP=a;
	}
}
