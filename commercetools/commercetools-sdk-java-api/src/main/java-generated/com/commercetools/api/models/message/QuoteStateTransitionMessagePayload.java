
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
 *     QuoteStateTransitionMessagePayload quoteStateTransitionMessagePayload = QuoteStateTransitionMessagePayload.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteStateTransitionMessagePayloadImpl.class)
public interface QuoteStateTransitionMessagePayload extends MessagePayload {

    String QUOTE_STATE_TRANSITION = "QuoteStateTransition";

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
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     */
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateReference state);

    public void setOldState(final StateReference oldState);

    public void setForce(final Boolean force);

    public static QuoteStateTransitionMessagePayload of() {
        return new QuoteStateTransitionMessagePayloadImpl();
    }

    public static QuoteStateTransitionMessagePayload of(final QuoteStateTransitionMessagePayload template) {
        QuoteStateTransitionMessagePayloadImpl instance = new QuoteStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static QuoteStateTransitionMessagePayloadBuilder builder() {
        return QuoteStateTransitionMessagePayloadBuilder.of();
    }

    public static QuoteStateTransitionMessagePayloadBuilder builder(final QuoteStateTransitionMessagePayload template) {
        return QuoteStateTransitionMessagePayloadBuilder.of(template);
    }

    default <T> T withQuoteStateTransitionMessagePayload(Function<QuoteStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteStateTransitionMessagePayload>";
            }
        };
    }
}
