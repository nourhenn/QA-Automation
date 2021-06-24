@cnxoutline
Feature: AuthentificationOutline-OrangeHRM
  En tant que utilisateur je veux connecter à l'application OrangeHRM avec un scenario outline

  @cnxoutline
  Scenario Outline: AuthentificationOutline-OrangeHRM
    Given Je me connecte à l'application OrangeHRM
    When Je saisie login "<login>"
    And Je saisie password "<password>"
    And Je clique sur le bouton login

    Examples: 
      | login           | password   |
      | Admin           | admin123   |
      | nourhen         | nourhen123 |
      | nourhenr        | nourhen123 |
     
