
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
@JsonDeserialize(as = OrderTransitionLineItemStateActionImpl.class)
public interface OrderTransitionLineItemStateAction extends OrderUpdateAction {

    String TRANSITION_LINE_ITEM_STATE = "transitionLineItemState";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
    *  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:State">State</a>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("fromState")
    public StateResourceIdentifier getFromState();

    /**
    *  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:State">State</a>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("toState")
    public StateResourceIdentifier getToState();

    @JsonProperty("actualTransitionDate")
    public ZonedDateTime getActualTransitionDate();

    public void setLineItemId(final String lineItemId);

    public void setQuantity(final Long quantity);

    public void setFromState(final StateResourceIdentifier fromState);

    public void setToState(final StateResourceIdentifier toState);

    public void setActualTransitionDate(final ZonedDateTime actualTransitionDate);

    public static OrderTransitionLineItemStateAction of() {
        return new OrderTransitionLineItemStateActionImpl();
    }

    public static OrderTransitionLineItemStateAction of(final OrderTransitionLineItemStateAction template) {
        OrderTransitionLineItemStateActionImpl instance = new OrderTransitionLineItemStateActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        instance.setActualTransitionDate(template.getActualTransitionDate());
        return instance;
    }

    public static OrderTransitionLineItemStateActionBuilder builder() {
        return OrderTransitionLineItemStateActionBuilder.of();
    }

    public static OrderTransitionLineItemStateActionBuilder builder(final OrderTransitionLineItemStateAction template) {
        return OrderTransitionLineItemStateActionBuilder.of(template);
    }

    default <T> T withOrderTransitionLineItemStateAction(Function<OrderTransitionLineItemStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderTransitionLineItemStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderTransitionLineItemStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderTransitionLineItemStateAction>";
            }
        };
    }
}
