package com.company;

public class User {
    private  String name;
     private  int age;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name)throws  IllegalNameLengthException {

        if(name.length()> 20){
            throw  new  IllegalNameLengthException("Введеное имя не соответсвует требованиям ",name);
        }   this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
       if( age<0 || age>100){
           throw  new IllegalAgeException("Возраст не подходит", age);
       }
    }
}
