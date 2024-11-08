import Classes.ArvoreBinaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(555);
        arvore.inserir(333);
        arvore.inserir(111);
        arvore.inserir(444);
        arvore.inserir(888);
        arvore.inserir(999);

        arvore.imprimirArvore();

        arvore.inserir(400);
        arvore.inserir(410);
        arvore.inserir(800);
        arvore.inserir(700);
        arvore.inserir(810);
        arvore.inserir(1000);

        arvore.imprimirArvore();

        System.out.println("Nós da esquerda festiva: " + arvore.contarNosDaEsquerdaFestiva());

    }
}