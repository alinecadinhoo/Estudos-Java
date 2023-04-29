package POO;

public class main {
    public static void main(String[] args) {

        // utilizando construtor padrão, colocando valores nele
        // criando um objeto carro1
        Carro carro1 = new Carro();

        //com objeto carro1 chama o set e o get
        carro1.setCor("Vermelho");
        carro1.setModelo("Fiesta");
        carro1.setCapacidadetanque(50);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadetanque());
        System.out.println(carro1.totalValorTanque(6.39));

        //outro construtor carro2 com parâmetros

        Carro carro2 = new Carro("Cinza", "Mercedes", 55);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadetanque());
        System.out.println(carro2.totalValorTanque(6.46));



    }
}
