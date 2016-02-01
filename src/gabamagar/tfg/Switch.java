package gabamagar.tfg;

import gabamagar.util.Interfaz;

import java.util.List;

public interface Switch extends Hub{
	public List<Interfaz> getInterfaces();//en la interfaz solo dejaremos un tipo de velocidad
	public String getNombre();
	//tabla de caches ARP aqui:
}
