package interfaceTest.FactoryMethodExample;

public class Restraunt {
    private BurgerFactory factory = new BurgerFactory();
    
    public Burger orderBurger(String burgerType){
        Burger burger = factory.createBurger(burgerType);
        burger.prepare();
        return burger;
    }

}
