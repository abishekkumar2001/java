public class Main{
    public static void main(String args[]){

        Box blackBox;
        blackBox = new Box();
        //Box blackBox = new Box(); can also be written like this ...
        blackBox.length = 15;
        blackBox.breadth = 18;
        blackBox.height = 30;
        System.out.println(blackBox.height);

        //When a class is created no memory is allocated ... When an object is created memory will be allocated ....

        //We can create any number of objects for a particular class ....

        Box woodBox = new Box();
        System.out.println("Memory allocated for woodBox Object ...");
        System.out.println(woodBox.height); 
        //We have not assigned the values but the memory has been allocated hence the default value will get printed ...

        /*
        Inside a file there should be only one public class ... 
        we can create any number of classes inside a package but each in separate files
        and can access all of them inside the main function ...
        */

       int a =woodBox.volume(10,6,5);
       System.out.println("The volume of woodBox is " + a);

        //Demo using library class
        Library lib = new Library();
        lib.books = 1000;
        lib.name = "Tirunelveli Library";
        lib.days = 5;
        lib.displayDetails();

        String str = lib.displayName();
        System.out.println("The name is " + str);

    }
}