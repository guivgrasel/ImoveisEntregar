package br.edu.unoesc.aplicacao;

import java.util.Locale;
import br.edu.unoesc.entidades.Imovel;
import br.edu.unoesc.entidades.Novo;
import br.edu.unoesc.entidades.Usado;
import br.edu.unoesc.enums.Situacao;

import java.util.Date;

public class ClasseTeste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Date dataTeste = new Date();
		
		//teste classe novo
		Novo testeNovo = new Novo("GUI", "SJO", 20000, 200000.50, dataTeste);
		System.out.println(testeNovo.toString() + "\n");

		//teste classe usado
		Usado testeUsado = new Usado("GUI", "SJO", 10000, 100000.50, Situacao.DESOCUPADO);
		System.out.println(testeUsado.toString() + "\n");
		//escrita situação sozinha
		System.out.println("Situação: " + testeUsado.getSituacao().getDescricaoSituacao() + "\n");
		
		//método exclusivo de imóvel
		Imovel testeImovel = new Imovel();
		testeImovel.setValor(100000); //valor do imóvel
		double valorDesejado = 50000; //valor desejado
		if(testeImovel.testarValorMenor(valorDesejado)) {
			System.out.println("O valor desde imóvel é INFERIOR ao valor desejado \n");
		} else {
			System.out.println("O valor desde imóvel é SUPERIOR ao valor desejado \n");
		}
		
		//valor venda Novo
		System.out.printf("Valor venda imóvel Novo R$ %.2f \n\n", testeNovo.mostrarValorVenda());
		
		//valor venda Usado
		System.out.printf("Valor venda imóvel Usado R$ %.2f \n\n", testeUsado.mostrarValorVenda());		
	}

}
