
package com.commercetools.api.models;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import javax.annotation.Nullable;

public class MapAccessor<T> {
    private final Map<String, T> map;

    public MapAccessor(Map<String, T> map) {
        this.map = map;
    }

    @Nullable
    public <U> U get(final String key, Function<T, U> mapFn) {
        return Optional.ofNullable(map.get(key)).map(mapFn).orElse(null);
    }

    @Nullable
    public T get(final String key) {
        return map.get(key);
    }
}
