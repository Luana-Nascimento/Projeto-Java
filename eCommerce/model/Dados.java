package eCommerce.model;

import java.time.LocalDate;

public class Dados {
	
	private String nomeAluno;
	private String cpf;
	private LocalDate dataNascimento;
	private String email;
	private String contato;
	private String metodoPagamento;
	private LocalDate dataPagamento;
	
	public Dados(String nomeAluno, String cpf, LocalDate dataNascimento, String email, String contato, String metodoPagamento, LocalDate dataPagamento) {
		this.nomeAluno = nomeAluno;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.contato = contato;
		this.metodoPagamento = metodoPagamento;
		this.dataPagamento = dataPagamento;
	
	}

	public Dados(String string, String string5, String string2, String string6, String string3, String string4) {
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

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
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
		System.out.println("Método de Pagamento: " + this.metodoPagamento);
		System.out.println("Data de Pagamento: " + this.dataPagamento);
		
	}
}
