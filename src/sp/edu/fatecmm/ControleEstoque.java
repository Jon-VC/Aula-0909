package sp.edu.fatecmm;

import java.util.Scanner;

public class ControleEstoque {

    public static void main(String[] args) {
        int select = 9;
            while (select != 0){
                System.out.println("Selecione a operação: ");
                System.out.println("1 - Cadastrar");
                System.out.println("2 - Consultar");
                System.out.println("3 - Retirar");
                System.out.println("4 - Depositar");
                System.out.println("0 - Sair");
                System.out.println("Digite: ");
                Scanner nextInteger = new Scanner(System.in);
                select = nextInteger.nextInt();
                switch (select){
                    case 1:
                        ControleEstoque.execCadastrar();
                        break;
                    case 2:
                        ControleEstoque.execConsultar();
                        break;
                    case 3:
                        ControleEstoque.execSair();
                        break;
                    case 4:
                        ControleEstoque.execEntrar();
                        break;
                }
            }
        }
    private static void execConsultar() {
        e.imprimir();
    }

    static Estoque e = new Estoque();
    private static void execCadastrar() {
        System.out.println("Digitar nome: ");
        Scanner nome = new Scanner(System.in);
        e.nome = nome.nextLine();
        System.out.println("Digitar codigo: ");
        Scanner agen = new Scanner(System.in);
        e.codigo = agen.nextLine();
        System.out.println("Digitar quantidade: ");
        Scanner sal = new Scanner(System.in);
        e.quantidade = Integer.parseInt(sal.nextLine());
    }

    public static void execSair(){
        int valor;
        System.out.println("Quantidade de saida: ");
        Scanner val = new Scanner(System.in);
        valor = val.nextInt();
        e.sair(valor);
    }

    public static void execEntrar(){
        System.out.println("Quantidade de entrada: ");
        Scanner val = new Scanner(System.in);
        int valor = val.nextInt();
        e.depositar(valor);
    }
}
