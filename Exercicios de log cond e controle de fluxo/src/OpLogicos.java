public class OpLogicos {
    public static void main(String[] args) {
        double salario1 = 150.5;
        double salario2 = 80.5;
        double salarioMinimo = 100;
        int dependentes1 = 5;
        int dependentes2 = 3;

        if ((salario1 < salarioMinimo) && (dependentes1 > 4)) {
            System.out.println("situação 1 recebe beneficio");
        } else {
            if ((salario2 < salarioMinimo) && (dependentes2 > 4)) {
                System.out.println("situação  2 recebe beneficio");
            } else {
                System.out.println("teste && não recebe beneficio");
            }
        }

        if ((salario1 < salarioMinimo) || (dependentes1 > 4)) {
            System.out.println("situação 3 recebe beneficio");
        } else {
            if ((salario2 < salarioMinimo) || (dependentes2 > 4)) {
                System.out.println("situação 4 recebe beneficio");
            } else {
                System.out.println("teste || não recebe beneficio");
            }
        }
    }

}
