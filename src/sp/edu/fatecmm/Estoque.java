package sp.edu.fatecmm;

public class Estoque {
    public static String nome;
    public static String codigo;
    public static int quantidade;

    public void sair(int valor){
        if(valor <= quantidade){
            quantidade = quantidade - valor;
            System.out.println("Saida realizada com sucesso!");
            return;
        }else{
            System.out.println("Quantidade insuficiente!");
            return;}
    }

    public void depositar(int valor){
        quantidade = quantidade + valor;
        return;
    }

    public static void imprimir(){
        System.out.println("Produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Agencia: " + quantidade);
    }
}
