package com.commercetools.api.models;

import java.util.List;

public interface ResourceUpdate<U extends ResourceUpdate<U, T>, T extends ResourceUpdateAction<T>> {

    public Long getVersion();

    public void setVersion(final Long version);

    public List<T> getActions();

    public void setActions(List<T> actions);

    default U get() {
        return (U) this;
    }

}
