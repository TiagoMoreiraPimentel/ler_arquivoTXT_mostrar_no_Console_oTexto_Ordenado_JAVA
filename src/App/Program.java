package App;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		// instancia a lista que recebera e armazenara os nomes.
		List<String> list = new ArrayList<>();
		// define o caminho do arquivo que sera lido.
		String path = "C:\\Users\\nitro\\Desktop\\in.txt";
		
		// metodo de leitura com buff.
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
		// variavel que armazena os valores na linha do txt.
		String name = br.readLine();
		
		// laço for para percorrer a linha até o final.
		while (name != null) {
		// pega o valor da linha e armazena na variavel 'nome'.
		list.add(name);
		// reinicia o processo até acabar os dados da linha.
		name = br.readLine();
		}
		
		// apresenta os dados no console de forma ordenada por ordem alfabetica.
		Collections.sort(list);
		
		// faz a leitura da lista printando os nomes.
		for (String s : list) {
		System.out.println(s);
		}
		
		// trata as possiveis exceções.
		} catch (IOException e) {
		System.out.println("Error: " + e.getMessage());
		}

	}

}
