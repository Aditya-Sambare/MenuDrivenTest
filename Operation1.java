public class Operation1 {
    public Student[] students = new Student[15];
    static int index = 0;

    void insert( int id , String firstName,String lastName,String city,String techStack,String mobileNumber ) {
        students[index] = new Student(id, firstName, lastName, city, techStack, mobileNumber);
        index++;
    }

    void displayRecords() {
        for (Student student1 : students) {
            if(student1 != null){
            System.out.println("Student id is " + student1.id+"\nfirst name is "+student1.firstName+"\nlast name is "+student1.lastName+"\ncity is "+student1.city+"techstack is "+student1.techStack+"\nmobile number is "+student1.mobileNumber);
        }
        }
    }
    void removeRecord(int id){
        for (Student student1 : students){
            if(student1.id==id){
                student1=null;
            }
        }
    }
    void update( int id , String firstName,String lastName,String city,String techStack,String mobileNumber ){
        for (Student student1 : students){
            if(student1.id==id){
                student1.id=id;
                student1.firstName=firstName;
                student1.lastName=lastName;
                student1.city=city;
                student1.techStack=techStack;
                student1.mobileNumber=mobileNumber;
            }
        }
    }
}