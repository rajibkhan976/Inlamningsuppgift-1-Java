package ec.java.utbildning;

import java.util.ArrayList;

public class Solutions {

    public void FizzBuzz () {
        for (int c = 1; c < 101; c++) {
            if (c % 3 != 0 && c % 5 != 0) {
                System.out.println(c);
            } else {
                if (c % 3 == 0 && c % 5 == 0) {
                    System.out.println("FizzBuzz");
                    continue;
                }
                if (c % 3 == 0) {
                    System.out.println("Fizz");
                }
                if (c % 5 == 0) {
                    System.out.println("Buzz");
                }
            }
        }
    }

    public ArrayList<Integer> uniqueList(int[] inputList) {
        ArrayList<Integer> uniqueList = new ArrayList<Integer>();
        for (int i = 0; i < inputList.length; i++) {
            if (!uniqueList.contains(inputList[i])) {
                uniqueList.add(inputList[i]);
            }
        }
        return uniqueList;
    }

    public StringBuilder languageTransformerOne(String langInput) {
        StringBuilder output = new StringBuilder();
        char[] langArr = langInput.toCharArray();
        for (int c = 0; c < langArr.length; c++) {
            output.append(langTransformHelperOne(langArr[c]));
        }
        return output;
    }

    private StringBuilder langTransformHelperOne (char charInput) {
        char[] vowelArr = {
                'a', 'e', 'i', 'o', 'u', 'ä', 'ö', 'å',
                'A', 'E', 'I', 'O', 'U', 'Ä', 'Ö', 'Å',
                ' ', '!', '.', ',', '-', ';', ':', '?',
                '(', ')', '{', '}', '[', ']', '_', '=',
                '@', '$', '%', '+', '*', '&', '/','<',
                '>', '#', '~', '|', '^', '"','\''
        };
        ArrayList<Character> vowelChar = new ArrayList<Character>();
        StringBuilder returnVal = new StringBuilder();
        StringBuilder consonant = new StringBuilder();
        for(char vowel: vowelArr) {
            vowelChar.add(vowel);
        }
        if (vowelChar.contains(charInput)) {
            returnVal.append(charInput);
        } else {
            consonant.append(charInput);
            returnVal.append(consonant);
            returnVal.append("o");
            returnVal.append(consonant.toString().toLowerCase());
        }
        return returnVal;
    }

    public StringBuilder languageTransformerTwo(StringBuilder langInput) {
        StringBuilder output = new StringBuilder();
        String[] langArr = langInput.toString().split(" ");
        for (int c = 0; c < langArr.length; c++) {
            output.append(langTransformHelperTwo(langArr[c]) + " ");
        }
        return output;
    }

    private StringBuilder langTransformHelperTwo (String wordInput) {
        StringBuilder output = new StringBuilder();
        StringBuilder workingString = new StringBuilder();
        workingString.append(wordInput);
        while (workingString.length() != 0) {
            if (workingString.length() >= 3) {
                if(workingString.substring(0, 1).equalsIgnoreCase(workingString.substring(2, 3)) &&
                        workingString.substring(1, 2).equals("o")
                ) {
                    output.append(workingString.substring(0, 1));
                    workingString.delete(0, 3);
                } else {
                    output.append(workingString.substring(0, 1));
                    workingString.delete(0, 1);
                }
            } else {
                output.append(workingString);
                workingString.delete(0, workingString.length());
                break;
            }
        }
        return output;
    }

    public int whatSquare(int inputNum) {
        if (inputNum > 0) {
            int initialStep = 1;
            int counter = 1;
            while (inputNum > initialStep) {
                if (!(initialStep * 2 > inputNum)) {
                    initialStep = initialStep * 2;
                    counter++;
                } else {
                    break;
                }
            }
            return counter;
        }
        return 0;
    }
}
