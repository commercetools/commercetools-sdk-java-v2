
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.CustomLineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderRemoveCustomLineItemAction" rel="nofollow">Remove CustomLineItem</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomLineItemRemovedMessage orderCustomLineItemRemovedMessage = OrderCustomLineItemRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .customLineItemId("{customLineItemId}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderCustomLineItemRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomLineItemRemovedMessageImpl.class)
public interface OrderCustomLineItemRemovedMessage extends OrderMessage {

    /**
     * discriminator value for OrderCustomLineItemRemovedMessage
     */
    String ORDER_CUSTOM_LINE_ITEM_REMOVED = "OrderCustomLineItemRemoved";

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
     * @return customLineItemKey
     */

    @JsonProperty("customLineItemKey")
    public String getCustomLineItemKey();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @return customLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public CustomLineItem getCustomLineItem();

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
     * @param customLineItemKey value to be set
     */

    public void setCustomLineItemKey(final String customLineItemKey);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param customLineItem value to be set
     */

    public void setCustomLineItem(final CustomLineItem customLineItem);

    /**
     * factory method
     * @return instance of OrderCustomLineItemRemovedMessage
     */
    public static OrderCustomLineItemRemovedMessage of() {
        return new OrderCustomLineItemRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomLineItemRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomLineItemRemovedMessage of(final OrderCustomLineItemRemovedMessage template) {
        OrderCustomLineItemRemovedMessageImpl instance = new OrderCustomLineItemRemovedMessageImpl();
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
        instance.setCustomLineItem(template.getCustomLineItem());
        return instance;
    }

    public OrderCustomLineItemRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of OrderCustomLineItemRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomLineItemRemovedMessage deepCopy(
            @Nullable final OrderCustomLineItemRemovedMessage template) {
        if (template == null) {
            return null;
        }
        OrderCustomLineItemRemovedMessageImpl instance = new OrderCustomLineItemRemovedMessageImpl();
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
        instance.setCustomLineItem(
            com.commercetools.api.models.cart.CustomLineItem.deepCopy(template.getCustomLineItem()));
        return instance;
    }

    /**
     * builder factory method for OrderCustomLineItemRemovedMessage
     * @return builder
     */
    public static OrderCustomLineItemRemovedMessageBuilder builder() {
        return OrderCustomLineItemRemovedMessageBuilder.of();
    }

    /**
     * create builder for OrderCustomLineItemRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomLineItemRemovedMessageBuilder builder(final OrderCustomLineItemRemovedMessage template) {
        return OrderCustomLineItemRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomLineItemRemovedMessage(Function<OrderCustomLineItemRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomLineItemRemovedMessage>";
            }
        };
    }
}
