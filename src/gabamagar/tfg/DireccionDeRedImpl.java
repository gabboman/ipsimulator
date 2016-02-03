package gabamagar.tfg;


import gabamagar.util.Utilidades;
public class DireccionDeRedImpl implements DireccionDeRed {

	private String ip;
	private Integer mascara;//0 a 31
	private String gateway;
	
	
	public String getIP() {
		return ip;
	}
	public Integer getMascara() {
		return mascara;
	}
	public String getGateway() {
		return gateway;
	}

	public String getRepresentacionMascara() {
		
		return Utilidades.networkMaskFromInteger(this.getMascara());
	}
	@Override
	public String getSubnet() {//CALCULOS AQUI
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
