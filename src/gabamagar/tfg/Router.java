package gabamagar.tfg;

import gabamagar.util.Interfaz;


import java.util.Map;

public interface Router extends Switch{
	Map<Interfaz,DireccionDeRed> getInterfacesConIp();
}
