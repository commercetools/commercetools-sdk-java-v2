
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
 * OrderCustomLineItemRemovedMessage
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomLineItemRemovedMessageImpl.class)
public interface OrderCustomLineItemRemovedMessage extends OrderMessage {

    String ORDER_CUSTOM_LINE_ITEM_REMOVED = "OrderCustomLineItemRemoved";

    /**
     *
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public CustomLineItem getCustomLineItem();

    public void setCustomLineItemId(final String customLineItemId);

    public void setCustomLineItem(final CustomLineItem customLineItem);

    public static OrderCustomLineItemRemovedMessage of() {
        return new OrderCustomLineItemRemovedMessageImpl();
    }

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
        instance.setCustomLineItem(template.getCustomLineItem());
        return instance;
    }

    public static OrderCustomLineItemRemovedMessageBuilder builder() {
        return OrderCustomLineItemRemovedMessageBuilder.of();
    }

    public static OrderCustomLineItemRemovedMessageBuilder builder(final OrderCustomLineItemRemovedMessage template) {
        return OrderCustomLineItemRemovedMessageBuilder.of(template);
    }

    default <T> T withOrderCustomLineItemRemovedMessage(Function<OrderCustomLineItemRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomLineItemRemovedMessage>";
            }
        };
    }
}
