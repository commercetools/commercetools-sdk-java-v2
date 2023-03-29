
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.LineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add Line Item update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderLineItemAddedMessage orderLineItemAddedMessage = OrderLineItemAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .addedQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderLineItemAddedMessageImpl.class)
public interface OrderLineItemAddedMessage extends OrderMessage {

    /**
     * discriminator value for OrderLineItemAddedMessage
     */
    String ORDER_LINE_ITEM_ADDED = "OrderLineItemAdded";

    /**
     *  <p>Line Item that was added to the Order.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LineItem getLineItem();

    /**
     *  <p>Quantity of Line Items that were added to the Order.</p>
     * @return addedQuantity
     */
    @NotNull
    @JsonProperty("addedQuantity")
    public Long getAddedQuantity();

    /**
     *  <p>Line Item that was added to the Order.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final LineItem lineItem);

    /**
     *  <p>Quantity of Line Items that were added to the Order.</p>
     * @param addedQuantity value to be set
     */

    public void setAddedQuantity(final Long addedQuantity);

    /**
     * factory method
     * @return instance of OrderLineItemAddedMessage
     */
    public static OrderLineItemAddedMessage of() {
        return new OrderLineItemAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderLineItemAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderLineItemAddedMessage of(final OrderLineItemAddedMessage template) {
        OrderLineItemAddedMessageImpl instance = new OrderLineItemAddedMessageImpl();
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
        instance.setLineItem(template.getLineItem());
        instance.setAddedQuantity(template.getAddedQuantity());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderLineItemAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderLineItemAddedMessage deepCopy(@Nullable final OrderLineItemAddedMessage template) {
        if (template == null) {
            return null;
        }
        OrderLineItemAddedMessageImpl instance = new OrderLineItemAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(Optional.ofNullable(template.getResource())
                .map(com.commercetools.api.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(Optional.ofNullable(template.getResourceUserProvidedIdentifiers())
                .map(com.commercetools.api.models.message.UserProvidedIdentifiers::deepCopy)
                .orElse(null));
        instance.setLineItem(Optional.ofNullable(template.getLineItem())
                .map(com.commercetools.api.models.cart.LineItem::deepCopy)
                .orElse(null));
        instance.setAddedQuantity(template.getAddedQuantity());
        return instance;
    }

    /**
     * builder factory method for OrderLineItemAddedMessage
     * @return builder
     */
    public static OrderLineItemAddedMessageBuilder builder() {
        return OrderLineItemAddedMessageBuilder.of();
    }

    /**
     * create builder for OrderLineItemAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderLineItemAddedMessageBuilder builder(final OrderLineItemAddedMessage template) {
        return OrderLineItemAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderLineItemAddedMessage(Function<OrderLineItemAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderLineItemAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderLineItemAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderLineItemAddedMessage>";
            }
        };
    }
}
