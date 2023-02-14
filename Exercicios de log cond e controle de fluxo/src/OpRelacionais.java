public class OpRelacionais {
    public static void main(String[] args) throws Exception {
        int i1 = 10;
        int i2 = 20;

        float f1 = 4.5f;
        float f2 = 3.5f;

        char c1 = 'x';
        char c2 = 'y';

        String s1 = "Fulano";
        String s2 = "Fulano";

        boolean b1 = true;
        boolean b2 = false;

        long l1 =1597L;
        long l2 =8997L;
        byte y1 =1;
        short h1 =25;

        System.out.println("i1 == i2"+ (i1 == i2));
        System.out.println("i1 != i2"+ (i1 != i2));
        System.out.println("i1 > i2"+ (i1 > i2));
        System.out.println("i1 < i2"+ (i1 < i2));

        System.out.println("f1 == f2"+ (f1 == f2));
        System.out.println("f1 != f2"+ (f1 != f2));
        System.out.println("f1 > f2"+ (f1 > f2));
        System.out.println("f1 < f2"+ (f1 < f2));

        //em baixo nivel o char acaba sendo um valor numerico, então é possivel comparar maior e menor
        System.out.println("c1 == c2"+ (c1 == c2));
        System.out.println("c1 != c2"+ (c1 != c2));
        System.out.println("c1 > c2"+ (c1 > c2));
        System.out.println("c1 < c2"+ (c1 < c2));
        
        
        System.out.println("s1 == s2"+ (s1 == s2));
        System.out.println("s1 != s2"+ (s1 != s2));
       // é possivel comparar tipos diferentess mas com mesma estrutura, numero com numero string com char
       //porem o visual code nem deixa o codigo rodar
        //System.out.println("s1 == c1"+ (s1 == c1));
      //  System.out.println("d1 == h2"+ (d1 == h2));
        



    }
}
