package za.ac.cput.AshDesign.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2015/03/10.
 */

public class FlyWeightFactory {

    private static FlyWeightFactory factory;
    private Map <String, FlyWeight> flyWeightMap;

    private FlyWeightFactory()
    {
        flyWeightMap = new HashMap<String, FlyWeight> ();
    }

    public static FlyWeightFactory getInstance()
    {
        if (factory == null)
        {
            factory = new FlyWeightFactory();
        }

        return factory;
    }

    public FlyWeight getFlyWeight (String key)
    {
        if (flyWeightMap.containsKey(key))
        {
            return flyWeightMap.get(key);
        }
        else
        {
            FlyWeight flyWeight;
            if ("subtract".equals(key))
            {
                flyWeight = new FlyWeightSubtractor();
            }
            else
            {
                flyWeight = new FlyWeightDivider();

            }

            flyWeightMap.put(key, flyWeight);
            return flyWeight;

        }
    }

}

