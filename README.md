# ExtremePrograming

## Git

* Clone the project : `git clone <target-url>`
* Create your own project on Github
* Change the remote branch : `git remote set-url origin <new-url>`

## Installation

Normalement, **Eclipse** est déjà installé sur vos machines avec un **JDK 1.8** (Java 8).


### Téléchargement

Vous pouvez télécharger de votre choix :
* [Eclipse Oxygen (September 2017)](http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/oxygenrc3) (Portable)
* [IntelliJ Community](https://www.jetbrains.com/idea/download/) (_Il est possible que vous n'ayez pas les droits pour l'installer_ )

### Extraction

Vous pouvez lancer l'extraction via l'explorateur ou bien à l'aide de l'un des commandes suivantes :
```
tar -zxf <tar.gz-file>
unzip <zip-file>
```

### Eclipse

Vous avez téléchargé la version portable d'Eclipse, vous pouvez donc le lancer en allant directement dans le dossier extrait.

Pour importer le projet :
```
File > Open Projects from File System... > Directory...
```

### IntelliJ

Après l'extraction, une fois dans le répertoire, vous devez lancer le script `./bin/idea.sh`.

* `Import Project > Import project from external model > Eclipse`
* Sélectionnez le SDK installé sur votre machine
* `File > Project Structure... > Modules`
* Dans l'onglet _Sources_, sélectionnez _java_ comme source (bleu) et _test_ comme tests (vert)
* Dans l'onglet _Dependencies_, cochez _junit-4.12.jar_ avec un scope de _Test_

## Help

### Cheat sheets

* [Java](https://introcs.cs.princeton.edu/java/11cheatsheet/ "Java Programing Cheatsheet")
* [Git](https://www.git-tower.com/blog/posts/git-cheat-sheet "Git Tower")
* [Markdown](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet "Markdown Cheat Sheet by Adam Pritchard")

### Docs

* [Debian](https://www.debian.org/doc/manuals/refcard/refcard "Debian Doc")
* [Git](https://git-scm.com/documentation "Git SCM doc")
* [Javadoc](https://docs.oracle.com/javase/8/docs/api/ "Java 8 Doc")
* [JUnit](http://junit.org/junit4/javadoc/latest/ "JUnit Doc")
