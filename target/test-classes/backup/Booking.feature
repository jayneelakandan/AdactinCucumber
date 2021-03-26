Feature: verifying Adactin Details

  Scenario Outline: Verifying adactin login details with valid credentials
    Given I am in Login page
    When I enter the "<userName>" and "<password>"
    And select the Options of the Hotel "<location>","<hotel>","<roomType>","<noofRooms>","<inDate>","<outDate>","<adults>","<childrens>"
    And select hotel and click ok
    And fill user details and click booking"<fName>","<lName>","<billAddress>"
      | CardNo           | CardType         | expMonth | expYear | ccvNo |
      | 1234567891234567 | American Express | June     |    2022 |  1323 |
      | 1234567891234567 | VISA             | June     |    2022 |  1323 |
      | 1234567891234567 | Master Card      | June     |    2022 |  1323 |
      | 1234567891234567 | Other            | June     |    2022 |  1323 |

    Examples: 
      | userName    | password    | location | hotel          | roomType | noofRooms | inDate     | outDate    | adults  | childrens | fName       | lName | billAddress                   |
      | neelakandan | neelakandan | Sydney   | Hotel Sunshine | Standard | 1 - One   | 16/05/2021 | 17/06/2021 | 1 - One | 0 - None  | Neelakandan | Ravi  | No.19,Thuraipakkam,chennai-97 |
		#		|neelakandan|neelakandan|Sydney|Hotel Creek|Double|2 - Two|16/05/2021|17/06/2021|2 - Two|1 - One|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Sydney|Hotel Hervey|Deluxe|3 - Three|16/05/2021|17/06/2021|3 - Three|2 - Two|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Sydney|Hotel Cornice|Super Deluxe|4 - Four|16/05/2021|17/06/2021|4 - Four|3 - Three|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Melbourne|Hotel Creek|Standard|5 - Five|16/05/2021|17/06/2021|1 - One|0 - None|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Melbourne|Hotel Sunshine|Double|6 - Six|16/05/2021|17/06/2021|2 - Two|1 - One|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Melbourne|Hotel Hervey|Deluxe|7 - Seven|16/05/2021|17/06/2021|3 - Three|2 - Two|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Melbourne|Hotel Cornice|Super Deluxe|8 - Eight|16/05/2021|17/06/2021|4 - Four|3 - Three|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Brisbane|Hotel Creek|Standard|9 - Nine|16/05/2021|17/06/2021|1 - One|4 - Four|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Brisbane|Hotel Sunshine|Double|10 - Ten|16/05/2021|17/06/2021|2 - Two|1 - One|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Brisbane|Hotel Hervey|Deluxe|4 - Four|16/05/2021|17/06/2021|3 - Three|2 - Two|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Brisbane|Hotel Cornice|Super Deluxe|10 - Ten|16/05/2021|17/06/2021|4 - Four|3 - Three|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Adelaide|Hotel Creek|Standard|4 - Four|16/05/2021|17/06/2021|1 - One|0 - None|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Adelaide|Hotel Sunshine|Double|10 - Ten|16/05/2021|17/06/2021|2 - Two|1 - One|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Adelaide|Hotel Hervey|Deluxe|4 - Four|16/05/2021|17/06/2021|3 - Three|2 - Two|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Adelaide|Hotel Cornice|Super Deluxe|4 - Four|16/05/2021|17/06/2021|1 - One|3 - Three|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|London|Hotel Creek|Standard|3 - Three|16/05/2021|17/06/2021|4 - Four|0 - None|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|London|Hotel Sunshine|Double|4 - Four|16/05/2021|17/06/2021|3 - Three|1 - One|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|London|Hotel Hervey|Deluxe|4 - Four|16/05/2021|17/06/2021|4 - Four|2 - Two|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|London|Hotel Cornice|Super Deluxe|4 - Four|16/05/2021|17/06/2021|1 - One|3 - Three|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|New York|Hotel Creek|Standard|3 - Three|16/05/2021|17/06/2021|2 - Two|4 - Four|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|New York|Hotel Sunshine|Double|4 - Four|16/05/2021|17/06/2021|4 - Four|1 - One|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|New York|Hotel Hervey|Deluxe|4 - Four|16/05/2021|17/06/2021|1 - One|2 - Two|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|New York|Hotel Cornice|Super Deluxe|4 - Four|16/05/2021|17/06/2021|2 - Two|0 - None|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Los Angeles|Hotel Creek|Standard|3 - Three|16/05/2021|17/06/2021|3 - Three|3 - Three|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Los Angeles|Hotel Sunshine|Double|4 - Four|16/05/2021|17/06/2021|4 - Four|1 - One|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Los Angeles|Hotel Hervey|Deluxe|4 - Four|16/05/2021|17/06/2021|1 - One|0 - None|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Los Angeles|Hotel Cornice|Super Deluxe|4 - Four|16/05/2021|17/06/2021|2 - Two|0 - None|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Paris|Hotel Creek|Standard|4 - Four|16/05/2021|17/06/2021|4 - Four|1 - One|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Paris|Hotel Sunshine|Double|4 - Four|16/05/2021|17/06/2021|3 - Three|4 - Four|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Paris|Hotel Hervey|Deluxe|4 - Four|16/05/2021|17/06/2021|1 - One|3 - Three|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Paris|Hotel Cornice|Super Deluxe|4 - Four|16/05/2021|17/06/2021|4 - Four|4 - Four|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|New York|Hotel Sunshine|Super Deluxe|4 - Four|16/05/2021|17/06/2021|4 - Four|4 - Four|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Paris|Hotel Cornice|Super Deluxe|3 - Three|16/05/2021|17/06/2021|4 - Four|4 - Four|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|New York|Hotel Cornice|Super Deluxe|4 - Four|16/05/2021|17/06/2021|3 - Three|4 - Four|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
		#		|neelakandan|neelakandan|Paris|Hotel Cornice|Super Deluxe|4 - Four|16/05/2021|17/06/2021|4 - Four|3 - Three|Neelakandan|Ravi|No.19,Thuraipakkam,chennai-97|
