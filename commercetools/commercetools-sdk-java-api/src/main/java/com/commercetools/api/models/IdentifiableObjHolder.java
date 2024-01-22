
package com.commercetools.api.models;

public interface IdentifiableObjHolder<T> extends Identifiable<T> {
    public T getObj();
}
