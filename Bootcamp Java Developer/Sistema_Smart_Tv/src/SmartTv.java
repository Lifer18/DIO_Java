import java.util.Scanner;

public class SmartTv {
    private boolean ligada;
    private int canal;
    private int volume;

    public SmartTv(boolean ligada, int canal, int volume){
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }
    
    public boolean getLigada() {
        return this.ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void imprimirLigada(){
        String tv;
        if(ligada==true){
            tv = "Ligada";
        }
        else{
            tv = "Desligada";
        }

        System.out.println("A TV está: "+tv);
    }

    public void imprimirVolume(){
        System.out.println("Volume atual: "+volume);
    }

    public void imprimirCanal(){
        System.out.println("Canal atual: "+canal);
    }

    public void aumentarVolume(){
        volume++;
    }
    
    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        if(canal < 100){
            canal++;
        }
        else{
            canal=1;
        }
    }
    
    public void diminuirCanal(){
        if(canal>0){
            canal--;
        }
        else{
            canal=99;
        }
    }

    public void alterarCanal(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o canal: ");
        canal = sc.nextInt();
        
        if(canal>100){
            canal = 99;
        }

        else if (canal < 0){
            canal = 1;
        }
    }

    public void power(){
        if(ligada==true){
            ligada=false;
        }
        else{
            ligada=true;
        }
    }
}
