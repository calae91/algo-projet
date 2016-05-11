
public class Piste {
	private int id;
	private String nom;
	private int duree;
	private int depart;
	private int arrivee;
	private String color;

	public Piste(int id,String nom,int duree, int depart, int arrivee, String color){
		this.id=id;
		this.nom=nom;
		this.duree=duree;
		this.depart=depart;
		this.arrivee=arrivee;
		this.color = color;
	}
	
	public int getID(){
		return this.id;
	}
	
	public String getNom(){
		return this.nom;
	}
	public String getColor (){
		return this.color;
	}
	public int getStart(){
		return this.depart;
	}
	
	public int getFinish() {
		return arrivee;
	}
	
	public int getTime(){
		return this.duree;
	}
}