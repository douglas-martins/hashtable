package br.univali.kob.model;

import java.util.ArrayList;
import java.util.List;

public class Map<K, V> {
    private List<Hash<K, V>> chains;

    public Map() {
        this.chains = new ArrayList<>();
    }

    /**
     * Insert a object on the Key group on the Map.
     * @param key: K with the value Key of the Object that will be inserted on the Map.
     * @param value: K with the Value of the Object that will be inserted on the Map.
     */
    public void insert(K key, V value) {

    }
}
