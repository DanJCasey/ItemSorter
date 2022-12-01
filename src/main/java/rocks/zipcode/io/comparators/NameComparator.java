package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {
    @Override
public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());
}
}


//    for(char c : Item)
//    if(o1.getName().compareTo(o2.getName()))
//        return 1;
//    }
//    if(o1.getId() < o2.getId()) {
//        return -1;
//    }
//    if(o1.getId() == o2.getId()){
//        return 0;
//    }
//    return 0;
//
//}
//}
//}
