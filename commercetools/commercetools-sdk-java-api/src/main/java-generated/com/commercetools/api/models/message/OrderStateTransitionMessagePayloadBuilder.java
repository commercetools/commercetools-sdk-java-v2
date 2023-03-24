
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderStateTransitionMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderStateTransitionMessagePayload orderStateTransitionMessagePayload = OrderStateTransitionMessagePayload.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderStateTransitionMessagePayloadBuilder implements Builder<OrderStateTransitionMessagePayload> {

    private com.commercetools.api.models.state.StateReference state;

    @Nullable
    private com.commercetools.api.models.state.StateReference oldState;

    private Boolean force;

    /**
     *  <p>OrderState after the Transition State update action.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public OrderStateTransitionMessagePayloadBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>OrderState after the Transition State update action.</p>
     * @param state value to be set
     * @return Builder
     */

    public OrderStateTransitionMessagePayloadBuilder state(
            final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>OrderState before the Transition State update action.</p>
     * @param builder function to build the oldState value
     * @return Builder
     */

    public OrderStateTransitionMessagePayloadBuilder oldState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.oldState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>OrderState before the Transition State update action.</p>
     * @param oldState value to be set
     * @return Builder
     */

    public OrderStateTransitionMessagePayloadBuilder oldState(
            @Nullable final com.commercetools.api.models.state.StateReference oldState) {
        this.oldState = oldState;
        return this;
    }

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     * @param force value to be set
     * @return Builder
     */

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

    /**
     * builds OrderStateTransitionMessagePayload with checking for non-null required values
     * @return OrderStateTransitionMessagePayload
     */
    public OrderStateTransitionMessagePayload build() {
        Objects.requireNonNull(state, OrderStateTransitionMessagePayload.class + ": state is missing");
        Objects.requireNonNull(force, OrderStateTransitionMessagePayload.class + ": force is missing");
        return new OrderStateTransitionMessagePayloadImpl(state, oldState, force);
    }

    /**
     * builds OrderStateTransitionMessagePayload without checking for non-null required values
     * @return OrderStateTransitionMessagePayload
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
