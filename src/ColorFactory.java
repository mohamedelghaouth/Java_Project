
public class ColorFactory implements AbstractFactory {

	
	public Shape CreatShape(String s) throws Exception {
		return null;
	}

	
	public Color creatColor(String s) throws Exception {
		Color c=null;
		if(s.equals("red")) {
			c=new red();	
		}
		else if(s.equals("blue")) {
			c=new blue();	
		}
		else throw new Exception();
		
		return c;
	}

	
	
}
