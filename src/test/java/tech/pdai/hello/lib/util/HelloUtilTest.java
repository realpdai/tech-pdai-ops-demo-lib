package tech.pdai.hello.lib.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloUtilTest {

     @Test
     void helloTest() {
          Assertions.assertEquals("hello pdai", HelloUtil.hello("pdai"));
     }
}
