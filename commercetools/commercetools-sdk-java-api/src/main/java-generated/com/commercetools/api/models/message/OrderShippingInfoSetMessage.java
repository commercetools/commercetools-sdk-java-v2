
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.cart.ShippingInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Shipping Method and Set Custom Shipping Method update actions.</p>
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

    public void setShippingInfo(final ShippingInfo shippingInfo);

    public void setOldShippingInfo(final ShippingInfo oldShippingInfo);

    public static OrderShippingInfoSetMessage of() {
        return new OrderShippingInfoSetMessageImpl();
    }

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

    public static OrderShippingInfoSetMessageBuilder builder() {
        return OrderShippingInfoSetMessageBuilder.of();
    }

    public static OrderShippingInfoSetMessageBuilder builder(final OrderShippingInfoSetMessage template) {
        return OrderShippingInfoSetMessageBuilder.of(template);
    }

    default <T> T withOrderShippingInfoSetMessage(Function<OrderShippingInfoSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderShippingInfoSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderShippingInfoSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderShippingInfoSetMessage>";
            }
        };
    }
}
