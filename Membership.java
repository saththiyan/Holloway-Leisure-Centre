public class  Membership {
    private String number;
    private String name;
    private boolean isTeamOrganizer;
    private String teamName;
    private String dob;
    private String address;
    private String homeTel;
    private String workTel;
    private String email;
    private String doj;

    //Constructor
    public Membership(String number, String name, boolean isTeamOrganizer, String teamName, String dob, String address, String homeTel, String workTel, String email, String doj) {
        this.number = number;
        this.name = name;
        this.isTeamOrganizer = isTeamOrganizer;
        this.teamName = teamName;
        this.dob = dob;
        this.address = address;
        this.homeTel = homeTel;
        this.workTel = workTel;
        this.email = email;
        this.doj = doj;
    }

    // getter methods
    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public boolean getIsTeamOrganizer() {
        return isTeamOrganizer;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getDOB() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public String getWorkTel() {
        return workTel;
    }

    public String getEmail() {
        return email;
    }

    public String getDOJ() {
        return doj;
    }

    public String isTeamOrganizer() {
        return null;
    }

    public String getDob() {
        return null;
    }

    public String getDoj() {
        return null;
    }
}

    

