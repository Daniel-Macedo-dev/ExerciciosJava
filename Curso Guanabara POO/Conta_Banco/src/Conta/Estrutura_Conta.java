package Conta;

public class Estrutura_Conta {
    public int _numConta;
    protected String _tipo;
    private String _dono;
    private float _saldo;
    private boolean _status;

    //Construtor
    public Estrutura_Conta(int numConta, String tipo, String dono){
        _numConta= numConta;
        _tipo= tipo;
        _dono= dono;
        _saldo= 0.0f;
        _status= false;
    }

    //getters e setters

    public int getNumConta() {
        return _numConta;
    }

    public void setNumConta(int numConta){
        _numConta = numConta;
    }

    public String getTipo(){
        return _tipo;
    }

    public void setTipo(String tipo){
        _tipo = tipo;
    }

    public String getDono(){
        return _dono;
    }

    public void setDono(String dono){
        _dono = dono;
    }

    public float getSaldo(){
        return _saldo;
    }

    public void setSaldo(float saldo){
        _saldo = saldo;
    }

    public boolean getStatus(){
        return _status;
    }

    public void setStatus(boolean status){
        _status = status;
    }

    //Metodos
    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);

        if (tipo.equals("CC")){
            setSaldo(50);
        } else if (tipo.equals("CP")) {
            setSaldo(150);
        }

        System.out.println("Conta aberta.");
    }

    public void fecharConta(){
        if (getSaldo() > 0){
            System.out.println("Há dinheiro na conta, não pode ser fechada.");
        } else if (getSaldo() < 0) {
            System.out.println("Conta com débito, não pode ser fechada.");
        } else {
            setStatus(false);
            System.out.println("A conta foi fechada com sucesso.");
        }
    }

    public void depositar(float valor){
        if (getStatus()){
            setSaldo(getSaldo() + valor);
            System.out.println("Valor de R$ " + valor + " depositado com sucesso.");
        } else {
            System.out.println("A conta está fechado e não é possível depositar nenhum valor.");
        }
    }

    public void sacar(float valor){
        if(getStatus()){
            if(getSaldo() >= valor){
                setSaldo(getSaldo() - valor);
                System.out.println("Saque de R$ " + valor + "bem sucedido.");
            } else {
                System.out.println("Saldo insuficiente para realizar um saque.");
            }
        } else {
            System.out.println("A conta está fechada, não é possível prosseguir");
        }
    }

    public void pagarMensalidade(){
        float valor = 0;
        if (getTipo().equals("CC")){
            valor = 12;
        } else if (getTipo().equals("CP")){
            valor = 20;
        }
        if (getStatus()){
            if(getSaldo() >= valor){
                setSaldo(getSaldo() - valor);
                System.out.println("Mensalidade de R$ " + valor + " paga com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para prosseguir com o pagamento.");
            }
        } else {
            System.out.println("A conta está fechada.");
        }
    }

    public void estadoConta(){
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: R$ " + getSaldo());
        System.out.println("Status: " + getStatus());
    }
}