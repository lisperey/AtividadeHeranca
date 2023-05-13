package AulaHeraca;

public class Endereco {
    String rua;
    int numero;
    int CEP;
    String UF;
    String cidade;
    String complemento;

    public Endereco(String rua, int numero, int CEP, String UF, String cidade, String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.CEP = CEP;
        this.UF = UF;
        this.cidade = cidade;
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numero=" + numero +
                ", CEP=" + CEP +
                ", UF='" + UF + '\'' +
                ", cidade='" + cidade + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
