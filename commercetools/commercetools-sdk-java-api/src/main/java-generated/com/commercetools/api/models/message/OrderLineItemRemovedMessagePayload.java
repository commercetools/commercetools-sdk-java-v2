
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

    /**
     * discriminator value for OrderLineItemRemovedMessagePayload
     */
    String ORDER_LINE_ITEM_REMOVED = "OrderLineItemRemoved";

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Quantity of Line Items that were removed during the Remove Line Item update action.</p>
     * @return removedQuantity
     */
    @NotNull
    @JsonProperty("removedQuantity")
    public Long getRemovedQuantity();

    /**
     *  <p>Line Item quantity after the Remove Line Item update action.</p>
     * @return newQuantity
     */
    @NotNull
    @JsonProperty("newQuantity")
    public Long getNewQuantity();

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     * @return newState
     */
    @NotNull
    @Valid
    @JsonProperty("newState")
    public List<ItemState> getNewState();

    /**
     *  <p><code>totalPrice</code> of the Order after the Remove Line Item update action.</p>
     * @return newTotalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("newTotalPrice")
    public CentPrecisionMoney getNewTotalPrice();

    /**
     *  <p>TaxedItemPrice of the Order after the Remove Line Item update action.</p>
     * @return newTaxedPrice
     */
    @Valid
    @JsonProperty("newTaxedPrice")
    public TaxedItemPrice getNewTaxedPrice();

    /**
     *  <p>Price of the Order after the Remove Line Item update action.</p>
     * @return newPrice
     */
    @Valid
    @JsonProperty("newPrice")
    public Price getNewPrice();

    /**
     *  <p>Shipping Details of the Order after the Remove Line Item update action.</p>
     * @return newShippingDetail
     */
    @Valid
    @JsonProperty("newShippingDetail")
    public ItemShippingDetails getNewShippingDetail();

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p>Quantity of Line Items that were removed during the Remove Line Item update action.</p>
     * @param removedQuantity value to be set
     */

    public void setRemovedQuantity(final Long removedQuantity);

    /**
     *  <p>Line Item quantity after the Remove Line Item update action.</p>
     * @param newQuantity value to be set
     */

    public void setNewQuantity(final Long newQuantity);

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     * @param newState values to be set
     */

    @JsonIgnore
    public void setNewState(final ItemState... newState);

    /**
     *  <p>ItemStates after the Remove Line Item update action.</p>
     * @param newState values to be set
     */

    public void setNewState(final List<ItemState> newState);

    /**
     *  <p><code>totalPrice</code> of the Order after the Remove Line Item update action.</p>
     * @param newTotalPrice value to be set
     */

    public void setNewTotalPrice(final CentPrecisionMoney newTotalPrice);

    /**
     *  <p>TaxedItemPrice of the Order after the Remove Line Item update action.</p>
     * @param newTaxedPrice value to be set
     */

    public void setNewTaxedPrice(final TaxedItemPrice newTaxedPrice);

    /**
     *  <p>Price of the Order after the Remove Line Item update action.</p>
     * @param newPrice value to be set
     */

    public void setNewPrice(final Price newPrice);

    /**
     *  <p>Shipping Details of the Order after the Remove Line Item update action.</p>
     * @param newShippingDetail value to be set
     */

    public void setNewShippingDetail(final ItemShippingDetails newShippingDetail);

    /**
     * factory method
     * @return instance of OrderLineItemRemovedMessagePayload
     */
    public static OrderLineItemRemovedMessagePayload of() {
        return new OrderLineItemRemovedMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of OrderLineItemRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * builder factory method for OrderLineItemRemovedMessagePayload
     * @return builder
     */
    public static OrderLineItemRemovedMessagePayloadBuilder builder() {
        return OrderLineItemRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderLineItemRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderLineItemRemovedMessagePayloadBuilder builder(final OrderLineItemRemovedMessagePayload template) {
        return OrderLineItemRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderLineItemRemovedMessagePayload(Function<OrderLineItemRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderLineItemRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderLineItemRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderLineItemRemovedMessagePayload>";
            }
        };
    }
}
