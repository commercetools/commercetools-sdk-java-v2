
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.Order;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Order Import.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderImportedMessage orderImportedMessage = OrderImportedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderImportedMessageImpl.class)
public interface OrderImportedMessage extends OrderMessage {

    /**
     * discriminator value for OrderImportedMessage
     */
    String ORDER_IMPORTED = "OrderImported";

    /**
     *  <p>Order that was imported.</p>
     * @return order
     */
    @NotNull
    @Valid
    @JsonProperty("order")
    public Order getOrder();

    /**
     *  <p>Order that was imported.</p>
     * @param order value to be set
     */

    public void setOrder(final Order order);

    /**
     * factory method
     * @return instance of OrderImportedMessage
     */
    public static OrderImportedMessage of() {
        return new OrderImportedMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderImportedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderImportedMessage of(final OrderImportedMessage template) {
        OrderImportedMessageImpl instance = new OrderImportedMessageImpl();
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
        instance.setOrder(template.getOrder());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderImportedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderImportedMessage deepCopy(@Nullable final OrderImportedMessage template) {
        if (template == null) {
            return null;
        }
        OrderImportedMessageImpl instance = new OrderImportedMessageImpl();
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
        instance.setOrder(Optional.ofNullable(template.getOrder())
                .map(com.commercetools.api.models.order.Order::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderImportedMessage
     * @return builder
     */
    public static OrderImportedMessageBuilder builder() {
        return OrderImportedMessageBuilder.of();
    }

    /**
     * create builder for OrderImportedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderImportedMessageBuilder builder(final OrderImportedMessage template) {
        return OrderImportedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderImportedMessage(Function<OrderImportedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderImportedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderImportedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderImportedMessage>";
            }
        };
    }
}
