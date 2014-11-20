package fr.treeptik.tp.chaine_caractere;

import java.util.Scanner;

public class StringSample {

	public static void main(String[] args) {
		StringSample test = new StringSample();
		Scanner sc = new Scanner(System.in);
		// String chaine = sc.nextLine();
		String chaine1 = sc.next();
		// test.decouper(chaine);
		test.miror1(chaine1);

	}

	public String decouper(String chaine) {

		chaine = chaine.toLowerCase();
		String[] strings = chaine.split(" ");
		for (int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].toUpperCase();
			i++;
		}
		for (String string : strings) {
			System.out.println(string);
		}
		return null;
	}

	public String mirror(String chaine) {
		int taille = chaine.length();
		String envers = "";
		for (int i = taille - 1; i >= 0; i--) {

			envers = envers + chaine.charAt(i);
		}
		System.out.println(envers);
		return null;
	}

	public String miror1(String chaine){
		int taille = chaine.length();
		StringBuilder envers;
		StringBuilder sb= new  StringBuilder();
		for (int i = taille-1; i >= 0; i--) {
			sb.append(chaine.charAt(i));
			
			//envers=envers+chaine.charAt(i);
		}
		System.out.println(sb);
		
		return null;
	}
}
