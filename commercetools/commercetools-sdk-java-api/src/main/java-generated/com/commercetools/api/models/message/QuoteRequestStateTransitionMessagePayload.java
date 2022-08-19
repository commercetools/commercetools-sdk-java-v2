
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
 *     QuoteRequestStateTransitionMessagePayload quoteRequestStateTransitionMessagePayload = QuoteRequestStateTransitionMessagePayload.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestStateTransitionMessagePayloadImpl.class)
public interface QuoteRequestStateTransitionMessagePayload extends MessagePayload {

    String QUOTE_REQUEST_STATE_TRANSITION = "QuoteRequestStateTransition";

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

    public static QuoteRequestStateTransitionMessagePayload of() {
        return new QuoteRequestStateTransitionMessagePayloadImpl();
    }

    public static QuoteRequestStateTransitionMessagePayload of(
            final QuoteRequestStateTransitionMessagePayload template) {
        QuoteRequestStateTransitionMessagePayloadImpl instance = new QuoteRequestStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static QuoteRequestStateTransitionMessagePayloadBuilder builder() {
        return QuoteRequestStateTransitionMessagePayloadBuilder.of();
    }

    public static QuoteRequestStateTransitionMessagePayloadBuilder builder(
            final QuoteRequestStateTransitionMessagePayload template) {
        return QuoteRequestStateTransitionMessagePayloadBuilder.of(template);
    }

    default <T> T withQuoteRequestStateTransitionMessagePayload(
            Function<QuoteRequestStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestStateTransitionMessagePayload>";
            }
        };
    }
}
