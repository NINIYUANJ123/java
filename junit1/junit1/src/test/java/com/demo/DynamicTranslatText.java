package com.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicTranslatText {

    private TranslateSerivice translator;
    @BeforeEach
    public void setup(){
        translator = new TranslateSerivice();
    }
    @TestFactory
    public Stream<DynamicTest> translateDynamicTestFromStream(){
        List<String> in = new ArrayList<>(Arrays.asList("Hello","Yes"));
        List<String> out= new ArrayList<>(Arrays.asList("Bonjour","Qui"));

        return in.stream().map(word -> DynamicTest.dynamicTest("Test Translat"+word,
                ()-> {int idx = in.indexOf(word);    //上两行没看懂
                    assertEquals(out.get(idx),translator.translatr(word));
                }));
    }
}
