import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int escolhaUsuario;
        int idadeUsuario;
        int opcaoComputador;
        int tentativaUsuario;
        int jogarNovamente = 0;

        System.out.println("Olá, qual seu nome?");
        String nome = scan.nextLine();
        System.out.println("Muito prazer " + nome + ", vamos jogar um jogo? Eu escolho um número e você tenta adivinhar OK?");
        System.out.println("> 1 para SIM\n> 0 para NÃO");
        escolhaUsuario = scan.nextInt();
        do {
            if (escolhaUsuario == 1) {
                System.out.println("Ótimo! Então vamos lá, mas antes me diga a sua idade:");
                idadeUsuario = scan.nextInt();
                if (idadeUsuario >= 18) {
                    System.out.println("""
                            Muito bem então, já que é maior de idade não irei pegar leve com você.
                            Já fiz a minha escolha, tente adivinhar é um número entre 0 e 100.""");
                    opcaoComputador = gerador.nextInt(101);
                    System.out.println("Agora é com você, tente advinhar:");
                    //System.out.println(opcaoComputador);
                    tentativaUsuario = scan.nextInt();
                    if (tentativaUsuario == opcaoComputador) {
                        System.out.println("Meus parabéns, você acertou!");
                        System.out.println("Você quer jogar novamente?\n> 1 para SIM\n> 0 para NÃO");
                        jogarNovamente = scan.nextInt();
                        if (jogarNovamente == 0) {
                            System.out.println("Que pena, fica para a próxima!");
                        }
                    }
                    while (tentativaUsuario != opcaoComputador) {
                        System.out.println("Tente novamente:");
                        tentativaUsuario = scan.nextInt();
                        if (tentativaUsuario == opcaoComputador) {
                            System.out.println("Meus parabéns, você acertou!");
                            System.out.println("Você quer jogar novamente?\n> 1 para SIM\n> 0 para NÃO");
                            jogarNovamente = scan.nextInt();
                            if (jogarNovamente == 0){
                                System.out.println("Que pena, fica para a próxima!");
                            }
                        } else if (tentativaUsuario > opcaoComputador) {
                            System.out.println("Um pouco menor...");
                        } else {
                            System.out.println("Um pouco maior...");
                        }
                    }
                } else {
                    System.out.println("""
                            Muito bem então, já que é menor de idade vou facilitar para você.
                            Já fiz a minha escolha, tente adivinhar é um número entre 0 e 20.""");
                    opcaoComputador = gerador.nextInt(21);
                    System.out.println("Agora é com você, tente advinhar:");
                    //System.out.println(opcaoComputador);
                    tentativaUsuario = scan.nextInt();
                    }
                    while (tentativaUsuario != opcaoComputador) {
                        System.out.println("Tente novamente:");
                        tentativaUsuario = scan.nextInt();
                        if (tentativaUsuario == opcaoComputador) {
                            System.out.println("Meus parabéns, você acertou!");
                            System.out.println("Você quer jogar novamente?\n> 1 para SIM\n> 0 para NÃO");
                            jogarNovamente = scan.nextInt();
                                if (jogarNovamente == 0){
                                System.out.println("Que pena, fica para a próxima!");
                            }
                        } else if (tentativaUsuario > opcaoComputador) {
                            System.out.println("Um pouco menor...");
                        } else {
                            System.out.println("Um pouco maior...");
                        }
                    }

            } else {
                System.out.println("Que pena, fica para a próxima!");
            }
        } while (jogarNovamente == 1);
    }
}