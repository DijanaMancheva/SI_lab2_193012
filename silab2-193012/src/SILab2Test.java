import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


class SILab2Test {
    void function(){}
    private ArrayList<Time> createList(Time elems) {
        return new ArrayList<Time>(asList(elems));
    }

    private ArrayList<Integer> returnList(Integer elems) {
        return new ArrayList<Integer>(asList(elems));
    }

    @Test
    void multipleCondition() {
        RuntimeException re;
        //Невалидни часови
        re = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(-20, 57, 30))));
        re = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(30, 2, 31))));
        //Невалидни минути
        re = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(10, -15, 3))));
        re = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(10, 95, 30))));
        //Невалидни секунди
        re = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(10, 20, 111))));
        re = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(10, 20, -90))));
        //Невалидно време
        re = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(24, 10, 50))));
        re = assertThrows(RuntimeException.class, () -> SILab2.function(createList(new Time(28, 10, 90))));

        assertEquals(returnList(36315), SILab2.function(createList(new Time(12, 3, 25))));

    }
}
