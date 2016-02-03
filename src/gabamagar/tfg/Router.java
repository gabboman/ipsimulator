package gabamagar.tfg;



import java.util.Map;

public interface Router extends Switch{
	Map<Interfaz,DireccionDeRed> getInterfacesConIp();
}
