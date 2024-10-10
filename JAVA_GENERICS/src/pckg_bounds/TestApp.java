package pckg_bounds;

public class TestApp {

    public static void main(String[] args) {

        Integer [] ints = {1,2,3,4,5};
        User[] users = {new BestUser("Besty"), new BestUser("Plain"), new BestUser("New User")};
        BestUser[] users2 = {new BestUser("Besty"), new User("Plain"), new NewUser("New User")};
        SimpleClass<BestUser> bestUserSimpleClass = new SimpleClass<BestUser>(users);
        bestUserSimpleClass.performSomething();
        SimpleClass<NewUser> newUserSimpleClass = new SimpleClass<>();
        SimpleClass<User> userSimpleClass = new SimpleClass<>(users2);
        System.out.println("-------------------");
        userSimpleClass.performSomething();
    }
}
