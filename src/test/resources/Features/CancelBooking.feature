@cancel
Feature: Booking Hotel in Adactin Booking App

  @smoke @reg
  Scenario Outline: Cancel Booking After Booking
    Given I enter the "<userName>" and "<password>" in Login Page
    And Book the Hotel and cancel the Booking"<location>","<hotel>","<roomType>","<noofRooms>","<inDate>","<outDate>","<adults>","<childrens>","<expected>","<fName>","<lName>","<billAddress>","<CardNo>","<CardType>","<expMonth>","<expYear>","<ccvNo>","<expected1>","<expected3>"

    Examples: 
      | userName    | password    | location | hotel          | roomType | noofRooms | inDate     | outDate    | adults  | childrens | expected     | fName       | lName | billAddress                   | CardNo           | CardType         | expMonth | expYear | ccvNo | expected1            |expected3|
      | neelakandan | neelakandan | Sydney   | Hotel Sunshine | Standard | 1 - One   | 16/05/2021 | 17/06/2021 | 1 - One | 0 - None  | Select Hotel | Neelakandan | Ravi  | No.19,Thuraipakkam,chennai-97 | 1234567891234567 | American Express | June     |    2022 |  1323 | Booking Confirmation |The booking has been cancelled.|

  @smoke
  Scenario Outline:  Direct Cancel Booking 
    Given I enter the "<userName>" and "<password>" in Login Page
    And Cancel Oredr Id "<expected3>"
    

    Examples: 
      | userName    | password    |expected3|
      | neelakandan | neelakandan |The booking has been cancelled.|
