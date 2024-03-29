
package io.vrap.rmf.base.client;

/**
 * abstract class for accessor implementations
 * @param <T> the underlying value type
 */
public abstract class Accessor<T> {
    protected final T value;

    /**
     * accessor constructor
     * @param value to be accessed
     */
    public Accessor(final T value) {
        this.value = value;
    }
}
