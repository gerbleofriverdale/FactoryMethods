package interfaceTest;
import interfaceTest.FactoryMethodExample.BeefBurger;
import interfaceTest.FactoryMethodExample.Burger;
import interfaceTest.FactoryMethodExample.Restraunt;
import interfaceTest.FactoryMethodExample.VeggieBurger;

public class App {
    public static void main(String[] args) throws Exception {
        Restraunt oliveGarder = new Restraunt();
        oliveGarder.orderBurger("BEEF");
    }
}
