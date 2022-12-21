/*
PESSOA: NOME, TELEFONE, DATA_DE_ADMISSAO
*/

public class Pessoa {
    private String nome;
    private String telefone;
    private String data_admi;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getData_admi() {
        return data_admi;
    }
    public void setData_admi(String data_admi) {
        this.data_admi = data_admi;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", data_admi='" + data_admi + '\'' +
                '}';
    }
}
