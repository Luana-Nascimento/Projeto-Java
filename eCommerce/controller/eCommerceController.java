package eCommerce.controller;

import java.util.ArrayList;
import eCommerce.model.Dados;
import eCommerce.repository.eCommerceRepository;

public class eCommerceController implements eCommerceRepository {
	
	private ArrayList<Dados> listaAlunos = new ArrayList<Dados>();

	@Override
	public void procurarPorNome(String nomeAluno) {
		var aluno = buscarNaCollection(nomeAluno); 
		
		if (aluno != null)
			aluno.visualizarCadastro(); 
		else 
			System.out.println("\nO cadastro de " + nomeAluno + " não foi encontrado!");	
	}

	@Override
	public void listarTodos() {
		for (var aluno :listaAlunos) {
			aluno.visualizarCadastro(); 
		}
		
	}

	@Override
	public void cadastrar(Dados aluno) {
		var buscaNome = buscarNaCollection(aluno.getNomeAluno());
		if(buscaNome == null) {
			listaAlunos.add(aluno);
			System.out.println("O cadastro do aluno(a) " + aluno.getNomeAluno() + " foi realizado com sucesso!");
		}else 
			System.out.println("O cadastro do aluno(a) " + aluno.getNomeAluno() + " já existe!");
			
		}

	@Override
	public void atualizar(Dados alunoAtualizado) {
		var buscaAluno = buscarNaCollection(alunoAtualizado.getNomeAluno());
		
		
		if (buscaAluno != null) {
	        buscaAluno.setCpf(alunoAtualizado.getCpf());
	        buscaAluno.setDataNascimento(alunoAtualizado.getDataNascimento());
	        buscaAluno.setEmail(alunoAtualizado.getEmail());
	        buscaAluno.setContato(alunoAtualizado.getContato());
	        System.out.println("O cadastro do aluno(a) " + buscaAluno.getNomeAluno() + " foi atualizado com sucesso!");
	    } else {
	        System.out.println("O cadastro do aluno(a) " + alunoAtualizado.getNomeAluno() + " não foi encontrado!");
	    }
	}

	@Override
	public void deletar(String nomeAluno) {
		var buscaAluno = buscarNaCollection(nomeAluno);
		if(buscaAluno != null) {
			if (listaAlunos.remove(buscaAluno))
				System.out.println("\nO cadastro do aluno(a) " + nomeAluno + " foi deletado com sucesso!");
			} else {
            System.out.println("\nFalha ao deletar o cadastro do aluno(a),  " + nomeAluno + " cadastro não foi encontrado!");
  }	
	}
	
	public Dados buscarNaCollection(String nomeAluno) {
		for (Dados aluno : listaAlunos) {
			if (aluno.getNomeAluno().equals(nomeAluno)) {
				return aluno;
			}
		}
		return null; 
	}

	
}
