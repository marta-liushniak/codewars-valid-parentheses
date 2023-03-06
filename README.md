Write a method that takes a String of parentheses, and determines if the order of the parentheses is valid. The function should return **true** if the String is valid, and **false** if it's invalid.

Examples:  
`"()"`              - output:  `true`  
`")(()))"`          - output:  `false`  
`"("`               - output:  `false`  
`"(())((()())())"`  - output:  `true`  

Constraints:  
*0 <= input.length <= 100*

Along with opening (() and closing ()) parenthesis, input may contain any valid ASCII characters. Furthermore, the input String may be empty and/or not contain any parentheses at all. Do not treat other forms of brackets as parentheses (e.g. *[], {}, <>*).
