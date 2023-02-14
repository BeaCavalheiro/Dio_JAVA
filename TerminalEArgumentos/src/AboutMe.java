public class AboutMe {
    /* A baixo quando o metodo é inicado com void diz que nao sera retornado nada
     * ja o String[]args, diz que dentro do metodo pode e provavelmente vira um array de argumentos
     * quando damos as variaveis uma numeração de args, dizemos a posição delas no array
     * e dessa forma ao abrir em um terminal externo, devemos apenas passar o caminho da classe na pasta bim e depois do nome da classe dar espaço e colocar cada um dos args com espaço entre eles
     * ex: D:\Documentos\estudando\dio\Dio_Java\TerminalEArgumentos\bin>java AboutMe beatriz cavalheiro 30 1.58
     */
    public static void main(String[] args) {
        
        String nome= args [0];
        String sobreNome = args [1];
        int idade = Integer.valueOf(args [2]);
        double altura = Double.valueOf(args [3]);

        System.out.println("ola, me chamo "+ nome +" "+ sobreNome);
        System.out.println("tenho "+ idade +" anos");
        System.out.println("minha altura é  "+ altura +" cm ");
        

    }
}
