public class TiposEVariaveis {
    public static void main(String[] args) throws Exception {
        // as 4 aulas são mais explicativas expositivas, do que realmente praticaveis 
       
        //Aula 03
        // Para usar long (]l]0e float é preciso especificar:
        long numLongo = 2568952357L;
        float numComVirgula=256.3F;

        //para que o numero curto 2 aceite ser o numero inteiro é preciso "aceitar" e arcar com possiveis erros, a forma de fazer isso é usar o " (short) "
        short numCurto=1;
        int numNormal=numCurto;
        short numCurto2 = (short)numNormal;
        
        //Aula 04 Constante, como dito antes para criar uma constante usar "final" antes do tipo da variavel e nome em maiusculo:
        final String CONSTANTE_IMUTAVEL="essa variavel nao pode mudar";
        
        
    }
}
