package AulaHeraca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Funcionario extends Pessoa {
    int matricula;
    double salario;
    String dataAdmissao;
    Cargo cargo;

    public Funcionario(String nome, String dataNascimento, Endereco endereco, List<Telefone> telefone,int matricula, double salario, String dataAdmissao, Cargo cargo) {
        super(nome, dataNascimento, endereco, telefone);
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;

    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void reajustarSalario(double reajuste){
        double novoSalario = salario + reajuste;
        this.salario = novoSalario;
        System.out.println("Novo salario:"+novoSalario);

    }
    public void promover(Cargo novoCargo){
        this.cargo = novoCargo;
        System.out.println("Novo cargo " +novoCargo+" cadastrado com sucesso." );
    }

    public void getIdade() throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(dataNascimento);
        Date hoje = new Date();
        int idade = hoje.getYear() - dataFormatada.getYear();

        System.out.println("O funcionario "+ nome + " tem " + idade + " anos." );
    }

    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Data nascimento: "+ dataAdmissao);
        System.out.println("Data admissão: "+ dataAdmissao);
        System.out.println("Cargo: "+ cargo);
        System.out.println("Telefones: "+ telefone.toString());
        System.out.println("Endereço: "+ endereco.toString());


    }
}
