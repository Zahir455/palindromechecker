# Palindrome Tester

## main
![img.png](img.png)

The Main class simpliy runs the splitter method from the menu class.

## menu
The menu class contains two methods spliter and tester.
![img_1.png](img_1.png)

### Spliter
The spliter class take in the string sentence and seperate it into words and stores these words in an array called words.
![img_2.png](img_2.png)

### Tester
The tester method allows the user to choose which method of testing for palindromes they want to use and then calls said method. in the example below the code for choosing the Pali1 method is show however the code for the other two is very similar.
![img_3.png](img_3.png)
The method also has a default in the use case if the user doesn't enter a valid value.
![img_4.png](img_4.png)

## PaliInterface
The Palindrome interface sets the strucutre of all classes using the isPalindrome method.
![img_5.png](img_5.png)

## Pali1
Pali1 is the first class to test for palindromes and uses a for loop. All of the classes convert every character to lower case and removes spaces. 
![img_6.png](img_6.png)

## Pali2
Pali2 uses String Builders.
![img_7.png](img_7.png)

## Pali3
Pali3 uses a while loop.
![img_8.png](img_8.png)

## Main Test
This class was used to test all code, each Palindrome class was checked for a true and a false output.