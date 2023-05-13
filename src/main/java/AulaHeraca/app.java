package AulaHeraca;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[] args) throws ParseException {
        List<Telefone> telefones_f = new ArrayList<Telefone>();
        telefones_f.add(new Telefone("83", "85858585"));
        telefones_f.add(new Telefone("83", "88585858"));

        Funcionario f = new Funcionario("Filipe", "20/09/1997",
                new Endereco("rua a", 10, 585828, "PE", "Petrolina", "AP 103"),
                telefones_f, 01, 5000.00, "13/05/2023", Cargo.cargo1);

        f.imprimir();
        f.getIdade();
        f.promover(Cargo.cargo3);
        f.reajustarSalario(1000.00);

        List<Telefone> telefones_c = new ArrayList<Telefone>();
        telefones_c.add(new Telefone("83", "85858585"));
        telefones_c.add(new Telefone("83", "88585858"));

        Cliente c = new Cliente("Felipe", "21/10/1998", new Endereco("Rua b", 11, 595929, "BA", "Juazeiro", "AP 104"),
                telefones_c, "1A", Profissao.p3);

        c.getIdade();;
        c.imprimir();




    }
}
