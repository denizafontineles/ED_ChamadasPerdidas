package controller;
import com.deniza.utils.fila.string.Fila;
import javax.swing.JOptionPane;

public class ChamadasController {
	
	public ChamadasController() {
		super();
	}

	public void insereLigacao(Fila f, String numeroTelefone) {
		f.insert(numeroTelefone);
	}

	public void consultaLigacoes(Fila f) {
		if (f.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não há chamadas perdidas");
		} else {
			try {
				String chamada = f.remove();
				JOptionPane.showMessageDialog(null, chamada);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Não há chamadas perdidas");
			}
		}
	}

}
