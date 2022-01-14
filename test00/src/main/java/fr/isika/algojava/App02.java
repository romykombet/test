package fr.isika.algojava;

// MAIN
// Modif sur la nouvelle branche testing
// Modif Romy

// je rajoute une modif ici 
// et une autre ici : modif2

//ENCORE UNE MODIF MAIS CETTE FOIS SUR TESTIN !!

import java.util.Random;
import java.util.Scanner;

public class App02 {


	public static void main(String[] args) {
		//		// TODO Auto-generated method stub
		//		// déclaration de varaibles
		//		// = c'est l'opérateur d'affectation
		//		int a = 0;
		//		//a=a+2000;
		//		System.out.println("Valeur de a = "+a);
		//		// 5 < a <11
		//		if (a>5 && a<11) {
		//			// si la cond est vraie
		//			System.out.println("5 < a <11");
		//		}
		//		else if (a >100){
		//			// sinon
		//			System.out.println("Valeur de a = "+a);
		//		}
		//		else {
		//			System.out.println("a = 0");
		//		}
		//		// boucle 10 fois
		////		for(int compteur=1;compteur<=10;compteur++) {
		////			System.out.println("Valeur du compteur = "+compteur);
		////		}
		//		
		//		boolean valeur=true;
		//		// ATTENTION == c'est l'opération d'égalité
		//		while(valeur==true) {
		//			System.out.println("Valeur = "+valeur);
		//			if (a>3) {
		//				valeur=false;
		//			}
		//			a++;
		//			System.out.println("Valeur de a = "+a);
		//		}
		//		
		////		Random r = new Random();
		////		System.out.println("Valeur de r = "+r.ints(1, (100 + 1)).limit(1).findFirst().getAsInt());

		// ================================================ DEVIN ========================================
		//		
		//		Random r = new Random();
		//		int nombreATrouver = r.ints(1, (100 + 1)).limit(1).findFirst().getAsInt();
		//		int choixJoueur = 0;
		//		Scanner clavier = new Scanner(System.in);
		//		int limiteDeTours = 0;
		//		// A COMMENTER
		//		System.out.printf("le nombre secret était : %d \n",nombreATrouver);
		//        
		//        while (nombreATrouver != choixJoueur && limiteDeTours < 10 ) {
		//        	limiteDeTours++;
		//            System.out.printf("Saisir votre nombre secret (10 coups max) : ");
		//            choixJoueur = clavier.nextInt();
		//            if (nombreATrouver > choixJoueur) {
		//            	System.out.println("Plus grand ! ");
		//            }
		//            else if (nombreATrouver < choixJoueur) {
		//            	System.out.printf("Plus petit ! ");
		//            }
		//        }
		//        if (limiteDeTours +1 <= 10) {
		//        	 System.out.printf("Bravo, vous avez trouvé en %d coups, le nombre secret était bien : %d", limiteDeTours,nombreATrouver);
		//        }
		//        else {
		//        	System.out.printf("Désolé,vous n'avez pas trouvé en 10 coups, le nombre secret était : %d", nombreATrouver);
		//        }
		//        
		//        
		//	}

		//		Algo de tri simple ordre croissant d'un tableau d'entiers :
		//			parcourir le tableau d'entiers, comparer 2 à 2 les éléments, 
		//			si l'élément N+1 est < à l'élément n alors les permuter et dire 
		//			qu'on a fait une permutation. Le tableau est trié lorsqu'on 
		//			reparcourt le tableau sans faire aucuen permutation.
		int t[] = {10, 5 ,20 , -1};
		boolean permutation =false;
		do {
			permutation =false;
			// parcourir le tab
			// tentative d'accès en dehors d'un tab => IndexOutOfBoundException
			// ATTENTION : s'arreter sur l'avent dernier
			// car on compra l'él n avec n+1
			for (int i= 0 ; i < t.length - 1 ; i++) {
				int temp = 0;
				if (t[i+1] < t[i]) {
					// on permute
					temp = t[i];
					t[i] = t[i+1];
					t[i+1] = temp;
					permutation = true;
				}
			}	
		} while (permutation);

		// Le tableau est triè
		// Test
		for (int i= 0 ; i < t.length ; i++)
			System.out.println( t[i]);

	}

	// Tableau à 2 dimension
	int[][] matrice1 = { {1,2,3}, {4,5,6}, {7,8,9}    };
	//	1 2 3
	//	4 5 6
	//	7 8 9
	int[][] matrice2 = { {10,20,30}, {40,50,60}, {70,-1,90}    };
	//	10 20 30
	//	40 50 60
	//	70 -1 90
	// Ecrire un programme qui fait l'adition de 2 matrice
	//	matriceTotal
	//	11 22 33
	//	44 52 66
	//	77 7 99
}
