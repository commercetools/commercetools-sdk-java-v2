
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Shipping Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderShippingAddressSetMessagePayload orderShippingAddressSetMessagePayload = OrderShippingAddressSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderShippingAddressSetMessagePayloadImpl.class)
public interface OrderShippingAddressSetMessagePayload extends OrderMessagePayload {

    String ORDER_SHIPPING_ADDRESS_SET = "OrderShippingAddressSet";

    /**
     *  <p>Shipping address on the Order after the Set Shipping Address update action.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>Shipping address on the Order before the Set Shipping Address update action.</p>
     * @return oldAddress
     */
    @Valid
    @JsonProperty("oldAddress")
    public Address getOldAddress();

    public void setAddress(final Address address);

    public void setOldAddress(final Address oldAddress);

    public static OrderShippingAddressSetMessagePayload of() {
        return new OrderShippingAddressSetMessagePayloadImpl();
    }

    public static OrderShippingAddressSetMessagePayload of(final OrderShippingAddressSetMessagePayload template) {
        OrderShippingAddressSetMessagePayloadImpl instance = new OrderShippingAddressSetMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        instance.setOldAddress(template.getOldAddress());
        return instance;
    }

    public static OrderShippingAddressSetMessagePayloadBuilder builder() {
        return OrderShippingAddressSetMessagePayloadBuilder.of();
    }

    public static OrderShippingAddressSetMessagePayloadBuilder builder(
            final OrderShippingAddressSetMessagePayload template) {
        return OrderShippingAddressSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderShippingAddressSetMessagePayload(Function<OrderShippingAddressSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderShippingAddressSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderShippingAddressSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderShippingAddressSetMessagePayload>";
            }
        };
    }
}
