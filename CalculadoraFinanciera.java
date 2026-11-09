public class CalculadoraFinanciera {
    double tasaInteresAnualBase;

    public CalculadoraFinanciera(double tasaInteresAnualBase) {
        this.tasaInteresAnualBase = tasaInteresAnualBase;
    }

    public double calcularInteresSimple(double capital, int dias) {
        return (capital * this.tasaInteresAnualBase * dias) / (365.0 * 100.0);
    }

    public static void main(String[] args) {
        CalculadoraFinanciera calc = new CalculadoraFinanciera(15.5); // 15.5% anual

        double interes1 = calc.calcularInteresSimple(100000.0, 90);
        double interes2 = calc.calcularInteresSimple(500000.0, 180);

        System.out.println(String.format("Interés generado (Monto 1 - $100.000 a 90 días): $%.2f", interes1));
        System.out.println(String.format("Interés generado (Monto 2 - $500.000 a 180 días): $%.2f", interes2));
    }
}