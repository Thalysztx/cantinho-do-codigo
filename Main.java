import java.sql.SQLOutput;

public class Main{

    public static void main(String[] args){


        lista lista = new lista();
        System.out.println(lista.estaVazia());
        lista.inserePrimeiro(100);
        lista.inserePrimeiro(20);
        lista.insereUltimo(300);

        lista.mostrar();
        System.out.println("Escolhido foi O: " + lista.getPrimeiro().getProximo().getInfo());
        System.out.println("Busquei o: " + lista.buscar(20));
        lista.mostrar();
        lista.removeUltimo();
        lista.mostrar();
    }
}