public class SmartTv {
    boolean ligada;
    int     canal;
    int     volume;

    public SmartTv(){
        this.ligada = false;
        this.canal = 2;
        this.volume = 12;
    }

    public void ligaTv() {
        this.ligada = true;
    }

    public void desligaTv() {
        this.ligada = false;
    }
}
