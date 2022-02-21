
package com.commercetools.api.models;

public interface DomainResource<T extends DomainResource<T>> extends Identifiable<T> {
    public String getId();

    public Long getVersion();

    default T get() {
        return (T) this;
    }
}
