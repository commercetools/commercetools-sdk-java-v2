
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Transition State update action.</p>
 *
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
@JsonDeserialize(as = StagedQuoteStateTransitionMessagePayloadImpl.class)
public interface StagedQuoteStateTransitionMessagePayload extends MessagePayload {

    String STAGED_QUOTE_STATE_TRANSITION = "StagedQuoteStateTransition";

    /**
     *  <p>State of the Quote after the Transition State update action.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>State of the Quote before the Transition State update action.</p>
     */
    @Valid
    @JsonProperty("oldState")
    public StateReference getOldState();

    /**
     *  <p><code>true</code>, if State transition validations were turned off during the Transition State update action.</p>
     */
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateReference state);

    public void setOldState(final StateReference oldState);

    public void setForce(final Boolean force);

    public static StagedQuoteStateTransitionMessagePayload of() {
        return new StagedQuoteStateTransitionMessagePayloadImpl();
    }

    public static StagedQuoteStateTransitionMessagePayload of(final StagedQuoteStateTransitionMessagePayload template) {
        StagedQuoteStateTransitionMessagePayloadImpl instance = new StagedQuoteStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static StagedQuoteStateTransitionMessagePayloadBuilder builder() {
        return StagedQuoteStateTransitionMessagePayloadBuilder.of();
    }

    public static StagedQuoteStateTransitionMessagePayloadBuilder builder(
            final StagedQuoteStateTransitionMessagePayload template) {
        return StagedQuoteStateTransitionMessagePayloadBuilder.of(template);
    }

    default <T> T withStagedQuoteStateTransitionMessagePayload(
            Function<StagedQuoteStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteStateTransitionMessagePayload>";
            }
        };
    }
}
