package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.message.QuoteRequestStateTransitionMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = QuoteRequestStateTransitionMessageImpl.class)
public interface QuoteRequestStateTransitionMessage extends Message {

    /**
     * discriminator value for QuoteRequestStateTransitionMessage
     */
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
     * @return instance of QuoteRequestStateTransitionMessage
     */
    public static QuoteRequestStateTransitionMessage of(){
        return new QuoteRequestStateTransitionMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy QuoteRequestStateTransitionMessage
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of QuoteRequestStateTransitionMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QuoteRequestStateTransitionMessage deepCopy(@Nullable final QuoteRequestStateTransitionMessage template) {
        if (template == null) {
            return null;
        }
        QuoteRequestStateTransitionMessageImpl instance = new QuoteRequestStateTransitionMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers.deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setOldState(com.commercetools.api.models.state.StateReference.deepCopy(template.getOldState()));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for QuoteRequestStateTransitionMessage
     * @return builder
     */
    public static QuoteRequestStateTransitionMessageBuilder builder() {
        return QuoteRequestStateTransitionMessageBuilder.of();
    }
    
    /**
     * create builder for QuoteRequestStateTransitionMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QuoteRequestStateTransitionMessageBuilder builder(final QuoteRequestStateTransitionMessage template) {
        return QuoteRequestStateTransitionMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQuoteRequestStateTransitionMessage(Function<QuoteRequestStateTransitionMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestStateTransitionMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestStateTransitionMessage>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestStateTransitionMessage>";
            }
        };
    }
}
