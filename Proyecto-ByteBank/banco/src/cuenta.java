class cuenta {

    double saldo;
    int agencia;
    int numero;
    String titular;

    void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } 
        return false;

    }

    public boolean transferir(double valor, cuenta cuenta) {

        if (this.saldo >= valor) {
            this.saldo -= valor;
            cuenta.deposita(valor);
            return true;
        } 
        return false;

    }

}