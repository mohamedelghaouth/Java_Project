
public class test {

	public static void main(String[] args) {
		
		AbstractFactory a= new shapeFactory();
		try {
			Shape s=a.CreatShape("rectangle");
			s.afficherShape();
		} catch (Exception e) {
			System.out.println("il ya erreur1");
		}
		
					a= new ColorFactory();

		try {
			Color c = a.creatColor("red");
			c.affichercolor();
		} catch (Exception e) {
				System.out.println("il ya erreur2");
		}
		
	}
	
	
}
