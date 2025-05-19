
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.ShippingRateInput;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Generated after a successful Set ShippingRateInput update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderShippingRateInputSetMessage orderShippingRateInputSetMessage = OrderShippingRateInputSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderShippingRateInputSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderShippingRateInputSetMessageImpl.class)
public interface OrderShippingRateInputSetMessage extends OrderMessage {

    /**
     * discriminator value for OrderShippingRateInputSetMessage
     */
    String ORDER_SHIPPING_RATE_INPUT_SET = "OrderShippingRateInputSet";

    /**
     *  <p>ShippingRateInput after the Set ShippingRateInput update action.</p>
     * @return shippingRateInput
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInput getShippingRateInput();

    /**
     *  <p>ShippingRateInput before the Set ShippingRateInput update action.</p>
     * @return oldShippingRateInput
     */
    @Valid
    @JsonProperty("oldShippingRateInput")
    public ShippingRateInput getOldShippingRateInput();

    /**
     *  <p>ShippingRateInput after the Set ShippingRateInput update action.</p>
     * @param shippingRateInput value to be set
     */

    public void setShippingRateInput(final ShippingRateInput shippingRateInput);

    /**
     *  <p>ShippingRateInput before the Set ShippingRateInput update action.</p>
     * @param oldShippingRateInput value to be set
     */

    public void setOldShippingRateInput(final ShippingRateInput oldShippingRateInput);

    /**
     * factory method
     * @return instance of OrderShippingRateInputSetMessage
     */
    public static OrderShippingRateInputSetMessage of() {
        return new OrderShippingRateInputSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderShippingRateInputSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderShippingRateInputSetMessage of(final OrderShippingRateInputSetMessage template) {
        OrderShippingRateInputSetMessageImpl instance = new OrderShippingRateInputSetMessageImpl();
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
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setOldShippingRateInput(template.getOldShippingRateInput());
        return instance;
    }

    public OrderShippingRateInputSetMessage copyDeep();

    /**
     * factory method to create a deep copy of OrderShippingRateInputSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderShippingRateInputSetMessage deepCopy(@Nullable final OrderShippingRateInputSetMessage template) {
        if (template == null) {
            return null;
        }
        OrderShippingRateInputSetMessageImpl instance = new OrderShippingRateInputSetMessageImpl();
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
        instance.setShippingRateInput(
            com.commercetools.api.models.cart.ShippingRateInput.deepCopy(template.getShippingRateInput()));
        instance.setOldShippingRateInput(
            com.commercetools.api.models.cart.ShippingRateInput.deepCopy(template.getOldShippingRateInput()));
        return instance;
    }

    /**
     * builder factory method for OrderShippingRateInputSetMessage
     * @return builder
     */
    public static OrderShippingRateInputSetMessageBuilder builder() {
        return OrderShippingRateInputSetMessageBuilder.of();
    }

    /**
     * create builder for OrderShippingRateInputSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderShippingRateInputSetMessageBuilder builder(final OrderShippingRateInputSetMessage template) {
        return OrderShippingRateInputSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderShippingRateInputSetMessage(Function<OrderShippingRateInputSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderShippingRateInputSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderShippingRateInputSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderShippingRateInputSetMessage>";
            }
        };
    }
}
