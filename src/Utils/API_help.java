package Utils;

import norsys.netica.*;

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
			Streamer stream = new Streamer ("C:/Users/Dru/Desktop/IAA/java/IAA_GAME/src/gui/Juego.neta");
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
			
			double belief = S1.getBelief ("BuscarArmas");
			System.out.println ("\nThe probability is " + belief);
			
			NE.finding().enterState("Pocos");
			
			net.write (stream);

			belief = S1.getBelief ("BuscarArmas");
			System.out.println ("\nThe probability is " + belief);
		
			//System.out.println("dentro");
			//net.finalize();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void S_state (String str) throws NeticaException {
		S.finding().enterState(str);
	}
	
	public void HN_state (String str) throws NeticaException {
		HN.finding().enterState(str);
	}
	
	public void PW_state (String str) throws NeticaException {
		PW.finding().enterState(str);
	}
	
	public void H_state (String str) throws NeticaException {
		H.finding().enterState(str);
	}
	
	public void W_state (String str) throws NeticaException {
		W.finding().enterState(str);
	}
	
	public void OW_state (String str) throws NeticaException {
		OW.finding().enterState(str);
	}
	
	public void NE_state (String str) throws NeticaException {
		NE.finding().enterState(str);
	}
	
	public void PH_state (String str) throws NeticaException {
		PH.finding().enterState(str);
	}
	
}

