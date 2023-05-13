package AulaHeraca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Cliente extends Pessoa{
    String codigo;
    Profissao profissao;

    public Cliente(String nome, String dataNascimento, Endereco endereco, List<Telefone> telefone, String codigo, Profissao profissao) {
        super(nome, dataNascimento, endereco, telefone);
        this.codigo = codigo;
        this.profissao = profissao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public void getIdade() throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(dataNascimento);
        Date hoje = new Date();
        int idade = hoje.getYear() - dataFormatada.getYear();

        System.out.println("O cliente "+ nome + " tem " + idade + " anos." );
    }

    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Profissão: " + profissao );
        System.out.println("Telefones: "+ telefone.toString());
        System.out.println("Endereço: "+ endereco.toString());


    }
}
