package presentacion;

import javax.swing.JLabel;
import java.awt.Graphics;
import java.util.ArrayList;

public class MiMapaDibujo extends JLabel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<ObjetoGrafico> objetosGraficos = new ArrayList<ObjetoGrafico>();
	
	public MiMapaDibujo(){
	}
	
	void addObjetoGrafico(ObjetoGrafico objg) {
		objetosGraficos.add(objg);
	}
	public ObjetoGrafico getUltimoObjetoGrafico(){
		return objetosGraficos.get(objetosGraficos.size()-1);
	}
	public void paint(Graphics g){
		super.paint(g);
		
		for (int i = 0; i < objetosGraficos.size(); i++) {
			ObjetoGrafico objg = objetosGraficos.get(i);
			if (objg instanceof ImagenGrafico){
				g.drawImage(((ImagenGrafico)objg).getImagen(), objg.getX(), objg.getY(), null);
			}
			else if (objg instanceof LineaGrafica){
				g.setColor(((LineaGrafica)objg).getColor());
				int w = ((LineaGrafica)objg).getX1();
				int h = ((LineaGrafica)objg).getY1();
				g.drawLine(objg.getX(),objg.getY(),w,h);
			}
			else {
				g.setColor(((TextoGrafico)objg).getColor());
				g.drawString(((TextoGrafico)objg).getTexto(),objg.getX(),objg.getY());
			}
		}
	}
}
