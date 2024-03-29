
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestStateTransitionMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestStateTransitionMessagePayload quoteRequestStateTransitionMessagePayload = QuoteRequestStateTransitionMessagePayload.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestStateTransitionMessagePayloadBuilder
        implements Builder<QuoteRequestStateTransitionMessagePayload> {

    private com.commercetools.api.models.state.StateReference state;

    @Nullable
    private com.commercetools.api.models.state.StateReference oldState;

    private Boolean force;

    /**
     *  <p>State of the Quote after the Transition State update action.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public QuoteRequestStateTransitionMessagePayloadBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Quote after the Transition State update action.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public QuoteRequestStateTransitionMessagePayloadBuilder withState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>State of the Quote after the Transition State update action.</p>
     * @param state value to be set
     * @return Builder
     */

    public QuoteRequestStateTransitionMessagePayloadBuilder state(
            final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>State of the Quote before the Transition State update action.</p>
     * @param builder function to build the oldState value
     * @return Builder
     */

    public QuoteRequestStateTransitionMessagePayloadBuilder oldState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.oldState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Quote before the Transition State update action.</p>
     * @param builder function to build the oldState value
     * @return Builder
     */

    public QuoteRequestStateTransitionMessagePayloadBuilder withOldState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.oldState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>State of the Quote before the Transition State update action.</p>
     * @param oldState value to be set
     * @return Builder
     */

    public QuoteRequestStateTransitionMessagePayloadBuilder oldState(
            @Nullable final com.commercetools.api.models.state.StateReference oldState) {
        this.oldState = oldState;
        return this;
    }

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     * @param force value to be set
     * @return Builder
     */

    public QuoteRequestStateTransitionMessagePayloadBuilder force(final Boolean force) {
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
     * builds QuoteRequestStateTransitionMessagePayload with checking for non-null required values
     * @return QuoteRequestStateTransitionMessagePayload
     */
    public QuoteRequestStateTransitionMessagePayload build() {
        Objects.requireNonNull(state, QuoteRequestStateTransitionMessagePayload.class + ": state is missing");
        Objects.requireNonNull(force, QuoteRequestStateTransitionMessagePayload.class + ": force is missing");
        return new QuoteRequestStateTransitionMessagePayloadImpl(state, oldState, force);
    }

    /**
     * builds QuoteRequestStateTransitionMessagePayload without checking for non-null required values
     * @return QuoteRequestStateTransitionMessagePayload
     */
    public QuoteRequestStateTransitionMessagePayload buildUnchecked() {
        return new QuoteRequestStateTransitionMessagePayloadImpl(state, oldState, force);
    }

    /**
     * factory method for an instance of QuoteRequestStateTransitionMessagePayloadBuilder
     * @return builder
     */
    public static QuoteRequestStateTransitionMessagePayloadBuilder of() {
        return new QuoteRequestStateTransitionMessagePayloadBuilder();
    }

    /**
     * create builder for QuoteRequestStateTransitionMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestStateTransitionMessagePayloadBuilder of(
            final QuoteRequestStateTransitionMessagePayload template) {
        QuoteRequestStateTransitionMessagePayloadBuilder builder = new QuoteRequestStateTransitionMessagePayloadBuilder();
        builder.state = template.getState();
        builder.oldState = template.getOldState();
        builder.force = template.getForce();
        return builder;
    }

}
