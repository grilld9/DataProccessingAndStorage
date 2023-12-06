import org.example.SyncLinkedList;
import org.junit.Test;

public class SyncLinkedListTests {

    @Test
    public void sortingTest() {
        SyncLinkedList list = new SyncLinkedList();
        list.add("ab");
        list.add("attt");
        list.add("atttt");
        list.sort();
    }
}
