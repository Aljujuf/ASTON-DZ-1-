public class Main {
    public static void main(String[] args) {

        Address address = new Address("Москва");

        Person person = new Person("Александр", address);

        address.setCity("Казань");

        System.out.println(person.getName());
        System.out.println(person.getAddress().getCity());

        person.getAddress().setCity("Санкт-Петербург");

        System.out.println(person.getAddress().getCity());
    }
}