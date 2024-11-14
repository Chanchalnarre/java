class StaticExample {
    static int staticCounter = 0;

    int instanceCounter = 0;

    static void incrementStaticCounter() {
        staticCounter++;
        System.out.println("Static Counter: " + staticCounter);
    }

    void incrementInstanceCounter() {
        instanceCounter++;
        System.out.println("Instance Counter: " + instanceCounter);
    }

    static {
        System.out.println("Static block executed.");
    }
}

public class staticKeywordDemo {
    public static void main(String[] args) {
    
        System.out.println("Initial Static Counter: " + StaticExample.staticCounter);
        StaticExample.incrementStaticCounter();

        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        obj1.incrementInstanceCounter();
        obj2.incrementInstanceCounter();

        obj1.incrementStaticCounter();
        obj2.incrementStaticCounter();
    }
}
