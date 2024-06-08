
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.ShippingInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Generated after a successful Set ShippingMethod and Set Custom ShippingMethod update actions.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderShippingInfoSetMessage orderShippingInfoSetMessage = OrderShippingInfoSetMessage.builder()
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderShippingInfoSetMessageImpl.class)
public interface OrderShippingInfoSetMessage extends OrderMessage {

    /**
     * discriminator value for OrderShippingInfoSetMessage
     */
    String ORDER_SHIPPING_INFO_SET = "OrderShippingInfoSet";

    /**
     *  <p>ShippingInfo after the Set Shipping Method or Set Custom Shipping Method update action.</p>
     * @return shippingInfo
     */
    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo();

    /**
     *  <p>ShippingInfo before the Set Shipping Method or Set Custom Shipping Method update action.</p>
     * @return oldShippingInfo
     */
    @Valid
    @JsonProperty("oldShippingInfo")
    public ShippingInfo getOldShippingInfo();

    /**
     *  <p>ShippingInfo after the Set Shipping Method or Set Custom Shipping Method update action.</p>
     * @param shippingInfo value to be set
     */

    public void setShippingInfo(final ShippingInfo shippingInfo);

    /**
     *  <p>ShippingInfo before the Set Shipping Method or Set Custom Shipping Method update action.</p>
     * @param oldShippingInfo value to be set
     */

    public void setOldShippingInfo(final ShippingInfo oldShippingInfo);

    /**
     * factory method
     * @return instance of OrderShippingInfoSetMessage
     */
    public static OrderShippingInfoSetMessage of() {
        return new OrderShippingInfoSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderShippingInfoSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderShippingInfoSetMessage of(final OrderShippingInfoSetMessage template) {
        OrderShippingInfoSetMessageImpl instance = new OrderShippingInfoSetMessageImpl();
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
        instance.setShippingInfo(template.getShippingInfo());
        instance.setOldShippingInfo(template.getOldShippingInfo());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderShippingInfoSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderShippingInfoSetMessage deepCopy(@Nullable final OrderShippingInfoSetMessage template) {
        if (template == null) {
            return null;
        }
        OrderShippingInfoSetMessageImpl instance = new OrderShippingInfoSetMessageImpl();
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
        instance.setShippingInfo(com.commercetools.api.models.cart.ShippingInfo.deepCopy(template.getShippingInfo()));
        instance.setOldShippingInfo(
            com.commercetools.api.models.cart.ShippingInfo.deepCopy(template.getOldShippingInfo()));
        return instance;
    }

    /**
     * builder factory method for OrderShippingInfoSetMessage
     * @return builder
     */
    public static OrderShippingInfoSetMessageBuilder builder() {
        return OrderShippingInfoSetMessageBuilder.of();
    }

    /**
     * create builder for OrderShippingInfoSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderShippingInfoSetMessageBuilder builder(final OrderShippingInfoSetMessage template) {
        return OrderShippingInfoSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderShippingInfoSetMessage(Function<OrderShippingInfoSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderShippingInfoSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderShippingInfoSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderShippingInfoSetMessage>";
            }
        };
    }
}
