public class Usuário {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Status da TV: " + smartTv.getLigada());

        smartTv.ligarTv();

        System.out.println("Status da TV: " + smartTv.getLigada());
        smartTv.aumetarVolume();
        smartTv.aumetarVolume();
        smartTv.aumetarVolume();
        smartTv.aumetarVolume();
        smartTv.diminirVolume();

        smartTv.diminiuirCanal();
        smartTv.diminiuirCanal();

        smartTv.trocarCanal(6);

        smartTv.desligarTv();

        System.out.println("Status da TV: " + smartTv.getLigada());
    }
}
