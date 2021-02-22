package com.partition.serviceImpl;

import com.partition.service.Partition;

import java.util.ArrayList;
import java.util.List;

public class PartitionImpl<T> implements Partition<T> {
    private final Class<? extends T> cls;

    public PartitionImpl(Class<? extends T> cls) {
        this.cls = cls;
    }

    public List<List<T>> partitionList(List<T> liste, int taille) throws IllegalArgumentException {
        if (liste == null) {
            throw new IllegalArgumentException("la liste ne doit pas etre null");
        }
        if (taille < 1) {
            throw new IllegalArgumentException("taille doit etre superieur ou egale a 1");
        }
        int nombreElementSousListe = (liste.size() / taille) + liste.size() % taille;
        List<List<T>> listePartitione = new ArrayList<List<T>>();
        for (int i = 0; i < nombreElementSousListe; i++) {
            listePartitione.add(liste.subList(i * taille, Math.min(i * taille + taille, liste.size())));
        }

        return listePartitione;
    }
}
