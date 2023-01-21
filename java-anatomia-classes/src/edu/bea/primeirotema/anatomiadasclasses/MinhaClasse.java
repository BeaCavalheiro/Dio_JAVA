package edu.bea.primeirotema.anatomiadasclasses;
//aulas 01,02,03
public class MinhaClasse {

    public static void main(String[] args) {
        // variavel tem tipo+nome+valor*(valor não é obrigatorio)
        // nome de variaveis podem ser iniciados com letras(maiusculas se for uma final,
        // kamelCase se for var.)

        String nome = "beatriz";
        final String SOBRE_NOME = "souza cavalheiro"; // usar o termo final ou o nome da classe todo em maiuscula defini
                                                      // que é uma variavel imutavel
        int _idade = 29;
        String $sexo = "feminino";
        final String NOME_COMPLETO = nomeCompleto(nome, SOBRE_NOME);

        System.out.println(NOME_COMPLETO);
        System.out.println("Tem "+_idade+" anos, e é do sexo "+$sexo);
    }

    // diferente do static void que nao retorna nada, apenas executa, metodos de
    // retorno nao tem void e exigen um return
    public static String nomeCompleto(String nome, String SOBRE_NOME) {
        // metodo concat, é o mesmo que concatenar coisas
        return nome.concat(" ").concat(SOBRE_NOME);
    }

}