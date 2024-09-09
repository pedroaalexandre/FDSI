import java.util.Scanner;

public class TesteMaster {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Quem é o seu amigo mais bonito?");
        System.out.println("Opção 1: Pedro");
        System.out.println("Opção 2: Arthur");
        System.out.println("Opção 3: Fernandinho");
        int opcao = s.nextInt();
        if(opcao == 1) {
            System.out.println("Opção certa!");

        }else if(opcao == 2){
            System.out.println("Opção errada...");

        }else if (opcao == 3){
            System.out.println("Então você prefere o Fernandinho?");

        }else{
            System.out.println("Não existe essa opção, tente novamente.");
        }
    }
}
