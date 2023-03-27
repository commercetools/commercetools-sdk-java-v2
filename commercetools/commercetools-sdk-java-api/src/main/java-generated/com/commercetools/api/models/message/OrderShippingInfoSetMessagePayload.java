
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

    /**
     * discriminator value for OrderShippingInfoSetMessagePayload
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
     * @return instance of OrderShippingInfoSetMessagePayload
     */
    public static OrderShippingInfoSetMessagePayload of() {
        return new OrderShippingInfoSetMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of OrderShippingInfoSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderShippingInfoSetMessagePayload of(final OrderShippingInfoSetMessagePayload template) {
        OrderShippingInfoSetMessagePayloadImpl instance = new OrderShippingInfoSetMessagePayloadImpl();
        instance.setShippingInfo(template.getShippingInfo());
        instance.setOldShippingInfo(template.getOldShippingInfo());
        return instance;
    }

    /**
     * builder factory method for OrderShippingInfoSetMessagePayload
     * @return builder
     */
    public static OrderShippingInfoSetMessagePayloadBuilder builder() {
        return OrderShippingInfoSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderShippingInfoSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderShippingInfoSetMessagePayloadBuilder builder(final OrderShippingInfoSetMessagePayload template) {
        return OrderShippingInfoSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderShippingInfoSetMessagePayload(Function<OrderShippingInfoSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderShippingInfoSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderShippingInfoSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderShippingInfoSetMessagePayload>";
            }
        };
    }
}
