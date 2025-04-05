public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = true;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    
}
