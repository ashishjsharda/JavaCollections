import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/**
 * Example using Collections
 * @author ashish
 */
public class CollectionsEx {
    public static void main(String[] args) {
        Collection<String> collection=new HashSet<>();
        Collection<String> collection1= Arrays.asList("one","two","three");
        Collection<String> collection2= Collections.singleton("four");
        collection.add("zero");
        collection.addAll(collection1);
        System.out.println(collection.contains("zero"));
    }
}
