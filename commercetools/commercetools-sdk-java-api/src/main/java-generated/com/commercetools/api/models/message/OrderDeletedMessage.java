
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.Order;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete Order request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderDeletedMessage orderDeletedMessage = OrderDeletedMessage.builder()
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
@JsonDeserialize(as = OrderDeletedMessageImpl.class)
public interface OrderDeletedMessage extends OrderMessage {

    /**
     * discriminator value for OrderDeletedMessage
     */
    String ORDER_DELETED = "OrderDeleted";

    /**
     *  <p>Order that has been deleted.</p>
     * @return order
     */
    @NotNull
    @Valid
    @JsonProperty("order")
    public Order getOrder();

    /**
     *  <p>Order that has been deleted.</p>
     * @param order value to be set
     */

    public void setOrder(final Order order);

    /**
     * factory method
     * @return instance of OrderDeletedMessage
     */
    public static OrderDeletedMessage of() {
        return new OrderDeletedMessageImpl();
    }

    /**
     * factory method to copy an instance of OrderDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderDeletedMessage of(final OrderDeletedMessage template) {
        OrderDeletedMessageImpl instance = new OrderDeletedMessageImpl();
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
     * builder factory method for OrderDeletedMessage
     * @return builder
     */
    public static OrderDeletedMessageBuilder builder() {
        return OrderDeletedMessageBuilder.of();
    }

    /**
     * create builder for OrderDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderDeletedMessageBuilder builder(final OrderDeletedMessage template) {
        return OrderDeletedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderDeletedMessage(Function<OrderDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderDeletedMessage>";
            }
        };
    }
}
