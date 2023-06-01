package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.CustomLineItem;
import com.commercetools.api.models.message.OrderMessage;
import com.commercetools.api.models.message.OrderCustomLineItemAddedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Generated after a successful Add Custom Line Item update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomLineItemAddedMessage orderCustomLineItemAddedMessage = OrderCustomLineItemAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderCustomLineItemAddedMessageImpl.class)
public interface OrderCustomLineItemAddedMessage extends OrderMessage {

    /**
     * discriminator value for OrderCustomLineItemAddedMessage
     */
    String ORDER_CUSTOM_LINE_ITEM_ADDED = "OrderCustomLineItemAdded";

    /**
     *  <p>Custom Line Item that was added to the Order.</p>
     * @return customLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public CustomLineItem getCustomLineItem();

    /**
     *  <p>Custom Line Item that was added to the Order.</p>
     * @param customLineItem value to be set
     */
    
    public void setCustomLineItem(final CustomLineItem customLineItem);
    

    /**
     * factory method
     * @return instance of OrderCustomLineItemAddedMessage
     */
    public static OrderCustomLineItemAddedMessage of(){
        return new OrderCustomLineItemAddedMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderCustomLineItemAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomLineItemAddedMessage of(final OrderCustomLineItemAddedMessage template) {
        OrderCustomLineItemAddedMessageImpl instance = new OrderCustomLineItemAddedMessageImpl();
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
        instance.setCustomLineItem(template.getCustomLineItem());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderCustomLineItemAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomLineItemAddedMessage deepCopy(@Nullable final OrderCustomLineItemAddedMessage template) {
        if (template == null) {
            return null;
        }
        OrderCustomLineItemAddedMessageImpl instance = new OrderCustomLineItemAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers.deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setCustomLineItem(com.commercetools.api.models.cart.CustomLineItem.deepCopy(template.getCustomLineItem()));
        return instance;
    }

    /**
     * builder factory method for OrderCustomLineItemAddedMessage
     * @return builder
     */
    public static OrderCustomLineItemAddedMessageBuilder builder() {
        return OrderCustomLineItemAddedMessageBuilder.of();
    }
    
    /**
     * create builder for OrderCustomLineItemAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomLineItemAddedMessageBuilder builder(final OrderCustomLineItemAddedMessage template) {
        return OrderCustomLineItemAddedMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomLineItemAddedMessage(Function<OrderCustomLineItemAddedMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomLineItemAddedMessage>";
            }
        };
    }
}
