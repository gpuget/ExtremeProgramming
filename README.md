# ExtremePrograming

## Git

* Forkez le projet sur votre github
* Clonez le projet : `git clone <target-url>`

## Installation

### Eclipse

Vous avez téléchargé la version portable d'Eclipse, vous pouvez donc le lancer en allant directement dans le dossier extrait.

Pour importer le projet :
```
File > Open Projects from File System... > Directory...
```
## Pratique (POKER)

### Backlog

Id | En tant que... | Je veux... | Afin de... | Valeur | O(n) (h)
--- | --- | --- | --- | --- | ---
1 | Joueur | initialiser une partie | commencer à jouer | 100 | 2
2 | Joueur | choisir le nombre de joueurs | initialiser la partie | 100 | 1/2
3 | Joueur | choisir le nom des joueurs | initialiser la partie | 50 | 1
4 | Joueur | recevoir 2 cartes en début de tour | constituer ma main | 100 | 1
5 | Joueur | terminer ma partie au bout d'un certain nombre de tours | limiter le temps de jeux | 50 | 1/2
6 | Joueur | découvrir les cartes sur la table | connaître ma combinaison | 70 | 1/2
7 | Joueur | être exclu si je n'ai plus d'argent | réduire le nombre de joueurs | 80 | 1/2
8 | Joueur | miser | augmenter les gains du tour | 80 | 1/2
9 | Joueur | suivre (miser le minimum pour continuer) | augmenter la somme en jeu | 80 | 1/2
10 | Joueur | faire tapis (miser tout mon argent) | augmenter la somme en jeu | 80 | 1/2
11 | Joueur | relancer (surenchérir) | augmenter la somme en jeu | 80 | 1/2
12 | Joueur | passer | voir les autres mises | 80 | 1/2
13 | Joueur | voir ma mise actuelle | décider de mon annonce | 80 | 1/2
14 | Joueur | jouer après le joueur à ma droite | effectuer une action | 70 | 1
15 | Joueur | voir seulement mes cartes | décider de mon annonce | 100 | 1
16 | Joueur | voir la somme qui me reste | décider des mises | 80 | 1/2
17 | Joueur / Spectateur | savoir quel joueur a gagné le tour | savoir la répartition des gains | 70 | 2
18 | Joueur / Spectateur | voir la somme en jeu | connaître l'objectif | 50 | 1/2
19 | Spectateur | découvrir les cartes sur la table | suivre le déroulement de la partie | 20 | 1/2
20 | Spectateur | voir l'argent de tous les joueurs | suivre le déroulement de la partie | 20 | 1/2
21 | Spectateur | voir les cartes de tous les joueurs | suivre le déroulement de la partie | 20 | 1/2
22 | Croupier | le joueur à ma gauche mise la petite blind | initialiser le tour | 90 | 1/2
23 | Croupier | le deuxième joueur à ma gauche mise la grande blind | initialiser le tour | 90 | 1/2
24 | Croupier | le troisième joueur à ma gauche commence le tour | initialiser le tour | 90 | 1/2
25 | Croupier | le joueur à ma gauche soit le prochain croupier | initialiser le prochain tour | 90 | 1/2

### Sprint 1

User story | Temps (h)
--- | ---
1 | 2
4 | 1
8 | 1/2
9 | 1/2
10 | 1/2
11 | 1/2
12 | 1/2
13 | 1/2
15 | 1
**Total** | **7**

### Sprint 2

User story | Temps (h)
--- | ---
6 | 1/2
7 | 1/2
14 | 1
16 | 1/2
17 | 2
18 | 1/2
22 | 1/2
23 | 1/2
24 | 1/2
25 | 1/2
**Total** | **7**


## Aide

### Cheat sheets

* [Java](https://introcs.cs.princeton.edu/java/11cheatsheet/ "Java Programing Cheatsheet")
* [Git](https://www.git-tower.com/blog/posts/git-cheat-sheet "Git Tower")
* [Markdown](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet "Markdown Cheat Sheet by Adam Pritchard")

### Docs

* [Debian](https://www.debian.org/doc/manuals/refcard/refcard "Debian Doc")
* [Git](https://git-scm.com/documentation "Git SCM doc")
* [Javadoc](https://docs.oracle.com/javase/8/docs/api/ "Java 8 Doc")
* [JUnit](http://junit.org/junit4/javadoc/latest/ "JUnit Doc")
