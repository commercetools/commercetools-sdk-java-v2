
package com.commercetools.api.models;

public interface ResourceUpdateAction<T extends ResourceUpdateAction<T>> {
    public String getAction();

    default T get() {
        return (T) this;
    }

}
