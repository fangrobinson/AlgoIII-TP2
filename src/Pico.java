public class Pico extends Herramienta {

	public Pico(int fuerza, Durabilidad unaDurabilidad) {
		this.fuerza = fuerza;
		this.durabilidad = unaDurabilidad;
	}

	@Override
	public void golpear(Madera madera) {
		//el pico no afecta a la madera
		this.desgastar(this.fuerza);
	}

	public static Pico crearPicoDeMadera() {
		return new Pico(2, new DurabilidadConFactor(1, 100));	
	}
	
	public static Pico crearPicoDePiedra() {
		return new Pico(4, new DurabilidadConFactor(1.5, 200));
	}
	
	public static Pico crearPicoDeMetal() {
		return new Pico(12, new DurabilidadConUsos(10, 400));
	}
	
	public static Pico crearPicoFino() {
		return new Pico(20, new DurabilidadConFactor(10, 1000));
	}
}

