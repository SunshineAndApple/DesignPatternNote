package sunshine.builder;
/*
Director
 */
public class Waiter {
    public Coffee createCoffeeByDirector(IMakeCoffee imc){
        imc.addName();
        imc.addMilk();
        imc.addCoffee();
        imc.addFroth();
        return imc.createOneCoffee();
    }
}