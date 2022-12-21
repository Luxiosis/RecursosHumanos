public class Desenvolvedor extends Pessoa{
    private int horas;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "horas=" + horas +
                '}';
    }

    public double calcSalario() {
        double total = horas * 255;
        System.out.printf("O salário do desenvolvedor é: ");
        return total;
    }
}
