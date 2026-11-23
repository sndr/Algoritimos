package src;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        if(s == null || s.isEmpty())  return 0;

        int result = 0;
        int i = s.length() - 1 ;

        // hello world (nao tem espaco, entao o valor eh  i == s.length() - 1 )
        while(i >= 0 && s.charAt(i) == ' ' ){
            i--;
        }

        // com o espaco ja limpo ele percorre de tras pra frente ate achar o primeiro vazio; e entao encrementa ate achar o proximo vazio
        while(i >= 0 && s.charAt(i) != ' '){
            result++;
            i--;
        }

        return result;
    }
}
