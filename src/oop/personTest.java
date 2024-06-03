package src.oop;

public class personTest {
    public static void main(String[] args) {
        osoba person = new osoba();
        person.age = 17;
        person.name = "Lucinka";
        person.shoeSize = 40;
        person.intro();

        osoba otherperson = new osoba();
        otherperson.age = 16;
        otherperson.name = "FILIP";
        otherperson.shoeSize = 42;
        otherperson.intro();
    }
}