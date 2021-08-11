
package com.commercetools.api.models.store;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreUpdateBuilder implements Builder<StoreUpdate> {

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
        Objects.requireNonNull(version, StoreUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, StoreUpdate.class + ": actions is missing");
        return new StoreUpdateImpl(version, actions);
    }

    /**
     * builds StoreUpdate without checking for non null required values
     */
    public StoreUpdate buildUnchecked() {
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
