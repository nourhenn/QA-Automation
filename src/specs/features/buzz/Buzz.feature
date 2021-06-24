@tag
Feature: Buz Orange-HRM
  En tant que utilisateur je souhaite exprimer mon opinion
 Background:
  Given Je me connecte à l'application OrangeHRM
    When Je saisie Username "admin" 
    And Je saisie Password "admin123"
    And Je clique sur le bouton login
   Then Je me redirige vers le compte admin "Welcome"
  @buzz
  Scenario: Buz Orange-HRM
    When Je clique sur le module buzz
    When Je saisie un message  "I'm Happy"
    And Je clique sue le button post
    Then je verifier le message "I'm Happy"
    