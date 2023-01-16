package com.example.demo;

public class Dog{
private String name = "";
private String breed = "";

public Dog(){  //Default Constructor

}

public Dog(String name,String breed){
setName(name);
setBreed(breed);

}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getBreed() {
    return breed;
}

public void setBreed(String breed) {
    this.breed = breed;
}

@Override
public String toString() {
    return "Dog [name=" + name + ", breed=" + breed + "]";
}




}