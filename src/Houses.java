import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot robby = new Robot();
	public static void main(String[] args) {
		robby.moveTo(0, 600);
		robby.setSpeed(10);
		robby.penDown();
		
		for( int i=0; i<4; i++) {
		drawHouses("small", 60,90,180);
		}
		for( int i=0; i<3; i++) {
			drawHouses("medium", 90,180,60);
		}
		for( int i=0; i<3; i++) {
			drawHouses("large", 180,60,90);
		}
	}

static void drawHouses(String h, int r, int g, int b) {
	int j = 0;
	if (h.contentEquals("small")) {
		 j = 60;
	} else if (h.contentEquals("medium")) {
		 j=  120;
	} else if (h.contentEquals("large")) {
		j = 250;
	}
	
	robby.setPenColor(r, g, b);
	robby.move(j);
	
	if(h.contentEquals("large")) {
		drawPointedRoofs();
	}
	else {
		drawFlatRoofs();
	}
	
	robby.move(j);
	robby.turn(-90);
	robby.move(15);
	robby.turn(-90);
	
}
static void drawFlatRoofs() {
	robby.turn(90);
	robby.move(25);
	robby.turn(90);
}
static void drawPointedRoofs() {
	robby.turn(45);
	robby.move(15);
	robby.turn(90);
	robby.move(15);
	robby.turn(45);
	
}

}