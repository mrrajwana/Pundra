

import java.util.Scanner;

class pub {
    String pubName = "pub Bogura";
    public void Welcome(){
        System.out.println("Welcome to the pub");
    }   

}




class Student extends pub {

    String studentName,gender;
    int studentId,age;

    public void SetValue(String studentName, String gender, int age){
        this.studentName = studentName;
        this.gender = gender;
        this.age = age;
    }

    public void PrintValue(){
        System.out.println(studentName);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(super.pubName);
    }

    public void Welcome() {
        super.Welcome();
    }


    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = inputScanner.nextLine();

        System.out.println("Enter Your Gender: ");
        String gender = inputScanner.nextLine();

        System.out.println("Enter You age: ");
        int age = inputScanner.nextInt();

        inputScanner.close();

        Student s1 = new Student();


        s1.Welcome();
        s1.SetValue(name, gender, age);
        s1.PrintValue();

    }

