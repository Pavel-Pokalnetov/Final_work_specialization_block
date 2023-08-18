package AppTools;

public class Counter implements AutoCloseable {
    private static int count = 0;

    public void up() {
        count++;
    }

    public int get() {
        return count;
    }

    public void reset() {
        count = 0;
    }

    public void down() throws Exception {
        if (count == 0) throw new Exception("счетчик на нуле");
        count--;
    }

    @Override
    public void close() throws Exception {
        if (count > 0) throw new Exception("ресурс не был закрыт");
    }
}
