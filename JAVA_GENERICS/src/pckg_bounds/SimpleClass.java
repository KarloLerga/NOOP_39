package pckg_bounds;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleClass <T extends User> {

    private final ArrayList<T> users;

    public SimpleClass() {

        this.users = new ArrayList<>();
    }

    public SimpleClass(T[] arrUsrs){

        this.users = Arrays.asList(arrUsrs);
    }

    public void performSomething(){

        if(users.isEmpty()){
            System.out.println("There is no users to perform");

        } else {

            for (T usr : users) {

                usr.performSomething();
            }
        }
    }

}
