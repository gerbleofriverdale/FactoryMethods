package interfaceTest.FactoryMethodExample;

public class BurgerFactory {
    public Burger createBurger(String burgerType){
        if("BEEF".equals((burgerType))){
            return new BeefBurger();
        }
        if("VEGGIE".equals(burgerType)){
            return new VeggieBurger();
        }
        return null;
    }   
}
