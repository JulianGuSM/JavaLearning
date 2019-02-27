package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * this program uses a set to print all unique words in system.in
 * @author : Julian
 * @date : 2019/2/27 10:10
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        long totalTime = 0;
        String flag = "eof";
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext(flag)){
            String word = scanner.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime = totalTime + callTime;
        }

        Iterator<String> iterator = words.iterator();
        for (int i = 0; i < 20 && iterator.hasNext(); i++) {
            System.out.println(iterator.next());
        }
        System.out.println("...");
        System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds");

    }
}
