package GUI;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import Utils.API_help;
import norsys.netica.NeticaException;

public class OptionsPanel extends GUI {
	API_help apiH = new API_help();
	
	// NIVEL DE VIDA
	JRadioButton altoVida;
	JRadioButton bajoVida;
	JRadioButton desactivarVida;
	
	// NIVEL DE ARMAS
	JRadioButton armado;
	JRadioButton desarmado;
	JRadioButton desactivarArmas;
	
	// NIVEL DE ARMAS OPONENTE
	JRadioButton armadoOp;
	JRadioButton desarmadoOp;
	JRadioButton desactivarArmasOp;
	  
	// ENEMIGOS CERCA
	JRadioButton muchos;
	JRadioButton pocos;
	JRadioButton desactivarEnemigos;
	
	// ESCUCHA SONIDO
	JRadioButton siSonido;
    JRadioButton noSonido;
    JRadioButton desactivarSonido;
    
    // ARMAS CERCA
    JRadioButton siArmaCerca;
    JRadioButton noArmaCerca;
    JRadioButton desactivarArmasCerca;
    
    // VIDA CERCA
    JRadioButton siVidaCerca;
    JRadioButton noVidaCerca;
    JRadioButton desactivarVidaCerca;
    
    // T0
    JRadioButton atacar;
    JRadioButton buscarArmas;
    JRadioButton buscarEnergia;
    JRadioButton explorar;
    JRadioButton huir;
    JRadioButton detectarPeligro;
    JRadioButton desactivarT0;
    
	private static final long serialVersionUID = 1L;
	private JPanel panel = new JPanel();
	public OptionsPanel () {	
		ButtonGroup nivelVida = new ButtonGroup();             //H
		ButtonGroup nivelArmas = new ButtonGroup();            //W
		ButtonGroup nivelArmasOponente = new ButtonGroup();    //OW
		ButtonGroup sonido = new ButtonGroup();                //HN
		ButtonGroup enemigosCerca = new ButtonGroup();         //NE
		ButtonGroup armaCercana = new ButtonGroup();           //PW
		ButtonGroup vidaCercana = new ButtonGroup();           //PH
		ButtonGroup accionS0 = new ButtonGroup();              //St
	  
		altoVida = new JRadioButton("Alto");
		bajoVida = new JRadioButton("Bajo");
		desactivarVida = new JRadioButton("Desactivar");
		nivelVida.add(altoVida);
		nivelVida.add(bajoVida);
		nivelVida.add(desactivarVida);
		desactivarVida.setSelected(true);

		armado = new JRadioButton("Armado");
		desarmado = new JRadioButton("Desarmado");
		desactivarArmas = new JRadioButton("Desactivar");
		nivelArmas.add(armado);
		nivelArmas.add(desarmado);
		nivelArmas.add(desactivarArmas);
		desactivarArmas.setSelected(true);

		armadoOp = new JRadioButton("Armado");
		desarmadoOp = new JRadioButton("Desarmado");
		desactivarArmasOp = new JRadioButton("Desactivado");
		nivelArmasOponente.add(armadoOp);
		nivelArmasOponente.add(desarmadoOp);
		nivelArmasOponente.add(desactivarArmasOp);
		desactivarArmasOp.setSelected(true);
    
    	muchos = new JRadioButton("Muchos");
    	pocos = new JRadioButton("Pocos");
    	desactivarEnemigos = new JRadioButton("Desactivar");
    	enemigosCerca.add(muchos);
    	enemigosCerca.add(pocos);
    	enemigosCerca.add(desactivarEnemigos);
    	desactivarEnemigos.setSelected(true);
    
	    siSonido = new JRadioButton ("Si");
	    noSonido = new JRadioButton ("No");
	    desactivarSonido = new JRadioButton ("Desactivar");
	    sonido.add(siSonido);
	    sonido.add(noSonido);
	    sonido.add(desactivarSonido);
	    desactivarSonido.setSelected(true);
    
	    JRadioButton siArmaCerca = new JRadioButton ("Si");
	    JRadioButton noArmaCerca = new JRadioButton ("No");
	    JRadioButton desactivarArmasCerca = new JRadioButton ("Desactivar");
	    armaCercana.add(siArmaCerca );
	    armaCercana.add(noArmaCerca );
	    armaCercana.add(desactivarArmasCerca );
	    desactivarArmasCerca.setSelected(true);
    
    siVidaCerca = new JRadioButton ("Si");
    noVidaCerca = new JRadioButton ("No");
    desactivarVidaCerca = new JRadioButton ("Desactivar");
    
    vidaCercana.add(siVidaCerca );
    vidaCercana.add(noVidaCerca );
    vidaCercana.add(desactivarVidaCerca );
    
    desactivarVidaCerca.setSelected(true);
    
    atacar = new JRadioButton ("Atacar");
    buscarArmas = new JRadioButton ("Buscar Armas");
    buscarEnergia = new JRadioButton ("Buscar Energía");
    explorar = new JRadioButton ("Explorar");
    huir = new JRadioButton ("Huir");
    detectarPeligro = new JRadioButton ("Detectar Peligro");
    desactivarT0 = new JRadioButton ("Desactivar");
    accionS0.add(atacar);
    accionS0.add(buscarArmas);
    accionS0.add(buscarEnergia);
    accionS0.add(explorar);
    accionS0.add(huir);
    accionS0.add(detectarPeligro);
    accionS0.add(desactivarT0);
    desactivarT0.setSelected(true);
    
    panel.setLayout(new GridLayout(1,5,1,1));
    JPanel subPanelA = new JPanel();
    JPanel subPanelB = new JPanel();
    JPanel subPanelB1 = new JPanel();
    JPanel subPanelB2 = new JPanel();
    JPanel subPanelC = new JPanel();
    JPanel subPanelC1 = new JPanel();
    JPanel subPanelC2 = new JPanel();
    JPanel subPanelD = new JPanel();
    JPanel subPanelD1 = new JPanel();
    JPanel subPanelD2 = new JPanel();
    JPanel subPanelE = new JPanel();
    JPanel subPanelE1 = new JPanel();
    JPanel subPanelE2 = new JPanel();
    
    subPanelA.setLayout(new GridLayout(7,1,1,1));
    subPanelA.add(atacar);
    subPanelA.add(buscarArmas);
    subPanelA.add(buscarEnergia);
    subPanelA.add(explorar);
    subPanelA.add(huir);
    subPanelA.add(detectarPeligro);
    subPanelA.add(desactivarT0);
    subPanelA.setBorder(new TitledBorder("Accion T0"));
    
    subPanelB.setLayout(new GridLayout(2,1,1,1));
    subPanelB1.setLayout(new GridLayout(3,1,1,1));
    subPanelB1.add(altoVida);
    subPanelB1.add(bajoVida);
    subPanelB1.add(desactivarVida);
    subPanelB1.setBorder(new TitledBorder("¿Nivel de vida?"));
    subPanelB.add(subPanelB1);
    subPanelB2.setLayout(new GridLayout(3,1,1,1));
    subPanelB2.add(muchos);
    subPanelB2.add(pocos);
    subPanelB2.add(desactivarEnemigos);
    subPanelB2.setBorder(new TitledBorder("¿Enemigos Cerca?"));
    subPanelB.add(subPanelB2);
    
    subPanelC.setLayout(new GridLayout(2,1,1,1));
    subPanelC1.setLayout(new GridLayout(3,1,1,1));
    subPanelC1.add(armado);
    subPanelC1.add(desarmado);
    subPanelC1.add(desactivarArmas);
    subPanelC1.setBorder(new TitledBorder("¿Nivel de Armas?"));
    subPanelC.add(subPanelC1);
    subPanelC2.setLayout(new GridLayout(3,1,1,1));
    subPanelC2.add(armadoOp);
    subPanelC2.add(desarmadoOp);
    subPanelC2.add(desactivarArmasOp);
    subPanelC2.setBorder(new TitledBorder("¿Nivel armas oponente?"));
    subPanelC.add(subPanelC2);
    
    subPanelD.setLayout(new GridLayout(2,1,1,1));
    subPanelD1.setLayout(new GridLayout(3,1,1,1));
    subPanelD1.add(siSonido);
    subPanelD1.add(noSonido);
    subPanelD1.add(desactivarSonido);
    subPanelD1.setBorder(new TitledBorder("¿Se escucha algún sonido?"));
    subPanelD.add(subPanelD1);
    subPanelD2.setLayout(new GridLayout(3,1,1,1));
    subPanelD2.add(siArmaCerca);
    subPanelD2.add(noArmaCerca);
    subPanelD2.add(desactivarArmasCerca);
    
    subPanelD2.setBorder(new TitledBorder("¿Detecto Armas?"));
    subPanelD.add(subPanelD2);
    
    subPanelE.setLayout(new GridLayout(2,1,1,1));
    subPanelE1.setLayout(new GridLayout(3,1,1,1));
    subPanelE1.add(siVidaCerca);
    subPanelE1.add(noVidaCerca);
    subPanelE1.add(desactivarVidaCerca);
    subPanelE1.setBorder(new TitledBorder("¿Detecto Vidas?"));
    subPanelE.add(subPanelE1);
    subPanelE2.setLayout(new GridLayout(1,1,1,1));
    subPanelE2.setBorder(new LineBorder(Color.BLACK));
    JButton calcular = new JButton("Calcular");
    calcular.setVerticalAlignment(JButton.CENTER);
    subPanelE2.add(calcular);
    subPanelE.add(subPanelE2);
    
    panel.add(subPanelA);
    panel.add(subPanelB);
    panel.add(subPanelC);
    panel.add(subPanelD);
    panel.add(subPanelE);
    add(panel);
    
    // NIVEL DE VIDA
    altoVida.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.H_state("Alto");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	bajoVida.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.H_state("Bajo");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
    desactivarVida.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.H_state("Desactivar");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	

    // NIVEL DE ARMAS
	armado.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.W_state("Armado");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	desarmado.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.W_state("Desarmado");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	desactivarArmas.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.W_state("Desactivar");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	// NIVEL DE ARMAS OPONENTE
	armadoOp.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.OW_state("Armado");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	desarmadoOp.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.OW_state("Desarmado");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	desactivarArmasOp.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.OW_state("Desactivar");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
		
	
	
	// ENEMIGOS CERCA
	muchos.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.NE_state("Muchos");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	pocos.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.NE_state("Pocos");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	desactivarEnemigos.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.NE_state("Desactivar");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	
	// ESCUCHA SONIDO
	siSonido.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.HN_state("Si");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	noSonido.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.HN_state("No");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	desactivarSonido.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.HN_state("Desactivar");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	// ARMAS CERCA
	siArmaCerca.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.PW_state("Si");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	noArmaCerca.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.PW_state("No");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	desactivarArmasCerca.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.PW_state("Desactivar");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	// VIDA CERCA
	siVidaCerca.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.PH_state("Si");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	noVidaCerca.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.PH_state("No");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	desactivarVidaCerca.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.PH_state("Desactivar");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	// T0
	atacar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.S_state("Atacar");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	buscarArmas.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.S_state("BuscarArmas");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	buscarEnergia.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.S_state("BuscarEnergia");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	explorar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.S_state("Explorar");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	huir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.S_state("Huir");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	detectarPeligro.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.S_state("DetectarPeligro");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	desactivarT0.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.S_state("Desactivar");
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	
	
	// CALCULAR
    calcular.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
				apiH.Calculate();
				repaint();
			} catch (NeticaException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    });
	}
	
	

	

}