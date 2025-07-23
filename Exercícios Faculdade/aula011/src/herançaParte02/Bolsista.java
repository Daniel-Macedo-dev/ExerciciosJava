package herançaParte02;

public class Bolsista extends Aluno {
    private float _bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + _nome);
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(_nome + "é bolsista! Pagamento facilitado");
    }

    public float getBolsa() {return _bolsa;}

    public void setBolsa(float bolsa) {_bolsa = bolsa;}
}
