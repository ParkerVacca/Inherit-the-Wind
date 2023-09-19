import java.util.Objects;

public class Person
{
    private String IDNum;
    private String firstName;
    private String lastName;

    private String title;
    private int YOB;
    static private int IDSeed =  1;

    public static void setIDSeed(int IDSeed) {
        Person.IDSeed = IDSeed;
    }

    public static int getIDSeed() {
        return IDSeed;
    }



    public Person(String firstName, String lastName, String IdNum, String title, int YOB)
    {
        this.IDNum = this.genIDNum();
        this.firstName = firstName;
        this.lastName = lastName;
        this.YOB = YOB;
        this.title = title;
    }


    public String getIDNum() {
        return IDNum;
    }

    private String genIDNum() {
        String newID = "" + IDSeed;
        while(newID.length() < 8)
        {
            newID = "0" + newID;
        }

        IDSeed++;

        return newID;
    }

    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String fullName() {
        return getFirstName()+ " " + getLastName();
    }

    public String formalName() {
        return title + " " + fullName();
    }

    public int getAge() {return 2023 - YOB;}

    public int getAge(int year) { return year - YOB;}
















}

