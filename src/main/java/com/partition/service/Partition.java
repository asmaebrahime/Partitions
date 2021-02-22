package com.partition.service;

import java.util.List;

public interface Partition<T> {
    public List<List<T>> partitionList(List<T> liste, int taille) throws IllegalArgumentException;
}
