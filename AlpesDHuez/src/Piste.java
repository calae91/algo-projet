
public class Piste {
	private int id;
	private String nom;
	private int duree;
	private String depart;
	private String arrivee;

	public Piste(int id,String nom,int duree, String depart, String arrivee){
		this.id=id;
		this.nom=nom;
		this.duree=duree;
		this.depart=depart;
		this.arrivee=arrivee;
	}
	
	public int getID(){
		return this.id;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public String getStart(){
		return this.depart;
	}
	
	public String getFinish() {
		return arrivee;
	}
	
	public int getTime(){
		return this.duree;
	}
}