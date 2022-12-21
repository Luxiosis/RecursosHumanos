public class Empregado extends Pessoa {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "salario=" + salario +
                '}';
    }

    public double calcSalario() {
        System.out.printf("O salário do empregado é: ");
        return salario;
    }
}
