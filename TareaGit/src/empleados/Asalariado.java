package empleados;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("asalariado")
public class Asalariado extends Empleado {

}
