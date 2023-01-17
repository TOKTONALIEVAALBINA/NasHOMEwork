public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer(" Albina ", " write to code ");
        System.out.println(programmer.toString());
        programmer.toString();
        programmer.eat();
        programmer.walk();
        programmer.learn();
        programmer.coding();

        System.out.println("****************************************8");

        Dancer dancer = new Dancer( "Volodya", " to dance");
        System.out.println(dancer.toString());
        dancer.toString();
        dancer.eat();
        dancer.walk();
        dancer.learn();
        dancer.dancing();

        System.out.println("******************************************8");

        Singer singer = new Singer("Dima" , " to sing");
        System.out.println(singer.toString());
        singer.toString();
        singer.eat();
        singer.walk();
        singer.learn();
        singer.singing();




    }
}