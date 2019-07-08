
public class shapeFactory implements AbstractFactory {

	
	public Shape CreatShape(String s) throws Exception {
		Shape sh=null;
		if (s.equals("rectangle")) {
		sh =new rectangle()	;
		}
		else if (s.equals("cercle")) {
			sh =new cercle(5)	;
			}
		else  throw new Exception();
	
		return sh;
	}

	
	public Color creatColor(String s) {
		return null;
	}

}
