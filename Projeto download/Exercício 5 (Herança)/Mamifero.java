public class Mamifero extends Animal {

    //Atributos
    public String alimento;

    //Contrutor
    public Mamifero(String nome, float comprimento, int numeroPatas, String cor, String ambiente, double velocidadeMedia, String alimento){
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }
    
    //Métodos
    public String getAlimento(){
        return alimento;
    }

    public void setAlimento(String alimento){
        this.alimento = alimento;
    }

    public String toString(){
        return "Nome: " + this.nome +
                "\nComprimento: " + this.comprimento + " cm" +
                "\nNúmero de patas: " + this.numeroPatas + 
                "\nCor: " + this.cor + 
                "\nAmbiente: " + this.ambiente +
                "\nVelocidade média: " + this.velocidadeMedia + " m/s" +
                "\nAlimento: " + this.alimento;
    }
    
}
