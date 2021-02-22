package rpc;
/**
 * Ce programme permet de jouer au jeu de roche-papier-ciseau.
 * @author Cedryk Cartier, CARC11039400
 * @author Maxime Fournier, FOUM27039600
 */
public class rpc {
	public static void main(String[] args) {
		//Declaration de variables
			char joueur1;
			char joueur2;
			int score1 = 0;
			int score2 = 0;
			int nbManches;
					
			Pep8.stro("-----------------------------------------------\n");
			Pep8.stro("--- Bienvenue au jeu de roche-papier-ciseau ---\n");
			Pep8.stro("-----------------------------------------------\n");
			Pep8.stro("Combien de manches voulez-vous jouer? ");
			nbManches = Pep8.deci();
			if((nbManches ^ 1) == nbManches +1) {
				nbManches++;
			}
			
			//Boucle principale de la partie
			do {	
				//Choix de la réponse du joueur 1 {r/p/c}
				Pep8.stro("\nIl reste " + nbManches + " manche(s) à jouer.\n");
				Pep8.stro("JOUEUR 1, quel est votre choix? [r/p/c] ");
				joueur1 = Pep8.chari();
				joueur1 = Pep8.chari();
				joueur1 = Pep8.chari();
				if(joueur1 != 'r' && joueur1 != 'p' && joueur1 != 'c') {
					Pep8.stro("Erreur d'entrée ! Programme terminé");
					Pep8.stop();
				}
				//Choix de la réponse du joueur 2 {r/p/c}	
				Pep8.stro("JOUEUR 2, quel est votre choix? [r/p/c] ");
				joueur2 = Pep8.chari();
				joueur2 = Pep8.chari();
				joueur2 = Pep8.chari();
				 if(joueur2 != 'r' && joueur2 != 'p' && joueur2 != 'c') {
						Pep8.stro("Erreur d'entrée ! Programme terminé");
						Pep8.stop();
				 }
				 
				 //Condition si joueur1 a gagné la partie
				 if(joueur1 == 'r' & joueur2 == 'c') {
					score1 ++;
					Pep8.stro("\nJoueur 1 a gagné cette manche! Score: " + score1 + "-" + score2 + "\n");
				}else if(joueur1 == 'c' & joueur2 == 'p') {
					score1 ++;
					Pep8.stro("\nJoueur 1 a gagné cette manche! Score: " + score1 + "-" + score2 + "\n");
				}else if(joueur1 == 'p' & joueur2 == 'r') {
					score1 ++;
					Pep8.stro("\nJoueur 1 a gagné cette manche! Score: " + score1 + "-" + score2 + "\n");
				}else if(joueur1 == joueur2) {
					Pep8.stro("\nManche nulle...\n");
				}else {
					score2 ++;
					Pep8.stro("\nJoueur 2 a gagné cette manche! Score: " + score2 + "-" + score1 + "\n");
				}
					
				/*Si la réponse des jeux joueurs est différentes, alors on décrémente le nombre de manches à jouer.
				 *Sinon, on ne le décrémente pas. 
				 */
				if(joueur1 != joueur2) {
					nbManches--;	
				}
				
				//Si la partie est terminé, on affiche le gagnant		
				if(nbManches == 0) {
					if(score1 == score2) {
						Pep8.stro("\nManche nulle...\n");
					}else if (score1 > score2) {
						Pep8.stro("\n Joueur 1 a gagné le match! Félicitations! Score final: " + score1 + "-" +score2 + "\n");
					}else if(score2 > score1) {
						Pep8.stro("\n Joueur 2 a gagné le match! Félicitations! Score final: " + score2 + "-" +score1 + "\n");
					}
				}
			}while(nbManches != 0);
		}
}