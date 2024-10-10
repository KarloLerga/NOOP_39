package pckg_class_param;

import java.util.ArrayList;

public class Package <T> {

    private final ArrayList<T> pckgContent;
    private Class<T> classType;

    public Package(Class<T> type) {

        this.classType = type;
        this.pckgContent = new ArrayList<>();
    }

//    public void setPckgContent(ArrayList<T> contentNew) {
//
//        this.pckgContent = contentNew;
//    }

    public void listPackageContent(){

        if(pckgContent.isEmpty()){

            System.out.println("No content");

        } else {

            for(T cntnt : pckgContent){

                System.out.println("Element " + cntnt);

            }
        }
    }

    public void addNewElementToPackage(T pckgElement){

        if(pckgContent.contains(pckgElement)){

            System.out.println("Element already exists");


        } else {

            System.out.println("Element added");

            pckgContent.add(pckgElement);

        }
    }

}
