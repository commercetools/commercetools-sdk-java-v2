
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Change CustomLineItem Quantity update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomLineItemQuantityChangedMessage orderCustomLineItemQuantityChangedMessage = OrderCustomLineItemQuantityChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .customLineItemId("{customLineItemId}")
 *             .quantity(0.3)
 *             .oldQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderCustomLineItemQuantityChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomLineItemQuantityChangedMessageImpl.class)
public interface OrderCustomLineItemQuantityChangedMessage extends OrderMessage {

    /**
     * discriminator value for OrderCustomLineItemQuantityChangedMessage
     */
    String ORDER_CUSTOM_LINE_ITEM_QUANTITY_CHANGED = "OrderCustomLineItemQuantityChanged";

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     * @return customLineItemKey
     */

    @JsonProperty("customLineItemKey")
    public String getCustomLineItemKey();

    /**
     *  <p>Custom Line Item quantity after the Change Custom Line Item Quantity update action.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Custom Line Item quantity before the Change Custom Line Item Quantity update action.</p>
     * @return oldQuantity
     */
    @NotNull
    @JsonProperty("oldQuantity")
    public Long getOldQuantity();

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     * @param customLineItemKey value to be set
     */

    public void setCustomLineItemKey(final String customLineItemKey);

    /**
     *  <p>Custom Line Item quantity after the Change Custom Line Item Quantity update action.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>Custom Line Item quantity before the Change Custom Line Item Quantity update action.</p>
     * @param oldQuantity value to be set
     */

    public void setOldQuantity(final Long oldQuantity);

    /**
     * factory method
     * @return instance of OrderCustomLineItemQuantityChangedMessage
     */
    public static OrderCustomLineItemQuantityChangedMessage of() {
        return new OrderCustomLineItemQuantityChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomLineItemQuantityChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomLineItemQuantityChangedMessage of(
            final OrderCustomLineItemQuantityChangedMessage template) {
        OrderCustomLineItemQuantityChangedMessageImpl instance = new OrderCustomLineItemQuantityChangedMessageImpl();
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
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setQuantity(template.getQuantity());
        instance.setOldQuantity(template.getOldQuantity());
        return instance;
    }

    public OrderCustomLineItemQuantityChangedMessage copyDeep();

    /**
     * factory method to create a deep copy of OrderCustomLineItemQuantityChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomLineItemQuantityChangedMessage deepCopy(
            @Nullable final OrderCustomLineItemQuantityChangedMessage template) {
        if (template == null) {
            return null;
        }
        OrderCustomLineItemQuantityChangedMessageImpl instance = new OrderCustomLineItemQuantityChangedMessageImpl();
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
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setQuantity(template.getQuantity());
        instance.setOldQuantity(template.getOldQuantity());
        return instance;
    }

    /**
     * builder factory method for OrderCustomLineItemQuantityChangedMessage
     * @return builder
     */
    public static OrderCustomLineItemQuantityChangedMessageBuilder builder() {
        return OrderCustomLineItemQuantityChangedMessageBuilder.of();
    }

    /**
     * create builder for OrderCustomLineItemQuantityChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomLineItemQuantityChangedMessageBuilder builder(
            final OrderCustomLineItemQuantityChangedMessage template) {
        return OrderCustomLineItemQuantityChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomLineItemQuantityChangedMessage(
            Function<OrderCustomLineItemQuantityChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemQuantityChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemQuantityChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomLineItemQuantityChangedMessage>";
            }
        };
    }
}
