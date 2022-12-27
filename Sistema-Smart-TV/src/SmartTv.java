public class SmartTv {
    private boolean ligada;
    private int     canal;
    private int     volume;

    public SmartTv(){
        this.ligada = false;
        this.canal = 2;
        this.volume = 12;
    }

    public void ligarTv() {
        this.ligada = true;
    }

    public void desligarTv() {
        this.ligada = false;
    }

    public boolean getLigada(){
        return this.ligada;
    }

    public void aumetarVolume(){
        this.volume++;
        System.out.println(this.volume);
    }

    public void diminirVolume(){
        this.volume--;
        System.out.println(this.volume);
    }

    public void trocarCanal(int canal) {
        this.canal = canal;
        mostraCanal();
    }

    public void mostraCanal(){
        System.out.println(this.canal);
    }

    public void aumetarCanal(){
        this.canal++;
        if (this.canal > 13){
            this.trocarCanal(2);
        }
        mostraCanal();
       
    }

    public void diminiuirCanal(){
        this.canal--;
        if (this.canal < 2){
            this.trocarCanal(13);
        }
        mostraCanal();
    }
}
