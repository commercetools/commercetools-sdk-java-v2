
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderTransitionCustomLineItemStateActionImpl.class)
public interface OrderTransitionCustomLineItemStateAction extends OrderUpdateAction {

    String TRANSITION_CUSTOM_LINE_ITEM_STATE = "transitionCustomLineItemState";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    @NotNull
    @Valid
    @JsonProperty("fromState")
    public StateResourceIdentifier getFromState();

    @NotNull
    @Valid
    @JsonProperty("toState")
    public StateResourceIdentifier getToState();

    @JsonProperty("actualTransitionDate")
    public ZonedDateTime getActualTransitionDate();

    public void setCustomLineItemId(final String customLineItemId);

    public void setQuantity(final Long quantity);

    public void setFromState(final StateResourceIdentifier fromState);

    public void setToState(final StateResourceIdentifier toState);

    public void setActualTransitionDate(final ZonedDateTime actualTransitionDate);

    public static OrderTransitionCustomLineItemStateAction of() {
        return new OrderTransitionCustomLineItemStateActionImpl();
    }

    public static OrderTransitionCustomLineItemStateAction of(final OrderTransitionCustomLineItemStateAction template) {
        OrderTransitionCustomLineItemStateActionImpl instance = new OrderTransitionCustomLineItemStateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        instance.setActualTransitionDate(template.getActualTransitionDate());
        return instance;
    }

    public static OrderTransitionCustomLineItemStateActionBuilder builder() {
        return OrderTransitionCustomLineItemStateActionBuilder.of();
    }

    public static OrderTransitionCustomLineItemStateActionBuilder builder(
            final OrderTransitionCustomLineItemStateAction template) {
        return OrderTransitionCustomLineItemStateActionBuilder.of(template);
    }

    default <T> T withOrderTransitionCustomLineItemStateAction(
            Function<OrderTransitionCustomLineItemStateAction, T> helper) {
        return helper.apply(this);
    }
}
