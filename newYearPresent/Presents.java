package hanna_aleksieitseva.newYearPresent;

public class Presents {
    public static void main(String[] args) {
        Sweets sweets = new Sweets();
        sweets.setWeight(12);

        Fruit fruit = new Fruit();
        fruit.setWeight(2);

        Chocolate chocolate = new Chocolate();
        chocolate.setWeight(5);

        Gummy gummy = new Gummy();
        gummy.setWeight(3);

        Other other = new Other();
        other.setWeight(3);

        Cookies cookies = new Cookies();
        cookies.setWeight(2);

        Sweets raffaello   = new Chocolate();
        raffaello.setWeight(23);

        Sweets[] arraySweets = {sweets,chocolate, cookies, fruit, other, gummy, raffaello};
        int totalWeight = 0;
        for (Sweets item: arraySweets){
           totalWeight+= item.getWeight();
        }

        System.out.println("totalWeight = " + totalWeight);

    }


}
