public class Main {
    public static void main(String[] args)
    {

        Student s1 = new Student("MOHAMMED","jalajil", "java", 22, 2500);
        Staff f1 = new Staff("NAIF", "Riyadh", "Ksu",12500);

        System.out.println(s1.toString());
        System.out.println(f1.toString());
    }
}