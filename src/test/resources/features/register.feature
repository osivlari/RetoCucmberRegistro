Feature: Register

  Scenario Outline: Register
    Given que el usuario abre el navegador en la pagina WEB Guru99 y le da click en nuevo reigistro
    When Este ingresa los datos en las casillas correspondientes de la informacion y le de enviar
      | userName   | lastName   | phone   | email   | address1   | city   | state   | postalCode   | password   | confirmPassword   |
      | <userName> | <lastName> | <phone> | <email> | <address1> | <city> | <state> | <postalCode> | <password> | <confirmPassword> |

    Then se le dara click en la opcion de login para ingresar con nueva cuenta

    Examples:
      | userName | lastName | phone  | email            | address1       | city     | state    | postalCode | password | confirmPassword |
      | sandra   | gomez    | 789456 | sandra@gmail.com | Diagonal50sur  | bogota   | bogota   | 5798       | 456789   | 456789          |
      | andres   | perez    | 789456 | andres@gmail.com | calle17sur     | medellin | medellin | 5798       | 56987    | 56987           |
      | maick    | vargas   | 789456 | maick@gmail.com  | carrera58sur   | bogota   | bogota   | 5798       | 87924    | 87924           |
      | oscar    | ladino   | 789456 | oscar@gmail.com  | autopistanorte | bogota   | bogota   | 5798       | 13547    | 13547           |


