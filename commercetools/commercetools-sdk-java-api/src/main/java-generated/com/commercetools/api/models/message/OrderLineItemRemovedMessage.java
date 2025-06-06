
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.ItemShippingDetails;
import com.commercetools.api.models.cart.TaxedItemPrice;
import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.order.ItemState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Remove LineItem update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderLineItemRemovedMessage orderLineItemRemovedMessage = OrderLineItemRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .lineItemId("{lineItemId}")
 *             .removedQuantity(0.3)
 *             .newQuantity(0.3)
 *             .plusNewState(newStateBuilder -> newStateBuilder)
 *             .newTotalPrice(newTotalPriceBuilder -> newTotalPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderLineItemRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderLineItemRemovedMessageImpl.class)
public interface OrderLineItemRemovedMessage extends OrderMessage {

    /**
     * discriminator value for OrderLineItemRemovedMessage
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
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @return lineItemKey
     */

    @JsonProperty("lineItemKey")
    public String getLineItemKey();

    /**
     *  <p>Quantity of Line Items that were removed during the Remove LineItem update action.</p>
     * @return removedQuantity
     */
    @NotNull
    @JsonProperty("removedQuantity")
    public Long getRemovedQuantity();

    /**
     *  <p>Line Item quantity after the Remove LineItem update action.</p>
     * @return newQuantity
     */
    @NotNull
    @JsonProperty("newQuantity")
    public Long getNewQuantity();

    /**
     *  <p>ItemStates after the Remove LineItem update action.</p>
     * @return newState
     */
    @NotNull
    @Valid
    @JsonProperty("newState")
    public List<ItemState> getNewState();

    /**
     *  <p><code>totalPrice</code> of the Order after the Remove LineItem update action.</p>
     * @return newTotalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("newTotalPrice")
    public CentPrecisionMoney getNewTotalPrice();

    /**
     *  <p>TaxedItemPrice of the Order after the Remove LineItem update action.</p>
     * @return newTaxedPrice
     */
    @Valid
    @JsonProperty("newTaxedPrice")
    public TaxedItemPrice getNewTaxedPrice();

    /**
     *  <p>Price of the Order after the Remove LineItem update action.</p>
     * @return newPrice
     */
    @Valid
    @JsonProperty("newPrice")
    public Price getNewPrice();

    /**
     *  <p>Shipping Details of the Order after the Remove LineItem update action.</p>
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
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @param lineItemKey value to be set
     */

    public void setLineItemKey(final String lineItemKey);

    /**
     *  <p>Quantity of Line Items that were removed during the Remove LineItem update action.</p>
     * @param removedQuantity value to be set
     */

    public void setRemovedQuantity(final Long removedQuantity);

    /**
     *  <p>Line Item quantity after the Remove LineItem update action.</p>
     * @param newQuantity value to be set
     */

    public void setNewQuantity(final Long newQuantity);

    /**
     *  <p>ItemStates after the Remove LineItem update action.</p>
     * @param newState values to be set
     */

    @JsonIgnore
    public void setNewState(final ItemState... newState);

    /**
     *  <p>ItemStates after the Remove LineItem update action.</p>
     * @param newState values to be set
     */

    public void setNewState(final List<ItemState> newState);

    /**
     *  <p><code>totalPrice</code> of the Order after the Remove LineItem update action.</p>
     * @param newTotalPrice value to be set
     */

    public void setNewTotalPrice(final CentPrecisionMoney newTotalPrice);

    /**
     *  <p>TaxedItemPrice of the Order after the Remove LineItem update action.</p>
     * @param newTaxedPrice value to be set
     */

    public void setNewTaxedPrice(final TaxedItemPrice newTaxedPrice);

    /**
     *  <p>Price of the Order after the Remove LineItem update action.</p>
     * @param newPrice value to be set
     */

    public void setNewPrice(final Price newPrice);

    /**
     *  <p>Shipping Details of the Order after the Remove LineItem update action.</p>
     * @param newShippingDetail value to be set
     */

    public void setNewShippingDetail(final ItemShippingDetails newShippingDetail);

    /**
     * factory method
     * @return instance of OrderLineItemRemovedMessage
     */
    public static OrderLineItemRemovedMessage of() {
        return new OrderLineItemRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderLineItemRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderLineItemRemovedMessage of(final OrderLineItemRemovedMessage template) {
        OrderLineItemRemovedMessageImpl instance = new OrderLineItemRemovedMessageImpl();
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
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setRemovedQuantity(template.getRemovedQuantity());
        instance.setNewQuantity(template.getNewQuantity());
        instance.setNewState(template.getNewState());
        instance.setNewTotalPrice(template.getNewTotalPrice());
        instance.setNewTaxedPrice(template.getNewTaxedPrice());
        instance.setNewPrice(template.getNewPrice());
        instance.setNewShippingDetail(template.getNewShippingDetail());
        return instance;
    }

    public OrderLineItemRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of OrderLineItemRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderLineItemRemovedMessage deepCopy(@Nullable final OrderLineItemRemovedMessage template) {
        if (template == null) {
            return null;
        }
        OrderLineItemRemovedMessageImpl instance = new OrderLineItemRemovedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setLineItemId(template.getLineItemId());
        instance.setLineItemKey(template.getLineItemKey());
        instance.setRemovedQuantity(template.getRemovedQuantity());
        instance.setNewQuantity(template.getNewQuantity());
        instance.setNewState(Optional.ofNullable(template.getNewState())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ItemState::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNewTotalPrice(
            com.commercetools.api.models.common.CentPrecisionMoney.deepCopy(template.getNewTotalPrice()));
        instance.setNewTaxedPrice(
            com.commercetools.api.models.cart.TaxedItemPrice.deepCopy(template.getNewTaxedPrice()));
        instance.setNewPrice(com.commercetools.api.models.common.Price.deepCopy(template.getNewPrice()));
        instance.setNewShippingDetail(
            com.commercetools.api.models.cart.ItemShippingDetails.deepCopy(template.getNewShippingDetail()));
        return instance;
    }

    /**
     * builder factory method for OrderLineItemRemovedMessage
     * @return builder
     */
    public static OrderLineItemRemovedMessageBuilder builder() {
        return OrderLineItemRemovedMessageBuilder.of();
    }

    /**
     * create builder for OrderLineItemRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderLineItemRemovedMessageBuilder builder(final OrderLineItemRemovedMessage template) {
        return OrderLineItemRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderLineItemRemovedMessage(Function<OrderLineItemRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderLineItemRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderLineItemRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderLineItemRemovedMessage>";
            }
        };
    }
}
