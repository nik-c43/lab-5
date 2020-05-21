package Controller;

import Organization.Organization;

import java.time.LocalDate;
import java.util.Enumeration;
import java.util.Map;
import java.util.TreeMap;

public class OrganizationCollection {
    private static TreeMap<Integer, Organization> collection; //инициализачия коллекции
    private static LocalDate dateCreation;

    public TreeMap<Integer, Organization> getCollection() {
        return collection;
    }

    public static void setCollection(TreeMap<Integer, Organization> collection) {
        OrganizationCollection.collection = collection;
    }


    public static LocalDate getDateCreation() {
        return dateCreation;
    }

    public static void setDateCreation(LocalDate dateCreation) {
        OrganizationCollection.dateCreation = dateCreation;
    }

    public void clear() {
        collection.clear();
    }

    public void insert(Integer ind, Organization organization) {
        if (this.isKeyFree(ind))
            collection.put(ind, organization);
    }

    public void update(Integer ind, Organization organization) {
        if (!this.isKeyFree(ind))
            collection.put(ind, organization);
    }
    public void remuve(int key){
        collection.remove(key);
    }
    public boolean isKeyFree(Integer ind) {
        try {
            for (Map.Entry<Integer, Organization> entry : collection.entrySet())
                if (entry.getKey() == ind) return false;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;

        }
    }


    public int getSize() {
        return collection.size();
    }

    public String getInfo() {
        return "Тип коллекции: TreeMap;\nKоличество элементов коллекции: " + this.getSize() + ";\nДата создания кол"
                + "лекции: " + this.getDateCreation() + ".";
    }


}
