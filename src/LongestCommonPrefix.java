package src;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Começamos assumindo que a primeira string inteira é o prefixo
        String prefix = strs[0];

        // Comparamos o prefixo com cada uma das outras strings do array
        for (int i = 1; i < strs.length; i++) {
            // Enquanto a string atual não começar com o prefixo, reduzimos o prefixo em 1 caractere
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // Se o prefixo sumir por completo, não há prefixo comum
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
