package POO;

//herança da classe veiculo
public class Carro extends veiculo { //classe

    //Atributos
    String cor;
    String modelo;
    int capacidadetanque;

    //sobrecarga - assinatura com nomes e parâmetros
    //aqui acrescentou nada
    Carro() {

    }
    // acrescentou três parâmetros
    Carro(String cor, String modelo, int capacidadetanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadetanque = capacidadetanque;

    }

    //Construtor - métodos get(retorna a cor do carro) e set(coloca o valor)
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadetanque() {
        return capacidadetanque;
    }

    public void setCapacidadetanque(int capacidadetanque) {
        this.capacidadetanque = capacidadetanque;
    }

    //metodo de calcular total
    double totalValorTanque(double valorCombustivel) {
        return capacidadetanque * valorCombustivel;

    }
}
