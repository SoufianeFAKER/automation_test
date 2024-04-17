@product-name
Feature: Recherche nom produit
  ETQ utilisateur je souhaite chercher le nom du produit

  Background: 
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home

  @productName
  Scenario: Je souhaite chercher le nom du produit
    And Je clique sur catalog
    And Je clique sur products
    And Je saisis le nom du produit "Honda"
    And Je clique sur le bouton search
