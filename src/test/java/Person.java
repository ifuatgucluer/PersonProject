public class Person {

    // Sınıfın özellikleri
    private String name;
    private int age;

    // Parametreli yapıcı metod (constructor)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // İsmi döndüren getter metodu
    public String getName() {
        return name;
    }

    // Yaşı döndüren getter metodu
    public int getAge() {
        return age;
    }

    // Kişinin bilgilerini konsola yazdıran metod
    public void printPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Yeni bir Person nesnesi yarat
        Person person = new Person("Ali", 25);

        // Kişinin bilgilerini konsola yazdır
        person.printPersonInfo();
    }
}
