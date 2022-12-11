package org.example.infra;

import org.example.api.Pair;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import static java.time.LocalTime.now;

public class PeriodicalScopeConfigurer implements Scope {
    Map<String, Pair<Object, LocalTime>> map = new HashMap<>();

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Pair<Object, LocalTime> pair = map.get(name);
        if (pair == null || now().getSecond() - pair.getValue().getSecond() > 5) {
            pair = new Pair<>(objectFactory.getObject(), now());
            map.put(name, pair);
        }
        return pair.getKey();
    }

    @Override
    public Object remove(String name) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
