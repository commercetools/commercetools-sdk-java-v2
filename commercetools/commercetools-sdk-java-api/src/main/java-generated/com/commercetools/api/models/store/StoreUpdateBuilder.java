
package com.commercetools.api.models.store;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreUpdateBuilder {

    private Long version;

    private java.util.List<com.commercetools.api.models.store.StoreUpdateAction> actions;

    public StoreUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public StoreUpdateBuilder actions(final com.commercetools.api.models.store.StoreUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public StoreUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.store.StoreUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.store.StoreUpdateAction> getActions() {
        return this.actions;
    }

    public StoreUpdate build() {
        return new StoreUpdateImpl(version, actions);
    }

    public static StoreUpdateBuilder of() {
        return new StoreUpdateBuilder();
    }

    public static StoreUpdateBuilder of(final StoreUpdate template) {
        StoreUpdateBuilder builder = new StoreUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
