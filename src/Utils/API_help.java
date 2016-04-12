package Utils;

import GUI.PaintPanel;
import norsys.netica.Environ;
import norsys.netica.Net;
import norsys.netica.NeticaException;
import norsys.netica.Node;
import norsys.netica.Streamer;

public class API_help {
	// Red
	Net net;
	
	// Nodos
	Node S;
	Node S1;
	Node HN;
	Node PW;
	Node H;
	Node W;
	Node OW;
	Node NE;
	Node PH;
				
	public API_help (){
		try {
			new Environ (null);
			// Read in the net created by the BuildNet.java example program.
			Streamer stream = new Streamer ("C:/Users/Dru/Desktop/IAA/java/IAA_GAME/src/Juego.neta");
			net = new Net (stream);
			
			// Obtenemos cada nodo
			S = net.getNode ("S");
			S1 = net.getNode ("S1");
			HN = net.getNode ("HN");
			PW = net.getNode ("PW");
			H = net.getNode ("H");
			W = net.getNode ("W");
			OW = net.getNode ("OW");
			NE = net.getNode ("NE");
			PH = net.getNode ("PH");

			net.compile();
			
			//double belief = S1.getBelief ("BuscarArmas");
			//System.out.println ("\nThe probability is " + belief);
			
			//NE.finding().enterState("Pocos");
			
			//net.write (stream);

			//belief = S1.getBelief ("BuscarArmas");
			//System.out.println ("\nThe probability is " + belief);
		
			//System.out.println("dentro");
			//net.finalize();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void S_state (String str) throws NeticaException {
		if (str == "Desactivar"){
			S.finding().clear();
		} else {
			S.finding().clear();
			S.finding().enterState(str);
		}
	}
	
	public void HN_state (String str) throws NeticaException {
		if (str == "Desactivar"){
			HN.finding().clear();
		} else {
			HN.finding().clear();
			HN.finding().enterState(str);
		}
	}
	
	public void PW_state (String str) throws NeticaException {
		if (str == "Desactivar"){
			PW.finding().clear();
		} else {
			PW.finding().clear();
			PW.finding().enterState(str);
		}
	}
	
	// NIVEL DE VIDA
	public void H_state (String str) throws NeticaException {
		if (str == "Desactivar"){
			H.finding().clear();
		} else {
			H.finding().clear();
			H.finding().enterState(str);
		}
	}
	
	// NIVEL DE ARMAS
	public void W_state (String str) throws NeticaException {
		if (str == "Desactivar"){
			W.finding().clear();
		} else {
			W.finding().clear();
			W.finding().enterState(str);
		}
	}
	
	public void OW_state (String str) throws NeticaException {
		if (str == "Desactivar"){
			OW.finding().clear();
		} else {
			OW.finding().clear();
			OW.finding().enterState(str);
		}
	}
	
	public void NE_state (String str) throws NeticaException {
		if (str == "Desactivar"){
			NE.finding().clear();
		} else {
			NE.finding().clear();
			NE.finding().enterState(str);
		}
	}
	
	public void PH_state (String str) throws NeticaException {
		if (str == "Desactivar"){
			PH.finding().clear();
		} else {
			PH.finding().clear();
			PH.finding().enterState(str);
		}
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
	
	public void Calculate () throws NeticaException {
		System.out.println ("Calculando");
		PaintPanel.prob.put("Atacar", round((double) S1.getBelief ("Atacar"),3));
		PaintPanel.prob.put("Buscar Armas", round((double) S1.getBelief ("BuscarArmas"),3));
		PaintPanel.prob.put("Buscar Vida", round((double) S1.getBelief ("BuscarEnergia"),3));
		PaintPanel.prob.put("Explorar", round((double) S1.getBelief ("Explorar"),3));
		PaintPanel.prob.put("Huir", round((double) S1.getBelief ("Huir"),2));
		PaintPanel.prob.put("Detectar Peligro", round((double) S1.getBelief ("DetectarPeligro"),3));
	
	}
}

