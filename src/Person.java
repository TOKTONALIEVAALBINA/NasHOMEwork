public class Person {
    private String name;
    private String designator;

    public Person(String name, String designator) {
        this.name = name;
        this.designator = designator;
    }

    public Person(){

    }
    public void eat(){
        System.out.println(getName()+" " + "is eat");

    }
    public void walk(){
        System.out.println(getName()+" " + "is walk");

    }
     public void learn(){
         System.out.println(getName()+" " + "is learn");
     }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignator() {
        return designator;
    }

    public void setDesignator(String designator) {
        this.designator = designator;
    }




}
