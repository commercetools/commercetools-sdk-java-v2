
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ReturnShipmentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Return Shipment State update action.</p>
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

    String ORDER_RETURN_SHIPMENT_STATE_CHANGED = "OrderReturnShipmentStateChanged";

    /**
     *  <p>Unique identifier of the ReturnItem.</p>
     */
    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();

    /**
     *  <p>State of the ReturnItem after the Set Return Shipment State update action.</p>
     */
    @NotNull
    @JsonProperty("returnShipmentState")
    public ReturnShipmentState getReturnShipmentState();

    public void setReturnItemId(final String returnItemId);

    public void setReturnShipmentState(final ReturnShipmentState returnShipmentState);

    public static OrderReturnShipmentStateChangedMessage of() {
        return new OrderReturnShipmentStateChangedMessageImpl();
    }

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

    public static OrderReturnShipmentStateChangedMessageBuilder builder() {
        return OrderReturnShipmentStateChangedMessageBuilder.of();
    }

    public static OrderReturnShipmentStateChangedMessageBuilder builder(
            final OrderReturnShipmentStateChangedMessage template) {
        return OrderReturnShipmentStateChangedMessageBuilder.of(template);
    }

    default <T> T withOrderReturnShipmentStateChangedMessage(
            Function<OrderReturnShipmentStateChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderReturnShipmentStateChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderReturnShipmentStateChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderReturnShipmentStateChangedMessage>";
            }
        };
    }
}
