
package heranca;


public class Principal {
    public static void main(String[] args) {
        Automovel carro = new Automovel();
        Automovel moto = new Automovel();
        
        carro.setNumPlaca("KSU724SA");
        carro.setNumPortas(4);
        carro.setCor("branco");
        carro.setNumRodas(4);
        carro.setCapacidade(0);
        
        moto.imprimirDadosMoto();
    }
}
