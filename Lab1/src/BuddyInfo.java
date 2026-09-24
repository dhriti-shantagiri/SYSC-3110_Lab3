public class BuddyInfo {
    private String name;
    private String address;
    private String number;

    //parameter constructor
    public BuddyInfo(String name, String address, String number)
    {
        this.name = name;
        this.address = address;
        this.number = number;
    }


    public BuddyInfo(){
        this("Alicia", "Unknown", "Unknown");
    }

    public String getName(){

        return name;
    }
    public String getAddress(){
        return address;

    }
    public String getNumber(){
        return number;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Alicia", "123 Bird Street","1234567890");
        System.out.println("Hello " + buddy.getName());
    }
}
