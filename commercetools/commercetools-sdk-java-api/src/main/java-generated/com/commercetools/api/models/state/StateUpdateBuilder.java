
package com.commercetools.api.models.state;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StateUpdateBuilder implements Builder<StateUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.state.StateUpdateAction> actions;

    public StateUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public StateUpdateBuilder actions(final com.commercetools.api.models.state.StateUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public StateUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.state.StateUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.state.StateUpdateAction> getActions() {
        return this.actions;
    }

    public StateUpdate build() {
        Objects.requireNonNull(version, StateUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, StateUpdate.class + ": actions is missing");
        return new StateUpdateImpl(version, actions);
    }

    /**
     * builds StateUpdate without checking for non null required values
     */
    public StateUpdate buildUnchecked() {
        return new StateUpdateImpl(version, actions);
    }

    public static StateUpdateBuilder of() {
        return new StateUpdateBuilder();
    }

    public static StateUpdateBuilder of(final StateUpdate template) {
        StateUpdateBuilder builder = new StateUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
