package src.main.java.br.edu.infnet.appFlaStore.model.negocio;

import br.edu.infnet.appFlaStore.model.exception.NumeroCamisaInvalidaException;

public class Camisa extends Produto {

	private boolean mangaLonga;
	private int numeroCamisa;

	public Camisa(String descricao, float valor, boolean produtoFlamengo) {
		super(descricao, valor, produtoFlamengo);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.isMangaLonga());
		sb.append(";");
		sb.append(this.getNumeroCamisa());
		
		return sb.toString();
	}
	
	@Override
	public float calcularValorVenda() {
		float valor = this.getValor() + (this.isprodutoFlamengo() ? 2 : 0);		
		float valormangaLonga = valor / 2;		
		float valorNumeroCamisa = this.getvalorMangaLonga() * 0.03f; 

		return valor + valormangaLonga + NumeroCamisa;
	}

	public boolean isMangaLonga() {
		return mangaLonga;
	}
	public void setMangaLonga(boolean mangalonga) {
		this.mangaLonga = MangaLonga;
	}
	public float getNumeroCamisa() {
		return NumeroCamisa;
	}
	public void setNumeroCamisa(float numerocamisa) throws NumeroCamisaException {
		
		if(NumeroCamisa < 1 || NumeroCamisa > 99) {
			throw new NumeroCamisaException("Número Invalido");
		}
		
		this.NumeroCamisa = NumeroCamisa;
	}
}