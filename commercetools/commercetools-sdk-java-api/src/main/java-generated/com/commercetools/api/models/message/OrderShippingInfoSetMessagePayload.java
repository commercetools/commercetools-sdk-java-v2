
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
 *     OrderShippingInfoSetMessagePayload orderShippingInfoSetMessagePayload = OrderShippingInfoSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderShippingInfoSetMessagePayloadImpl.class)
public interface OrderShippingInfoSetMessagePayload extends OrderMessagePayload {

    String ORDER_SHIPPING_INFO_SET = "OrderShippingInfoSet";

    /**
     *  <p>ShippingInfo after the Set Shipping Method or Set Custom Shipping Method update action.</p>
     */
    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo();

    /**
     *  <p>ShippingInfo before the Set Shipping Method or Set Custom Shipping Method update action.</p>
     */
    @Valid
    @JsonProperty("oldShippingInfo")
    public ShippingInfo getOldShippingInfo();

    public void setShippingInfo(final ShippingInfo shippingInfo);

    public void setOldShippingInfo(final ShippingInfo oldShippingInfo);

    public static OrderShippingInfoSetMessagePayload of() {
        return new OrderShippingInfoSetMessagePayloadImpl();
    }

    public static OrderShippingInfoSetMessagePayload of(final OrderShippingInfoSetMessagePayload template) {
        OrderShippingInfoSetMessagePayloadImpl instance = new OrderShippingInfoSetMessagePayloadImpl();
        instance.setShippingInfo(template.getShippingInfo());
        instance.setOldShippingInfo(template.getOldShippingInfo());
        return instance;
    }

    public static OrderShippingInfoSetMessagePayloadBuilder builder() {
        return OrderShippingInfoSetMessagePayloadBuilder.of();
    }

    public static OrderShippingInfoSetMessagePayloadBuilder builder(final OrderShippingInfoSetMessagePayload template) {
        return OrderShippingInfoSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderShippingInfoSetMessagePayload(Function<OrderShippingInfoSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderShippingInfoSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderShippingInfoSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderShippingInfoSetMessagePayload>";
            }
        };
    }
}
