package AulaHeraca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pessoa{
    String nome;
    String dataNascimento;
    List<Telefone> telefone;
    Endereco endereco;


    public Pessoa(String nome, String dataNascimento, Endereco endereco, List<Telefone> telefone) {
        super();
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone= telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
