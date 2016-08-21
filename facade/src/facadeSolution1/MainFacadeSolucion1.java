package facadeSolution1;

public class MainFacadeSolucion1 {

	   public static void main(String[] args) {
		   // http://www.tutorialspoint.com/design_pattern/facade_pattern.htm
		      ShapeMaker shapeMaker = new ShapeMaker();

		      shapeMaker.drawCircle();
		      shapeMaker.drawRectangle();
		      shapeMaker.drawSquare();		
		   }
	
}
