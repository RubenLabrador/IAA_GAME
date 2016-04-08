package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JPanel;

public class Graf extends JPanel {
	private ArrayList<Double> prob = new ArrayList<Double>();
	
	public void setProbs(ArrayList<Double> probs){
		prob = probs;
	}
	
	public void paintComponent (Graphics g){
		
		//Asignación de valores provisional, esto se debe obtener automaticamente
		prob.clear();
		prob.add(1.0);
		prob.add(0.25);
		prob.add(0.33);
		prob.add(0.10);
		prob.add(0.17);
		prob.add(0.28);
		
		draw (g);
		
	}
	private void draw (Graphics g){
		double probmax = Collections.max(prob);
		int i = 0;
		for (double value : prob){
			int base = this.getHeight()-20;
			int altura = this.getHeight()-30 -30;
			int anchura = this.getWidth()-100;
			int xpos = 50+(((int)(anchura/6)*i));
			int ypos = (int)(base-(altura*value));
			if (value == probmax){
				g.setColor(Color.BLUE);
			}else{
				g.setColor(Color.RED);
			}
			g.fillRect(xpos, ypos, (int)((anchura/6)-10),(int) (altura*value));
			g.setColor(Color.BLACK);
			g.drawString("" + value, xpos, ypos-10);
			g.drawString("Accion", xpos, this.getHeight()-5);
			i++;
		}
	}
}
