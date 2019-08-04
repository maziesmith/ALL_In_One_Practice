package com.bikloo.allinonepractice;

public class Animal
{
    int imageID;
    String animalName;

    public Animal(int imageID, String animalName) {
        this.imageID = imageID;
        this.animalName = animalName;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
}
