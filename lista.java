public class lista {
    private no primeiro;

    //construtor
    public lista() {
        primeiro = null;
    }

    public no getPrimeiro() {
        return primeiro;
    }

    //ta vasilha
    public boolean estaVazia() {

        //return primeiro == null;

        if (primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    //coloca primeiro
    public void inserePrimeiro(int valor) {
        no no1 = new no(valor);
        no1.setProximo(primeiro);
        primeiro = no1;
    }

    //mostrar a cabulosa lista
    public void mostrar() {
        if (estaVazia()) {
            System.out.println("O SEU ENERGUMENO, A LISTA TA VAZIA, MALDITO");
        } else {
            no cursor = primeiro;
            while (cursor != null) {
                System.out.println(cursor.getInfo());
                cursor = cursor.getProximo();
            }
        }

    }

    //colocar no ultimo:
    public void insereUltimo(int valor) {
        if (estaVazia()) {
            inserePrimeiro(valor);
        } else {
            no cursor = primeiro;
            while (cursor.getProximo() != null) {
                cursor = cursor.getProximo();
            }
            no no1 = new no(valor);
            cursor.setProximo(no1);
        }
    }

    //metodo de remoçao2

    public boolean removePrimeiro() {

        if (estaVazia()) {
            System.out.println("lista ta vazia, quer remover oq?");
            return false;
        } else {
            no cursor = primeiro;
            primeiro = primeiro.getProximo();
            return true;
        }

    }

    //remove ultimo
    public boolean removeUltimo() {
        if (estaVazia()) {
            System.out.println("Lista vazia: " + false);
            return false;
        } else {
            no cursor = primeiro;
            no anterior = null;

            while (cursor.getProximo() != null) {
                anterior = cursor;
                cursor = cursor.getProximo();
            }

            if (anterior == null) {
                primeiro = null;
            } else {
                anterior.setProximo(null);
            }

            System.out.println("Último nó removido: " + true);
            return true;
        }
    }
    public String buscar(int valor) {
        int index = 0;
        no cursor = primeiro;
        while (cursor != null) {
            if (cursor.getInfo() == valor) {
                return "Valor encontrado no nó " + index;
            }
            index++;
            cursor = cursor.getProximo();
        }
        return "Não encontrou. Ele executou " + index + " passos";
    }
}