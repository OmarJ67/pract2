public class EmpleadoAsalariado extends Empleado implements Bonificable {
    private double sueldoMensual;
    private int diasTrabajados;

    public EmpleadoAsalariado(String nombre, double sueldoMensual,double salario, int diasTrabajados) throws SalakarioInvalidoException {
        super(nombre,salario);

        if (sueldoMensual <= 0 || diasTrabajados <= 0) {
            throw new SalakarioInvalidoException();
        }

        this.sueldoMensual = sueldoMensual;
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    public double calcularBonificacion() {
        // Implementación del cálculo de bonificación si es necesario
        return 0.0;
    }

    public double calcularSalario() {
        double salarioDiario = sueldoMensual / 30.0; // Suponemos un mes de 30 días
        return salarioDiario * diasTrabajados;
    }
}
