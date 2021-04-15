
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentStatusStateTransitionMessagePayloadBuilder {

    private com.commercetools.api.models.state.StateReference state;

    private Boolean force;

    public PaymentStatusStateTransitionMessagePayloadBuilder state(
            final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    public PaymentStatusStateTransitionMessagePayloadBuilder force(final Boolean force) {
        this.force = force;
        return this;
    }

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    public Boolean getForce() {
        return this.force;
    }

    public PaymentStatusStateTransitionMessagePayload build() {
        return new PaymentStatusStateTransitionMessagePayloadImpl(state, force);
    }

    public static PaymentStatusStateTransitionMessagePayloadBuilder of() {
        return new PaymentStatusStateTransitionMessagePayloadBuilder();
    }

    public static PaymentStatusStateTransitionMessagePayloadBuilder of(
            final PaymentStatusStateTransitionMessagePayload template) {
        PaymentStatusStateTransitionMessagePayloadBuilder builder = new PaymentStatusStateTransitionMessagePayloadBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
