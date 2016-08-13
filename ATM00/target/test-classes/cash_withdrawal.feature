Feature: Cash withdrawal
	Scenario Outline: Cash withdrawal from an account
	Given I have <amount1> in my account
	When I request <amount2> 
	Then <total> should remain
	Examples:
	|	amount1	|	amount2	|	total	|
	|	100		|	20		|	80		|
	|	250		|	10		|	240		|
	|	100		|	0		|	100		|
