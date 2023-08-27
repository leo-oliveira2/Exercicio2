public class App{

    public static void main(String[] args){
        Conta c1 = new Conta.Builder(11, "Alemao").build();
        
        System.out.println(c1.toString());

        
        Conta c2 = new Conta.Builder(10,"Bernardo").categoria(Categoria.PREMIUM)
                            .salAplicacaoInicial(1000).build();

        System.out.println("\n"+c2);
    }

}