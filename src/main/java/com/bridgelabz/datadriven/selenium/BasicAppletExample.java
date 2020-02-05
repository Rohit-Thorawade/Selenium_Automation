package com.bridgelabz.datadriven.selenium;


/*
	Basic Java Applet Example
	This Java example shows how to create a basic applet using Java Applet class.
*/
 
import java.applet.Applet;
import java.awt.Graphics;
 
/* 
	<applet code = "BasicAppletExample" width = 200 height = 200>
	</applet>
*/
public class BasicAppletExample extends Applet{
	
	public void paint(Graphics g){
		//write text using drawString method of Graphics class
		g.drawString("This is my First Applet",20,100);
	}
}
