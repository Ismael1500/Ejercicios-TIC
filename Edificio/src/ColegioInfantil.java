
public class ColegioInfantil extends Colegio{
	private boolean tienePatioInfantil;
	public ColegioInfantil(String direccion, int codigoPostal, float altura,
			boolean calefaccionCentral, int numeroAulas) {
		super(direccion, codigoPostal, altura, calefaccionCentral, numeroAulas);
	}
	public boolean isTienePatioInfantil() {
		return tienePatioInfantil;
	}
	public void setTienePatioInfantil(boolean tienePatioInfantil) {
		this.tienePatioInfantil = tienePatioInfantil;
	}
}
