package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args)
    {
        /* HELLO WORLD
        System.out.println("Hello world");
        /*

        /* DATOVE TYPY
        int celeCislo = 5;
        long celeCisloVacsie = 5L
        float desatinneSinglePrecision = 5.5f;
        double desatinneDoublePrecision = 5.5;
        char znak = 'a';
        String retazec = "a";*/

        /* DATOVE TYPY - operacie
        int podiel = 2/3; // 0
        System.out.println(podiel);

        int poDeleni = 2%3; // 2
        System.out.println(poDeleni);

        float podielDesatinny = 2/3.0f; // 2
        System.out.println(podielDesatinny);*/

        /* BOOLEAN
        boolean pravda = true;
        boolean nepravda = false;*/

        /*IF ELSE
        if (2 > 1)
            System.out.println("Hello");
        else {
            if (true) {
                System.out.println("else");
            }
        }*/

        /* SWITCH
        int a = 5;

        for (int a = 0; a < 6; a++) {
            switch (a) {
                case 1:
                    System.out.println("a je jedna");
                    break;
                case 2:
                    System.out.println("a je dva");
                    break;
                case 3:
                case 4:
                    System.out.println("a je 3 alebo 4");
                    break;
                default:
                    System.out.println(String.format("a je %d", a));
            }
        }*/
        /* WHILE A WHILE DO
        int a = 0;
        while ( a < 6){
            System.out.println("fake for a = " + a);
            a++;
        }
        System.out.println();
        int b = 0;
        do {
            b++;
            System.out.println("fake for b = " + b);
        } while (b < 6);*/
        //System.out.println("5 + 7 je" + scitaj(5,7));

        /* POLE
        System.out.println("Dĺžka: " + args.length);
        for (int i=0; i < args.length; i++){
            System.out.println(args[i]);
        }*/

        /* POLIA - operacie
        int[] mojePole = new int[10];
        for (int i = 0; i < mojePole.length; i++){
            if (i == 0){
                mojePole[i] = 1;
                continue;
            }

            mojePole[i] = mojePole[i - 1] * 2;

        }

        for (int i = 0; i < mojePole.length; i++){
            System.out.println(i + " : " + mojePole[i]);
        }*/


    }
    /* FUNKCIA
    public static int scitaj(int a, int b){
        return a + b;
    }*/
}
