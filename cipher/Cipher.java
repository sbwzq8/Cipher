/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipher;

//import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Sean
 */
public class Cipher {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException  {

        String code;
        String cipherText;
        Boolean dictionarySearch = true;
        Boolean seventhLetter = false;
        //[] shall denote a typo or a letter being inserted/replaced in the original text

//        code = "Echelon 3 24 20 12 19 17 17 22 19 23 19 4 0 7 6 7 19 10 12 16 17 6 14 4 3 17 24 20 13 24 8 16 17 1 24 9 21 15 0 5 15 4 4 23 6 11 25 14 4 20 4 9 14 18 12 8 7 21 6 4 21 7 21 4 2 14 3 14 7 18 13 6 22 16 6 1 21 21 15 3 5 24 9 11 2 10 5 21 4 20 11 19 12 5 12 13 12 5 17 19 3 14 21 12 15 17 7 7 2 2 21 1 10 22 13 5";
//        cipherText = "Walter Lippmann, after nearly half a century of careful observations, rendered in his recent book a harsh judgement both on the politician";
//        cipherText = "cubanalliesauthorizeconstructionofpermanentbroadcaststationrusalkagulfofmexicoprojectnovainitiatedawaitinstructions";

//        code = "Ascension 7 15 1 2 19 7 25 6 13 6 7 15 14 0 11 24 11 1 7 19 20 10 14 2 3 19 0 8 11 22 21 5 17 17 0 10 2 23 1 8 11 25 22 9 4 12 9 23 1 12 0 12 16 6 12 8 4 1 6 2 10 2 1 24 18 10 15 9 13 18 14 11 11 2 14 23 3 17 24 17 21 2 15 4 5 7 13 4 24 6 3 4 24 1 9 23 17 10 2 10 23 24 14 5 25";
//        cipherText = "enators and so it went it was a plutocratic feudalism eminently respectable the collar of any great financial interest was w";
//        cipherText = "LOCATION TEXAS SCHOOL BOOK DEPOSITORY SIXTH FLOOR SIX POINT FIVE MM CARCANO RIFLE DALLAS DEALEY PLAZA ELEVEN TWENTY SECOND";

//        code = "Ascension 1 23 9 12 3 13 5 9 22 21 0 21 10 15 5 17 12 21 18 8 5 13 22 10 2 11 5 11 8 9 19 23 2 14 17 10 7 15 7 12 21 25 16 25 0 23 12 23 13 22 8 9 25 4 20 19 11 14 24 17 9 21 0 2 16 16 1 22 1 20 22 22 25 0 15 1 1 22 17";
//        cipherText = "ision of their policies as he c reveled in the exercise of the sharp tongue which e the dignitie";
//        cipherText = "Prepare down target Kennedy John Fitzgerald Priority supersedes all previous instruction";

//        code = "Ascension 2 12 21 19 11 15 17 15 19 19 3";
//        cipherText = "merelyreplied";
//        cipherText = "archetypes";

//        code = "Ascension 7 12 5 21 3 0 25 15 5 18 12 20 11 18 17 24 14 0 6 7 11 4 4 24 5 1";
//        cipherText = "ton [s] pr[b]ssed hard on these gro";
//        cipherText = "uton pressed hard on these gro";
//        cipherText = "TRILLIONAIRESAVANNAHMASON";
//        cipherText = "umhqlilaniresavannahmason";

//        code = "Ascension 5 7 19 3 22 2 21 17 11 11 17 3 4 0 1 14 4 20 9 12 9 15 18 21 12 6 19 9 0 22 5 21 1 16 7 24 8 0 25 4 25 0 19 2 5 19 25 15 5 18 6 14 16 17 3 0 8 25";
//        cipherText = "his honest opinion of the seccessionist leader houston replied he has";
//        cipherText = "ALL POINTS DOWN TARGET CLARKE PRIORITY ONE AWAIT FINAL COORDINATES";

        code = "Ascension 7 21 14 20 4 0 5 4 20 2 1 14 16 6 12 14 11 22 6";
        cipherText = "dozensenatorsandso";
//        cipherText ="savannah cia zombies";
//        cipherText = "ascensionarchetype";
//        cipherText = "hvoueafeucboqgmolwg";

//        code = "Ascension 1 9 6 6 8 2";
//        code = "Ascension 1 10 7 3 1 1";
//        code = "Ascension 9 6 6 8 2";
//        code = "Ascension 10 7 3 1 1";
//        code = "Ascension 1 9 6 6 8 2 10 7 3 1 1";
//        code = "Ascension 9 6 6 8 2 10 7 3 1 1";

        //2 different codes?
        //9 6 6 8 2
        //10 7 3 1 1

        //1 code?
        //Ascension ? 9 6 6 8 2 10 7 3 1 1
        //Ascension 9 6 6 8 2 10 7 3 1 1

        String[] numbers = code.split(" ");
        if(dictionarySearch){
            File file = new File("D:\\Ciphers\\PICNoNums.txt");
//            File file = new File("D:\\Ciphers\\Profiles in Courage.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            try{
                while((cipherText = br.readLine()) != null){
                    cipherText = cipherText.replaceAll("\\[", "");
                    cipherText = cipherText.replaceAll("\\]", "");
                    cipherText = cipherText.replaceAll(",", "");
                    cipherText = cipherText.replaceAll("\\.", "");
                    cipherText = cipherText.replaceAll("!", "");
                    cipherText = cipherText.replaceAll("\\?", "");
                    cipherText = cipherText.replaceAll(" ", "");
                if(seventhLetter && cipherText.length() > 6)
                    cipherText = cipherText.substring(6);
                    String[] cipherLetters = cipherText.toLowerCase().split("");
//                    System.out.println("text = " + cipherText);
//                    System.out.println(cipherText.length());
                    if(cipherText.length() < (numbers.length-2)){
                        System.out.println("NOPE " + cipherLetters.length);
                    }
                    else{
                        Integer numFromLetter;
                        String decipheredMessage = "";
                        for(int i=2; i<numbers.length; i++){
                            numFromLetter = returnNumber(cipherLetters[i-2]);
                            Integer newNumber = computeCipher(numbers[i], numFromLetter);
                            String newLetter = returnLetter(newNumber);
                            decipheredMessage = decipheredMessage.concat(returnLetter(newNumber));
                        }
                        System.out.println(decipheredMessage);
                    }
                }
            }catch(IOException e){
                System.out.println("UH OH SOMETHIGN WENT WRONG");
            }
        }
        else{
            System.out.println("Cipher: " + cipherText);
            System.out.println("Code: " + code);

            cipherText = cipherText.replaceAll("\\[", "");
            cipherText = cipherText.replaceAll("\\]", "");
            cipherText = cipherText.replaceAll(",", "");
            cipherText = cipherText.replaceAll("\\.", "");
            cipherText = cipherText.replaceAll("!", "");
            cipherText = cipherText.replaceAll("\\?", "");
            cipherText = cipherText.replaceAll(" ", "");

            if(seventhLetter && cipherText.length() > 6){
                cipherText = cipherText.substring(6);
            }
            String[] cipherLetters = cipherText.toLowerCase().split("");
            Integer numFromLetter;
            String decipheredMessage = "";
            for(int i=2; i<numbers.length; i++){
                numFromLetter = returnNumber(cipherLetters[i-2]);
                Integer newNumber = computeCipher(numbers[i], numFromLetter);
                String newLetter = returnLetter(newNumber);
                System.out.println(numbers[i] + " " + cipherLetters[i-2] + "->" + numFromLetter + "->"+ newNumber + "->" + newLetter);
                decipheredMessage = decipheredMessage.concat(returnLetter(newNumber));
            }
            System.out.println(decipheredMessage);
        }
    }
    
    
    
    public static Integer computeCipher(String numString, Integer numFromLetter){
        Integer num1 = Integer.parseInt(numString);
        Integer result = num1 - numFromLetter;
        
        if( (result) < 0){
            return 26 - Math.abs(result);
        }
        else{
            return result;
        }
    }
    
    public static String numbers(String cipher, String text){
        String newString = "";
        
        cipher = cipher.replaceAll(" ", "");
        cipher = cipher.toLowerCase();
        String[] cipherLetters = cipher.split("");
        text = text.replace(" ", "");
        text = text.toLowerCase();
        String[] textLetters = text.split("");
        
        
        for(int i=0; i<textLetters.length; i++){
            Integer int1 = returnNumber(cipherLetters[i]);
            Integer int2 = returnNumber(textLetters[i]);
            
            Integer result = (int1+int2)%26;
            
            newString = newString.concat(result + " ");
            
        }
        
        
        
//        for(String string : textLetters){
//            System.out.print(string + " ");
//        }
//        System.out.println();
//        
//        for(String string : cipherLetters){
//            System.out.print(string + " ");
//        }
        System.out.println();
        
        return newString;
    }
    
    public static Integer returnNumber(String input){
        Integer output = null;
        
        switch(input){
            case "a":
                output = 0;
                break;
            case "b":
                output = 1;
                break;
            case "c":
                output = 2;
                break;
            case "d":
                output = 3;
                break;
            case "e":
                output = 4;
                break;
            case "f":
                output = 5;
                break;
            case "g":
                output = 6;
                break;
            case "h":
                output = 7;
                break;
            case "i":
                output = 8;
                break;
            case "j":
                output = 9;
                break;
            case "k":
                output = 10;
                break;
            case "l":
                output = 11;
                break;
            case "m":
                output = 12;
                break;
            case "n":
                output = 13;
                break;
            case "o":
                output = 14;
                break;
            case "p":
                output = 15;
                break;
            case "q":
                output = 16;
                break;
            case "r":
                output = 17;
                break;
            case "s":
                output = 18;
                break;
            case "t":
                output = 19;
                break;
            case "u":
                output = 20;
                break;
            case "v":
                output = 21;
                break;
            case "w":
                output = 22;
                break;
            case "x":
                output = 23;
                break;
            case "y":
                output = 24;
                break;
            case "z":
                output = 25;
                break;
        }
        return output;
    }
    
    public static String returnLetter(int input){
        
        String output = null;
//        Integer number = Integer.parseInt(input);
        
        switch(input){
            case 0:
                output = "a";
                break;
            case 1:
                output = "b";
                break;
            case 2:
                output = "c";
                break;
            case 3:
                output = "d";
                break;
            case 4:
                output = "e";
                break;
            case 5:
                output = "f";
                break;
            case 6:
                output = "g";
                break;
            case 7:
                output = "h";
                break;
            case 8:
                output = "i";
                break;
            case 9:
                output = "j";
                break;
            case 10:
                output = "k";
                break;
            case 11:
                output = "l";
                break;
            case 12:
                output = "m";
                break;
            case 13:
                output = "n";
                break;
            case 14:
                output = "o";
                break;
            case 15:
                output = "p";
                break;
            case 16:
                output = "q";
                break;
            case 17:
                output = "r";
                break;
            case 18:
                output = "s";
                break;
            case 19:
                output = "t";
                break;
            case 20:
                output = "u";
                break;
            case 21:
                output = "v";
                break;
            case 22:
                output = "w";
                break;
            case 23:
                output = "x";
                break;
            case 24:
                output = "y";
                break;
            case 25:
                output = "z";
                break;
        }
        return output;
    }
    
}
