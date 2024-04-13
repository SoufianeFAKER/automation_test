@logout
Feature: Deconnexion
  ETQ utilisatuer je souhaite me déconnecter

  Background: 
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home

  @logout
  Scenario: Je souhaite me déconnecter
    When Je me déconnecte
