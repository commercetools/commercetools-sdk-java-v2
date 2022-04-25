
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
@JsonDeserialize(as = OrderImportLineItemStateActionImpl.class)
public interface OrderImportLineItemStateAction extends OrderUpdateAction {

    String IMPORT_LINE_ITEM_STATE = "importLineItemState";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @Valid
    @JsonProperty("state")
    public List<ItemState> getState();

    public void setLineItemId(final String lineItemId);

    @JsonIgnore
    public void setState(final ItemState... state);

    public void setState(final List<ItemState> state);

    public static OrderImportLineItemStateAction of() {
        return new OrderImportLineItemStateActionImpl();
    }

    public static OrderImportLineItemStateAction of(final OrderImportLineItemStateAction template) {
        OrderImportLineItemStateActionImpl instance = new OrderImportLineItemStateActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setState(template.getState());
        return instance;
    }

    public static OrderImportLineItemStateActionBuilder builder() {
        return OrderImportLineItemStateActionBuilder.of();
    }

    public static OrderImportLineItemStateActionBuilder builder(final OrderImportLineItemStateAction template) {
        return OrderImportLineItemStateActionBuilder.of(template);
    }

    default <T> T withOrderImportLineItemStateAction(Function<OrderImportLineItemStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderImportLineItemStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderImportLineItemStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderImportLineItemStateAction>";
            }
        };
    }
}
