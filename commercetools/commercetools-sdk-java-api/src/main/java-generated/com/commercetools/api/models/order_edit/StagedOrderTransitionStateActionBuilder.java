
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderTransitionStateActionBuilder {

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    @Nullable
    private Boolean force;

    public StagedOrderTransitionStateActionBuilder state(
            final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    public StagedOrderTransitionStateActionBuilder force(@Nullable final Boolean force) {
        this.force = force;
        return this;
    }

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    @Nullable
    public Boolean getForce() {
        return this.force;
    }

    public StagedOrderTransitionStateAction build() {
        return new StagedOrderTransitionStateActionImpl(state, force);
    }

    public static StagedOrderTransitionStateActionBuilder of() {
        return new StagedOrderTransitionStateActionBuilder();
    }

    public static StagedOrderTransitionStateActionBuilder of(final StagedOrderTransitionStateAction template) {
        StagedOrderTransitionStateActionBuilder builder = new StagedOrderTransitionStateActionBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
