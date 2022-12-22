
package com.commercetools.api.models;

public interface DomainResourceUpdateAction<T extends DomainResourceUpdateAction<T, TResource>, TResource extends DomainResource<TResource>> {
    public String getAction();

    default T get() {
        return (T) this;
    }

}
