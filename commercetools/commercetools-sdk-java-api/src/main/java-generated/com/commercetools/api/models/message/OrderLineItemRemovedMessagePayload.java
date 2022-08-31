
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ItemShippingDetails;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.order.ItemState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Remove Line Item update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderLineItemRemovedMessagePayload orderLineItemRemovedMessagePayload = OrderLineItemRemovedMessagePayload.builder()
 *             .lineItemId("{lineItemId}")
 *             .removedQuantity(0.3)
 *             .newQuantity(0.3)
 *             .plusNewState(newStateBuilder -> newStateBuilder)
 *             .newTotalPrice(newTotalPriceBuilder -> newTotalPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderLineItemRemovedMessagePayloadImpl.class)
public interface OrderLineItemRemovedMessagePayload extends OrderMessagePayload {

    String ORDER_LINE_ITEM_REMOVED = "OrderLineItemRemoved";

    /**
     *  <p>Unique identifier of the Line Item.</p>
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Quantity of Line Items that were removed during the Remove Line Item update action.</p>
     */
    @NotNull
    @JsonProperty("removedQuantity")
    public Long getRemovedQuantity();

    /**
     *  <p>Line Item quantity after the Remove Line Item update action.</p>
     */
    @NotNull
    @JsonProperty("newQuantity")
    public Long getNewQuantity();

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("newState")
    public List<ItemState> getNewState();

    /**
     *  <p><code>totalPrice</code> of the Order after the Remove Line Item update action.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("newTotalPrice")
    public CentPrecisionMoney getNewTotalPrice();

    /**
     *  <p>TaxedItemPrice of the Order after the Remove Line Item update action.</p>
     */
    @Valid
    @JsonProperty("newTaxedPrice")
    public TaxedItemPrice getNewTaxedPrice();

    /**
     *  <p>Price of the Order after the Remove Line Item update action.</p>
     */
    @Valid
    @JsonProperty("newPrice")
    public Price getNewPrice();

    /**
     *  <p>Shipping Details of the Order after the Remove Line Item update action.</p>
     */
    @Valid
    @JsonProperty("newShippingDetail")
    public ItemShippingDetails getNewShippingDetail();

    public void setLineItemId(final String lineItemId);

    public void setRemovedQuantity(final Long removedQuantity);

    public void setNewQuantity(final Long newQuantity);

    @JsonIgnore
    public void setNewState(final ItemState... newState);

    public void setNewState(final List<ItemState> newState);

    public void setNewTotalPrice(final CentPrecisionMoney newTotalPrice);

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
