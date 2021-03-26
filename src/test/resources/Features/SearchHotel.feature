@Search
Feature: Search Hotel in Adactin Booking App

  @reg
  Scenario Outline: Verifying the Search Hotel with Select All Fields
    Given I enter the "<userName>" and "<password>" in Login Page
    And select the All Options of the Hotel "<location>","<hotel>","<roomType>","<noofRooms>","<inDate>","<outDate>","<adults>","<childrens>","<expected>"

    Examples: 
      | userName    | password    | location | hotel          | roomType | noofRooms | inDate     | outDate    | adults  | childrens | expected     |
      | neelakandan | neelakandan | Sydney   | Hotel Sunshine | Standard | 1 - One   | 16/05/2021 | 17/06/2021 | 1 - One | 0 - None  | Select Hotel |

  @smoke @reg
  Scenario Outline: Verifying the Search Hotel with select Mandatory Fields
    Given I enter the "<userName>" and "<password>" in Login Page
    And select the All Options of the Hotel with Mandatory "<location>","<noofRooms>","<inDate>","<outDate>","<adults>","<expected>"

    Examples: 
      | userName    | password    | location | noofRooms | inDate     | outDate    | adults  | expected     |
      | neelakandan | neelakandan | Sydney   | 1 - One   | 16/05/2021 | 17/06/2021 | 1 - One | Select Hotel |

  @reg1
  Scenario Outline: Verifying the Check in and Check Out Date in Search Page
    Given I enter the "<userName>" and "<password>" in Login Page
    And select the Wrong Date With Valid Datas"<location>","<hotel>","<roomType>","<noofRooms>","<inDate>","<outDate>","<adults>","<childrens>","<expected>"

    Examples: 
      | userName    | password    | location | hotel          | roomType | noofRooms | inDate     | outDate    | adults  | childrens | expected                                          |
      | neelakandan | neelakandan | Sydney   | Hotel Sunshine | Standard | 1 - One   | 16/05/2021 | 14/05/2021 | 1 - One | 0 - None  | Check-In Date shall be before than Check-Out Date |

  @reg
  Scenario Outline: Verifying the Error Message for Search without Any Data
    Given I enter the "<userName>" and "<password>" in Login Page
    And Click Search Button "<expected>"

    Examples: 
      | userName    | password    | expected                 |
      | neelakandan | neelakandan | Please Select a Location |
