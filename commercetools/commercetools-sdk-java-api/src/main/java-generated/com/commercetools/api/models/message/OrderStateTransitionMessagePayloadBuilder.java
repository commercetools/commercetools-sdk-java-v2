
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderStateTransitionMessagePayloadBuilder {

    private com.commercetools.api.models.state.StateReference state;

    private Boolean force;

    public OrderStateTransitionMessagePayloadBuilder state(
            final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    public OrderStateTransitionMessagePayloadBuilder force(final Boolean force) {
        this.force = force;
        return this;
    }

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    public Boolean getForce() {
        return this.force;
    }

    public OrderStateTransitionMessagePayload build() {
        return new OrderStateTransitionMessagePayloadImpl(state, force);
    }

    public static OrderStateTransitionMessagePayloadBuilder of() {
        return new OrderStateTransitionMessagePayloadBuilder();
    }

    public static OrderStateTransitionMessagePayloadBuilder of(final OrderStateTransitionMessagePayload template) {
        OrderStateTransitionMessagePayloadBuilder builder = new OrderStateTransitionMessagePayloadBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
