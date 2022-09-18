package br.com.curso;
import java.util.Scanner;
public class CursoJava {

	public static void main(String[]args){
	     System.out.println("=============== Testando Java  =======================");
	     @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	     String n1,n2;
	     System.out.print("Digite o seu nome:  ");
	     n1=sc.nextLine();
	     System.out.print("Digite o seu segundo nome: ");
	     n2=sc.nextLine();
	     System.out.println("O seu primeiro e segundo nome é: "+n1+" "+n2);
	     System.out.println();
	     System.out.println(" * Primeiro programa em Java :) ");
	     System.out.println(" * Ola mundo !!!!!!!!! ");
	     System.out.println("=============== FIM =============================");
	
	}
}
