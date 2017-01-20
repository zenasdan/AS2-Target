/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	
//Declaring radius as a constant
private static final int radius = 72;	
	
	public void run() {
		addOuterRed();
		addWhite();
		addInnerRed();
	}
	//Adding the outer red circle at the center of the page
	private void addOuterRed(){
		GOval outerRed = new GOval(getWidth()/2 - radius, getHeight()/2 - radius, radius*2, radius*2);
		outerRed.setColor(Color.red);
		outerRed.setFilled(true);
		add(outerRed);
	}
	//Adding the white circle at the center of the page
	private void addWhite(){
		GOval white = new GOval(getWidth()/2 - radius*0.65, getHeight()/2 - radius*0.65, radius*2*0.65, radius*2*0.65);
		white.setColor(Color.white);
		white.setFilled(true);
		add(white);
	}
	//Adding the inner red circle at the center of the page
	private void addInnerRed(){
		GOval innerRed = new GOval(getWidth()/2 - radius*0.3, getHeight()/2 - radius*0.3, radius*2*0.3, radius*2*0.3);
		innerRed.setColor(Color.red);
		innerRed.setFilled(true);
		add(innerRed);
	}
}
