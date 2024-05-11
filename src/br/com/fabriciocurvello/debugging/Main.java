package br.com.fabriciocurvello.debugging;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciou o programa no método main()");
        metodoA();
        System.out.println("Finalizou o programa no método main()");
    }

    public static void metodoA() {
        System.out.println("Entrou no metodoA()");
        metodoB();
        System.out.println("Finalizou o metodoA()");
    }

    public static void metodoB() {
        System.out.println("Entrou no metodoB()");
        for(int cont = 1; cont <= 4; cont++ ) {
            System.out.println( cont );
        }
        metodoC();
        System.out.println("Finalizou o metodoB()");
    }

    public static void metodoC() {
        System.out.println("Entrou no metodoC()");
        //Thread.dumpStack();
        System.out.println("Finalizou o metodoC()");
    }
}