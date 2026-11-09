import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class ABB<K, V> implements IMapeamento<K, V>{

	// atributos
	private long comparacoes;
	private long inicio;
	private long termino;
	
	/**
	 * Construtor da classe.
	 * @param comparador o comparador a ser utilizado para organizar os elementos da árvore.  
	 */
	public ABB(Comparator<K> comparador) {

	}
	
	@Override
	public long getComparacoes() {
		return comparacoes;
	}

	@Override
	public double getTempo() {
		return (termino - inicio) / 1_000_000;
	}

	public Lista<V> recortar(K chaveInicio, K chaveFinal){
		Lista<V> lista = new Lista<>();

		recortar(raiz, cgabveInicio, chaveInicio, lista);

		return lista;
	}

	private void recortar(No<v> no, K chaveInicio, K chaveFinal, Lista<V> lista){
		if(no.getChave().compareTo(ChaveInicio) > 0){
			recortar(no.getEsquerda(), chaveInicio, chaveFinal, Lista)
		}
		if(no.getChave().compareTo(ChaveInicio) >= 0) && (no.getChave().compareTo(ChaveInicio) <= 0){
			lista.inserir(no.getValor());
		}
		if(no.get.Chave().compareTo(chaveFinal) < 0){
			recortar(no.getDiretira(), chaveInicio, chaveFinal, lista);
		}
	}
}
