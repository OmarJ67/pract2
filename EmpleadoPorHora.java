public class EmpleadoPorHora extends Empleado implements Bonificable {
    private double valorPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHora(String nombre, double salario, double valorPorHora, int horasTrabajadas) throws SalakarioInvalidoException {
        super(nombre,salario);

        if (valorPorHora <= 0 || horasTrabajadas <= 0) {
            throw new SalakarioInvalidoException();
        }

        this.valorPorHora = valorPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularBonificacion() {
        // Implementación del cálculo de bonificación si es necesario
        return 0.0;
    }

    public double calcularSalario() {
        return valorPorHora * horasTrabajadas;
    }
}

