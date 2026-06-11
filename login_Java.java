package sintema_de_Login;

import java.util.Scanner;

public class login_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loginCorreto = 1234;
        int senhaCorreta = 5678;

        System.out.println("Digite o login:");
        int loginDigitado = sc.nextInt();
        System.out.println("Digite a senha:");
        int senhaDigitada = sc.nextInt();

        if (loginDigitado == loginCorreto && senhaDigitada == senhaCorreta) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Login ou senha incorretos. Tente novamente.");
        }

        sc.close();

    }

}
