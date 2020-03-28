package br.edu.unoesc.entidades;

public class Imovel {
	private String proprietario;
	private String endereco;
	private double area;
	private double valor;
	
	public Imovel() {
	}
	
	public Imovel(String proprietario, String endereco, double area, double valor) {
		this.proprietario = proprietario;
		this.endereco = endereco;
		this.area = area;
		this.valor = valor;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getEndereco() {
		return endereco;
	}
	
	//metodo mostrar valor venda
	public double mostrarValorVenda() {
		return this.valor;
	}	
	
	//método FINAL, conferir se valor do imóvel é menor que o desejado
	public final boolean testarValorMenor(double valorDesejado) {
		if (valorDesejado > this.valor) {
			return true;
		} 
		return false;
	}

	@Override
	public String toString() {
		return "Imovel" 
				+ "\n Proprietario: " + getProprietario()
				+ "\n Endereco: " + getEndereco()
				+ "\n Area: " + String.format("%.2f m²", getArea())
				+ "\n Valor: " + String.format("R$ %.2f", getValor());
	}	
}
