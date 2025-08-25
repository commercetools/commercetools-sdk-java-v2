
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderStateTransitionMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderStateTransitionMessagePayload recurringOrderStateTransitionMessagePayload = RecurringOrderStateTransitionMessagePayload.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderStateTransitionMessagePayloadBuilder
        implements Builder<RecurringOrderStateTransitionMessagePayload> {

    private com.commercetools.api.models.state.StateReference state;

    @Nullable
    private com.commercetools.api.models.state.StateReference oldState;

    private Boolean force;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public RecurringOrderStateTransitionMessagePayloadBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public RecurringOrderStateTransitionMessagePayloadBuilder withState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @param state value to be set
     * @return Builder
     */

    public RecurringOrderStateTransitionMessagePayloadBuilder state(
            final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @param builder function to build the oldState value
     * @return Builder
     */

    public RecurringOrderStateTransitionMessagePayloadBuilder oldState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.oldState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @param builder function to build the oldState value
     * @return Builder
     */

    public RecurringOrderStateTransitionMessagePayloadBuilder withOldState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.oldState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @param oldState value to be set
     * @return Builder
     */

    public RecurringOrderStateTransitionMessagePayloadBuilder oldState(
            @Nullable final com.commercetools.api.models.state.StateReference oldState) {
        this.oldState = oldState;
        return this;
    }

    /**
     *  <p>Whether <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> transition validations were turned off during the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @param force value to be set
     * @return Builder
     */

    public RecurringOrderStateTransitionMessagePayloadBuilder force(final Boolean force) {
        this.force = force;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @return state
     */

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderState" rel="nofollow">RecurringOrderState</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @return oldState
     */

    @Nullable
    public com.commercetools.api.models.state.StateReference getOldState() {
        return this.oldState;
    }

    /**
     *  <p>Whether <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> transition validations were turned off during the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderTransitionStateAction" rel="nofollow">Transition State</a> update action.</p>
     * @return force
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * builds RecurringOrderStateTransitionMessagePayload with checking for non-null required values
     * @return RecurringOrderStateTransitionMessagePayload
     */
    public RecurringOrderStateTransitionMessagePayload build() {
        Objects.requireNonNull(state, RecurringOrderStateTransitionMessagePayload.class + ": state is missing");
        Objects.requireNonNull(force, RecurringOrderStateTransitionMessagePayload.class + ": force is missing");
        return new RecurringOrderStateTransitionMessagePayloadImpl(state, oldState, force);
    }

    /**
     * builds RecurringOrderStateTransitionMessagePayload without checking for non-null required values
     * @return RecurringOrderStateTransitionMessagePayload
     */
    public RecurringOrderStateTransitionMessagePayload buildUnchecked() {
        return new RecurringOrderStateTransitionMessagePayloadImpl(state, oldState, force);
    }

    /**
     * factory method for an instance of RecurringOrderStateTransitionMessagePayloadBuilder
     * @return builder
     */
    public static RecurringOrderStateTransitionMessagePayloadBuilder of() {
        return new RecurringOrderStateTransitionMessagePayloadBuilder();
    }

    /**
     * create builder for RecurringOrderStateTransitionMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderStateTransitionMessagePayloadBuilder of(
            final RecurringOrderStateTransitionMessagePayload template) {
        RecurringOrderStateTransitionMessagePayloadBuilder builder = new RecurringOrderStateTransitionMessagePayloadBuilder();
        builder.state = template.getState();
        builder.oldState = template.getOldState();
        builder.force = template.getForce();
        return builder;
    }

}
