
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CustomLineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomLineItemAddedMessage
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomLineItemAddedMessageImpl.class)
public interface OrderCustomLineItemAddedMessage extends OrderMessage {

    String ORDER_CUSTOM_LINE_ITEM_ADDED = "OrderCustomLineItemAdded";

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public CustomLineItem getCustomLineItem();

    public void setCustomLineItem(final CustomLineItem customLineItem);

    public static OrderCustomLineItemAddedMessage of() {
        return new OrderCustomLineItemAddedMessageImpl();
    }

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

    public static OrderCustomLineItemAddedMessageBuilder builder() {
        return OrderCustomLineItemAddedMessageBuilder.of();
    }

    public static OrderCustomLineItemAddedMessageBuilder builder(final OrderCustomLineItemAddedMessage template) {
        return OrderCustomLineItemAddedMessageBuilder.of(template);
    }

    default <T> T withOrderCustomLineItemAddedMessage(Function<OrderCustomLineItemAddedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomLineItemAddedMessage>";
            }
        };
    }
}
