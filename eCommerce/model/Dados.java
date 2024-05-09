package eCommerce.model;

import java.time.LocalDate;

public class Dados {
	
	private String nomeAluno;
	private String cpf;
	private LocalDate dataNascimento;
	private String email;
	private String contato;
	
	public Dados(String nomeAluno, String cpf, LocalDate dataNascimento, String email, String contato) {
		this.nomeAluno = nomeAluno;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.contato = contato;
	
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public void visualizarCadastro() {
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Aluno:");
		System.out.println("***********************************************************");
		System.out.println("Nome: " + this.nomeAluno);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("E-mail: " + this.email);
		System.out.println("Contato: " + this.contato);
		
	}
}
