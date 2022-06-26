package ua.lviv.iot;
package ua.lviv.iot.texteditor;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class Main {
    private  static final ConsonantInExclamatory counter=new ConsonantInExclamatory();
    String txt="Behind me, dips eternity!" +
            "Behind me, immortality." +
            "Myself, the term between." +
            "Death but the drift of Eastern Gray!" +;
    @Test
    void findExclamatoryTest() {
        List<String> expected = new ArrayList<>();
        expected.add("Behind me, dips eternity!");
        expected.add("Death but the drift of Eastern Gray!");
        assertNotEquals(null, counter.findExclamatory(txt));
        assertEquals(expected.toString(), counter.findExclamatory(txt));



    }
    @Test
    void amountConsonantTest() {
        assertNotEquals(0,counter.amountConsonant(counter.findExclamatory(txt)));
        assertEquals(42,counter.amountConsonant(counter.findExclamatory(txt)));
    }
}
