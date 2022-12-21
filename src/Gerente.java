public class Gerente extends Pessoa{
    private double salario;
    private int horas;
    private int dias;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "salario=" + salario +
                ", horas=" + horas +
                ", dias=" + dias +
                '}';
    }

    public double calcSalario() {
        double total = salario * horas * dias;
        System.out.printf("O salário do gerente é: ");
        return total;
    }
}
