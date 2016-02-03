package gabamagar.tfg;

public interface DireccionDeRed {
	public String getIP();
	public Integer getMascara();//8 a 32
	public String getRepresentacionMascara();//pasar a utilidades?
	public String getSubnet();//calculos aqui
	public String getGateway();
	

}
