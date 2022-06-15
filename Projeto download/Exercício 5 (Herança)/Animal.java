public class Animal {

    //Atributos
    public String nome;
    public float comprimento;
    public int numeroPatas;
    public String cor;
    public String ambiente;
    public double velocidadeMedia;

    //Construtor
    public Animal (String nome, float comprimento, int numeroPatas, String cor, String ambiente, double velocidadeMedia){
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroPatas = numeroPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    } 

    public float getComprimento(){
        return this.comprimento;
    }

    public void setComprimento (float comprimento){
        this.comprimento = comprimento;
    } 

    public int getNumeroPatas(){
        return this.numeroPatas;
    }

    public void setNumeroPatas (int numeroPatas){
        this.numeroPatas = numeroPatas;
    } 

    public String getCor(){
        return this.cor;
    }

    public void setCor (String cor){
        this.cor = cor;
    } 

    public String getAmbiente(){
        return this.ambiente;
    }

    public void setAmbiente (String ambiente){
        this.ambiente = ambiente;
    } 

    public double getVelocidadeMedia(){
        return this.velocidadeMedia;
    }

    public void setVelocidadeMedia (double velocidadeMedia){
        this.velocidadeMedia = velocidadeMedia;
    } 
    
    /*public String toString(){
        return "Nome: " + this.nome +
                "\nComprimento: " + this.comprimento + " cm" +
                "\nNúmero de patas: " + this.numeroPatas + 
                "\nCor: " + this.cor + 
                "\nAmbiente: " + this.ambiente +
                "\nVelocidade média: " + this.velocidadeMedia + " m/s";
    }*/
}
