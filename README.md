# spaceInvaders
Space Invaders en TDD
L'objectif de ce mini-projet est de développer un jeu de space invaders en TDD.

Dans ce README, vous trouverez les rubriques suivantes :

A propos du jeu Space Invaders
A propos du TDD (Test Driven Development)
Organisation du mini-projet (accès aux différents sprints)
Références
Commentaires, remarques et suggestions
Licence
A propos du jeu Space Invaders
Space Invader est un jeu de tir spatial (shoot'em up).

Le système du jeu est le suivant (Extrait Wikipédia):

Space Invaders est un jeu fixe en deux dimensions.
Le joueur contrôle un canon laser qu'il peut déplacer horizontalement, au bas de l'écran.
Dans les airs, des rangées d'aliens se déplacent latéralement tout en se rapprochant progressivement du sol et en lançant des missiles.
L'objectif est de détruire avec le canon laser une vague ennemie, qui se compose de cinq rangées de onze aliens chacune, avant qu'elle n'atteigne le bas de l'écran.
Le joueur gagne des points à chaque fois qu'il détruit un envahisseur.
Le jeu n'autorise qu'un tir à la fois et permet d'annuler ceux des ennemis en tirant dessus.
La vitesse et la musique s'accélèrent au fur et à mesure que le nombre d'aliens diminue.
L'élimination totale de ces derniers amène une nouvelle vague ennemie plus difficile, et ce indéfiniment.
Le jeu ne se termine que lorsque le joueur perd, ce qui en fait le premier jeu sans fin. Les aliens tentent de détruire le canon en tirant dessus pendant qu'ils s'approchent du bas de l'écran. S'ils l'atteignent ou arrivent jusqu'au sol, ils ont réussi leur invasion et le jeu est fini.
De temps en temps, un vaisseau spatial apparait tout en haut de l'écran et fait gagner des points bonus s'il est détruit. Quatre bâtiments destructibles permettent au joueur de se protéger des tirs ennemis.
Ces défenses se désintègrent progressivement sous l'effet des projectiles adverses et de ceux du joueur.
Le nombre de bâtiments n'est pas le même d'une version à l'autre.

Remarques :

Le site http://www.classicgaming.cc/classics/space-invaders est dédié à Space Invaders, on y trouve : un descriptif détaillé du jeu, des ressources graphiques, des ressources de son, ...
Une définition de jeu de tir spatial peut être consulté dans le Vocabulaire du jeu vidéo de Yolande Perron disponible ici.
| Space Invaders Space Invaders sur Classic Game |
Sources : images extraites de Wikipédia et de ClassicGaming

A propos du TDD (Test Driven Development)
Le développement dirigé par les tests (Test Driven Development ou TDD) est une approche itérative et incrémentale de codage piloté par les tests unitaires. Un cycle de développement TDD se compose de trois étapes :

Mantra

La première étape (RED) consiste à écrire un nouveau test unitaire et vérifier qu'il échoue : ce test apporte ainsi un nouveau comportement.

La deuxième étape (GREEN) consiste à écrire au plus vite un code de production pour faire passer le test précédent ainsi que les tests antérieurs.

La troisième étape (REFACTOR) est une phase de refactoring qui vise à faire émerger une conception simple afin d'améliorer la qualité de code.
4 critères de simplicité ont été énoncés par Kent Beck (dans le cadre d'eXtreme Programming) :

le code est doté de tests unitaires et fonctionnels et tous ces tests passent
le code ne fait apparaître aucune duplication
le code fait apparaître séparément chaque responsabilité distincte
le code contient le nombre minimum d'élément (classes, méthodes, lignes) compatible avec les trois premiers critères
Gardez à l'esprit ces critères lorsque vous êtes dans une phase de refactoring.
Remarque : Une présentation rapide du TDD est disponible ici

Organisation du mini-projet
Ce mini-projet est découpé en plusieurs fonctionnalités priorisées et regroupées en trois objectifs :

Objectif n° 1 :
Un Space Invaders minimum : un vaisseau, un missile, un envahisseur (MVP)

Fonctionnalité n°1 : Déplacer le vaisseau dans l'espace de jeu
Fonctionnalité n°2 : Dimensionner le vaisseau
Fonctionnalité n°3 : Choisir la vitesse du vaisseau
Fonctionnalité n°4 : Tirer un missile depuis le vaisseau
Fonctionnalité n°5 : Ajouter un envahisseur dans le jeu
Fonctionnalité n°6 : Détecter une collision entre deux sprites
Fonctionnalité n°7 : Terminer la partie
Objectif n° 2 :
Vers un Space Invaders plus classique (Améliorations du MVP)

Fonctionnalité n°8 : Permettre au vaisseau de tirer plusieurs missiles
Fonctionnalité n°9 : Envoyer une ligne d'envahisseurs
Fonctionnalité n°10 : Gérer un score
Fonctionnalité n°11 : Tirer un missile depuis un envahisseur de manière aléatoire
Fonctionnalité n°12 : Envoyer une horde d'envahisseurs
Objectif n° 3 : Le Space Invaders de vos rêves smile

Fonctionnalité n°13 & co : Toute amélioration possible pour réaliser le Space Invader de vos rêves
Les quatre premières fonctionnalités sont écrites sous la forme de tutoriel et sont extrêmement détaillées : vous serez guidés pas à pas afin de vous plonger dans la démarche TDD et apprendre peu à peu à prendre en main votre IDE smile

Au fil des fonctionnalités, vous aurez de plus en plus d'autonomie pour développer votre mini-projet qui devra bien sûr respecter au mieux les bonnes pratiques de qualité de code ...

Outre les fonctionnalités, d'autres tâches techniques vont être nécessaire pour mener à bien le premier objectif :

Le Sprint 0 (selon la terminologie agile) en tout début de projet va permettre :
Installation du socle technique
Rapide Analyse du problème
La mise en place d'un moteur graphique au sein de notre jeu sera consacrée à la prise en main d'un moteur graphique simplifié et à son intégration au jeu. Idéalement, cette tâche devrait être réalisée après la fonctionnalité 2 lorsque le vaisseau a une dimension. En réalité jusqu'à la livraison, le moteur graphique n'est pas vraiment nécessaire pour le développement de notre application puisque le comportement du jeu est vérifié et validé par les tests !
Une fois l'objectif n°1 terminé (et avant de commencer l'objectif n°2), nous verrons également comment livrer ce projet via la :

Création d'un .JAR du projet
Remarque pour ce projet dans le cadre du module M2104 :

Suivant la vitesse à laquelle vous avancerez, plusieurs fonctionnalités pourront être réalisées pendant une séance de TP. Vous tirerez ainsi les fonctionnalités au fur et à mesure de vos besoins, chaque binôme avançant à son propre rythme.
La séance consacrée à la mise en place du moteur graphique sera réalisée après La fonctionnalité n°2 : soyez patient, et continuez tranquillement les fonctionnalités en attendant de mettre en place ce rendu visuel ;-)
Pour le module M2104, l'objectif n°1 est demandé.
Have fun !

Nous commencerons donc ce mini-projet par l'installation du socle technique : c'est par ici.

Références
Ce mini-projet est en relation avec les enseignements suivants :

Cours : Quid du Test dans un développement logiciel ?
Cours : Sensibilisation aux bonnes pratiques de la programmation (qualité logicielle)
Présentation : Coding Dojo : une aide à la pratique du TDD
Atelier TDDlego : Sensibilisation aux bonnes pratiques techniques du Software Craftsmanship : Lego® à la rescousse !
Et plus généralement tous les enseignements du module de conception (M2104)
Commentaires, remarques et suggestions
Pour les discussions, c'est par là : https://github.com/iblasquez/tdd_spaceInvaders/issues
Pour les propositions de contenu, de modification par ici : https://github.com/iblasquez/tdd_spaceInvaders/pulls

Et bien sûr, n'hésitez pas à personnaliser vos messages avec des emojis smile

Licence
Tous les documents de ce dépôt sont placés sous licence CC BY-NC-SA : Creative Commons Attribution - Pas d'Utilisation Commerciale - Partage dans les Mêmes Conditions



En savoir plus sur les licences Creative Commons ...

Toutefois, toute personne enseignant ou ayant enseignée au département Informatique de l'IUT du Limousin doit demander une autorisation préalable par écrit si elle souhaite utiliser les documents de ce dépôt. smile
