public class UsarRadioEncapsulado{
    public static void main(String[] args) {
        RadioEncapsulada radio1 = new RadioEncapsulada();

        radio1.setEstacao(85.1f);
        radio1.setVolume(80);
        radio1.mostrar();

        radio1.setEstacao(95.0f);
        radio1.aumentarVolume();
        radio1.aumentarVolume();
        radio1.mostrar();

    }
}