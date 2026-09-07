class Solution {

    
        // first make the function which tells us is the input is vowel or not
            boolean isVowel(char ch){
            return "aeiou".indexOf(ch)!=-1;
        }

    public int maxVowels(String s, int k) {

        int max =0;
        int count = 0;

        for(int i=0 ; i<k ; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
            max=count;

        for(int right=k ; right<s.length() ; right++){
            if(isVowel(s.charAt(right))){
            count++;
            }
            if (isVowel(s.charAt(right - k))) {
                count--;
            }
            max = Math.max(max, count);
        }
             return max;
    }
}