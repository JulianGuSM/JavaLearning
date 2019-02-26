package pair1;

/**
 * @author : Julian
 * @date : 2019/2/26 15:35
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }

static class ArrayAlg {
    /**
     * Minmax pair.
     * Gets the minimum and maximum of an array of strings
     * @param strings an array of strings
     * @return the pair with the min and max value,or null if strings is null or empty
     */
    public static Pair<String> minmax(String[] strings){

        if (strings == null || strings.length == 0){
            return null;
        }
        String min = strings[0];
        String max = strings[0];
        for (int i = 1; i < strings.length; i++) {
            if (min.compareTo(strings[i]) > 0){
                min = strings[i];
            }
            if (max.compareTo(strings[i]) < 0){
                max = strings[i];
            }
        }
        return new Pair<>(min,max);
        }
    }
}
