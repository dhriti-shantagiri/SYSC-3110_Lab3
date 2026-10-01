import java.util.ArrayList;
import java.util.List;
public class AddressBook {
    private List<BuddyInfo> buddies;

    public AddressBook(){
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int i){
        if (i >= 0 && i < buddies.size()){
            return buddies.remove(i);
        }
        return null;
    }
    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
    //a quick helper method
    public int size() {
        return myBuddies.size();
    }
}
