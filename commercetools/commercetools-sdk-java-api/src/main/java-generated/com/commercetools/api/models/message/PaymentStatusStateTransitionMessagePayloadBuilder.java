
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
     *  <p>State of the Payment after the Transition State update action.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public PaymentStatusStateTransitionMessagePayloadBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Payment after the Transition State update action.</p>
     * @param state value to be set
     * @return Builder
     */

    public PaymentStatusStateTransitionMessagePayloadBuilder state(
            final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Whether State transition validations were turned off during the Change Transaction State update action.</p>
     * @param force value to be set
     * @return Builder
     */

    public PaymentStatusStateTransitionMessagePayloadBuilder force(final Boolean force) {
        this.force = force;
        return this;
    }

    /**
     *  <p>State of the Payment after the Transition State update action.</p>
     * @return state
     */

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>Whether State transition validations were turned off during the Change Transaction State update action.</p>
     * @return force
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * builds PaymentStatusStateTransitionMessagePayload with checking for non-null required values
     * @return PaymentStatusStateTransitionMessagePayload
     */
    public PaymentStatusStateTransitionMessagePayload build() {
        Objects.requireNonNull(state, PaymentStatusStateTransitionMessagePayload.class + ": state is missing");
        Objects.requireNonNull(force, PaymentStatusStateTransitionMessagePayload.class + ": force is missing");
        return new PaymentStatusStateTransitionMessagePayloadImpl(state, force);
    }

    /**
     * builds PaymentStatusStateTransitionMessagePayload without checking for non-null required values
     * @return PaymentStatusStateTransitionMessagePayload
     */
    public PaymentStatusStateTransitionMessagePayload buildUnchecked() {
        return new PaymentStatusStateTransitionMessagePayloadImpl(state, force);
    }

    /**
     * factory method for an instance of PaymentStatusStateTransitionMessagePayloadBuilder
     * @return builder
     */
    public static PaymentStatusStateTransitionMessagePayloadBuilder of() {
        return new PaymentStatusStateTransitionMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentStatusStateTransitionMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentStatusStateTransitionMessagePayloadBuilder of(
            final PaymentStatusStateTransitionMessagePayload template) {
        PaymentStatusStateTransitionMessagePayloadBuilder builder = new PaymentStatusStateTransitionMessagePayloadBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
