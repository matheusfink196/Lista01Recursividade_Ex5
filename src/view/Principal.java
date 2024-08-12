package view;
import controller.SomaController;
public class Principal {
	
	public static void main(String args []) {
		SomaController somaCont = new SomaController();
		
		double num = 3;
		double soma = somaCont.recsoma(num);
		System.out.println(soma);
	}
}
