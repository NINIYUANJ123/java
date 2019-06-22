package com.demo;

import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(JUnitPlatform.class)
public class TranslateServiceTest {
    private TranslateSerivice translator;

    @BeforeEach
    public void setup(){
        translator = new TranslateSerivice();
    }

    @Test
    public void testTranslateHello(){
        assertEquals("Bonjour",translator.translatr("hello"));
    }

    @Test
    public void testTranslateNo(){
        assertTrue(translator.translatr("no").equals("Non"));
    }

    @Test
    public void testTranslateError(){
        Throwable exception = assertThrows(
                IllegalArgumentException.class,
                ()-> translator.translatr("")
        );
        assertEquals(exception.getMessage(),
                "输入值不能为空");
    }

    @TestFactory
    public Stream<DynamicTest> translateDynamicTestFromStream(){
        List<String> in = new ArrayList<>(Arrays.asList("Hello","Yes"));
        List<String> out= new ArrayList<>(Arrays.asList("Qui","Meric"));

        return in.stream().map(word -> DynamicTest.dynamicTest("Test Translat"+word,
                ()-> {int idx = in.indexOf(word);
                assertEquals(out.get(idx),translator.translatr(word));
                }));
    }
}
