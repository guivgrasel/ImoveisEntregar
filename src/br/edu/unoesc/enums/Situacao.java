package br.edu.unoesc.enums;

public enum Situacao {
	DESOCUPADO(1, "Desocupado"),
	OCUPADO(2, "Ocupado"),
	EM_REFORMA(3,"Em reforma");
	
	private int numSituacao;
	private String descricaoSituacao;
	
	Situacao(int numSituacao, String descricaoSituacao){
		this.numSituacao = numSituacao;
		this.descricaoSituacao = descricaoSituacao;
	}
	
	public int getNumSituacao() {
		return this.numSituacao;
	}
	
	public String getDescricaoSituacao() {
		return this.descricaoSituacao;
	}
}
