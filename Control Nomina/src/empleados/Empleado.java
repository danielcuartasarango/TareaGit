package empleados;

/**
 * Clase abstracta de empleados "genericos"
 * @author acer *
 */

public abstract class Empleado {
	protected int id;
	protected String nombre;
	
	public Empleado(int id, String nombre) {
		this.id=id;
		this.nombre=nombre;
	}
	
	public abstract double calcularSalario();
	
}
