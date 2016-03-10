/*
You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.

For example:

Secret number:  "1807"
Friend's guess: "7810"
Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
*/

public class Solution {
    public String getHint(String secret, String guess) {
        int len = secret.length();
        int bull = 0;
        int cow = 0;
        int count[] = new int[10];
        
        for(int i = 0; i < len; i++){
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if(s == g){
                bull ++;
                
            }
            else{
                if(count[g] > 0){
                    cow ++;
                    
                }
                if(count[s] < 0){
                    cow ++;
                }
                count[g] --;
                count[s] ++;
            }
        }
        return bull + "A" + cow + "B";
    }
}
