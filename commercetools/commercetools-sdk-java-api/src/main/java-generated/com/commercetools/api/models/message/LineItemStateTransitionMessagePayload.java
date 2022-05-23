
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
 * LineItemStateTransitionMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemStateTransitionMessagePayload lineItemStateTransitionMessagePayload = LineItemStateTransitionMessagePayload.builder()
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
@JsonDeserialize(as = LineItemStateTransitionMessagePayloadImpl.class)
public interface LineItemStateTransitionMessagePayload extends OrderMessagePayload {

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

    public static LineItemStateTransitionMessagePayload of() {
        return new LineItemStateTransitionMessagePayloadImpl();
    }

    public static LineItemStateTransitionMessagePayload of(final LineItemStateTransitionMessagePayload template) {
        LineItemStateTransitionMessagePayloadImpl instance = new LineItemStateTransitionMessagePayloadImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setTransitionDate(template.getTransitionDate());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        return instance;
    }

    public static LineItemStateTransitionMessagePayloadBuilder builder() {
        return LineItemStateTransitionMessagePayloadBuilder.of();
    }

    public static LineItemStateTransitionMessagePayloadBuilder builder(
            final LineItemStateTransitionMessagePayload template) {
        return LineItemStateTransitionMessagePayloadBuilder.of(template);
    }

    default <T> T withLineItemStateTransitionMessagePayload(Function<LineItemStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<LineItemStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItemStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<LineItemStateTransitionMessagePayload>";
            }
        };
    }
}
