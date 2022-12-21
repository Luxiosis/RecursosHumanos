/*
EXERCÍCIO: Criar uma aplicação que simule a entrada de dados de um RH, sabendo que existem os cargos: EMPREGADO,
GERENTE E DESENVOLVEDOR.  A aplicação calcula o salário de cada função, sendo:
    GERENTE: salário * horas * dias
    DESENVOLVEDOR: horas * 255
    EMPREGADO: salário
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        Empregado empregado = new Empregado();
        Scanner sc = new Scanner(System.in);

        System.out.println("Diga o nome do gerente: ");
        gerente.setNome(sc.nextLine());
        System.out.println("Diga o nome do desenvolvedor: ");
        desenvolvedor.setNome(sc.nextLine());
        System.out.println("Diga o nome do empregado: ");
        empregado.setNome(sc.nextLine());

        System.out.println("Diga o telefone do gerente: ");
        gerente.setTelefone(sc.next());
        System.out.println("Diga o telefone do desenvolvedor: ");
        desenvolvedor.setTelefone(sc.next());
        System.out.println("Diga o telefone do empregado: ");
        empregado.setTelefone(sc.next());

        System.out.println("Diga a data de admissão do gerente: ");
        gerente.setData_admi(sc.next());
        System.out.println("Diga a data de admissão do desenvolvedor: ");
        desenvolvedor.setData_admi(sc.next());
        System.out.println("Diga a data de admissão do empregado: ");
        empregado.setData_admi(sc.next());

        System.out.println("Diga o quanto o gerente ganha: ");
        gerente.setSalario(sc.nextDouble());
        System.out.println("Diga quantas horas por dia o gerente trabalha: ");
        gerente.setHoras(sc.nextInt());
        System.out.println("Diga quantos dias da semana o gerente trabalha");
        gerente.setDias(sc.nextInt());

        System.out.println("Diga quantas horas por dia o desenvolvedor trabalha: ");
        desenvolvedor.setHoras(sc.nextInt());

        System.out.println("Diga o salário do empregado");
        empregado.setSalario(sc.nextDouble());

        //System.out.println(gerente.toString());
        //System.out.println(desenvolvedor.toString());
        //System.out.println(empregado.toString());
        //
        System.out.println();

        System.out.println("Nome do gerente: " + gerente.getNome());
        System.out.println("Telefone do gerente: " + gerente.getTelefone());
        System.out.println("Data de admissão: " + gerente.getData_admi());
        System.out.println(gerente.calcSalario());

        System.out.println();

        System.out.println("Nome do desenvolvedor: " + desenvolvedor.getNome());
        System.out.println("Telefone do desenvolvedor: "+desenvolvedor.getTelefone());
        System.out.println("Data de admissão: " + desenvolvedor.getData_admi());
        System.out.println(desenvolvedor.calcSalario());

        System.out.println();

        System.out.println("Nome do empregado: " + empregado.getNome());
        System.out.println("Telefone do empregado: " + empregado.getTelefone());
        System.out.println("Data de admissão: " + empregado.getData_admi());
        System.out.println(empregado.calcSalario());
    }
}