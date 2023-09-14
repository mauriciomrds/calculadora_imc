package curso.java.adcio.arquivos;

import java.util.Date;

public class Pessoa {
	
	private String cpf;
	private String nome;
	
	private String sobrenome;
	
	private int idade;
	
	private String dataNascimento;
	
	private Date dataCadastros;

	public Date getDataCadastros() {
		return dataCadastros;
	}

	public String getCpf(String string) {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDataCadastros(Date dataCadastros) {
		this.dataCadastros = dataCadastros;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
		
		
	}

		
	}
	

