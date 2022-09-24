#Autor: Miguel
  @stories
  Feature: User registration in Utest page

    @scenario1
    Scenario: The sign up of julion on page Utest
      Given user wants to register in Utest
      When The user enters the data required by the system
        | StrFirstName | strLastName | strEmail         | strDateOfBirth | strMounthOfBirth | strYearOfBirth | strCity | strPostCode | strCountry | strDevice | strModel | strSystemOperating | strPassword |
        | Julian       | Arias       | julian@yahoo.com | 18             | July             | 1985           | Bogota  | 12345       | Colombia   | Apple     | iPhone 5S| iOS 11.0           | Julian123*  |

      Then Registration is completed when you see the complete setup button
        | strLastText    |
        | Complete Setup |
