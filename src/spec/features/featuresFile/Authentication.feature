@authentification
Feature: Authentification
  ETQ utilisateur je souhaite m'authentifier

  @login-valide
  Scenario: Je souhaite tester la page LOGIN
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail
    And Je saisis le login
    And Je clique sue le bouton Login
    Then Je me redirige vers la page home
