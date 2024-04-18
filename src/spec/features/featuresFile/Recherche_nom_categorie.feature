@categorie-name @tnr 
Feature: Recherche nom categorie
  ETQ utilisateur je souhaite chercher le nom du categorie

  Background: 
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home

  @gategorieName
  Scenario: Je souhaite chercher le nom du categorie
    And Je clique sur catalog
    And Je clique sur categories
    And Je saisis le nom du categorie "Computers"
    And Je clique sur le bouton search de la page Categories
