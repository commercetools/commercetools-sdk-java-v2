package com.commercetools.api.models;

public interface DomainResource<T> {
    public String getId();

    public Long getVersion();

    default T upcast() {
        return (T) this;
    }
}
