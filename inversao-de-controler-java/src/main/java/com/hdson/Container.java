package com.hdson;

import java.util.HashMap;
import java.util.Map;

public class Container {

    private final Map<Class<?>, Object> instances = new HashMap<>();

    public void register(Class<?> type, Object instance) {
        instances.put(type, instance);
    }

    public <T> T resolver(Class<T> type) {
        return type.cast(instances.get(type));
    }
}
