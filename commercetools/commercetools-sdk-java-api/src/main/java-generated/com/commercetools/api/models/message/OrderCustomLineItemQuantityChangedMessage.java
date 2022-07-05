
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomLineItemQuantityChangedMessage
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomLineItemQuantityChangedMessageImpl.class)
public interface OrderCustomLineItemQuantityChangedMessage extends OrderMessage {

    String ORDER_CUSTOM_LINE_ITEM_QUANTITY_CHANGED = "OrderCustomLineItemQuantityChanged";

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
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *
     */
    @NotNull
    @JsonProperty("oldQuantity")
    public Long getOldQuantity();

    public void setCustomLineItemId(final String customLineItemId);

    public void setQuantity(final Long quantity);

    public void setOldQuantity(final Long oldQuantity);

    public static OrderCustomLineItemQuantityChangedMessage of() {
        return new OrderCustomLineItemQuantityChangedMessageImpl();
    }

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
        instance.setQuantity(template.getQuantity());
        instance.setOldQuantity(template.getOldQuantity());
        return instance;
    }

    public static OrderCustomLineItemQuantityChangedMessageBuilder builder() {
        return OrderCustomLineItemQuantityChangedMessageBuilder.of();
    }

    public static OrderCustomLineItemQuantityChangedMessageBuilder builder(
            final OrderCustomLineItemQuantityChangedMessage template) {
        return OrderCustomLineItemQuantityChangedMessageBuilder.of(template);
    }

    default <T> T withOrderCustomLineItemQuantityChangedMessage(
            Function<OrderCustomLineItemQuantityChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemQuantityChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemQuantityChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomLineItemQuantityChangedMessage>";
            }
        };
    }
}
