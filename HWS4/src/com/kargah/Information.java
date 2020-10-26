package com.kargah;


import java.util.Scanner;

public class Information {
    public String name;
   public String getName(){
       return name;
   }
    public void setName(String name) {
        this.name = name;
    }
    public String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String education;

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String job;
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String salary;

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String Receviver;

    public void setReceviver(String receviver) {
        Receviver = receviver;
    }

    public String getReceviver() {
        return Receviver;
    }

   /* public void setinfo() throws InfoException {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a name:");
        String temp = input.nextLine();
        if (temp.isEmpty())
            throw new InfoException("the name is empty");
        else
            setName(temp);
        System.out.println("name is :" );
        temp = input.nextLine();
        if (temp.isEmpty())
            throw new InfoException("the job is empty");
        else
            setJob(temp);
        System.out.println("job is :" );
        temp = input.nextLine();

    }*/
    public void getinfo () throws InfoException {
        Scanner input = new Scanner(System.in);
        System.out.println("enter name receiver: ");
        String temp = input.nextLine();
        this.name = temp;
        if (temp.equals(name)) {
            setReceviver(temp);
            System.out.println("your name is true");
        }
               else throw new InfoException("name is not correct");

        System.out.println("enter id number receiver: ");
        temp = input.nextLine();
        this.id = id;
        if (temp.equals(id)){
            setReceviver(temp);
            System.out.println("your id is true");
        }
        else throw new  InfoException("id is not correct");

        System.out.println("enter edu receiver :");
        temp = input.nextLine();
        this.education = education;
        if (temp.equals(education)){
            setReceviver(temp);
            System.out.println("your edu is true");
        }
        else throw new  InfoException("edu is not correct");
        System.out.println("enter the job reciever");
        temp = input.nextLine();
        this.job = job ;
        if (temp.equals(job)){
            setReceviver(temp);
            System.out.println("your job is true");
        }
        else throw new  InfoException("job is not correct");
        System.out.println("enter salary receiver:");
        temp = input.nextLine();
        this.salary =salary;
        if (temp.equals(salary)){
            setReceviver(temp);
            System.out.println("your salary is true");
        }
        else throw new  InfoException("salary is not correct");

    }
}
