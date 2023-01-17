public class Programmer extends Person {

  public Programmer(String name, String designator) {
    super(name, designator);
  }
  @Override
  public String toString (){
    return "name: " + getName() + "designation" + getDesignator();
  }

  public void eat() {super.eat();};
    public void walk() {super.walk();};
    public void learn (){super.learn();};
    public void coding(){
      System.out.println(getName()+" " + " is coding");
    }
}
