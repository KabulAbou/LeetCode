package SentenceSimilarity;

class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {



        if(sentence1.contains(sentence2)){
            String test1 = " " + sentence2 + " ";
            if(sentence1.contains(test1)){
                return false;
            } else {
                return true;
            }
        } if (sentence2.contains(sentence1)){
            String test2 = " " + sentence1 + " ";
            if(sentence2.contains(test2)){
                return false;
            } else {
                return true;
            }
        }
        String test ="";
        String copySent2 = "";
        String copySent2Reversed = "";
        for(Character c : sentence2.toCharArray()){
            if(c != ' '){
            test = test.concat(String.valueOf(c));
            }
            else {
                break;
            }
        }
        for(int i = sentence2.length() - 1 ; i >= 0; i--){
            if(sentence2.charAt(i) != ' '){
            copySent2 = copySent2.concat(String.valueOf(sentence2.charAt(i)));
            } else {
                break;
            }
        }
        for(int i = copySent2.length() - 1; i >= 0; i--  ){
                copySent2Reversed = copySent2Reversed.concat(String.valueOf(copySent2.charAt(i)));
        }

        String combine = test + " " +copySent2Reversed;
        if(test != "" && combine != "") {
            if (sentence1.contains(test) && sentence1.contains(copySent2Reversed)) {
                if(sentence1.contains(" " + test) || sentence1.contains(copySent2Reversed + " ")) {
                    return false;
                } else {
                    return true;
                }
            } else if (sentence2.contains(combine)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }






    }

    public static void main(String[] args) {
       String test = "My name is Haley";
        String test2 = "My Haley";

        String test3 = "Luky";
        String test4 = "Lucccky";

        String test5 = "qbaVXO Msgr aEWD v ekcb";
        String test6 = "Msgr aEWD ekcb";

        String test7 = "d T d ED uXW L U J n klIe";
        String test8 = "d T d ED uXW L U J klIe";
         Solution solution = new Solution();

        System.out.println(solution.areSentencesSimilar(test7,test8));
    }
}
