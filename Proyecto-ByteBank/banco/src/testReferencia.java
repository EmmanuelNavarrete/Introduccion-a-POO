public class testReferencia {
    public static void main(String[] args) {
        cuenta primeraCuenta = new cuenta();
        primeraCuenta.saldo = 200;
        cuenta segundaCuenta = primeraCuenta;

        System.out.println(
                "Saldo primera cuenta: " + primeraCuenta.saldo + " Saldo segunda cuenta: " + segundaCuenta.saldo);

        segundaCuenta.saldo += 300;

        System.out.println(
                "Saldo primera cuenta: " + primeraCuenta.saldo + " Saldo segunda cuenta: " + segundaCuenta.saldo);

        System.out.println(primeraCuenta);

// Para saber si son la misma cuenta, se compara la referencia de memoria
        if (primeraCuenta == segundaCuenta) {
            System.out.println("Son la misma cuenta");
        } else {
            System.out.println("Son cuentas diferentes");
        }

    }
}
