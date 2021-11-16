
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderStateTransitionMessagePayloadBuilder implements Builder<OrderStateTransitionMessagePayload> {

    private com.commercetools.api.models.state.StateReference state;

    @Nullable
    private com.commercetools.api.models.state.StateReference oldState;

    private Boolean force;

    public OrderStateTransitionMessagePayloadBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    public OrderStateTransitionMessagePayloadBuilder state(
            final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    public OrderStateTransitionMessagePayloadBuilder oldState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.oldState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    public OrderStateTransitionMessagePayloadBuilder oldState(
            @Nullable final com.commercetools.api.models.state.StateReference oldState) {
        this.oldState = oldState;
        return this;
    }

    public OrderStateTransitionMessagePayloadBuilder force(final Boolean force) {
        this.force = force;
        return this;
    }

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.api.models.state.StateReference getOldState() {
        return this.oldState;
    }

    public Boolean getForce() {
        return this.force;
    }

    public OrderStateTransitionMessagePayload build() {
        Objects.requireNonNull(state, OrderStateTransitionMessagePayload.class + ": state is missing");
        Objects.requireNonNull(force, OrderStateTransitionMessagePayload.class + ": force is missing");
        return new OrderStateTransitionMessagePayloadImpl(state, oldState, force);
    }

    /**
     * builds OrderStateTransitionMessagePayload without checking for non null required values
     */
    public OrderStateTransitionMessagePayload buildUnchecked() {
        return new OrderStateTransitionMessagePayloadImpl(state, oldState, force);
    }

    public static OrderStateTransitionMessagePayloadBuilder of() {
        return new OrderStateTransitionMessagePayloadBuilder();
    }

    public static OrderStateTransitionMessagePayloadBuilder of(final OrderStateTransitionMessagePayload template) {
        OrderStateTransitionMessagePayloadBuilder builder = new OrderStateTransitionMessagePayloadBuilder();
        builder.state = template.getState();
        builder.oldState = template.getOldState();
        builder.force = template.getForce();
        return builder;
    }

}
