public class Main {
    public static void main(String[] args) {
//        Реализуйте структуру телефонной книги с помощью HashMap.
//                Программа также должна учитывать, что во
//        входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать,
//        как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
        homework();
    }
    static void homework(){
        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "123");
        phonebook.add("Ivanov", "456");
        phonebook.add("Ivanov", "789");
        phonebook.add("Petrov", "234");
        phonebook.add("Petrov", "345");
        phonebook.add("Vasilyev", "098");

        //System.out.println(phonebook.printAll());
        System.out.println(phonebook.getByName("Ivanov"));
        //System.out.println(phonebook.getByNumber("123"));
    }
}