package studentenrollmentsystem;

public enum Major {
    COMPUTER_SCIENCE("Computer Science"),
    BUSINESS_MANAGEMENT("Business Management"),
    AVIATION("Aviation");

    private String name;

    Major(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
