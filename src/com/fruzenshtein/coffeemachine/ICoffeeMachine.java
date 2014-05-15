package com.fruzenshtein.coffeemachine;

import com.fruzenshtein.containers.IContainer;
import com.fruzenshtein.data.Portion;
import com.fruzenshtein.exceptions.NotEnoughException;

public interface ICoffeeMachine {  
    
    public boolean makeCoffee(Portion portion) throws NotEnoughException;  
    public IContainer getCoffeeContainer();  
    public IContainer getWaterContainer();  
  
} 
