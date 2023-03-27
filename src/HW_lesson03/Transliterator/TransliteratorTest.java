package HW_lesson03.Transliterator;

import HW_lesson03.Transliterator.Transliterator;
import HW_lesson03.Transliterator.TransliteratorImpl;

public class TransliteratorTest {
    public static void main(String[] args) {
        Transliterator transliterator = new TransliteratorImpl();
        String res = transliterator
                .transliterate("HELLO! ПРИВЕТ! Go, boy!");
        System.out.println(res);
    }
}
