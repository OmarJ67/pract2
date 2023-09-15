public class Main {
    public static void main(String[] args) {
        try {
            EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora("Juan", 10.0, 40, 7);
            EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("María", 3000.0, 25, 8);

            double salarioPorHora = empleadoPorHora.calcularSalario();
            double salarioAsalariado = empleadoAsalariado.calcularSalario();
            double bonificacionAsalariado = empleadoAsalariado.calcularBonificacion();

            System.out.println("Salario de Juan por hora: $" + salarioPorHora);
            System.out.println("Salario de María asalariado: $" + salarioAsalariado);
            System.out.println("Bonificación de María asalariado: $" + bonificacionAsalariado);
        } catch (SalakarioInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
