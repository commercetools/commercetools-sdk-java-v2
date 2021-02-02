
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
@JsonDeserialize(as = CustomLineItemStateTransitionMessageImpl.class)
public interface CustomLineItemStateTransitionMessage extends Message {

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

    @NotNull
    @Valid
    @JsonProperty("fromState")
    public StateReference getFromState();

    @NotNull
    @Valid
    @JsonProperty("toState")
    public StateReference getToState();

    public void setCustomLineItemId(final String customLineItemId);

    public void setTransitionDate(final ZonedDateTime transitionDate);

    public void setQuantity(final Long quantity);

    public void setFromState(final StateReference fromState);

    public void setToState(final StateReference toState);

    public static CustomLineItemStateTransitionMessage of() {
        return new CustomLineItemStateTransitionMessageImpl();
    }

    public static CustomLineItemStateTransitionMessage of(final CustomLineItemStateTransitionMessage template) {
        CustomLineItemStateTransitionMessageImpl instance = new CustomLineItemStateTransitionMessageImpl();
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
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setTransitionDate(template.getTransitionDate());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        return instance;
    }

    public static CustomLineItemStateTransitionMessageBuilder builder() {
        return CustomLineItemStateTransitionMessageBuilder.of();
    }

    public static CustomLineItemStateTransitionMessageBuilder builder(
            final CustomLineItemStateTransitionMessage template) {
        return CustomLineItemStateTransitionMessageBuilder.of(template);
    }

    default <T> T withCustomLineItemStateTransitionMessage(Function<CustomLineItemStateTransitionMessage, T> helper) {
        return helper.apply(this);
    }
}
