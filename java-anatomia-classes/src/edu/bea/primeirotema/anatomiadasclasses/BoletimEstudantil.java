package edu.bea.primeirotema.anatomiadasclasses;

//aulas 04 e 05
//aula 05 sobre como criar packages de forma geral e como criar no vs code especificamente
//no VSCode devemos criar cada nivel de pasta sendo uma pasta dentro da outra
//EX: pasta edu>bea>primeirotema>anatomiadasclasses
//aula 06 é sobre nomeclatura de metodos, que devem ser verbos no infinitivoe apartir de duas palavras usar kamelCase ex: somarValores

public class BoletimEstudantil {
    public static void main(String[] args) {
        //aula sobre identação e leitura do codigo
        int mediaFinal = 6;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("RECUPERAÇAO");
        else
            System.out.println("APROVADO");

    }
}
