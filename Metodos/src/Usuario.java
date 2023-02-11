public class Usuario {
    public static void main(String[] args) throws Exception {
      
        SmartTv smartTv = new SmartTv();

        System.out.println("a tv esta Ligada? : " + smartTv.ligada);
        System.out.println("o canal inicial : "+smartTv.canal);
        System.out.println("o volume atual é: "+smartTv.volume);

        smartTv.Ligar();
        System.out.println("Agora ela esta ligada?:"+ smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("o volume atual é: "+smartTv.volume);
        
        smartTv.diminuirVolume();
        System.out.println("o volume atual é: "+smartTv.volume);
    }
}
