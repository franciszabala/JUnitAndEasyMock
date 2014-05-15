package com.fruzenshtein.containers;

import com.fruzenshtein.data.Portion;
import com.fruzenshtein.exceptions.NotEnoughException;

public interface IContainer {  
    public boolean getPortion(Portion portion) throws NotEnoughException;  
    public int getCurrentVolume();  
    public int getTotalVolume();  
    public void refillContainer();  
}  