public class ControleDeFluxo {
    public static void main(String[] args) {
        /*
         * nessa primeira parte sera trabalhado apenas estrutura de decisão (if,if else,
         * switch)
         * switch é para valores exatos e if, para comparaçoes booleanas do tipo com
         * operadores logico &&, ||, nao
         * evite muito if's alinhados. se for o caso faça pqnos ifs e coloque os
         * resultados dentro de uma variavel.
         */
        String diaSemana = "terça";
        int mes = 11;
        int ferias = 0;

        // ex 01 dias da semana com swich
        switch (diaSemana) {
            case "segunda":
                System.out.println("2º");
                break;
            case "terça":
                System.out.println("3º");
                break;
            case "quarta":
                System.out.println("4º");
                break;
            case "quinta":
                System.out.println("5º");
                break;
            case "sexta":
                System.out.println("6º");
                break;
            case "sabado":
                System.out.println("Inicio do fim de semana");
                break;
            case "domingo":
                System.out.println("final do fim de semana");
                break;
            default:
                System.out.println("dia incorreto");
                break;
        }
        ;

        if (mes > 0 && mes <= 12) {
            ferias = mes;
            switch (ferias) {
                case 1:
                case 6:
                case 12:
                    System.out.println("Aproveite suas ferias");
                    break;
                default:
                    System.out.println("vamos la que as ferias vem.");
                    break;

            };
        } else {
            System.out.println("mes incorreto");
        };

    }

}
