import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;
    protected Iterator<Integer> integerIterator;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
        integerIterator = random.ints(min, max + 1).iterator();
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> it = new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return integerIterator.next();
            }
        };
        return it;
    }
}