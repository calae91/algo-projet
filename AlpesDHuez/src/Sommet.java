import java.util.ArrayList;
import java.util.List;

public class Sommet {
	private int id;
	private	int duree;
	private int idaccess;//id de la piste d'acc�s (FINISH)
	
	public Sommet(int id,int duree,int idaccess){
		this.id=id;
		this.duree=duree;
		this.idaccess=idaccess;
	}
}
