import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GettingThingsStartedTest {
    private final GettingThingsStarted gettingThingsStarted = new GettingThingsStarted();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addition() {
        final Integer result = gettingThingsStarted.add(2,2);
        assertEquals(Integer.valueOf(4), result);
    }
}