import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {

    @Test
    public void test() {
        Data data = new Data();

        data.set(10);

        assertEquals(9, data.get());
    }

}
