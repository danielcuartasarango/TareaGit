package empleados;

/**
 * Clase para empleados por horas, que ganan por hora de trabajo realizada
 * @author acer
 *
 */

public class PorHoras extends Empleado{
	
	private double valorHora;
	private int horas;
	
	public PorHoras(int id, String nombre, double salario, int horas) {
		super(id,nombre);
		this.valorHora=salario;
		this.horas=horas;
	}
	
	/**
	 *@return Retorna el salario correspondiente a las horas trabajadas
	 *por el valor pagado por hora al trabajador
	 */
	public double calcularSalario() {
		return (this.valorHora*this.horas);
	}
}
