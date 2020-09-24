import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArvoreApp {

    public static int SUM = 0;

    public static void main(String args[]) {

        // Para testar o exercício 6
//        Scanner teclado = new Scanner(System.in);
//        ArvoreAVL arvore = new ArvoreAVL(new Elemento(teclado.nextInt()));
//        arvore.calcularBalanceamento();
//        arvore = arvore.verificaBalanceamento();
//        System.out.println(arvore.printArvore(0));
//        for (int i = 0; i < 8; i++) {
//            arvore = arvore.inserir(new Elemento(teclado.nextInt()));
//            arvore.calcularBalanceamento();
//            arvore = arvore.verificaBalanceamento();
//            System.out.println(arvore.printArvore(0));
//        }
//        System.out.println(arvore.consultaIntervalar(12, 0, 10000));


        // Para testar o exercício 7
//        List<Elemento> elementos = new ArrayList<>();
//
//        Scanner teclado = new Scanner(System.in);
//        ArvoreAVL arvore = new ArvoreAVL(new Elemento(teclado.nextInt()));
//        arvore.calcularBalanceamento();
//        arvore = arvore.verificaBalanceamento();
//        System.out.println(arvore.printArvore(0));
//        for (int i = 0; i < 4; i++) {
//            arvore = arvore.inserir(new Elemento(teclado.nextInt()));
//            arvore.calcularBalanceamento();
//            arvore = arvore.verificaBalanceamento();
//            System.out.println(arvore.printArvore(0));
//        }
//
//        System.out.println(arvore.printArvore(0));
//
//        arvore.adicionarNaListaEmOrdem(elementos);
//
//        System.out.println("Imprimindo elementos da lista: ");
//        elementos.forEach(elemento -> {
//            System.out.print(elemento.getValor() + "  ");
//        });
//
//        System.out.println("\n");
//
//        System.out.println("Imprimindo elementos da AVL: ");
//        arvore.imprimirInOrdem();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 5 números");
        ArvoreAVL arvore = new ArvoreAVL(new Elemento(teclado.nextInt()));
        arvore.calcularBalanceamento();
        arvore = arvore.verificaBalanceamento();
        for (int i = 0; i < 4; i++) {
            arvore = arvore.inserir(new Elemento(teclado.nextInt()));
            arvore.calcularBalanceamento();
            arvore = arvore.verificaBalanceamento();
        }
        arvore.calcularElementosComUmFilho();
        System.out.println("Número de elementos com um filho apenas: " + ArvoreApp.SUM);
    }
}
