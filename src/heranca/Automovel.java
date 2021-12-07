
package heranca;


public class Automovel extends Terrestre{
    private String numPlaca;
    private int numPortas;
    private String cor;
    private int potencia;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
    public Automovel (){
       
    }
    
    void imprimirDadosMoto (){
        System.out.println("---Moto---");
        System.out.println("Placa: "+numPlaca);
        System.out.println("cor: "+cor);
        System.out.println("potencia: "+potencia);
        System.out.println("N° de rodas: "+numRodas);
        System.out.println("capacidade: "+capacidade+ " pessoas");
    }
    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}
