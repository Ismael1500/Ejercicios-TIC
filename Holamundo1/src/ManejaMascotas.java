public class ManejaMascotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mascota milana;
		milana=new Mascota("milana",3,"perro",'h');
		System.out.println("mi mascota se llama "+milana.getNombre());
		System.out.println("y tiene "+milana.getEdad()+" a�os");
		//pasa un a�o
		milana.setEdad(4);
		System.out.println("Ahora tiene "+milana.getEdad());
		System.out.println("por lo tanto naci� en el a�o"+milana.getAnioNacimiento(2018));
	}
}
