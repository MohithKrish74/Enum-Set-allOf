package com.keyword;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum Movement {UP,BOTTOM,LEFT,RIGHT}
public class EnumSetAllOf
{
    public static void main(String[] args)
    {
        Set<Movement> set = EnumSet.allOf(Movement.class);
        Iterator<Movement> iterate = set.iterator();
        System.out.println("The Movements are: ");
        while(iterate.hasNext())
        {
            System.out.println(iterate.next());
        }

    }
}
