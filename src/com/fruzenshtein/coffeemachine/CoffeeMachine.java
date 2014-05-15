package com.fruzenshtein.coffeemachine;

import com.fruzenshtein.containers.IContainer;
import com.fruzenshtein.data.Portion;
import com.fruzenshtein.exceptions.NotEnoughException;

public class CoffeeMachine implements ICoffeeMachine {  
	  
    private IContainer coffeeContainer;  
    private IContainer waterContainer;  
  
    public CoffeeMachine(IContainer cContainer, IContainer wContainer) {  
        coffeeContainer = cContainer;  
        waterContainer = wContainer;  
    }  
  
    @Override  
    public boolean makeCoffee(Portion portion) throws NotEnoughException {  
          
        boolean isEnoughCoffee = coffeeContainer.getPortion(portion);  
        boolean isEnoughWater = waterContainer.getPortion(portion);  
          
        if (isEnoughCoffee && isEnoughWater) {  
            return true;  
        } else {  
            return false;  
        }  
    }  
  
    @Override  
    public IContainer getWaterContainer() {  
        return waterContainer;  
    }  
  
    @Override  
    public IContainer getCoffeeContainer() {  
        return coffeeContainer;  
    }  
  
}
