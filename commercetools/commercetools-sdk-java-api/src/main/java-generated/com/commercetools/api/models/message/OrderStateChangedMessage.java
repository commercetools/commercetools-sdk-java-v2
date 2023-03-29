
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.OrderState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change Order State update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderStateChangedMessage orderStateChangedMessage = OrderStateChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .orderState(OrderState.OPEN)
 *             .oldOrderState(OrderState.OPEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderStateChangedMessageImpl.class)
public interface OrderStateChangedMessage extends OrderMessage {

    /**
     * discriminator value for OrderStateChangedMessage
     */
    String ORDER_STATE_CHANGED = "OrderStateChanged";

    /**
     *  <p>OrderState after the Change Order State update action.</p>
     * @return orderState
     */
    @NotNull
    @JsonProperty("orderState")
    public OrderState getOrderState();

    /**
     *  <p>OrderState before the Change Order State update action.</p>
     * @return oldOrderState
     */
    @NotNull
    @JsonProperty("oldOrderState")
    public OrderState getOldOrderState();

    /**
     *  <p>OrderState after the Change Order State update action.</p>
     * @param orderState value to be set
     */

    public void setOrderState(final OrderState orderState);

    /**
     *  <p>OrderState before the Change Order State update action.</p>
     * @param oldOrderState value to be set
     */

    public void setOldOrderState(final OrderState oldOrderState);

    /**
     * factory method
     * @return instance of OrderStateChangedMessage
     */
    public static OrderStateChangedMessage of() {
        return new OrderStateChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderStateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderStateChangedMessage of(final OrderStateChangedMessage template) {
        OrderStateChangedMessageImpl instance = new OrderStateChangedMessageImpl();
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
        instance.setOrderState(template.getOrderState());
        instance.setOldOrderState(template.getOldOrderState());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderStateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderStateChangedMessage deepCopy(@Nullable final OrderStateChangedMessage template) {
        if (template == null) {
            return null;
        }
        OrderStateChangedMessageImpl instance = new OrderStateChangedMessageImpl();
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
        instance.setOrderState(template.getOrderState());
        instance.setOldOrderState(template.getOldOrderState());
        return instance;
    }

    /**
     * builder factory method for OrderStateChangedMessage
     * @return builder
     */
    public static OrderStateChangedMessageBuilder builder() {
        return OrderStateChangedMessageBuilder.of();
    }

    /**
     * create builder for OrderStateChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderStateChangedMessageBuilder builder(final OrderStateChangedMessage template) {
        return OrderStateChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderStateChangedMessage(Function<OrderStateChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderStateChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderStateChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderStateChangedMessage>";
            }
        };
    }
}
