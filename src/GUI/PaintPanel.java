package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	public static Hashtable<String,Double> prob = new Hashtable<String,Double>();
	
	public Hashtable<String, Double> getProb() {
		return prob;
	}

	public void setProb(Hashtable<String, Double> prob) {
		this.prob = prob;
	}
	
	public void paintComponent (Graphics g){
		draw (g);
	}
	
	private void draw (Graphics g){
		//double probmax = Collections.max(prob);
		int i = 0;
		for (String accion : prob.keySet()){
			int base = this.getHeight()-20;
			int altura = this.getHeight()-30 -30;
			int anchura = this.getWidth()-100;
			int xpos = 50+(((int)(anchura/6)*i));
			int ypos = (int)(base-(altura*prob.get(accion)));
			g.setColor(Color.BLUE);
			g.fillRect(xpos, ypos, (int)((anchura/6)-10),(int) (altura * prob.get(accion)));
			g.setColor(Color.BLACK);
			g.drawString("" + prob.get(accion), xpos, ypos-10);
			g.drawString("" + accion, xpos, this.getHeight()-5);
			i++;
		}
	}
}
