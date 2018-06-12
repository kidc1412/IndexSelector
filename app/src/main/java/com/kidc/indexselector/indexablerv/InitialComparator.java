package com.kidc.indexselector.indexablerv;

import java.util.Comparator;


class InitialComparator<T extends IndexAbleEntity> implements Comparator<EntityWrapper<T>> {
    @Override
    public int compare(EntityWrapper<T> lhs, EntityWrapper<T> rhs) {
        return lhs.getIndex().compareTo(rhs.getIndex());
    }
}
