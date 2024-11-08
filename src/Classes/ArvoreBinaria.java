package Classes;

public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(long id) {
        raiz = inserir(raiz, id);
    }

    private No inserir(No no, long id) {
        if (no == null) {
            return new No(id, null, null);
        }

        if (id < no.getId()) {
            no.setEsq(inserir(no.getEsq(), id));
        } else if (id > no.getId()) {
            no.setDir(inserir(no.getDir(), id));
        }
        return no;
    }

    public void imprimirArvore() {
        imprimirArvore(raiz, 0);
    }

    private void imprimirArvore(No no, int nivel) {
        if (no == null) {
            System.out.println(" ".repeat(nivel * 4) + "-");
            return;
        }

        System.out.println(" ".repeat(nivel * 4) + no.getId());

        imprimirArvore(no.getEsq(), nivel + 1);
        imprimirArvore(no.getDir(), nivel + 1);
    }

    public int contarNosDaEsquerdaFestiva() {
        return contarNosDaEsquerdaFestiva(raiz, false);
    }

    private int contarNosDaEsquerdaFestiva(No no, boolean eFilhoEsquerdo) {
        if (no == null) {
            return 0;
        }

        int count = eFilhoEsquerdo ? 1 : 0;

        count += contarNosDaEsquerdaFestiva(no.getEsq(), true);
        count += contarNosDaEsquerdaFestiva(no.getDir(), false);

        return count;
    }
}

