package gabamagar.tfg;

public interface DireccionDeRed {
	public String getIP();
	public Integer getMascara();//0 a 31
	public String getRepresentacionMascara();//pasar a utilidades?
	public String getSubnet();//calculos aqui
	public String getGateway();
	

}
