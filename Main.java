import entities.Lectures;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lectures lettura = new Lectures(16, "paperino", 2024,300);
        System.out.println(lettura.toString());
    }
}