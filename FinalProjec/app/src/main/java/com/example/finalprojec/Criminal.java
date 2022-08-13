package com.example.finalprojec;

public class Criminal {
    private String name;
    private String age;
    private String desc;
    private String height;
    private String weight;

    //dbHandler = new DBHandler(MainActivity.this);
    //dbHandler.addNewCriminal("George Foyet", "38", "Abusive relationship with father caused hatred for mother. Prolific serial killer that is wanted for 36 other killings. Lost his mother when he was 9.", "5 ft. 11 in.", "121 lbs.", "Topiramate"); //Topiramate is a medicine used for treating headaches
    //dbHandler.addNewCriminal("Spencer Reid", "26", "Lost father when he was 3. Mother has Alzheimers. No criminal history", "6 ft. 3 in.", "111 lbs.", "No medicine.");
    //dbHandler.addNewCriminal("Ian Doyle", "22", "Heavy drug and alcohol addiction. Killed a former member of your team. Former U.S. Marine. Has a recent record of misusing Vicodin.", "5 ft. 12 in.", "106 lbs.", "Vicodin");
    //dbHandler.addNewCriminal("Niall Lewis", "32", "Former stalker and hacker. Victim of sexual abuse by a former male partner. Orphaned at the age of 5. Had a recent leg injury and was treated with Oxycontin.", "5 ft. 9 in.", "121 lbs.", "Oxycontin");
    public Criminal(String name, String age, String desc, String height, String weight){
       this.name = name;
       this.age = age;
       this.desc = desc;
       this.height = height;
       this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getDesc() {
        return desc;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }
}
