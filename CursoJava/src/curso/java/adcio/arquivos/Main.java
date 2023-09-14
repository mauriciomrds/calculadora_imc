package curso.java.adcio.arquivos;
import java.util.Scanner;
import java.util.Date;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		String cpf;

		System.out.print("Digite o seu Cpf: ");
		cpf=sc.nextLine();
		
		if(cpf.equals("11111111115")) { 
			System.out.println("cpf, ok!");
		}else {
			System.out.println("cpf incorreto!");
			System.exit(0);
		}
	
			
		pessoa.setCpf("11111111115");
		pessoa.setNome("Mauricio");
		pessoa.setSobrenome("R d S");
		pessoa.setIdade(39);
		pessoa.setDataNascimento("27/05/1984");
		pessoa.setDataCadastros(new Date());
		
		
		
		 System.out.println("Nome: " + pessoa.getNome()+" "
		 		+ "Sobrenome: " +pessoa.getSobrenome()+" "
				 + "Idade: "	 + pessoa.getIdade()+" "
		 		+"DataNascimento: "	+ pessoa.getDataNascimento()+" "
				 +"DataCadastros: " + pessoa.getDataCadastros()+" "
		          +"Cpf: " + pessoa.getCpf(""));
		
	     }

			
	}
	

