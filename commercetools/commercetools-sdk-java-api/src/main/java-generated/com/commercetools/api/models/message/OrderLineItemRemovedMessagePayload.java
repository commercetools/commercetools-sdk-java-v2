
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ItemShippingDetails;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.order.ItemState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderLineItemRemovedMessagePayloadImpl.class)
public interface OrderLineItemRemovedMessagePayload extends OrderMessagePayload {

    String ORDER_LINE_ITEM_REMOVED = "OrderLineItemRemoved";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @JsonProperty("removedQuantity")
    public Long getRemovedQuantity();

    @NotNull
    @JsonProperty("newQuantity")
    public Long getNewQuantity();

    @NotNull
    @Valid
    @JsonProperty("newState")
    public List<ItemState> getNewState();

    /**
    *  <p>Base polymorphic read-only Money type which is stored in cent precision or high precision. The actual type is determined by the <code>type</code> field.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("newTotalPrice")
    public TypedMoney getNewTotalPrice();

    @Valid
    @JsonProperty("newTaxedPrice")
    public TaxedItemPrice getNewTaxedPrice();

    @Valid
    @JsonProperty("newPrice")
    public Price getNewPrice();

    @Valid
    @JsonProperty("newShippingDetail")
    public ItemShippingDetails getNewShippingDetail();

    public void setLineItemId(final String lineItemId);

    public void setRemovedQuantity(final Long removedQuantity);

    public void setNewQuantity(final Long newQuantity);

    @JsonIgnore
    public void setNewState(final ItemState... newState);

    public void setNewState(final List<ItemState> newState);

    public void setNewTotalPrice(final TypedMoney newTotalPrice);

    public void setNewTaxedPrice(final TaxedItemPrice newTaxedPrice);

    public void setNewPrice(final Price newPrice);

    public void setNewShippingDetail(final ItemShippingDetails newShippingDetail);

    public static OrderLineItemRemovedMessagePayload of() {
        return new OrderLineItemRemovedMessagePayloadImpl();
    }

    public static OrderLineItemRemovedMessagePayload of(final OrderLineItemRemovedMessagePayload template) {
        OrderLineItemRemovedMessagePayloadImpl instance = new OrderLineItemRemovedMessagePayloadImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setRemovedQuantity(template.getRemovedQuantity());
        instance.setNewQuantity(template.getNewQuantity());
        instance.setNewState(template.getNewState());
        instance.setNewTotalPrice(template.getNewTotalPrice());
        instance.setNewTaxedPrice(template.getNewTaxedPrice());
        instance.setNewPrice(template.getNewPrice());
        instance.setNewShippingDetail(template.getNewShippingDetail());
        return instance;
    }

    public static OrderLineItemRemovedMessagePayloadBuilder builder() {
        return OrderLineItemRemovedMessagePayloadBuilder.of();
    }

    public static OrderLineItemRemovedMessagePayloadBuilder builder(final OrderLineItemRemovedMessagePayload template) {
        return OrderLineItemRemovedMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderLineItemRemovedMessagePayload(Function<OrderLineItemRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderLineItemRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderLineItemRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderLineItemRemovedMessagePayload>";
            }
        };
    }
}
