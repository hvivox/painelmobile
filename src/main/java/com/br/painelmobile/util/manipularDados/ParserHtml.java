package com.br.painelmobile.util.manipularDados;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.examples.HtmlToPlainText;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParserHtml {

	private static Scanner scanner;

	/**
	 * Obtem todas as uris de imagens contidas no html passado por parametro
	 * 
	 * @param htmlFragment:
	 *            fragmento do html a ser analisado
	 * @return
	 */
	public static List<String> obterUrldaImagem(String htmlFragment) {
		String corpo = htmlFragment;

		Document doc;
		doc = Jsoup.parseBodyFragment(corpo);// ler o fragmento do html
		List<String> listaUriImagem = new ArrayList<String>();

		Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif|bmp)]");
		for (Element image : images) {
			listaUriImagem.add(image.attr("src"));
			/*
			 * System.out.println("\nsrc : " + image.attr("src"));
			 * System.out.println("height : " + image.attr("height"));
			 * System.out.println("width : " + image.attr("width"));
			 * System.out.println("alt : " + image.attr("alt"));
			 */
		}

		return listaUriImagem;
	}

	/**
	 * Converte um fragmento com tag html e remove a tag <a>
	 * 
	 * @param htmlFragmento:
	 *            string com tag html
	 * @return retorna uma string de texto sem tag html
	 */
	public static String converterHtmlEmTexto(String htmlFragmento) {
		Document doc;
		doc = Jsoup.parseBodyFragment(htmlFragmento);// ler o fragmento do html
		// remove todo o tipo de link
		doc.select("a").remove();
		HtmlToPlainText formatter = new HtmlToPlainText();
		String plainText = formatter.getPlainText(doc);
		//System.out.println(plainText);
		
		return plainText;
	}

	
	
	
	/**
	 * Converte um fragmento com tag html em texto sem html
	 * 
	 * @param htmlFragmento:
	 *            string com tag html
	 * @return retorna uma string de texto sem tag html
	 */
	public static String converterHtmlEmTexto_RemoveTodasAsTags(String htmlFragmento) {
		Document doc;
		doc = Jsoup.parseBodyFragment(htmlFragmento);// ler o fragmento do html
		// remove todo o tipo de link
		doc.select("tag").remove();
	
		String HtmlToPlainText = Jsoup.parse(htmlFragmento).text();
		
		return HtmlToPlainText;
	}
	
	
	/**
	 * retira a tag IMG do html e retorna o html sem a imagem
	 * 
	 * @param htmlFragmento
	 * @return
	 */
	public static String removeTagImgdoHtml(String htmlFragmento) {
		Document doc;
		doc = Jsoup.parseBodyFragment(htmlFragmento);// ler o fragmento do html

		// remove todo o tipo de link e IMG
		doc.select("a").remove();
		doc.select("img").remove();

		String plainText = doc.html();
		// System.out.println(plainText);

		return plainText;
	}

	// Ler html puro, também converte para utf-8
	public static String doLerHtmlComTag(String caminho) {
		String saida = "";

		// Leitura de arquivo local da maquina
		try {
			InputStream entrada = new FileInputStream(caminho);
			scanner = new Scanner(entrada);

			while (scanner.hasNextLine()) {
				saida += ('\n' + scanner.next());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ConversorTexto.doConverterCodificacao(saida);
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		Document doc;
		try {
			doc = Jsoup.connect("http://jsoup.org").get();
			doc.select("a").remove();

			System.out.println(doc.toString());

			// Element link = doc.select("a").first();

			// String teste = doc.attr("abs:href");
			System.out.println("--------------------------");

			HtmlToPlainText formatter = new HtmlToPlainText();
			String plainText = formatter.getPlainText(doc);
			System.out.println(plainText);

			/*
			 * String relHref = link.attr("href"); // == "/" String absHref =
			 * link.attr("abs:href"); // "http://jsoup.org/"
			 * 
			 * System.out.println(absHref);
			 */

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * Document doc; String corpo = doLerHtmlComTag("c:\\dados2.txt"); doc =
		 * Jsoup.parseBodyFragment(corpo);//ler o fragmento do html
		 * 
		 * 
		 * Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]"); for
		 * (Element image : images) {
		 * 
		 * System.out.println("\nsrc : " + image.attr("src"));
		 * System.out.println("height : " + image.attr("height"));
		 * System.out.println("width : " + image.attr("width"));
		 * System.out.println("alt : " + image.attr("alt"));
		 * 
		 * }
		 * 
		 * HtmlToPlainText formatter = new HtmlToPlainText();
		 * 
		 * String plainText = formatter.getPlainText(doc);
		 * System.out.println(plainText);
		 */

	}

}
