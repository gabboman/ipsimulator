package gabamagar.tfg;

import gabamagar.util.Velocidades;

public class InterfazImpl extends DireccionDeRedImpl implements Interfaz {
	private Velocidades velocidad;
	private String mac;
	private String name;
	
	public Velocidades getVelocidad() {
		return velocidad;
	}
	public String getMAC() {
		return mac;
	}
	public String getName() {
		return name;
	}

}
