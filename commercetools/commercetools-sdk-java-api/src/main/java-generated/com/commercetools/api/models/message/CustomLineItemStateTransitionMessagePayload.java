
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomLineItemStateTransitionMessagePayloadImpl.class)
public interface CustomLineItemStateTransitionMessagePayload extends OrderMessagePayload {

    String CUSTOM_LINE_ITEM_STATE_TRANSITION = "CustomLineItemStateTransition";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @NotNull
    @JsonProperty("transitionDate")
    public ZonedDateTime getTransitionDate();

    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:State">State</a>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("fromState")
    public StateReference getFromState();

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:State">State</a>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("toState")
    public StateReference getToState();

    public void setCustomLineItemId(final String customLineItemId);

    public void setTransitionDate(final ZonedDateTime transitionDate);

    public void setQuantity(final Long quantity);

    public void setFromState(final StateReference fromState);

    public void setToState(final StateReference toState);

    public static CustomLineItemStateTransitionMessagePayload of() {
        return new CustomLineItemStateTransitionMessagePayloadImpl();
    }

    public static CustomLineItemStateTransitionMessagePayload of(
            final CustomLineItemStateTransitionMessagePayload template) {
        CustomLineItemStateTransitionMessagePayloadImpl instance = new CustomLineItemStateTransitionMessagePayloadImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setTransitionDate(template.getTransitionDate());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        return instance;
    }

    public static CustomLineItemStateTransitionMessagePayloadBuilder builder() {
        return CustomLineItemStateTransitionMessagePayloadBuilder.of();
    }

    public static CustomLineItemStateTransitionMessagePayloadBuilder builder(
            final CustomLineItemStateTransitionMessagePayload template) {
        return CustomLineItemStateTransitionMessagePayloadBuilder.of(template);
    }

    default <T> T withCustomLineItemStateTransitionMessagePayload(
            Function<CustomLineItemStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomLineItemStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomLineItemStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomLineItemStateTransitionMessagePayload>";
            }
        };
    }
}
