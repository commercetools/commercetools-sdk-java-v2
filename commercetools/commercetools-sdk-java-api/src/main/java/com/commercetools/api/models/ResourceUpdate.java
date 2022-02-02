
package com.commercetools.api.models;

import java.util.List;

import io.vrap.rmf.base.client.Builder;

public interface ResourceUpdate<U extends ResourceUpdate<U, T, UBuilder>, T extends ResourceUpdateAction<T>, UBuilder extends Builder<U>> {

    public Long getVersion();

    public void setVersion(final Long version);

    public List<T> getActions();

    public void setActions(List<T> actions);

    default U get() {
        return (U) this;
    }
}
