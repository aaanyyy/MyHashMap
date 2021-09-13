package Util;
import lombok.Data;

import java.util.*;

@Data
public class MyHashMap<K,T> {
    @Data
    private static class Node<K,T>
    {
        Node next;
        Object key;
        Object value;
        public final String toString() { return key + "=" + value; }
    }
    private Node [] buckets=new Node[16];

    public int getIndex(K key)
    {
        return key.hashCode()% buckets.length;
    }
    public void put (K key, T value)
    {
        int index =getIndex(key);
        Node node =new Node();
        node.key=key;
        node.value=value;
        if(buckets[index]==null) buckets[index]=node;
        else
        {
            Node current=buckets[index];
            while(current!=null)
            {
                if(current.key.equals(key))
                {
                    current.value=value;
                    break;
                }
                if(current.next==null){
                    current.next=node;
                    break;
                }


                current=current.next;
            }

        }

    }

    public boolean containsKey(K key)
    {
        int index=getIndex(key);
        Node current=buckets[index];
        while(current!=null)
        {
            if(current.key.equals(key))
                return true;
            current=current.next;
        }

        return false;
    }

    public boolean containsValue(T value)
    {
        for (Node current : buckets) {
            while(current!=null)
            {
                if(current.value.equals(value))
                    return true;
                current=current.next;
            }


        }


        return false;
    }

    public boolean remove(K key)
    {
        int index=getIndex(key);
        Node current=buckets[index];
        if (current==null) return false;

        if(current.key.equals(key)) {
            if(current.next==null) {
                buckets[index] = null;
                return true;
            }
            buckets[index] =current.next;
            return true;
        }


        while(current.next!=null)
        {
            if(current.next.key.equals(key))
            {
                current.next=current.next.next;
                return true;
            }
            current=current.next;
        }

        return false;
    }

    public T get(K key)
    {
        int index=getIndex(key);
        Node current=buckets[index];
        while(current!=null)
        {
            if(current.key.equals(key))
                return (T)current.value;
            current=current.next;
        }

        return null;
    }

    public Set<K> keySet()
    {
       Set<K>keys=new HashSet<K>();
        for (Node current : buckets) {

            while(current!=null)
            {
                keys.add((K) current.key);
                current=current.next;
            }
        }

       return keys;

    }


    public Set<T> valueSet()
    {
        Set<T>valuesSet=new HashSet<T>();
        for (Node current : buckets) {

            while(current!=null)
            {
                valuesSet.add((T) current.value);
                current=current.next;
            }
        }

        return valuesSet;

    }

};






