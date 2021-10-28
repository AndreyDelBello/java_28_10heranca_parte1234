public class Empregado extends Pessoa{
    

    private int codigoSetor;
    private double salarioBase;
    private double imposto;
    //inserir metodos get e set.

    public double calculaSalario(){
        double salarioLiquido;
        salarioLiquido=this.salarioBase-this.imposto;
        return salarioLiquido;
    }
}
