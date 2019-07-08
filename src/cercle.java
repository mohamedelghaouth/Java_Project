
public class cercle implements Shape {

	private int rayon;

	public cercle(int rayon) {
		this.rayon = rayon;
	}


	public String toString() {
		return "cercle [rayon=" + rayon + "]";
	}


	
	public void afficherShape() {
		System.out.println(this.toString());
	}
	
	
	
}
