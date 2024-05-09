package eCommerce.repository;

import eCommerce.model.Dados;

public interface eCommerceRepository {
	
		public void procurarPorNome(String nomeAluno);
		public void listarTodos();
		public void cadastrar(Dados dados);
		public void atualizar(Dados dados);
		public void deletar(String nomeAluno);
	

}