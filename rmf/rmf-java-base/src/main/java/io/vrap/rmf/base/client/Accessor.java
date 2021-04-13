
package io.vrap.rmf.base.client;

public abstract class Accessor<T> {
    protected final T value;

    public Accessor(final T value) {
        this.value = value;
    }
}
