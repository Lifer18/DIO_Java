public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv tv = new SmartTv(true,1,25);

        tv.imprimirLigada();
        tv.imprimirCanal();
        tv.imprimirVolume();

        tv.diminuirVolume();
        tv.imprimirVolume();

        tv.aumentarVolume();
        tv.imprimirVolume();

        tv.aumentarCanal();
        tv.imprimirCanal();

        tv.diminuirCanal();
        tv.imprimirCanal();



        tv.alterarCanal();
        tv.imprimirCanal();

        tv.power();
        tv.imprimirLigada();


    }
}
