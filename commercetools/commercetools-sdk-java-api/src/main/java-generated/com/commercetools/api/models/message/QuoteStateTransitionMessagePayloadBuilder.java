
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteStateTransitionMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteStateTransitionMessagePayload quoteStateTransitionMessagePayload = QuoteStateTransitionMessagePayload.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteStateTransitionMessagePayloadBuilder implements Builder<QuoteStateTransitionMessagePayload> {

    private com.commercetools.api.models.state.StateReference state;

    @Nullable
    private com.commercetools.api.models.state.StateReference oldState;

    private Boolean force;

    /**
     *  <p>State of the Quote after the Transition State update action.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public QuoteStateTransitionMessagePayloadBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Quote after the Transition State update action.</p>
     * @param state value to be set
     * @return Builder
     */

    public QuoteStateTransitionMessagePayloadBuilder state(
            final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>State of the Quote before the Transition State update action.</p>
     * @param builder function to build the oldState value
     * @return Builder
     */

    public QuoteStateTransitionMessagePayloadBuilder oldState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.oldState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Quote before the Transition State update action.</p>
     * @param oldState value to be set
     * @return Builder
     */

    public QuoteStateTransitionMessagePayloadBuilder oldState(
            @Nullable final com.commercetools.api.models.state.StateReference oldState) {
        this.oldState = oldState;
        return this;
    }

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     * @param force value to be set
     * @return Builder
     */

    public QuoteStateTransitionMessagePayloadBuilder force(final Boolean force) {
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
     * builds QuoteStateTransitionMessagePayload with checking for non-null required values
     * @return QuoteStateTransitionMessagePayload
     */
    public QuoteStateTransitionMessagePayload build() {
        Objects.requireNonNull(state, QuoteStateTransitionMessagePayload.class + ": state is missing");
        Objects.requireNonNull(force, QuoteStateTransitionMessagePayload.class + ": force is missing");
        return new QuoteStateTransitionMessagePayloadImpl(state, oldState, force);
    }

    /**
     * builds QuoteStateTransitionMessagePayload without checking for non-null required values
     * @return QuoteStateTransitionMessagePayload
     */
    public QuoteStateTransitionMessagePayload buildUnchecked() {
        return new QuoteStateTransitionMessagePayloadImpl(state, oldState, force);
    }

    public static QuoteStateTransitionMessagePayloadBuilder of() {
        return new QuoteStateTransitionMessagePayloadBuilder();
    }

    public static QuoteStateTransitionMessagePayloadBuilder of(final QuoteStateTransitionMessagePayload template) {
        QuoteStateTransitionMessagePayloadBuilder builder = new QuoteStateTransitionMessagePayloadBuilder();
        builder.state = template.getState();
        builder.oldState = template.getOldState();
        builder.force = template.getForce();
        return builder;
    }

}
