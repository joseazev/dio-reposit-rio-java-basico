/**
 * <h1>Classe SmartTV</h1><p>Classe criada para estudo onde aglutina algumas dos metodos usados para usar uma televisão.</p><p>Ao ser iniciada a classe cria como default</p>
 * 1- Ligada = false<br>2- canal  = 2<br>3- volume =12
 * @since   27/12/2022
 * @author  José Francisco Azevedo da Silva
 * @version 1.0 
 */

public class SmartTv {
    private boolean ligada;
    private int     canal;
    private int     volume;


    /** 
     * <h2>Metodo de criação</h2> 
     */
    public SmartTv(){
        this.ligada = false;
        this.canal = 2;
        this.volume = 12;
    }

    /** 
     * Metodo para ligar a televisão, o metodo modifica o atributo boolean ligada para true 
     * 
     */
    public void ligarTv() {
        this.ligada = true;
    }

    /**
     * Metodo para desligar a televisão, o metodo modifica o atributo boolean ligada para false 
     */
    public void desligarTv() {
        this.ligada = false;
    }

    /**
     * Metodo para trazer o status se a televisão ligada ou desligadas
     * @return boolean
     */
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

    /**
     * <h2>trocaCanal</h2>
     * <p>Metodo para trocar de canal diretamente pelo usuário. 
     * Simula teclas numericas do controle remoto</p><p>recebe o valor do canal a ser trocado</p>
     * @param canal
     */
    public void trocarCanal(int canal) {
        this.canal = canal;
        mostraCanal();
    }

    public void mostraCanal(){
        System.out.println(this.canal);
    }

    /**<p>Almenta o canal de um por um</p>
     * <p>O maior canal de televisão 13 quando atinge um canal acima de 13 volta para o 
     *    canal 2</p>
     */
    public void aumetarCanal(){
        this.canal++;
        if (this.canal > 13){
            this.trocarCanal(2);
        }
        mostraCanal();
       
    }

    /** */
    public void diminiuirCanal(){
        this.canal--;
        if (this.canal < 2){
            this.trocarCanal(13);
        }
        mostraCanal();
    }
}
