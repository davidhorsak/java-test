# QA Challenge

The program is supposed to be a simple command line utility. It takes one or many arguments and search an attached NMUT file for name or address match. If found it, parses the details and prints it on the screen.

## Description
* All business logic has to be tested in jUnit!
* The resulting program has to fulfil acceptance criteria
* Acceptance criteria is ordered from the most important to the least important. Develop the outcome following this priority.


## Acceptance Criteria
*Scenario 1:* No argument is given
When I call the program and with no arguments given
Then it prints out "There are no commandline arguments passed!"

*Scenario 2:* 1 argument is given matching name
When I call the program with a string argument
And the argument matches a name of a person in the file
Then it prints out the account details (See example 1)

*Scenario 3:* 1 argument is given matching address
When I call the program with a string argument
And the argument matches an address of a person in the file
Then it prints out the account details (See example 2)

*Scenario 4:* 1 argument is matching multiple records
When I call the pgoramm with a string argument
And the argument matches multiple person and/or addresses
Then it prints out all found records (See example 3)

*Scenario 5:* 1 argument is given with no matching address or name
When I call the program with a string argument
And the argument does not match any name or address in the file
Then it prints out "Not details found for "{argument}"" (See example 3)

*Scenario 4:* 2 or more arguments are given matching name or address
When i call the program with multiple arguments
Then it prints out responses as for individual responses


## Examples
### Example 1

```
Query: WILLEMS
Code: 322819202255571699902210724020
Name: I.H.E. WILLEMS
Adrs: WARANDE 27, 2404 HR  ALPHEN A/D RIJN
// newline
```

### Example 2

```
Query: WARANDE
Code: 322810802255613369902089011000F
Name: F.F.H.M. HOOGSTEDER
Adrs: COENDERSTRAAT 40, 2613 SN  DELFT
// newline
```

### Example 3

Query: KAAGM
Code: 322812102255808889903096704000N
Name: N.B.M. KAAGMAN
Adrs: ORANJEPLEIN 8, 2012 LP  HAARLEM

Query: KAAGM
Code: 322812102255810199902707807000
Name: N.B.M. KAAGMAN
Adrs: ORANJEPLEIN 8, 2012 LP  HAARLEM

Query: KAAGM
Code: 322812102255810359902707815000
Name: N.B.M. KAAGMAN
Adrs: ORANJEPLEIN 8, 2012 LP  HAARLEM
// newline
```
