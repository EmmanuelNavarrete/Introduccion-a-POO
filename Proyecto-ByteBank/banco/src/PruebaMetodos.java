public class PruebaMetodos {
    public static void main(String[] args) {

        cuenta CuentaEmmanuel = new cuenta();
        CuentaEmmanuel.saldo = 100;
        CuentaEmmanuel.deposita(200);

        System.out.println(CuentaEmmanuel.saldo);

        CuentaEmmanuel.retirar(50);
        System.out.println(CuentaEmmanuel.saldo);

        cuenta cuentaJimena = new cuenta();

        cuentaJimena.deposita(1000);

        boolean puedeTransferir = cuentaJimena.transferir(500, CuentaEmmanuel);

        if (puedeTransferir) {
            System.out.println("Transferencia exitosa");
        } else {
            System.out.println("Fondos insuficientes");
        }

        System.out.println("Saldo cuenta Jimena: " + cuentaJimena.saldo);
        System.out.println("Saldo cuenta Emmanuel: " + CuentaEmmanuel.saldo);
        


    }
}
