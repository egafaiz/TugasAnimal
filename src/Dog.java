//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Dog {
    public String name = "heli";
    public int age = 12;
    public double tall = 12.5;
    public char gender = 'M';
    public float weight = 15;

    public void displayInformation(){
        System.out.println("Name = " + name);
    }
    public static void main(String[] args) {
        displayInformatioin();
    }
}