package avaliacao.resposta;

public class BinaryTreeMetdos {

	public int SomaTodosAnteriores( BinaryTree no ){
		int soma = 0;
		BinaryTree noAtual = no; 
		while (noAtual != null){
			soma = soma + noAtual.valor;
			noAtual = noAtual.left;
		}
		return soma;
	}

}
