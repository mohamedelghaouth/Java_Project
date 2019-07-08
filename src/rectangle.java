
public class rectangle implements Shape {

	private int  longer;
	private int  largeur;

	public void afficherShape() {
		System.out.println(this.toString());
	}

	
	public String toString() {
		return "rectangle [longer=" + longer + ", largeur=" + largeur + "]";
	}
	

	
}
