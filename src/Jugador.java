import java.util.ArrayList;
import java.util.List;

public class Jugador {
	
	Herramienta herramientaEquipada;
	List herramientas;
	List materiales;
	
	public Jugador() {
		this.herramientaEquipada = Hacha.crearHachaDeMadera();
		this.herramientas = new ArrayList();
		this.materiales = new ArrayList();
	}
	
}
