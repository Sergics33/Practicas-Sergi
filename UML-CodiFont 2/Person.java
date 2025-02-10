public class Person {

    private String name;
    private String phoneNumber;
    private String emailAddress;
    private boolean purchaseParkingPass;
    private Address address;
    private AddressBook addressBook;

    public Person(String name, String phoneNumber, String emailAddress, boolean purchaseParkingPass) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.purchaseParkingPass = purchaseParkingPass;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAddressBook(AddressBook addressBook) {
        this.addressBook = addressBook;
    }
}
