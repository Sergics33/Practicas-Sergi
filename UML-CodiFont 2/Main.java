public class Main {
    public static void main(String[] args) {
        Country country = new Country(1, "España");
        State state = new State(33, "Alicante", country);
        Address address = new Address("C Alicante", "Villajoyosa", "03570", state);
        AddressBook addressBook = new AddressBook("2929");

        Person persona = new Person("Sergi", "66666666", "Sergics@gmail.com", true);
        persona.setAddress(address);
        persona.setAddressBook(addressBook);

        System.out.println(persona);
        System.out.println("Persona creada sin ningún problema!");
    }
}
