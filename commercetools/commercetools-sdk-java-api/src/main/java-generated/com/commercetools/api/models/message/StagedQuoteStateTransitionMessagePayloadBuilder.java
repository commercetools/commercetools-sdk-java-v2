
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteStateTransitionMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteStateTransitionMessagePayload stagedQuoteStateTransitionMessagePayload = StagedQuoteStateTransitionMessagePayload.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteStateTransitionMessagePayloadBuilder
        implements Builder<StagedQuoteStateTransitionMessagePayload> {

    private com.commercetools.api.models.state.StateReference state;

    @Nullable
    private com.commercetools.api.models.state.StateReference oldState;

    private Boolean force;

    /**
     *  <p>State of the Quote after the Transition State update action.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public StagedQuoteStateTransitionMessagePayloadBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Quote after the Transition State update action.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public StagedQuoteStateTransitionMessagePayloadBuilder withState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>State of the Quote after the Transition State update action.</p>
     * @param state value to be set
     * @return Builder
     */

    public StagedQuoteStateTransitionMessagePayloadBuilder state(
            final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>State of the Quote before the Transition State update action.</p>
     * @param builder function to build the oldState value
     * @return Builder
     */

    public StagedQuoteStateTransitionMessagePayloadBuilder oldState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.oldState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Quote before the Transition State update action.</p>
     * @param builder function to build the oldState value
     * @return Builder
     */

    public StagedQuoteStateTransitionMessagePayloadBuilder withOldState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.oldState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>State of the Quote before the Transition State update action.</p>
     * @param oldState value to be set
     * @return Builder
     */

    public StagedQuoteStateTransitionMessagePayloadBuilder oldState(
            @Nullable final com.commercetools.api.models.state.StateReference oldState) {
        this.oldState = oldState;
        return this;
    }

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     * @param force value to be set
     * @return Builder
     */

    public StagedQuoteStateTransitionMessagePayloadBuilder force(final Boolean force) {
        this.force = force;
        return this;
    }

    /**
     *  <p>State of the Quote after the Transition State update action.</p>
     * @return state
     */

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>State of the Quote before the Transition State update action.</p>
     * @return oldState
     */

    @Nullable
    public com.commercetools.api.models.state.StateReference getOldState() {
        return this.oldState;
    }

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     * @return force
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * builds StagedQuoteStateTransitionMessagePayload with checking for non-null required values
     * @return StagedQuoteStateTransitionMessagePayload
     */
    public StagedQuoteStateTransitionMessagePayload build() {
        Objects.requireNonNull(state, StagedQuoteStateTransitionMessagePayload.class + ": state is missing");
        Objects.requireNonNull(force, StagedQuoteStateTransitionMessagePayload.class + ": force is missing");
        return new StagedQuoteStateTransitionMessagePayloadImpl(state, oldState, force);
    }

    /**
     * builds StagedQuoteStateTransitionMessagePayload without checking for non-null required values
     * @return StagedQuoteStateTransitionMessagePayload
     */
    public StagedQuoteStateTransitionMessagePayload buildUnchecked() {
        return new StagedQuoteStateTransitionMessagePayloadImpl(state, oldState, force);
    }

    /**
     * factory method for an instance of StagedQuoteStateTransitionMessagePayloadBuilder
     * @return builder
     */
    public static StagedQuoteStateTransitionMessagePayloadBuilder of() {
        return new StagedQuoteStateTransitionMessagePayloadBuilder();
    }

    /**
     * create builder for StagedQuoteStateTransitionMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteStateTransitionMessagePayloadBuilder of(
            final StagedQuoteStateTransitionMessagePayload template) {
        StagedQuoteStateTransitionMessagePayloadBuilder builder = new StagedQuoteStateTransitionMessagePayloadBuilder();
        builder.state = template.getState();
        builder.oldState = template.getOldState();
        builder.force = template.getForce();
        return builder;
    }

}
