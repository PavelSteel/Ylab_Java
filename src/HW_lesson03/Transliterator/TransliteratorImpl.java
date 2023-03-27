package HW_lesson03.Transliterator;

import HW_lesson03.Transliterator.Transliterator;

import java.util.*;

public class TransliteratorImpl implements Transliterator {
    private Map<String, String> translite = new HashMap<>();

    public TransliteratorImpl() {
        translite.put("А", "A");
        translite.put("Б", "B");
        translite.put("В", "V");
        translite.put("Г", "G");
        translite.put("Д", "D");
        translite.put("Е", "E");
        translite.put("Ё", "E");
        translite.put("Ж", "ZH");
        translite.put("З", "Z");
        translite.put("И", "I");
        translite.put("Й", "I");
        translite.put("К", "K");
        translite.put("Л", "L");
        translite.put("М", "M");
        translite.put("Н", "N");
        translite.put("О", "O");
        translite.put("П", "P");
        translite.put("Р", "R");
        translite.put("С", "S");
        translite.put("Т", "T");
        translite.put("У", "U");
        translite.put("Ф", "F");
        translite.put("Х", "KH");
        translite.put("Ц", "TS");
        translite.put("Ч", "CH");
        translite.put("Ш", "SH");
        translite.put("Щ", "SHCH");
        translite.put("Ы", "Y");
        translite.put("Ь", "");
        translite.put("Ъ", "IE");
        translite.put("Э", "E");
        translite.put("Ю", "IU");
        translite.put("Я", "IA");
    }

    @Override
    public String transliterate(String source) {
        String[] chars = new String[source.length()];
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1) {
                chars[i] = source.substring(i);
            } else {
                chars[i] = source.substring(i, i + 1);
            }
        }
        String res = "";
        for (int i = 0; i < chars.length; i++) {
            int x = 0;
            for (Map.Entry entry : translite.entrySet()) {
                if (chars[i].equals(entry.getKey())) {
                    res += entry.getValue();
                    x = 1;
                }
            }
            if (x == 0) {
                res += chars[i];
            }
        }
        return res;
    }
}
