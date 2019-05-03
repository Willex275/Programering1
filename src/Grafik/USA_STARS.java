package Grafik;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class USA_STARS extends Group{

	public USA_STARS(){
		Rectangle xg = new Rectangle();
		
		xg.setFill(Color.RED);
		xg.setWidth(200);
		xg.setHeight(140);
		xg.setTranslateY(0);
		xg.setFill(Color.DARKBLUE);
		this.getChildren().add(xg);
		
		for (int i = 0; i < 9; i++) {
			int Stars = 6;
			
			if(i % 2 == 1) {
				Stars = 5;
				
			}
			for (int j = 0; j < Stars; j++) {
				Star star = new Star(8, Color.WHITE);
				star.setTranslateX((200/6)*(j)+15);
				if(Stars == 5) {
					star.setTranslateX(star.getTranslateX()+(200/12));
				}
				 
				star.setTranslateY((i)*(140/9)+10);
				this.getChildren().add(star);
				
				
			}
			
		}
		
		
		
		
		
	}
}
