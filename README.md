# Extreme Programming - Travaux Pratiques

**Diapositives** : https://slides.com/gpuget/extreme-programming

## Consignes

**Sujet** : Développement d'une application de gestion de places de cinéma

## Partie 1 : User Story

**Objectifs** :

* Appliquer les principes _INVEST_ pour créer les _user stories_

**Instructions** :

* Vous devez discuter des différents types d'utilisateurs qui utiliseront l'application
* Vous devez identifier leurs besoins et leurs attentes
* Vous devez rédiger les _user stories_ sous la forme vue en cours
* Vous devez le faire par groupe et respecter au mieux les principes _INVEST_

**Exemples**

| Id  | En tant que... | Je veux...                               | Pour...                      | Valeur |
|-----|----------------|------------------------------------------|------------------------------|--------|
| 1   | joueur         | voir mes cartes                          | choisir une action           | 100    |
| 2   | spectateur     | consulter les cartes de tous les joueurs | suivre le cours de la partie | 60     |
| ... | ...            | ...                                      | ...                          | ...    |

| Ref | Étant donné...           | Quand...                  | Alors...                     |
|-----|--------------------------|---------------------------|------------------------------|
| 1   | un joueur sans carte     | je lui donne aucune carte | il ne peut voir aucune carte |
| 1   | un joueur avec une carte | je lui donne 1 carte      | il peut voir ses 2 cartes    |
| ... | ...                      | ...                       | ...                          |


## Partie 2 : Planification

**Objectifs** :

* Planifier les 2 prochaines itérations pour le développement de l'application

**Instructions** :

* Vous devez planifier 2 _sprints_ :
  * Pour un sprint de 3h30
  * Pour un groupe de 6 personnes
  * Pour des binômes
* Vous devez définir un objectif aux _sprints_
* Vous devez sélectionner les _user stories_ de chaque _sprints_
* Vous devez planifier des tâches et des sous-tâches
* Vous pouvez commencer à répartir les tâches

## Partie 3 : Application

**Objectifs** :

* Appliquer les principes de l'_Extreme Programming_ (XP) tels que :
  * le TDD
  * la programmation en binôme
  * ...
* Mettre en oeuvre les concepts de la programmation orienté objet en _Java_
* Mettre en oeuvre une interface graphique utilisant le _framework JS React_

**Instructions** :

* Vous devez développer une application de gestion de places de cinéma en utilisant le _framework_ _Spring_ ou _Spring Boot_ et _React_
* Vous devez utiliser le _TDD_ pour écrire des cas de test pour chaque fonctionnalité de l'application **AVANT** de commencer à écrire le code
* Vous devez utiliser la programmation en **binôme** pour écrire du code et s'entraider pour résoudre les problèmes
* Vous devez faire des "**refactorisations**" pour améliorer la qualité et la maintenabilité du code