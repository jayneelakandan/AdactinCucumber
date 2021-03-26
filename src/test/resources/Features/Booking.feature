@Booking
Feature: Booking Hotel in Adactin Booking App

  @smoke @reg
  Scenario Outline: Verifying the Booking Hotel with Select All Fields
    Given I enter the "<userName>" and "<password>" in Login Page
    And select the Options of the Hotel "<location>","<hotel>","<roomType>","<noofRooms>","<inDate>","<outDate>","<adults>","<childrens>","<expected>","<fName>","<lName>","<billAddress>","<CardNo>","<CardType>","<expMonth>","<expYear>","<ccvNo>","<expected1>"

    Examples: 
      | userName    | password    | location | hotel          | roomType | noofRooms | inDate     | outDate    | adults  | childrens | expected     | fName       | lName | billAddress                   | CardNo           | CardType         | expMonth | expYear | ccvNo | expected1            |
      | neelakandan | neelakandan | Sydney   | Hotel Sunshine | Standard | 1 - One   | 16/05/2021 | 17/06/2021 | 1 - One | 0 - None  | Select Hotel | Neelakandan | Ravi  | No.19,Thuraipakkam,chennai-97 | 1234567891234567 | American Express | June     |    2022 |  1323 | Booking Confirmation |

  @reg
  Scenario Outline: Verifying the Booking Hotel without giving any fields
    Given I enter the "<userName>" and "<password>" in Login Page
    And select the Options of the Hotel "<location>","<hotel>","<roomType>","<noofRooms>","<inDate>","<outDate>","<adults>","<childrens>","<expected>","<expected2>"

    Examples: 
      | userName    | password    | location | hotel          | roomType | noofRooms | inDate     | outDate    | adults  | childrens | expected     | expected2                    |
      | neelakandan | neelakandan | Sydney   | Hotel Sunshine | Standard | 1 - One   | 16/05/2021 | 17/06/2021 | 1 - One | 0 - None  | Select Hotel | Please Enter your First Name |
