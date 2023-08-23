public class Conta {
    
    private long numero;
    private String nomeCorrentista;
    private int saldoLivreInicial;
    private int salAplicacaoInicial;
    private double taxaRemuneracao;
    private double taxaSaldoNegativo;
    private Categoria categoria;
    

    public static class Builder{

        private long numero;
        private String nomeCorrentista;
        private int saldoLivreInicial = 0;
        private int salAplicacaoInicial = 0;
        private double taxaRemuneracao = 0;
        private double taxaSaldoNegativo = 0;
        private Categoria categoria = Categoria.NORMAL;

        public Builder(long numero, String nomeCorrentista){
            this.numero = numero;
            this.nomeCorrentista = nomeCorrentista;            
        }

        public Builder numero(long numero){
            this.numero = numero;
            return this;
        }

        public Builder nomeCorrentista(String nomeCorrentista){
            this.nomeCorrentista = nomeCorrentista;
            return this;
        }

        public Builder saldoLivreInicial(int saldoLivreInicial){
            this.saldoLivreInicial = saldoLivreInicial;
            return this;
        }

        public Builder salAplicacaoInicial(int salAplicacaoInicial){
            this.salAplicacaoInicial = salAplicacaoInicial;
            return this;
        }

        public Builder taxaRemuneracao(double taxaRemuneracao){
            this.taxaRemuneracao = taxaRemuneracao;
            return this;
        }

        public Builder categoria(Categoria categoria){
            this.categoria = categoria;
            return this;
        } 

        public Conta build(){
            return new Conta(this);
        }
    }

    private Conta(Builder builder){
        this.numero = builder.numero;
        this.nomeCorrentista = builder.nomeCorrentista;
        this.saldoLivreInicial = builder.saldoLivreInicial;
        this.salAplicacaoInicial = builder.salAplicacaoInicial;
        this.taxaRemuneracao = builder.taxaRemuneracao;
        this.taxaSaldoNegativo = builder.taxaSaldoNegativo;
        this.categoria = builder.categoria;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public int getSaldoLivreInicial() {
        return saldoLivreInicial;
    }

    public void setSaldoLivreInicial(int saldoLivreInicial) {
        this.saldoLivreInicial = saldoLivreInicial;
    }

    public int getSalAplicacaoInicial() {
        return salAplicacaoInicial;
    }

    public void setSalAplicacaoInicial(int salAplicacaoInicial) {
        this.salAplicacaoInicial = salAplicacaoInicial;
    }

    public double getTaxaRemuneracao() {
        return taxaRemuneracao;
    }

    public void setTaxaRemuneracao(double taxaRemuneracao) {
        this.taxaRemuneracao = taxaRemuneracao;
    }

    public double getTaxaSaldoNegativo() {
        return taxaSaldoNegativo;
    }

    public void setTaxaSaldoNegativo(double taxaSaldoNegativo) {
        this.taxaSaldoNegativo = taxaSaldoNegativo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String toString(){
       return String.format("Número : %d  \n Nome do Correntista : %s \n Saldo Inicial : %d \n Saldo Aplic Inicial : %d \n Taxa Remuneração : %.2f \n Taxa Saldo Negativo : %.2f \n Categoria : %s ", numero, nomeCorrentista, saldoLivreInicial, salAplicacaoInicial, taxaRemuneracao, taxaSaldoNegativo, categoria.toString()); 
    }



}
