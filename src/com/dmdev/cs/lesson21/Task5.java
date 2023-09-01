package com.dmdev.cs.lesson21;

/**
 * проходит циклом по алфавиту начиная с буквы b и выводит каждую букву до тех пор,
 * пока не встретит гласную ( т.е. вывести согласные на консоль)
 */
public class Task5 {

    public static void main(String[] args) {
        char startChar='b';
        printLetters(startChar);
    }

    private static void printLetters(char startChar) {
        for(char currentChar=startChar; !isVowel(currentChar);currentChar++){
            System.out.println(currentChar);
        }


    }

    private static boolean isVowel(char currentChar) {
        return  currentChar=='a'||currentChar=='e'||currentChar=='y'||currentChar=='o'||currentChar=='i';
    }
}



