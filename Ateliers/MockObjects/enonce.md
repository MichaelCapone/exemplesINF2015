Mock Objects
============

Les mock objects sont très pratiques pour tester des fonctionnalités qui
utilisent des fichiers ou des bases de données.

Objectifs
---------

* Expérimenter les mock objects.

Exercices
---------

Les solutions des exercices ne seront par fournies. Néanmoins, vous trouverez
des exemples identiques dans le code du projet [PerGen][https://github.com/jacquesberger/PerGen].

Créez un projet NetBeans et placez-y la classe
[JavaGenerator][JavaGenerator.java].

1. Créez un _wrapper_ sur la classe `FileWriter` et remplacez toutes les
   utilisations du `FileWriter` par le _wrapper_.

2. Créez un _mock object_ sur le _wrapper_.

3. À l'aide du _mock object_, écrivez des tests unitaires sur les fonctions de
   la classe `JavaGenerator`. Utilisez la technique des tests de caractérisation
   pour obtenir le résultat attendu.

4. Développez (ou utilisez) une classe quelconque qui fait plusieurs écritures à
   la console à l'aide du `System.out.println`. À l'aide de la même technique
   utilisée pour le `FileWriter`, faites des tests unitaires pour vérifier ce
   qui est écrit à la console. Jetez un oeil sur la classe `PrintStream`.
   N'hésitez pas à faire de l'injection de dépendances si c'est nécessaire.
