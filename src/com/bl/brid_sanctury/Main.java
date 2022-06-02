package com.bl.brid_sanctury;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to bird sanctuary program!!");
        UserInterface userInterface = new UserInterface();
        Main main = new Main();
        int choice = 0 ;
        while (choice != 5) {
            choice = userInterface.showMainMenu();
            main.handleUserSelection(choice);
        }
    }
    public void handleUserSelection(int choice) {
        switch (choice) {
            case 1:
                addBird();
                break;
            case 2:
                BirdRepository birdRepository = new BirdRepository();
                birdRepository.printBird();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    void addBird() {
        Duck duck = new Duck();
        duck.age = 2;
        duck.color = "yellow";
        duck.name = "Duck";
        duck.id = "D001";
        duck.isMammal = false;

        Parrot parrot = new Parrot();
        parrot.age = 2;
        parrot.color = "green";
        parrot.name = "Parrot";
        parrot.id = "PA01";
        parrot.isMammal = false;

        Ostrich ostrich = new Ostrich();
        ostrich.age = 3;
        ostrich.color = "Black";
        ostrich.name = "Ostrich";
        ostrich.id = "O001";
        ostrich.isMammal = false;

        Peacock peacock = new Peacock();
        peacock.age = 4;
        peacock.color = "Green";
        peacock.name = "Peacock";
        peacock.id = "PE001";
        peacock.isMammal = false;

        Penguin penguin = new Penguin();
        penguin.age = 3;
        penguin.color = "Black";
        penguin.name = "Penguin";
        penguin.id = "P001";
        penguin.isMammal = false;

        BirdRepository birdRepository = new BirdRepository();
        birdRepository.add(parrot);
        birdRepository.add(peacock);
        birdRepository.add(penguin);
        birdRepository.add(ostrich);
        birdRepository.add(duck);

        birdRepository.getListSize();
        birdRepository.printBird();
    }
}
