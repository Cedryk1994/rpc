;Maxime Fournier FOUM27039600
;Cedryk Cartier  CARC11039400        


main:    STRO    msg1,d      ;message de bienvenue
         CHARO   "\n",i
         STRO    msg2,d
         CHARO   "\n",i
         STRO    msg1,d
         CHARO   "\n",i      ;on demande combien de manches on veut jouer
      
         STRO    msg3,d
         CHARO   "\n",i 
         DECI    nbManche,d  
         

if:      LDA     nbManche,d 
         ORA    0x0001,i

         
do:                         
         STRO    msg4,d      ;on affiche la phrase de nombre de manches restantes
         CHARO   ' ',i
         DECO    nbManche,d
         CHARO   ' ',i
         STRO    msg5,dA
         CHARO   "\n",i
         STRO    msg6,d
         CHARI   joueur1,d ;on demande au joueur1 sa lettre
         CHARO   "\n",i

         STRO    msg7,d ;on demande au joueur2 sa lettre
         CHARI   joueur2,d
         CHARI   joueur2,d
if1:     CHARO   

while:    

; Declaration de variables
joueur1:         .BYTE       0
joueur2:         .BYTE       0
scoreJ1:         .WORD       0 
scoreJ2:         .WORD       0
nbManche:        .BYTE       0 

msg1:             .ASCII     "-----------------------------------------------\x00"
msgBien:          .ASCII     "--- Bienvenue au jeu de roche-papier-ciseau --- \x00"
msgManc:          .ASCII     "Combien de manches voulez-vous jouer ? \x00"
msgRest:          .ASCII      "Il vous reste \x00"
msgRest1:         .ASCII      "manches a jouer \x00"
msgJou1:          .ASCII      "Joueur1 , quel est votre choix ? [r-p-c] \x00"
msgJou2:          .ASCII      "Joueur2 , quel est votre choix ? [r-p-c] \x00"
                  .END