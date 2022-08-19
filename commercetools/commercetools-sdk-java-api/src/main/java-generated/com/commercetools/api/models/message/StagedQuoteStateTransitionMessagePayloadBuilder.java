
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
     */

    public StagedQuoteStateTransitionMessagePayloadBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Quote after the Transition State update action.</p>
     */

    public StagedQuoteStateTransitionMessagePayloadBuilder state(
            final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>State of the Quote before the Transition State update action.</p>
     */

    public StagedQuoteStateTransitionMessagePayloadBuilder oldState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.oldState = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Quote before the Transition State update action.</p>
     */

    public StagedQuoteStateTransitionMessagePayloadBuilder oldState(
            @Nullable final com.commercetools.api.models.state.StateReference oldState) {
        this.oldState = oldState;
        return this;
    }

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     */

    public StagedQuoteStateTransitionMessagePayloadBuilder force(final Boolean force) {
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

    public StagedQuoteStateTransitionMessagePayload build() {
        Objects.requireNonNull(state, StagedQuoteStateTransitionMessagePayload.class + ": state is missing");
        Objects.requireNonNull(force, StagedQuoteStateTransitionMessagePayload.class + ": force is missing");
        return new StagedQuoteStateTransitionMessagePayloadImpl(state, oldState, force);
    }

    /**
     * builds StagedQuoteStateTransitionMessagePayload without checking for non null required values
     */
    public StagedQuoteStateTransitionMessagePayload buildUnchecked() {
        return new StagedQuoteStateTransitionMessagePayloadImpl(state, oldState, force);
    }

    public static StagedQuoteStateTransitionMessagePayloadBuilder of() {
        return new StagedQuoteStateTransitionMessagePayloadBuilder();
    }

    public static StagedQuoteStateTransitionMessagePayloadBuilder of(
            final StagedQuoteStateTransitionMessagePayload template) {
        StagedQuoteStateTransitionMessagePayloadBuilder builder = new StagedQuoteStateTransitionMessagePayloadBuilder();
        builder.state = template.getState();
        builder.oldState = template.getOldState();
        builder.force = template.getForce();
        return builder;
    }

}
