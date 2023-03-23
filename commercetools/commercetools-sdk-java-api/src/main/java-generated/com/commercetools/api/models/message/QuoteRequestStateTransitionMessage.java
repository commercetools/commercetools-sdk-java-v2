
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
 *     QuoteRequestStateTransitionMessage quoteRequestStateTransitionMessage = QuoteRequestStateTransitionMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestStateTransitionMessageImpl.class)
public interface QuoteRequestStateTransitionMessage extends Message {

    String QUOTE_REQUEST_STATE_TRANSITION = "QuoteRequestStateTransition";

    /**
     *  <p>State of the Quote after the Transition State update action.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>State of the Quote before the Transition State update action.</p>
     * @return oldState
     */
    @Valid
    @JsonProperty("oldState")
    public StateReference getOldState();

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     * @return force
     */
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateReference state);

    public void setOldState(final StateReference oldState);

    public void setForce(final Boolean force);

    public static QuoteRequestStateTransitionMessage of() {
        return new QuoteRequestStateTransitionMessageImpl();
    }

    public static QuoteRequestStateTransitionMessage of(final QuoteRequestStateTransitionMessage template) {
        QuoteRequestStateTransitionMessageImpl instance = new QuoteRequestStateTransitionMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static QuoteRequestStateTransitionMessageBuilder builder() {
        return QuoteRequestStateTransitionMessageBuilder.of();
    }

    public static QuoteRequestStateTransitionMessageBuilder builder(final QuoteRequestStateTransitionMessage template) {
        return QuoteRequestStateTransitionMessageBuilder.of(template);
    }

    default <T> T withQuoteRequestStateTransitionMessage(Function<QuoteRequestStateTransitionMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestStateTransitionMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestStateTransitionMessage>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestStateTransitionMessage>";
            }
        };
    }
}
