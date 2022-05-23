
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * LineItemStateTransitionMessage
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LineItemStateTransitionMessageImpl.class)
public interface LineItemStateTransitionMessage extends OrderMessage {

    String LINE_ITEM_STATE_TRANSITION = "LineItemStateTransition";

    /**
     <>
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     <>
     */
    @NotNull
    @JsonProperty("transitionDate")
    public ZonedDateTime getTransitionDate();

    /**
     <>
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     <*  <p>Reference to a State.</p>>
     */
    @NotNull
    @Valid
    @JsonProperty("fromState")
    public StateReference getFromState();

    /**
     <*  <p>Reference to a State.</p>>
     */
    @NotNull
    @Valid
    @JsonProperty("toState")
    public StateReference getToState();

    public void setLineItemId(final String lineItemId);

    public void setTransitionDate(final ZonedDateTime transitionDate);

    public void setQuantity(final Long quantity);

    public void setFromState(final StateReference fromState);

    public void setToState(final StateReference toState);

    public static LineItemStateTransitionMessage of() {
        return new LineItemStateTransitionMessageImpl();
    }

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

    public static LineItemStateTransitionMessageBuilder builder() {
        return LineItemStateTransitionMessageBuilder.of();
    }

    public static LineItemStateTransitionMessageBuilder builder(final LineItemStateTransitionMessage template) {
        return LineItemStateTransitionMessageBuilder.of(template);
    }

    default <T> T withLineItemStateTransitionMessage(Function<LineItemStateTransitionMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<LineItemStateTransitionMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItemStateTransitionMessage>() {
            @Override
            public String toString() {
                return "TypeReference<LineItemStateTransitionMessage>";
            }
        };
    }
}
