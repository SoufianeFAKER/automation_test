@outline
Feature: Connexion avec plusieurs comptes
  ETQ utilisateur je souhaite me connecter avec plusieurs comptes

  @connexion_multiUsers
  Scenario Outline: Je souhaite me connecter avec plusieurs comptes
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "<email>"
    And Je saisis le login "<login>"
    And Je clique sur le bouton Login

    Examples: 
      | email               | login |
      | admin.yourstore.com | admin |
      | mouna@gmail.com     | mouna |
      | ahmed@gmail.com     | ahmed |
