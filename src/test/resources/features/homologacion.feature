


Feature: Ingresar al modulo de homologaciones y cambios de version
  como usuario necesito ingresar al modulo de homologaciones y cambios de version
  para realizar solicitudes de homologacion


  Scenario: Realizar una solicitud de homologacion
    Given que me encuentro en la pagina de inicio de sesion
    When inicie sesion y entre al modulo de homologaciones
    Then verifico que estoy en el modulo de homologaciones
    #When ingrese satisfactoriamente los campos del formulario
    #Then puedo ver las tasas y tarifas del credito de libre inversion
