package src;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger{

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            // i + 1 < s.length() garante se tem um proximo char antes de continuar evitando problema de bounts
            // map.get(s.charAt(i)) < map.get(s.charAt(i + 1)) olha se o proximo valor eh maior que o atual e decide se subtrai ou nao
            if (i + 1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                res -= map.get(s.charAt(i));
            } else {
                res += map.get(s.charAt(i));
            }
        }
        return res;
    }
}
