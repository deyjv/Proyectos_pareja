public class Citas{
	//Atributos trabajo....
	private String nombre;
	private String cedula;
	private String lugar ;
	private String motivo;

	//metodos construtor por defecto
	public Citas (){}
	public Citas (String nombre, String cedula, String lugar, String motivo){
		this.nombre = nombre;
		this.cedula = cedula;
		this.lugar = lugar;
		this.motivo = motivo;
	}
public void setNombre(String nombre){
	this.nombre = nombre;
}
public String getNombre(){
	return nombre;
}
public void setCedula(String cedula){
	this.cedula = cedula;
}
public String getCedula(){
	return cedula;
}
public void setLugar(String lugar){
	this.lugar = lugar;
}
public String getLugar(){
	return lugar;
}
public void setMotivo(String motivo){
	this.motivo = motivo;
}
public String getmotivo(){
	return motivo;
}

public double cobrarConsulta(int main_consulta){
		if(main_consulta <=10)
			return 10000.00;
		}
		if(main_consulta >10 && main_consulta <25){
			return 25000.00;
		}




}
