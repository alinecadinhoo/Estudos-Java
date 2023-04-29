package POO.Herança;

public class main {
    public static void main(String[] args) {

        Funcionário funcionario = new Funcionário();
        //ocorreu tres upcasts
        Funcionário gerente = new Gerente();
        Funcionário vendedor = new Vendedor();
        Funcionário Faxineiro = new Faxineiro();


    }
}
