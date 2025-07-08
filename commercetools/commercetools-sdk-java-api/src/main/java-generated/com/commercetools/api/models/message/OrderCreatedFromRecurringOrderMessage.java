
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.recurring_order.RecurringOrderReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after an Order is successfully created according to the defined schedule of a Recurring Order.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCreatedFromRecurringOrderMessage orderCreatedFromRecurringOrderMessage = OrderCreatedFromRecurringOrderMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .order(orderBuilder -> orderBuilder)
 *             .recurringOrderRef(recurringOrderRefBuilder -> recurringOrderRefBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderCreatedFromRecurringOrder")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCreatedFromRecurringOrderMessageImpl.class)
public interface OrderCreatedFromRecurringOrderMessage extends OrderMessage {

    /**
     * discriminator value for OrderCreatedFromRecurringOrderMessage
     */
    String ORDER_CREATED_FROM_RECURRING_ORDER = "OrderCreatedFromRecurringOrder";

    /**
     *  <p>Order that was created.</p>
     * @return order
     */
    @NotNull
    @Valid
    @JsonProperty("order")
    public Order getOrder();

    /**
     *  <p>Reference to the origin Recurring Order.</p>
     * @return recurringOrderRef
     */
    @NotNull
    @Valid
    @JsonProperty("recurringOrderRef")
    public RecurringOrderReference getRecurringOrderRef();

    /**
     *  <p>Order that was created.</p>
     * @param order value to be set
     */

    public void setOrder(final Order order);

    /**
     *  <p>Reference to the origin Recurring Order.</p>
     * @param recurringOrderRef value to be set
     */

    public void setRecurringOrderRef(final RecurringOrderReference recurringOrderRef);

    /**
     * factory method
     * @return instance of OrderCreatedFromRecurringOrderMessage
     */
    public static OrderCreatedFromRecurringOrderMessage of() {
        return new OrderCreatedFromRecurringOrderMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderCreatedFromRecurringOrderMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCreatedFromRecurringOrderMessage of(final OrderCreatedFromRecurringOrderMessage template) {
        OrderCreatedFromRecurringOrderMessageImpl instance = new OrderCreatedFromRecurringOrderMessageImpl();
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
        instance.setRecurringOrderRef(template.getRecurringOrderRef());
        return instance;
    }

    public OrderCreatedFromRecurringOrderMessage copyDeep();

    /**
     * factory method to create a deep copy of OrderCreatedFromRecurringOrderMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCreatedFromRecurringOrderMessage deepCopy(
            @Nullable final OrderCreatedFromRecurringOrderMessage template) {
        if (template == null) {
            return null;
        }
        OrderCreatedFromRecurringOrderMessageImpl instance = new OrderCreatedFromRecurringOrderMessageImpl();
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
        instance.setRecurringOrderRef(com.commercetools.api.models.recurring_order.RecurringOrderReference
                .deepCopy(template.getRecurringOrderRef()));
        return instance;
    }

    /**
     * builder factory method for OrderCreatedFromRecurringOrderMessage
     * @return builder
     */
    public static OrderCreatedFromRecurringOrderMessageBuilder builder() {
        return OrderCreatedFromRecurringOrderMessageBuilder.of();
    }

    /**
     * create builder for OrderCreatedFromRecurringOrderMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCreatedFromRecurringOrderMessageBuilder builder(
            final OrderCreatedFromRecurringOrderMessage template) {
        return OrderCreatedFromRecurringOrderMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCreatedFromRecurringOrderMessage(Function<OrderCreatedFromRecurringOrderMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCreatedFromRecurringOrderMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCreatedFromRecurringOrderMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCreatedFromRecurringOrderMessage>";
            }
        };
    }
}
