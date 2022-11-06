package static_instance;

import static static_instance.StaticClass.staticInt;
import static static_instance.StaticClass.staticMethod;

public class TestStaticInstance {
    public static void main(String[] args) {
        staticMethod();
        System.out.println(staticInt);
    }
}
