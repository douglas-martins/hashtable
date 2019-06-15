package br.univali.kob.test;

import br.univali.kob.model.Map;

public class MapTest {
    private Map<String, Integer> map;

    public static void main(String[] args) {
        System.out.println("==================== MAP TEST ====================");
        MapTest mapTest = new MapTest();

        // isEmpty() test case
        mapTest.isEmptyTestCase();

        System.out.println("==================== MAP TEST ====================");
    }

    public void isEmptyTestCase() {
        System.out.println("#################### IS EMPTY TEST CASE ####################");
        System.out.println("The Map is empty? " + this.map.isEmpty());
        this.map.print();
        System.out.println("#################### IS EMPTY TEST CASE ####################");
    }

    public void insertTestCase(String key, Integer value) {
        System.out.println("#################### INSERT TEST CASE ####################");
        System.out.println("Try to insert on key " + key + "with the value " + value + "...");
        this.map.insert(key, value);
        this.map.print();
        System.out.println("#################### INSERT TEST CASE ####################");
    }

    public void insertMulTestCase(String[] keys, Integer[] values) {
        System.out.println("#################### INSERT TEST CASE ####################");
            for (int i = 0; i < keys.length; i++) {
                System.out.println("Try to insert on key " + keys[i] + "with the value " + values[i] + "...");
                this.map.insert(keys[i], values[i]);
                this.map.print();
            }
        System.out.println("#################### INSERT TEST CASE ####################");
    }

    public void removeTestCase(String key) {
        System.out.println("#################### REMOVE TEST CASE ####################");
        System.out.println("Try to insert on key " + key + "with the value " + "...");
        this.map.print();
        System.out.println("#################### REMOVE TEST CASE ####################");
    }

    public void getTestCase(String key) {
        System.out.println("#################### GET TEST CASE ####################");
        System.out.println("Try to get value from the key " + key + "...");
        System.out.println(this.map.get(key));
        this.map.print();
        System.out.println("#################### GET TEST CASE ####################");
    }
}
