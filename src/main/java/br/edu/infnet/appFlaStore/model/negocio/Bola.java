package src.main.java.br.edu.infnet.appFlaStore.model.negocio;

import br.edu.infnet.appFlaStore.model.exception.TipoBolaInvalidoException;

public class Bola extends Produto {

	private boolean personalizada;
	private String tipoBola;
	
	public Bola(String descricao, float valor, boolean produtoFlamengo) {
		super(descricao, valor, produtoFlamengo);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.isPersonalizada());
		sb.append(";");
		sb.append(this.getTipoBola());
		
		return sb.toString();
	}

	@Override
	public float calcularValorVenda() {
		float valor = this.getValor() + (this.isProdutoFlamengo() ? 2 : 0);		
		float valorPersonalizada = valor * 0.35f;


		return valorPersonalizada + valor;
	}

	public boolean isPersonalizada() {
		return personalizada;
	}
	public void setPersonalizada(boolean Perso) {
		this.personalizada = Perso;
	}
	public string getTipoBola() {
		return tipobola;
	}
	public void setTamanho(string tipobola) throws TipoBolaException {
		
		if(!tipobola.equals("Quadra") || !tipobola.equals("Campo") || !tipobola.equals("Society")) {
			throw new TipoBolaInvalidoException("Tipo inválido.");
		}
		
	}
}