import java.util.ArrayList;
import java.awt.Color;

public class DataOfSquare {
	
	ArrayList<Color> C = new ArrayList<Color>();
	int color;
	SquarePanel square;
	
	public DataOfSquare(int col) {
		C.add(Color.darkGray);// 0 = empty
		C.add(Color.BLUE);// 1 = food
		C.add(Color.white);// 2 = snake
		
		color = col;
		square = new SquarePanel(C.get(color));
				
	}
	
	public void lightMeUp(int c) {
		square.ChangeColor(C.get(c));
		
	}
	
	

}
