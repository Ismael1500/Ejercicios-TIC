
public class PersonaViviente {
	private String nombre;
	private String apellido;
	private FechaNacimiento nacimiento;
	
	
	public PersonaViviente(String nombre, String apellido,
			FechaNacimiento nacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public FechaNacimiento getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(FechaNacimiento nacimiento) {
		this.nacimiento = nacimiento;
	}

	
}
