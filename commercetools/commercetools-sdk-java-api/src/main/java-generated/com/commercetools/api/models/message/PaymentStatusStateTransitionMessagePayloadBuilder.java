
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentStatusStateTransitionMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentStatusStateTransitionMessagePayload paymentStatusStateTransitionMessagePayload = PaymentStatusStateTransitionMessagePayload.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentStatusStateTransitionMessagePayloadBuilder
        implements Builder<PaymentStatusStateTransitionMessagePayload> {

    private com.commercetools.api.models.state.StateReference state;

    private Boolean force;

    /**
     <*  <p>Reference to a State.</p>>
     */

    public PaymentStatusStateTransitionMessagePayloadBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Reference to a State.</p>>
     */

    public PaymentStatusStateTransitionMessagePayloadBuilder state(
            final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     <>
     */

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
        Objects.requireNonNull(state, PaymentStatusStateTransitionMessagePayload.class + ": state is missing");
        Objects.requireNonNull(force, PaymentStatusStateTransitionMessagePayload.class + ": force is missing");
        return new PaymentStatusStateTransitionMessagePayloadImpl(state, force);
    }

    /**
     * builds PaymentStatusStateTransitionMessagePayload without checking for non null required values
     */
    public PaymentStatusStateTransitionMessagePayload buildUnchecked() {
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
