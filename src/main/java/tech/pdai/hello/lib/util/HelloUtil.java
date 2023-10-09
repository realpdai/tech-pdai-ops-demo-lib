package tech.pdai.hello.lib.util;

/**
 * @author pdai
 */
public final class HelloUtil {

    public static String hello(String name) {
        return String.join("hello ", name);
    }

    private HelloUtil() {}

}
