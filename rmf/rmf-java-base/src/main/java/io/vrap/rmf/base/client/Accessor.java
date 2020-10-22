package io.vrap.rmf.base.client;

public abstract class Accessor<T> {
    private final T value;

    public Accessor(T value) {
        this.value = value;
    }
}
