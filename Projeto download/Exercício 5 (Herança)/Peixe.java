public class Peixe extends Animal{

    //Atributos
    public String caracteristica;

    //Contrutor
    public Peixe(String nome, float comprimento, int numeroPatas, String cor, String ambiente, double velocidadeMedia, String caracteristica){
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    //Métodos
    public String getCaracteristica(){
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica){
        this.caracteristica = caracteristica;
    }

    /*public String toString(){
        return "Nome: " + this.nome +
                "\nComprimento: " + this.comprimento + " cm" +
                "\nNúmero de patas: " + this.numeroPatas + 
                "\nCor: " + this.cor + 
                "\nAmbiente: " + this.ambiente +
                "\nVelocidade média: " + this.velocidadeMedia + " m/s" +
                "\nCaracterística: " + this.caracteristica;
    }*/
    
}
