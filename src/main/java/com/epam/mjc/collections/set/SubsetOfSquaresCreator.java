package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> s = new TreeSet<>();
        for (int i = 0; i < sourceList.size(); i++)
            s.add(sourceList.get(i) * sourceList.get(i));
        return s.subSet(lowerBound, upperBound + 1);
    }
}
