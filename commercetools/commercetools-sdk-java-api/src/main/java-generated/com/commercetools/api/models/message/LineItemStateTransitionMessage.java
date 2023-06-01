package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessage;
import com.commercetools.api.models.state.StateReference;
import java.time.ZonedDateTime;
import com.commercetools.api.models.message.LineItemStateTransitionMessageImpl;

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
 *  <p>Generated after a successful Transition Line Item State update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemStateTransitionMessage lineItemStateTransitionMessage = LineItemStateTransitionMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .lineItemId("{lineItemId}")
 *             .transitionDate(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .quantity(0.3)
 *             .fromState(fromStateBuilder -> fromStateBuilder)
 *             .toState(toStateBuilder -> toStateBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = LineItemStateTransitionMessageImpl.class)
public interface LineItemStateTransitionMessage extends OrderMessage {

    /**
     * discriminator value for LineItemStateTransitionMessage
     */
    String LINE_ITEM_STATE_TRANSITION = "LineItemStateTransition";

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    /**
     *  <p>Date and time (UTC) when the transition of the Line Item State was performed.</p>
     * @return transitionDate
     */
    @NotNull
    @JsonProperty("transitionDate")
    public ZonedDateTime getTransitionDate();
    /**
     *  <p>Number of Line Items for which the State was transitioned.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();
    /**
     *  <p>State the Line Item was transitioned from.</p>
     * @return fromState
     */
    @NotNull
    @Valid
    @JsonProperty("fromState")
    public StateReference getFromState();
    /**
     *  <p>State the Line Item was transitioned to.</p>
     * @return toState
     */
    @NotNull
    @Valid
    @JsonProperty("toState")
    public StateReference getToState();

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @param lineItemId value to be set
     */
    
    public void setLineItemId(final String lineItemId);
    
    
    /**
     *  <p>Date and time (UTC) when the transition of the Line Item State was performed.</p>
     * @param transitionDate value to be set
     */
    
    public void setTransitionDate(final ZonedDateTime transitionDate);
    
    
    /**
     *  <p>Number of Line Items for which the State was transitioned.</p>
     * @param quantity value to be set
     */
    
    public void setQuantity(final Long quantity);
    
    
    /**
     *  <p>State the Line Item was transitioned from.</p>
     * @param fromState value to be set
     */
    
    public void setFromState(final StateReference fromState);
    
    
    /**
     *  <p>State the Line Item was transitioned to.</p>
     * @param toState value to be set
     */
    
    public void setToState(final StateReference toState);
    

    /**
     * factory method
     * @return instance of LineItemStateTransitionMessage
     */
    public static LineItemStateTransitionMessage of(){
        return new LineItemStateTransitionMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy LineItemStateTransitionMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static LineItemStateTransitionMessage of(final LineItemStateTransitionMessage template) {
        LineItemStateTransitionMessageImpl instance = new LineItemStateTransitionMessageImpl();
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
        instance.setLineItemId(template.getLineItemId());
        instance.setTransitionDate(template.getTransitionDate());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        return instance;
    }

    /**
     * factory method to create a deep copy of LineItemStateTransitionMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LineItemStateTransitionMessage deepCopy(@Nullable final LineItemStateTransitionMessage template) {
        if (template == null) {
            return null;
        }
        LineItemStateTransitionMessageImpl instance = new LineItemStateTransitionMessageImpl();
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
        instance.setLineItemId(template.getLineItemId());
        instance.setTransitionDate(template.getTransitionDate());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(com.commercetools.api.models.state.StateReference.deepCopy(template.getFromState()));
        instance.setToState(com.commercetools.api.models.state.StateReference.deepCopy(template.getToState()));
        return instance;
    }

    /**
     * builder factory method for LineItemStateTransitionMessage
     * @return builder
     */
    public static LineItemStateTransitionMessageBuilder builder() {
        return LineItemStateTransitionMessageBuilder.of();
    }
    
    /**
     * create builder for LineItemStateTransitionMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemStateTransitionMessageBuilder builder(final LineItemStateTransitionMessage template) {
        return LineItemStateTransitionMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLineItemStateTransitionMessage(Function<LineItemStateTransitionMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LineItemStateTransitionMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItemStateTransitionMessage>() {
            @Override
            public String toString() {
                return "TypeReference<LineItemStateTransitionMessage>";
            }
        };
    }
}
