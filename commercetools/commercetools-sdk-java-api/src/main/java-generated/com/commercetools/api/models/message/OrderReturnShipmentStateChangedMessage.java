
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ReturnShipmentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set ReturnShipmentState update action on Orders and Order Edits.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderReturnShipmentStateChangedMessage orderReturnShipmentStateChangedMessage = OrderReturnShipmentStateChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .returnItemId("{returnItemId}")
 *             .returnShipmentState(ReturnShipmentState.ADVISED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderReturnShipmentStateChangedMessageImpl.class)
public interface OrderReturnShipmentStateChangedMessage extends OrderMessage {

    /**
     * discriminator value for OrderReturnShipmentStateChangedMessage
     */
    String ORDER_RETURN_SHIPMENT_STATE_CHANGED = "OrderReturnShipmentStateChanged";

    /**
     *  <p>Unique identifier of the ReturnItem.</p>
     * @return returnItemId
     */
    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();

    /**
     *  <p>State of the ReturnItem after the Set Return Shipment State update action.</p>
     * @return returnShipmentState
     */
    @NotNull
    @JsonProperty("returnShipmentState")
    public ReturnShipmentState getReturnShipmentState();

    /**
     *  <p>Unique identifier of the ReturnItem.</p>
     * @param returnItemId value to be set
     */

    public void setReturnItemId(final String returnItemId);

    /**
     *  <p>State of the ReturnItem after the Set Return Shipment State update action.</p>
     * @param returnShipmentState value to be set
     */

    public void setReturnShipmentState(final ReturnShipmentState returnShipmentState);

    /**
     * factory method
     * @return instance of OrderReturnShipmentStateChangedMessage
     */
    public static OrderReturnShipmentStateChangedMessage of() {
        return new OrderReturnShipmentStateChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderReturnShipmentStateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderReturnShipmentStateChangedMessage of(final OrderReturnShipmentStateChangedMessage template) {
        OrderReturnShipmentStateChangedMessageImpl instance = new OrderReturnShipmentStateChangedMessageImpl();
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
        instance.setReturnItemId(template.getReturnItemId());
        instance.setReturnShipmentState(template.getReturnShipmentState());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderReturnShipmentStateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderReturnShipmentStateChangedMessage deepCopy(
            @Nullable final OrderReturnShipmentStateChangedMessage template) {
        if (template == null) {
            return null;
        }
        OrderReturnShipmentStateChangedMessageImpl instance = new OrderReturnShipmentStateChangedMessageImpl();
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
        instance.setReturnItemId(template.getReturnItemId());
        instance.setReturnShipmentState(template.getReturnShipmentState());
        return instance;
    }

    /**
     * builder factory method for OrderReturnShipmentStateChangedMessage
     * @return builder
     */
    public static OrderReturnShipmentStateChangedMessageBuilder builder() {
        return OrderReturnShipmentStateChangedMessageBuilder.of();
    }

    /**
     * create builder for OrderReturnShipmentStateChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderReturnShipmentStateChangedMessageBuilder builder(
            final OrderReturnShipmentStateChangedMessage template) {
        return OrderReturnShipmentStateChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderReturnShipmentStateChangedMessage(
            Function<OrderReturnShipmentStateChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderReturnShipmentStateChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderReturnShipmentStateChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderReturnShipmentStateChangedMessage>";
            }
        };
    }
}
