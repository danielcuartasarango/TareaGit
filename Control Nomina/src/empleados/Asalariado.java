package empleados;

/**
 * Clase para empleados asalariados con un sueldo fijo por semana
 * @author acer
 *
 */

public class Asalariado extends Empleado{
	
	private double salarioFijo;
	
	public Asalariado(int id, String nombre, double salario) {
		super(id,nombre);
		this.salarioFijo=salario;
	}
	
	/**
	 * @return Retorna el salario fijo semanal del empleado
	 */
	public double calcularSalario() {
		return this.salarioFijo;
	}
}
