public class aula03 {
    // EXERCITANDO METODOS
    public static void main(String[] args) {
        smartTV minhaTV = new smartTV();

        System.out.println("A minha TV está ligada? " + minhaTV.estadoTV);
        minhaTV.powerTV();
        System.out.println("A minha TV está ligada? " + minhaTV.estadoTV);

        System.out.println("O volume da TV está em: " + minhaTV.volume);
        minhaTV.aumentarVolumeTV();
        System.out.println("O volume da TV está em: " + minhaTV.volume);

        System.out.println("O canal atual da TV é: " + minhaTV.canal);
        minhaTV.aumentarCanalTV();
        System.out.println("O canal atual da TV é: " + minhaTV.canal);

        System.out.println("O canal atual da TV é: " + minhaTV.canal);
        minhaTV.diminuirCanalTV();
        System.out.println("O canal atual da TV é: " + minhaTV.canal);

        System.out.println("O canal atual da TV é: " + minhaTV.canal);
        minhaTV.buscarCanalTV(10);
        System.out.println("O canal atual da TV é: " + minhaTV.canal);
    }

    public static class smartTV {
        boolean estadoTV = false;
        int canal = 0;
        int volume = 0;

        public void powerTV() {
            estadoTV = !estadoTV;
        }

        public void aumentarVolumeTV() {
            volume++;
        }

        public void diminuirVolumeTV() {
            volume--;
        }

        public void aumentarCanalTV() {
            canal++;
        }

        public void diminuirCanalTV() {
            canal--;
        }

        public void buscarCanalTV(int numeroCanal) {
            canal = numeroCanal;
        }
    }
}
