public class Library{
    int books;
    String name;
    int days;

    void displayDetails(){
        System.out.println(books);
        System.out.println(name);
        System.out.println(days);
    }

    public String displayName(){
        return name;
    }

    //Functions with access specifiers as private are not accessible outside the class
}