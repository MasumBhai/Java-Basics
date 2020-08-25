class Student
{
    int roll;
    int classAt;
    Student(){}

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getClassAt() {
        return classAt;
    }

    public void setClassAt(int classAt) {
        this.classAt = classAt;
    }
    
    public void show()
    {
        System.out.println("roll number : " + getRoll() + " is at class : "+ getClassAt());
    }
};

public class Array_of_Objects {
    private static final int MAXX = 100;    //this will act like #define

    public static void main(String[] args) {
        
        Student s[] = new Student[MAXX]; //ekhane space allocate korbe 0 theke 100 porjonto not the 100th place will be allocate
        
        for(int i=1;i<MAXX;i++)
        {
            s[i] = new Student();   //we have to allocated here the array of objects
            s[i].setRoll(i);
            s[i].setClassAt(12);
        }
        for(int i=1;i<MAXX;i++)
        {
            s[i].show();
        }
    }
}
