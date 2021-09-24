# A2

This is a program that takes a lexical analyzer wriiten in C, and converted to java
input will be given from a file and output will be displayed on a created file from within the program

Methods include main
                lookup(char ch)
                addChar()
                get CHar()
                getNonBlank()
                lex()
                
 Method descriptions:
  lookup - is called from the lex() method and uses a switch to deterime what class to assign the characters to.
  addChar() - used to add char to a certain class and print out to the user
  getChar() - called from main and used to get the next character from the input file
  getNonBlank()- this method goes through the list of chars and if a blank space such as a tab or empty slot is ignored and moves on to the next "Non blank" character
  lex()- workhorse of the program. It recieves the characters and using a switch statement categoriezes and assins them to their respective class
