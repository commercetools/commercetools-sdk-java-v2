
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ShipmentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change ShipmentState update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderShipmentStateChangedMessage orderShipmentStateChangedMessage = OrderShipmentStateChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .shipmentState(ShipmentState.SHIPPED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderShipmentStateChangedMessageImpl.class)
public interface OrderShipmentStateChangedMessage extends OrderMessage {

    /**
     * discriminator value for OrderShipmentStateChangedMessage
     */
    String ORDER_SHIPMENT_STATE_CHANGED = "OrderShipmentStateChanged";

    /**
     *  <p>ShipmentState after the Change Shipment State update action.</p>
     * @return shipmentState
     */
    @NotNull
    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    /**
     *  <p>ShipmentState before the Change Shipment State update action.</p>
     * @return oldShipmentState
     */

    @JsonProperty("oldShipmentState")
    public ShipmentState getOldShipmentState();

    /**
     *  <p>ShipmentState after the Change Shipment State update action.</p>
     * @param shipmentState value to be set
     */

    public void setShipmentState(final ShipmentState shipmentState);

    /**
     *  <p>ShipmentState before the Change Shipment State update action.</p>
     * @param oldShipmentState value to be set
     */

    public void setOldShipmentState(final ShipmentState oldShipmentState);

    /**
     * factory method
     * @return instance of OrderShipmentStateChangedMessage
     */
    public static OrderShipmentStateChangedMessage of() {
        return new OrderShipmentStateChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderShipmentStateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderShipmentStateChangedMessage of(final OrderShipmentStateChangedMessage template) {
        OrderShipmentStateChangedMessageImpl instance = new OrderShipmentStateChangedMessageImpl();
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
        instance.setShipmentState(template.getShipmentState());
        instance.setOldShipmentState(template.getOldShipmentState());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderShipmentStateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderShipmentStateChangedMessage deepCopy(@Nullable final OrderShipmentStateChangedMessage template) {
        if (template == null) {
            return null;
        }
        OrderShipmentStateChangedMessageImpl instance = new OrderShipmentStateChangedMessageImpl();
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
        instance.setShipmentState(template.getShipmentState());
        instance.setOldShipmentState(template.getOldShipmentState());
        return instance;
    }

    /**
     * builder factory method for OrderShipmentStateChangedMessage
     * @return builder
     */
    public static OrderShipmentStateChangedMessageBuilder builder() {
        return OrderShipmentStateChangedMessageBuilder.of();
    }

    /**
     * create builder for OrderShipmentStateChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderShipmentStateChangedMessageBuilder builder(final OrderShipmentStateChangedMessage template) {
        return OrderShipmentStateChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderShipmentStateChangedMessage(Function<OrderShipmentStateChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderShipmentStateChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderShipmentStateChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderShipmentStateChangedMessage>";
            }
        };
    }
}
