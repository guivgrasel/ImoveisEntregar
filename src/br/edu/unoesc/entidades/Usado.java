package br.edu.unoesc.entidades;

import br.edu.unoesc.enums.Situacao;

public final class Usado extends Imovel{
	private Situacao situacao;
	
	public Usado() {
		super();
	}
	
	public Usado(String proprietario, String endereco, double area, double valor, Situacao situacao) {
		super(proprietario, endereco, area, valor);
		this.situacao = situacao;
	}
	
	public Situacao getSituacao() {
		return this.situacao;
	}
	
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	
	//metodo mostrar valor venda sobescrevendo
	@Override
	public double mostrarValorVenda() {
		double porcentagem;
		porcentagem = getValor() * 0.10;
		return getValor() - porcentagem;
	}		

	
	@Override
	public String toString() {
		return "Imovel Usado" 
				+ "\n Proprietario: " + getProprietario()
				+ "\n Endereco: " + getEndereco()
				+ "\n Area: " + String.format("%.2f m²", getArea())
				+ "\n Valor: " + String.format("R$ %.2f", getValor())
				+ "\n Situação: " + situacao.getDescricaoSituacao();
	}
}
