
package com.commercetools.api.models;

/**
 * Interface of a resource with an ID and version
 * @param <T> the type of the underlying model, like category or product.
 */
public interface DomainResource<T extends DomainResource<T>> extends Identifiable<T> {
    public String getId();

    public Long getVersion();

    default T get() {
        return (T) this;
    }
}
