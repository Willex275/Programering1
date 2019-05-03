package Grafik;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;

public class Flagmaker {

	public static Flag sweden() {
		Flag flagga = new Flag();
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.BLUE);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(300);
		hStripe.setHeight(40);
		hStripe.setTranslateY(80);
		hStripe.setFill(Color.YELLOW);

		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(40);
		vStripe.setHeight(200);
		vStripe.setTranslateX(80);
		vStripe.setFill(Color.YELLOW);

		flagga.getChildren().addAll(bg, vStripe, hStripe);

		/// FORMER
		return flagga;

	}

	public static Flag Denmark() {
		Flag flagga = new Flag();
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.RED);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(300);
		hStripe.setHeight(40);
		hStripe.setTranslateY(80);
		hStripe.setFill(Color.WHITE);

		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(40);
		vStripe.setHeight(200);
		vStripe.setTranslateX(80);
		vStripe.setFill(Color.WHITE);

		flagga.getChildren().addAll(bg, vStripe, hStripe);

		// Former

		return flagga;
	}

	public static Flag Laos() {

		Flag flagga = new Flag();
		Circle bg = new Circle();
		bg.setRadius(80);
		bg.setTranslateX(250);
		bg.setTranslateY(240);
		bg.setFill(Color.WHITE);
		bg.setRotationAxis(Rotate.X_AXIS);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(600);
		hStripe.setHeight(250);
		hStripe.setTranslateY(120);
		hStripe.setFill(Color.MEDIUMPURPLE);

		Rectangle aStripe = new Rectangle();
		aStripe.setWidth(600);
		aStripe.setHeight(160);
		aStripe.setTranslateY(345);
		aStripe.setFill(Color.RED);

		Rectangle cStripe = new Rectangle();
		cStripe.setWidth(600);
		cStripe.setHeight(130);
		cStripe.setTranslateY(10);
		cStripe.setFill(Color.RED);

		flagga.getChildren().addAll(hStripe, bg, aStripe, cStripe);

		// Fomer
		return flagga;

	}

	public static Flag kuwait() {
		Flag flagga = new Flag();
		Rectangle bg = new Rectangle();
		bg.setWidth(600);
		bg.setHeight(100);
		bg.setFill(Color.GREEN);

		Rectangle hg = new Rectangle();
		hg.setWidth(600);
		hg.setHeight(100);
		hg.setTranslateY(200);
		hg.setFill(Color.RED);

		Polygon cg = new Polygon(0, 0, // x1, y1
				125, 100, // x2 , y2
				125, 200, 0, 300); // x3 , y3

		flagga.getChildren().addAll(bg, hg, cg);

		// former
		return flagga;
	}

	public static Flag japan() {
		Flag flagga = new Flag();
		Circle bg = new Circle();
		bg.setRadius(80);
		bg.setTranslateX(250);
		bg.setTranslateY(240);
		bg.setFill(Color.RED);
		bg.setRotationAxis(Rotate.X_AXIS);

		flagga.getChildren().addAll(bg);

		// Former
		return flagga;

	}

	public static Flag usa() {
		Flag flagga = new Flag();
		Rectangle bg = new Rectangle();

		bg.setFill(Color.RED);
		bg.setWidth(600);
		bg.setHeight(20);
		bg.setTranslateY(0);
		bg.setFill(Color.RED);

		Rectangle hg = new Rectangle();

		hg.setFill(Color.RED);
		hg.setWidth(600);
		hg.setHeight(20);
		hg.setTranslateY(40);
		hg.setFill(Color.RED);

		Rectangle cg = new Rectangle();

		cg.setFill(Color.RED);
		cg.setWidth(600);
		cg.setHeight(20);
		cg.setTranslateY(80);
		cg.setFill(Color.RED);

		Rectangle dg = new Rectangle();

		dg.setFill(Color.RED);
		dg.setWidth(600);
		dg.setHeight(20);
		dg.setTranslateY(120);
		dg.setFill(Color.RED);

		Rectangle eg = new Rectangle();

		eg.setFill(Color.RED);
		eg.setWidth(600);
		eg.setHeight(20);
		eg.setTranslateY(160);
		eg.setFill(Color.RED);

		Rectangle fg = new Rectangle();

		fg.setFill(Color.RED);
		fg.setWidth(600);
		fg.setHeight(20);
		fg.setTranslateY(200);
		fg.setFill(Color.RED);

		Rectangle gg = new Rectangle();

		gg.setFill(Color.RED);
		gg.setWidth(600);
		gg.setHeight(20);
		gg.setTranslateY(240);
		gg.setFill(Color.RED);

		USA_STARS star = new USA_STARS();
		flagga.getChildren().addAll(bg, hg, cg, dg, eg, fg, gg, star);

		// Fomer
		return flagga;

	}

	public static Flag kongo() {
		Flag flagga = new Flag();
		Rectangle bg = new Rectangle();
		bg.setWidth(500);
		bg.setHeight(300);
		bg.setFill(Color.LIMEGREEN);

		Polygon hg = new Polygon(500, 0, // x1, y1
				500, 300, // x2 , y2
				166, 300); // x3 , y3
		hg.setFill(Color.RED);

		Polygon cg = new Polygon(500, 0, // x1, y1
				500 - 166, 0, // x2 , y2
				0, 300, 166, 300); // x3 , y3
		cg.setFill(Color.YELLOW);

		flagga.getChildren().addAll(bg, hg, cg);

		// fomer
		return flagga;
	}
	
	public static Flag island() {
		Flag flagga = new Flag();
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.BLUE);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(300);
		hStripe.setHeight(40);
		hStripe.setTranslateY(80);
		hStripe.setFill(Color.WHITE);

		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(40);
		vStripe.setHeight(200);
		vStripe.setTranslateX(80);
		vStripe.setFill(Color.WHITE);
		
		Rectangle zStripe = new Rectangle();
		zStripe.setWidth(20);
		zStripe.setHeight(200);
		zStripe.setTranslateX(90);
		zStripe.setFill(Color.RED);
		
		Rectangle tStripe = new Rectangle();
		tStripe.setWidth(300);
		tStripe.setHeight(20);
		tStripe.setTranslateY(90);
		tStripe.setFill(Color.RED);

		flagga.getChildren().addAll(bg, vStripe, hStripe,zStripe,tStripe);

		/// FORMER
		return flagga;

	}
	public static Flag tjeckien() {
		Flag flagga = new Flag();
		Rectangle bg = new Rectangle();
		bg.setHeight(200);
		bg.setWidth(600);
		bg.setTranslateY(200);
		bg.setFill(Color.RED);
		
		
		Polygon cg = new Polygon(0, 0, // x1, y1
				0, 400, // x2 , y2
				200, 200); // x3 , y3
		cg.setFill(Color.BLUE);
		
		flagga.getChildren().addAll(bg,cg);
		
		//formen 
		return flagga;
	}
		
	public static Flag Ryssland() {
		Flag flagga = new Flag();
		Rectangle bg = new Rectangle();
		bg.setHeight(200);
		bg.setWidth(600);
		bg.setFill(Color.BLUE);
		bg.setTranslateY(90);
		
		Rectangle hg = new Rectangle();
		hg.setHeight(200);
		hg.setWidth(600);
		hg.setFill(Color.RED);
		hg.setTranslateY(190);
		
		Rectangle cg = new Rectangle();
		cg.setHeight(400);
		cg.setWidth(600);
		cg.setFill(Color.GRAY);
		cg.setTranslateY(300);
		
		
		flagga.getChildren().addAll(bg,hg,cg);
		
		//fomer 
		return flagga;
		
		
	}
	
	public static Flag Estland() {
		Flag flagga = new Flag();
		Rectangle bg = new Rectangle();
		bg.setHeight(100);
		bg.setWidth(600);
		bg.setFill(Color.DODGERBLUE);
		
		
		Rectangle hg = new Rectangle();
		hg.setHeight(100);
		hg.setWidth(600);
		hg.setFill(Color.BLACK);
		hg.setTranslateY(100);
		
		Rectangle cg = new Rectangle();
		cg.setHeight(400);
		cg.setWidth(600);
		cg.setFill(Color.GRAY);
		cg.setTranslateY(300);
		
		
		flagga.getChildren().addAll(bg,hg,cg);
		
		//fomer 
		return flagga;
	}
	
	
	public static Flag England() {
		Flag flagga = new Flag();
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.WHITE);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(300);
		hStripe.setHeight(40);
		hStripe.setTranslateY(80);
		hStripe.setFill(Color.RED);

		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(40);
		vStripe.setHeight(200);
		vStripe.setTranslateX(120);
		vStripe.setFill(Color.RED);

		flagga.getChildren().addAll(bg, vStripe, hStripe);

		/// FORMER
		return flagga;

	}
	
	public static Flag Rumanien() {
		Flag flagga = new Flag();
		Rectangle bg = new Rectangle();
		bg.setWidth(150);
		bg.setHeight(300);
		bg.setFill(Color.DARKBLUE);
		bg.setTranslateY(0);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(150);
		hStripe.setHeight(300);
		hStripe.setTranslateX(150);
		hStripe.setTranslateY(0);
		hStripe.setFill(Color.ORANGE);

		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(150);
		vStripe.setHeight(300);
		vStripe.setTranslateX(300);
		vStripe.setTranslateY(0);
		vStripe.setFill(Color.RED);

		flagga.getChildren().addAll(bg, vStripe, hStripe);

		/// FORMER
		return flagga;

	}
	
	public static Flag Tyskland() {
		Flag flagga = new Flag();
		Rectangle bg = new Rectangle();
		bg.setHeight(100);
		bg.setWidth(600);
		bg.setFill(Color.BLACK);
		bg.setTranslateY(90);
		
		Rectangle hg = new Rectangle();
		hg.setHeight(100);
		hg.setWidth(600);
		hg.setFill(Color.RED);
		hg.setTranslateY(190);
		
		Rectangle zg = new Rectangle();
		zg.setHeight(100);
		zg.setWidth(600);
		zg.setFill(Color.YELLOW);
		zg.setTranslateY(280);
		
		
		
		
		flagga.getChildren().addAll(bg,hg,zg);
		
		//fomer 
		return flagga;
	}
	public static Flag italien() {
		Flag flagga = new Flag();
		Rectangle bg = new Rectangle();
		bg.setWidth(150);
		bg.setHeight(300);
		bg.setFill(Color.GREEN);
		bg.setTranslateY(0);

		Rectangle hStripe = new Rectangle();
		hStripe.setWidth(150);
		hStripe.setHeight(300);
		hStripe.setTranslateX(150);
		hStripe.setTranslateY(0);
		hStripe.setFill(Color.WHITE);

		Rectangle vStripe = new Rectangle();
		vStripe.setWidth(150);
		vStripe.setHeight(300);
		vStripe.setTranslateX(300);
		vStripe.setTranslateY(0);
		vStripe.setFill(Color.RED);

		flagga.getChildren().addAll(bg, vStripe, hStripe);

		/// FORMER
		return flagga;

	}

}
