package lecture;

import java.util.Random;

public class AnonymousClassExample {

    interface Food{
        public void choose();
        public void whichFood();
    }

    public void eat() {

        // Anonymous class
  Food birdsFoodPreference = new Food() {
        public void choose() {
            whichFood();
        }
        public void whichFood() {
       String [] foodItems = {"Insects", "Maize", "G.nuts"};
      System.out.println("Birds like eating "+getRandomFoodChoice(foodItems));
    }
    };

    // Anonymous class
    Food MansFoodPreference = new Food() {
        public void choose() {
            whichFood();
        }
        public void whichFood() {
   String [] foodItems = {"Meat", "Posho", "Rice"};
    System.out.println("Man likes eating "+getRandomFoodChoice(foodItems));
        }
    };

    birdsFoodPreference.choose();
    MansFoodPreference.choose();

    }

    public static void main(String[] args) {
    AnonymousClassExample app = new AnonymousClassExample();
    app.eat();

    }

    public static String getRandomFoodChoice(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

}