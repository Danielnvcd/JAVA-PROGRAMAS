    class Salario{
    public static double calcularSalarioDiario(double sueldo, double aguinaldo, double primaV, double viaticos, double vales) {
        final int DIAS = 365;
        double salarioIntegral = sueldo + aguinaldo + primaV + viaticos + vales;
        double salarioDiario = salarioIntegral / DIAS;
        return salarioDiario;
    }
}

public class Main {
    public static void main(String[] args) {
        double sueldo = 125;
        double aguinaldo = 125;
        double primaV = 125;
        double viaticos = 125;
        double vales = 125;
        double salarioDiario = Salario.calcularSalarioDiario(sueldo, aguinaldo, primaV, viaticos, vales);
        System.out.println("Salario diario integral: " + salarioDiario);
    }
}
