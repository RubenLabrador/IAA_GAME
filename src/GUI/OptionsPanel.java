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

public class OptionsPanel extends GUI {
	/**
	 * 
	 */
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
	  
	  JRadioButton altoVida = new JRadioButton("Alto");
	  JRadioButton bajoVida = new JRadioButton("Bajo");
	  nivelVida.add(altoVida);
	  nivelVida.add(bajoVida);
	  altoVida.setSelected(true);

	  JRadioButton armado = new JRadioButton("Armado");
	  JRadioButton desarmado = new JRadioButton("Desarmado");
	  nivelArmas.add(armado);
	  nivelArmas.add(desarmado);
	  armado.setSelected(true);

	  JRadioButton armadoOp = new JRadioButton("Armado");
	  JRadioButton desarmadoOp = new JRadioButton("Desarmado");
    nivelArmasOponente.add(armadoOp);
    nivelArmasOponente.add(desarmadoOp);
    armadoOp.setSelected(true);
    
    JRadioButton muchos = new JRadioButton("Muchos");
    JRadioButton pocos = new JRadioButton("Pocos");
    enemigosCerca.add(muchos);
    enemigosCerca.add(pocos);
    muchos.setSelected(true);
    
    JRadioButton siSonido = new JRadioButton ("Si");
    JRadioButton noSonido = new JRadioButton ("No");
    sonido.add(siSonido);
    sonido.add(noSonido);
    siSonido.setSelected(true);
    
    JRadioButton siArmaCerca = new JRadioButton ("Si");
    JRadioButton noArmaCerca = new JRadioButton ("No");
    armaCercana.add(siArmaCerca );
    armaCercana.add(noArmaCerca );
    siArmaCerca.setSelected(true);
    
    JRadioButton siVidaCerca = new JRadioButton ("Si");
    JRadioButton noVidaCerca = new JRadioButton ("No");
    vidaCercana.add(siVidaCerca );
    vidaCercana.add(noVidaCerca );
    siVidaCerca.setSelected(true);
    
    JRadioButton atacar = new JRadioButton ("Atacar");
    JRadioButton buscarArmas = new JRadioButton ("Buscar Armas");
    JRadioButton buscarEnergia = new JRadioButton ("Buscar Energía");
    JRadioButton explorar = new JRadioButton ("Explorar");
    JRadioButton huir = new JRadioButton ("Atacar");
    JRadioButton detectarPeligro = new JRadioButton ("Buscar Armas");
    accionS0.add(atacar);
    accionS0.add(buscarArmas);
    accionS0.add(buscarEnergia);
    accionS0.add(explorar);
    accionS0.add(huir);
    accionS0.add(detectarPeligro);
    atacar.setSelected(true);
    
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
    
    subPanelA.setLayout(new GridLayout(6,1,1,1));
    subPanelA.add(atacar);
    subPanelA.add(buscarArmas);
    subPanelA.add(buscarEnergia);
    subPanelA.add(explorar);
    subPanelA.add(huir);
    subPanelA.add(detectarPeligro);
    subPanelA.setBorder(new TitledBorder("Accion T0"));
    
    subPanelB.setLayout(new GridLayout(2,1,1,1));
    subPanelB1.setLayout(new GridLayout(2,1,1,1));
    subPanelB1.add(altoVida);
    subPanelB1.add(bajoVida);
    subPanelB1.setBorder(new TitledBorder("Nivel de vida"));
    subPanelB.add(subPanelB1);
    subPanelB2.setLayout(new GridLayout(2,1,1,1));
    subPanelB2.add(muchos);
    subPanelB2.add(pocos);
    subPanelB2.setBorder(new TitledBorder("Enemigos Cerca"));
    subPanelB.add(subPanelB2);
    
    subPanelC.setLayout(new GridLayout(2,1,1,1));
    subPanelC1.setLayout(new GridLayout(2,1,1,1));
    subPanelC1.add(armado);
    subPanelC1.add(desarmado);
    subPanelC1.setBorder(new TitledBorder("Armas"));
    subPanelC.add(subPanelC1);
    subPanelC2.setLayout(new GridLayout(2,1,1,1));
    subPanelC2.add(armadoOp);
    subPanelC2.add(desarmadoOp);
    subPanelC2.setBorder(new TitledBorder("Armas Op."));
    subPanelC.add(subPanelC2);
    
    subPanelD.setLayout(new GridLayout(2,1,1,1));
    subPanelD1.setLayout(new GridLayout(2,1,1,1));
    subPanelD1.add(siSonido);
    subPanelD1.add(noSonido);
    subPanelD1.setBorder(new TitledBorder("Oir Sonido"));
    subPanelD.add(subPanelD1);
    subPanelD2.setLayout(new GridLayout(2,1,1,1));
    subPanelD2.add(siArmaCerca);
    subPanelD2.add(noArmaCerca);
    subPanelD2.setBorder(new TitledBorder("Detector Armas"));
    subPanelD.add(subPanelD2);
    
    subPanelE.setLayout(new GridLayout(2,1,1,1));
    subPanelE1.setLayout(new GridLayout(2,1,1,1));
    subPanelE1.add(siVidaCerca);
    subPanelE1.add(noVidaCerca);
    subPanelE1.setBorder(new TitledBorder("Detector Vidas"));
    subPanelE.add(subPanelE1);
    subPanelE2.setLayout(new GridLayout(1,1,1,1));
    subPanelE2.setBorder(new LineBorder(Color.BLACK));
    JButton calcular = new JButton("Calcular");
    calcular.addActionListener(new ButtonListener());
    calcular.setVerticalAlignment(JButton.CENTER);
    subPanelE2.add(calcular);
    subPanelE.add(subPanelE2);
    
    panel.add(subPanelA);
    panel.add(subPanelB);
    panel.add(subPanelC);
    panel.add(subPanelD);
    panel.add(subPanelE);
    add(panel);
	}
	
	protected class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      
    }
	}
	
}
