package empleados;

public class EmpleadoFactory {
	
	public Empleado crearEmpleado(int id,String nombre, String tipo, double salario, int horas, int ventas) {
		Empleado empleado= null;
		if (tipo.equalsIgnoreCase("A")) 
			empleado= new Asalariado(id, nombre, salario);
		if(tipo.equalsIgnoreCase("H"))		
			empleado = new PorHoras(id, nombre, salario, horas);
		if(tipo.equalsIgnoreCase("C"))
			empleado= new PorComision(id, nombre, salario, ventas);		
		return empleado;
	}
}
