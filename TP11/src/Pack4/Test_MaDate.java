package Pack4;
import java.util.Scanner;

public class Test_MaDate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MaDate m1=new MaDate(31,12,2023);
		MaDate m2=new MaDate(31,11,2024);
		MaDate m3=new MaDate(2024);
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		if(m1.toString().equals(m2.toString()))
		{
			System.out.println("les deux dates sont similaires");
		}
		else
		{
			System.out.println("les deux dates sonts differents");
		}
		System.out.println("Choisissez une opération \n1:ajout d'un jour\n2:ajout de plusieurs jours\n3:Ajout d’un mois\n4:Ajout d’une année");
		int k=sc.nextInt();
		switch(k)
		{
			case 1:m1.ajour();break;
			case 2:
				System.out.println("Combien de jours vous voulez ajouter");
				int k1=sc.nextInt();
				m1.ajouterPlusieursJours(k1);
			break;
			case 3:m1.ajouterUnMoi();break;
			case 4:m1.ajouterUnAn();break;
			default:System.out.println("Veuillez saisir un nombre entre 1 et 3");
		}
		System.out.println(m1.toString());
	}
}
