package br.edu.unoesc.entidades;

import java.util.Date;
import java.text.SimpleDateFormat;

public final class Novo extends Imovel{
	private Date dataDisponivel;
	
	public Novo() {
		super();
	}
	
	public Novo(String proprietario, String endereco, double area, double valor, Date dataDisponivel) {
		super(proprietario, endereco, area, valor);
		this.dataDisponivel = dataDisponivel;
	}
	
	public Date getDataDisponivel() {
		return this.dataDisponivel;
	}
	
	public void setDataDisponivel(Date dataDisponivel) {
		this.dataDisponivel = dataDisponivel;
	}
	
	//metodo mostrar valor venda sobescrevendo
	@Override
	public double mostrarValorVenda() {
		double porcentagem;
		porcentagem = getValor() * 0.10;
		return getValor() + porcentagem;
	}		

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Imovel Novo" 
				+ "\n Proprietario: " + getProprietario()
				+ "\n Endereco: " + getEndereco()
				+ "\n Area: " + String.format("%.2f m²", getArea())
				+ "\n Valor: " + String.format("R$ %.2f", getValor())
				+ "\n Disponível em " + sdf.format(this.dataDisponivel);
	}
}
