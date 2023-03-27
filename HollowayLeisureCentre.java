import java.util.ArrayList;
import java.util.Scanner;

public class HollowayLeisureCentre {
    
    static ArrayList<Membership> memberships = new ArrayList<>();
    static ArrayList<Subscription> subscriptions = new ArrayList<>();
    static ArrayList<Pitch> pitches = new ArrayList<>();
    static ArrayList<Event> events = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Welcome to The Holloway Leisure Centre MS System!");
            System.out.println("Please select an option:");
            System.out.println("1. Manage Memberships");
            System.out.println("2. Manage Subscriptions");
            System.out.println("3. Manage Pitch Bookings");
            System.out.println("4. Manage Event Bookings");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    manageMemberships(sc);
                    break;
                case 2:
                    manageSubscriptions(sc);
                    break;
                case 3:
                    managePitches(sc);
                    break;
                case 4:
                    manageEvents(sc);
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
    
    private static void managePitches(Scanner sc) {
    }

    private static void manageEvents(Scanner sc) {
    }

    private static void manageSubscriptions(Scanner sc) {
    }

    public static void manageMemberships(Scanner sc) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Manage Memberships:");
            System.out.println("Please select an option:");
            System.out.println("1. Add Membership");
            System.out.println("2. Remove Membership");
            System.out.println("3. View All Memberships");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addMembership(sc);
                    break;
                case 2:
                    removeMembership(sc);
                    break;
                case 3:
                    viewMemberships();
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
    
    
    public static void addMembership(Scanner sc) {
        System.out.println("Add Membership:");
        System.out.println("Enter Membership Number:");
        String number = sc.next();
        System.out.println("Enter Membership Name:");
        String name = sc.next();
        System.out.println("Is the member a team organizer? (true/false)");
        boolean isTeamOrganizer = sc.nextBoolean();
        String teamName = "";
        if (isTeamOrganizer) {
            System.out.println("Enter Team Name:");
            teamName = sc.next();
        }
        System.out.println("Enter Date of Birth (dd/MM/yyyy):");
        String dob = sc.next();
        System.out.println("Enter Address:");
        String address = sc.next();
        System.out.println("Enter Home Tel:");
        String homeTel = sc.next();
        System.out.println("Enter Work Tel:");
        String workTel = sc.next();
        System.out.println("Enter Email address:");
        String email = sc.next();
        System.out.println("Enter Date of Joining (dd-MM-yy):");
        String doj = sc.next();
        Membership membership = new Membership(number, name, isTeamOrganizer, teamName, dob, address, homeTel, workTel, email, doj);
        memberships.add(membership);
        System.out.println("Membership added successfully!");
    }

    public static void viewMemberships() {
        System.out.println("All Members:");
        for (Membership membership : memberships) {
            System.out.println("Membership Number: " + membership.getNumber());
            System.out.println("Name: " + membership.getName());
            System.out.println("Team Organizer: " + membership.isTeamOrganizer());
            System.out.println("Team Name: " + membership.getTeamName());
            System.out.println("Date of Birth: " + membership.getDob());
            System.out.println("Address: " + membership.getAddress());
            System.out.println("Home Tel: " + membership.getHomeTel());
            System.out.println("Work Tel: " + membership.getWorkTel());
            System.out.println("Email: " + membership.getEmail());
            System.out.println("Date of Joining: " + membership.getDoj());
            System.out.println();
        }
    }
    
    public static void removeMembership(Scanner sc) {
        System.out.println("Remove Membership:");
        System.out.println("Enter Membership Number to remove:");
        String number = sc.next();
        Membership membershipToRemove = null;
        for (Membership membership : memberships) {
            if (membership.getNumber().equals(number)) {
                membershipToRemove = membership;
                break;
            }
        }
        if (membershipToRemove != null) {
            memberships.remove(membershipToRemove);
            System.out.println("Membership removed successfully!");
        } else {
            System.out.println("Membership not found!");
        }
    }


    //Manage Subscription
      public static void manageSubscription(Scanner sc) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Manage Subscription:");
            System.out.println("Please select an Subscription option:");
            System.out.println("1. Renew Subscription");
            System.out.println("2. Cancel Subscription");
            System.out.println("3. View All Subscription");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addSubscription(sc);
                    break;
                case 2:
                    //removeSubscription(sc);
                    break;
                case 3:
                    viewSubscription();
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    public static void addSubscription(Scanner sc) {
        System.out.println("Add Membership:");
        System.out.println("Enter Membership Number:");
        String subscri_ID = sc.next();
        System.out.println("Enter Membership Name:");
        String price = sc.next();
        System.out.println("Enter Membership Name:");
        String description = sc.next();
        Subscription subscriptions = new Subscription( subscri_ID, price, description);
        subscriptions.add(subscriptions);
        System.out.println("Membership added successfully!");
    }

    public static void viewSubscription() {
        System.out.println("All Subscription Level:");
        for (Subscription subscription : subscriptions) {
            System.out.println("Membership Number: " + subscription.getSubscri_ID());
            System.out.println("Name: " + subscription.getPrice());
            System.out.println("Team Organizer: " + subscription.getDescription());
        
            System.out.println();
        }
    }
}
