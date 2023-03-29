
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
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
 *     QuoteStateTransitionMessage quoteStateTransitionMessage = QuoteStateTransitionMessage.builder()
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
@JsonDeserialize(as = QuoteStateTransitionMessageImpl.class)
public interface QuoteStateTransitionMessage extends Message {

    /**
     * discriminator value for QuoteStateTransitionMessage
     */
    String QUOTE_STATE_TRANSITION = "QuoteStateTransition";

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

    /**
     *  <p>State of the Quote after the Transition State update action.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p>State of the Quote before the Transition State update action.</p>
     * @param oldState value to be set
     */

    public void setOldState(final StateReference oldState);

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     * @param force value to be set
     */

    public void setForce(final Boolean force);

    /**
     * factory method
     * @return instance of QuoteStateTransitionMessage
     */
    public static QuoteStateTransitionMessage of() {
        return new QuoteStateTransitionMessageImpl();
    }

    /**
     * factory method to create a shallow copy QuoteStateTransitionMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static QuoteStateTransitionMessage of(final QuoteStateTransitionMessage template) {
        QuoteStateTransitionMessageImpl instance = new QuoteStateTransitionMessageImpl();
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

    /**
     * factory method to create a deep copy of QuoteStateTransitionMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteStateTransitionMessage deepCopy(@Nullable final QuoteStateTransitionMessage template) {
        if (template == null) {
            return null;
        }
        QuoteStateTransitionMessageImpl instance = new QuoteStateTransitionMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(Optional.ofNullable(template.getResource())
                .map(com.commercetools.api.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(Optional.ofNullable(template.getResourceUserProvidedIdentifiers())
                .map(com.commercetools.api.models.message.UserProvidedIdentifiers::deepCopy)
                .orElse(null));
        instance.setState(Optional.ofNullable(template.getState())
                .map(com.commercetools.api.models.state.StateReference::deepCopy)
                .orElse(null));
        instance.setOldState(Optional.ofNullable(template.getOldState())
                .map(com.commercetools.api.models.state.StateReference::deepCopy)
                .orElse(null));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for QuoteStateTransitionMessage
     * @return builder
     */
    public static QuoteStateTransitionMessageBuilder builder() {
        return QuoteStateTransitionMessageBuilder.of();
    }

    /**
     * create builder for QuoteStateTransitionMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteStateTransitionMessageBuilder builder(final QuoteStateTransitionMessage template) {
        return QuoteStateTransitionMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteStateTransitionMessage(Function<QuoteStateTransitionMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteStateTransitionMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteStateTransitionMessage>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteStateTransitionMessage>";
            }
        };
    }
}
