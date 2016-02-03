package gabamagar.tfg;

import gabamagar.util.Velocidades;

public interface Interfaz extends DireccionDeRed {//Simplificamos y suponemos solo ethernet
	Velocidades getVelocidad();
	String getMAC();
	String getName();
	
}
