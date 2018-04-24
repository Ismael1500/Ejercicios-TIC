
public class Colegio extends Edificio{
	private int numeroAulas;
	private boolean pabellon;//si o no
	public Colegio(String direccion, int codigoPostal, float altura,
			boolean calefaccionCentral, int numeroAulas) {
		super(direccion, codigoPostal, altura, calefaccionCentral);
		this.numeroAulas=numeroAulas;   
		   }
	public int getCapacidadColegio(){
		int capacidadColegio;
		capacidadColegio=numeroAulas*30;
		return(capacidadColegio);
		
	}
	public boolean isPabellon() {
		return pabellon;
	}
	public void setPabellon(boolean pabellon) {
		this.pabellon = pabellon;
	}
}
