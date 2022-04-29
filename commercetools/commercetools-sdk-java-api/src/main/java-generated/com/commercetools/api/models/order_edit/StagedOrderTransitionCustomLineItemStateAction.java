
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderTransitionCustomLineItemStateActionImpl.class)
public interface StagedOrderTransitionCustomLineItemStateAction extends StagedOrderUpdateAction {

    String TRANSITION_CUSTOM_LINE_ITEM_STATE = "transitionCustomLineItemState";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

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

    public void setCustomLineItemId(final String customLineItemId);

    public void setQuantity(final Long quantity);

    public void setFromState(final StateResourceIdentifier fromState);

    public void setToState(final StateResourceIdentifier toState);

    public void setActualTransitionDate(final ZonedDateTime actualTransitionDate);

    public static StagedOrderTransitionCustomLineItemStateAction of() {
        return new StagedOrderTransitionCustomLineItemStateActionImpl();
    }

    public static StagedOrderTransitionCustomLineItemStateAction of(
            final StagedOrderTransitionCustomLineItemStateAction template) {
        StagedOrderTransitionCustomLineItemStateActionImpl instance = new StagedOrderTransitionCustomLineItemStateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setQuantity(template.getQuantity());
        instance.setFromState(template.getFromState());
        instance.setToState(template.getToState());
        instance.setActualTransitionDate(template.getActualTransitionDate());
        return instance;
    }

    public static StagedOrderTransitionCustomLineItemStateActionBuilder builder() {
        return StagedOrderTransitionCustomLineItemStateActionBuilder.of();
    }

    public static StagedOrderTransitionCustomLineItemStateActionBuilder builder(
            final StagedOrderTransitionCustomLineItemStateAction template) {
        return StagedOrderTransitionCustomLineItemStateActionBuilder.of(template);
    }

    default <T> T withStagedOrderTransitionCustomLineItemStateAction(
            Function<StagedOrderTransitionCustomLineItemStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderTransitionCustomLineItemStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderTransitionCustomLineItemStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderTransitionCustomLineItemStateAction>";
            }
        };
    }
}
