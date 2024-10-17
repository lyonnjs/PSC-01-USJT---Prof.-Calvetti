package PSC05.EX2;

public class ContaCorrente {
    private int numero;
    private int digito;
    private Agencia agencia;
    private double saldo;

    public ContaCorrente(Agencia a, int n,  double s){
        this.numero = n;
        this.digito = calcularDigito(n);
        this.agencia = a;
        this.saldo = s;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public double setSaldo(double saldo) {
        return this.saldo = saldo;
    }

    public double depositar(double deposito){
        setSaldo(deposito + getSaldo());
        return getSaldo();
    }

    private int calcularDigito(int i){

        int i4 = i % 10;
        int mult4 = i4 * 2;
        
        int i3 = (i / 10) % 10;
        int mult3 = i3 * 8;

        int i2 = (i / 100) % 10;
        int mult2 = i2 * 6;

        int i1 = i / 1000;
        int numero1 = i1 % 10;
        int mult1 = numero1 * 4;

        int soma = mult1 + mult2 + mult3 + mult4;
        int digito = soma % 11;

        if (digito == 10){
            digito = 0;
        }
        return digito;
    }

   public void sacar(double saque) {
    if (saldo <= 0) {
        System.out.println("Sem valor no saldo para sacar: ");
    } else {
        if (saque > saldo) {
            System.out.println("Sem valor no saldo para sacar: ");
        } else {
            saldo -= saque;
            System.out.println("Saque realizado");
        }
    }
}


    public String consultarSaldo(){
        return "Saldo: " + getSaldo();
        
    }

    public String imprimirSaldo(){
        return "Numero da conta com digito: " + getNumero() + "\nNumero da agencia: " + getAgencia() + "-" + getDigito() + "\nsaldo: " + getSaldo();
    }

    @Override
    public String toString() {
        return "ContaCorrente [numero= " + numero + "\ndigito= " + digito + "\nagencia= " + agencia + "\nsaldo= " + saldo + "]";
    }
    
}