public class SmartTv{
    boolean ligada =false;
    int canal=1;
    int volume= 20;

    public void Ligar(){
        ligada =true;
    }
    public void Desligar(){
       ligada =false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }
}
