@new-product
Feature: Ajouter un nouveau produit
  ETQ utilisateur je souhaite ajouter un nouveau produit

  Background: 
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home

  @add-product
  Scenario: Je souhaite ajouter un nouveau produit
    When Je clique sur catalog
    And Je clique sur products
    And Je clique sur add new
    And Je remplis les champs suivants
      | productName      | Book             |
      | shortDescription | La vie est belle |
    #And Je choisis une categorie (stale element exception)
    And Je clique sur show on home page
    And Je clique sur le bouton save
