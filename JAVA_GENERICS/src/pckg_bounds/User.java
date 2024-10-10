package pckg_bounds;

import java.sql.SQLOutput;

public class User extends Person {

    private int id;
    private static int cntID = 10;

    private String name;

    protected User(String name) {
        super(name);
    }

    public void performSomething(){

        System.out.println(getClass().getSimpleName() + "perform something...");
    }

    @Override
    public void someMethod(String content) {

        System.out.println(content);

    }
}
