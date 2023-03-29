
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
 *  <p>Generated after a successful Create Order request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCreatedMessage orderCreatedMessage = OrderCreatedMessage.builder()
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
@JsonDeserialize(as = OrderCreatedMessageImpl.class)
public interface OrderCreatedMessage extends OrderMessage {

    /**
     * discriminator value for OrderCreatedMessage
     */
    String ORDER_CREATED = "OrderCreated";

    /**
     *  <p>Order that was created.</p>
     * @return order
     */
    @NotNull
    @Valid
    @JsonProperty("order")
    public Order getOrder();

    /**
     *  <p>Order that was created.</p>
     * @param order value to be set
     */

    public void setOrder(final Order order);

    /**
     * factory method
     * @return instance of OrderCreatedMessage
     */
    public static OrderCreatedMessage of() {
        return new OrderCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCreatedMessage of(final OrderCreatedMessage template) {
        OrderCreatedMessageImpl instance = new OrderCreatedMessageImpl();
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
     * factory method to create a deep copy of OrderCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCreatedMessage deepCopy(@Nullable final OrderCreatedMessage template) {
        if (template == null) {
            return null;
        }
        OrderCreatedMessageImpl instance = new OrderCreatedMessageImpl();
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
        instance.setOrder(com.commercetools.api.models.order.Order.deepCopy(template.getOrder()));
        return instance;
    }

    /**
     * builder factory method for OrderCreatedMessage
     * @return builder
     */
    public static OrderCreatedMessageBuilder builder() {
        return OrderCreatedMessageBuilder.of();
    }

    /**
     * create builder for OrderCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCreatedMessageBuilder builder(final OrderCreatedMessage template) {
        return OrderCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCreatedMessage(Function<OrderCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCreatedMessage>";
            }
        };
    }
}
