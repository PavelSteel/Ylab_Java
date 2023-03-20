package HW_lesson03.DatedMap;

import HW_lesson03.DatedMap.DatedMap;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DatedMapImpl implements DatedMap {
    private Map<String, String> dateMap = new HashMap<>();
    private Map<String, Date> dateAddKey = new HashMap<>();

    @Override
    public void put(String key, String value) {
        dateMap.put(key, value);
        dateAddKey.put(key, new Date());
    }

    @Override
    public String get(String key) {
        return dateMap.get(key);
    }

    @Override
    public boolean containsKey(String key) {
        return dateMap.containsKey(key);
    }

    @Override
    public void remove(String key) {
        dateMap.remove(key);
    }

    @Override
    public Set<String> keySet() {
        return dateMap.keySet();
    }

    @Override
    public Date getKeyLastInsertionDate(String key) {
        Date resDate = null;
        if (dateMap.containsKey(key)) {
            resDate = dateAddKey.get(key);
        }
        return resDate;
    }
}
