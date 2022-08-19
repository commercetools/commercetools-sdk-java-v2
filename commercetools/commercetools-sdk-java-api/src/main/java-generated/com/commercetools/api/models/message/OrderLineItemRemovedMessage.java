
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderLineItemRemovedMessageImpl.class)
public interface OrderLineItemRemovedMessage extends OrderMessage {

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

    public static OrderLineItemRemovedMessage of() {
        return new OrderLineItemRemovedMessageImpl();
    }

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
        instance.setRemovedQuantity(template.getRemovedQuantity());
        instance.setNewQuantity(template.getNewQuantity());
        instance.setNewState(template.getNewState());
        instance.setNewTotalPrice(template.getNewTotalPrice());
        instance.setNewTaxedPrice(template.getNewTaxedPrice());
        instance.setNewPrice(template.getNewPrice());
        instance.setNewShippingDetail(template.getNewShippingDetail());
        return instance;
    }

    public static OrderLineItemRemovedMessageBuilder builder() {
        return OrderLineItemRemovedMessageBuilder.of();
    }

    public static OrderLineItemRemovedMessageBuilder builder(final OrderLineItemRemovedMessage template) {
        return OrderLineItemRemovedMessageBuilder.of(template);
    }

    default <T> T withOrderLineItemRemovedMessage(Function<OrderLineItemRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderLineItemRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderLineItemRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderLineItemRemovedMessage>";
            }
        };
    }
}
