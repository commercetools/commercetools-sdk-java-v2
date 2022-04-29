
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderImportCustomLineItemStateActionImpl.class)
public interface OrderImportCustomLineItemStateAction extends OrderUpdateAction {

    String IMPORT_CUSTOM_LINE_ITEM_STATE = "importCustomLineItemState";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @NotNull
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    public void setCustomLineItemId(final String customLineItemId);

    @JsonIgnore
    public void setState(final ItemState... state);

    public void setState(final List<ItemState> state);

    public static OrderImportCustomLineItemStateAction of() {
        return new OrderImportCustomLineItemStateActionImpl();
    }

    public static OrderImportCustomLineItemStateAction of(final OrderImportCustomLineItemStateAction template) {
        OrderImportCustomLineItemStateActionImpl instance = new OrderImportCustomLineItemStateActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setState(template.getState());
        return instance;
    }

    public static OrderImportCustomLineItemStateActionBuilder builder() {
        return OrderImportCustomLineItemStateActionBuilder.of();
    }

    public static OrderImportCustomLineItemStateActionBuilder builder(
            final OrderImportCustomLineItemStateAction template) {
        return OrderImportCustomLineItemStateActionBuilder.of(template);
    }

    default <T> T withOrderImportCustomLineItemStateAction(Function<OrderImportCustomLineItemStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderImportCustomLineItemStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderImportCustomLineItemStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderImportCustomLineItemStateAction>";
            }
        };
    }
}
