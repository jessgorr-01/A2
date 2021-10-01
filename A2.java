/**
 * CSC 345 Assignment #2
 * 
 * On my honor, Jessica Gorr, this assignment is my own work.  
 * I,Jessica Gorr, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */
 
import java.io.*;

// Students -- Add your import declarations here
public class A2 {
	
	// Students -- Add your constants here
	static int charClass;
	static char lexeme [100];
	static char nextChar;
	static int lexLen;
	static int token;
	static int nextToken;
// USE THE FILE TO READ FIILE
	FILE *in_fp, *fopen();
	
	//character classes
	public static final int LETTER = 0;
	public static final int DIGIT = 1;
	public static final int UNKNOWN = 99;
	public static final int INT_LIT =10;
	
	//token codes
	public static final int IDENT = 11;
	public static final int  ASSIGN_OP =20;
	public static final int  ADD_OP =21;
	public static final int  SUB_OP =22;
	public static final int  MULT_OP =23;
	public static final int  DIV_OP = 24;
	public static final int  LEFT_PAREN = 25;
	public static final int  RIGHT_PAREN = 26;
	
	//main method
	public static void main(String[] args) {
		try {
			// do not make any changes to the following TWO lines
			File file = new File(args[0]);		
			Scanner sc = new Scanner(file);		// do not make any other Scanners
			
			// Students -- your code and methods calls go here
			
			
			
			
			sc.close();
		} catch (Exception e) {
			System.out.println("ERROR - cannot open front.in \n");
		}
	}
	
	// Students -- add your method declarations here
	/* lookup - a function to lookup operators and parenthese and return the corrospodnding token*/
	int looku(char ch){
		System.out.print(" lookup(): %c\n", char);
		switch(ch){
			case '(':
				addChar();
				nextToken = LEFT_PAREN;
				break;
			case ')':
				addChar();
				nextToken = RIGHT_PAREN;
				break;
			case '+':
				addChar();
				nextToken = ASSIGN_OP;
				break;
			case '-':
				addChar();
				nextToken = SUB_OP;
				break;
			case '*':
				addChar();
				nextToken= MULT_OP;
				break;
			case '/':
				addChar();
				nextToken = DIV_OP;
				break;
			default:
				addChar();
				nextToken=EOF;//fix this line
				break;
		}
		return nextToken;
	}
	void addChar(){ //check this method LINES 88-89 in C file
		if(lexLen<=98){
			lexeme[lexLen++] = nextChar;
			lexeme[lexLen]=0;
			System,out.printf("	addChar() lexeme[]: %s\n", lexeme);
		}
		else{
			System.out.printf("Error - lexeme is too long\");
		}
	}
	void getChar(){ //do this method later
		
	}
	void getNonBlank(){ //check this method
		while(lexeme.charAt()== " "){
			Systen.out.printf(" REMOVED SPACE\n");
			getChar();
		}
	}
	int lex(){ //need to finish this method
		lexLEn=0;
		switch(charClass){
			case LETTER: 	break;
			case DIGIT:		break;
			case UNKNOWN:	break;	
		}
		getNonBlank();
		switch(charClass){
			case LETTER:	break;
			case DIGIT:	break;
			case UNKNOWN:	break;
		}
		switch (charClass){
			case LETTER:
				addChar();
				getChar();
				while(charClass == LETTER || charClass == DIGIT){
					addChar();
				getChar();}
				nextToken = IDENT;
				break;
				
			case DIGIT:
				addChar();
				getCahr();
				while(charClass == DIGIT){
					addChar();
					getChar();
				}
				nextToken =INT_LIT;
				break;
				
			case UNKNOWN:
				lookup(nextChar);
				getChar();
				break;
				
				//EOF 
				//need to do still
				}
		}
	}
}
