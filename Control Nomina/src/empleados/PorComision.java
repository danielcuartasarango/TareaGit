package empleados;

/**
 * 
 * @author acer
 *
 */

public class PorComision extends Empleado{
	private double salarioFijo;
	private int ventas;
	
	public PorComision(int id, String nombre, double salario, int ventas) {
		super(id,nombre);
		this.salarioFijo=salario;
		this.ventas=ventas;
	}
	
	/**
	 * Calcula la comision ganada por ventas y luego el salario a pagar.
	 * 
	 * @return Calcula la suma de la comision por ventas mas
	 * 		   el salario fijo semanal del empleado
	 */
	public double calcularSalario() {
		double comision=((this.salarioFijo/100)*5)*this.ventas;
		return this.salarioFijo+comision;
	}
}
