Feature: Cucumber Test Scenarios



Background: Booking a Ticket
	Given A workbook named "GoogleMaps" and sheet named "Sheet1" is read 
	

	When App is launched

	 Scenario Outline: TS_01
     Then Book a bus ticket from "<location1>" to "<location2>"
     
    Examples: 
      | location1 | location2 |
      | from      | to        |

      
      

      
      


