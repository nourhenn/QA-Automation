$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentication/Authentication.feature");
formatter.feature({
  "line": 2,
  "name": "Authentication - OrangeHRM",
  "description": "En tant que utilisateur je souhaite m\u0027authentifier",
  "id": "authentication---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@connexion"
    }
  ]
});
formatter.before({
  "duration": 4161933200,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Authentication - OrangeHRM",
  "description": "",
  "id": "authentication---orangehrm;authentication---orangehrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@cnx"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Je me connecte à l\u0027application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Je saisie Username \"admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Je saisie Password \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Je clique sur le bouton login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Je me redirige vers le compte admin",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationStepDefinition.jeMeConnecteÀLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 3898790600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 20
    }
  ],
  "location": "AuthenticationStepDefinition.jeSaisieUsername(String)"
});
formatter.result({
  "duration": 313517700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 20
    }
  ],
  "location": "AuthenticationStepDefinition.jeSaisiePassword(String)"
});
formatter.result({
  "duration": 367047700,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationStepDefinition.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "duration": 3689671100,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationStepDefinition.jeMeRedirigeVersLeCompteAdmin()"
});
formatter.result({
  "duration": 48900,
  "status": "passed"
});
formatter.after({
  "duration": 1709510900,
  "status": "passed"
});
});