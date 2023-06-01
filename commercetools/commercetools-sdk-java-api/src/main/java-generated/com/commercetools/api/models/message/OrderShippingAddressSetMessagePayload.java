package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.message.OrderShippingAddressSetMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderShippingAddressSetMessagePayloadImpl.class)
public interface OrderShippingAddressSetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderShippingAddressSetMessagePayload
     */
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

    /**
     *  <p>Shipping address on the Order after the Set Shipping Address update action.</p>
     * @param address value to be set
     */
    
    public void setAddress(final Address address);
    
    
    /**
     *  <p>Shipping address on the Order before the Set Shipping Address update action.</p>
     * @param oldAddress value to be set
     */
    
    public void setOldAddress(final Address oldAddress);
    

    /**
     * factory method
     * @return instance of OrderShippingAddressSetMessagePayload
     */
    public static OrderShippingAddressSetMessagePayload of(){
        return new OrderShippingAddressSetMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderShippingAddressSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderShippingAddressSetMessagePayload of(final OrderShippingAddressSetMessagePayload template) {
        OrderShippingAddressSetMessagePayloadImpl instance = new OrderShippingAddressSetMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        instance.setOldAddress(template.getOldAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderShippingAddressSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderShippingAddressSetMessagePayload deepCopy(@Nullable final OrderShippingAddressSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderShippingAddressSetMessagePayloadImpl instance = new OrderShippingAddressSetMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        instance.setOldAddress(com.commercetools.api.models.common.Address.deepCopy(template.getOldAddress()));
        return instance;
    }

    /**
     * builder factory method for OrderShippingAddressSetMessagePayload
     * @return builder
     */
    public static OrderShippingAddressSetMessagePayloadBuilder builder() {
        return OrderShippingAddressSetMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for OrderShippingAddressSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderShippingAddressSetMessagePayloadBuilder builder(final OrderShippingAddressSetMessagePayload template) {
        return OrderShippingAddressSetMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderShippingAddressSetMessagePayload(Function<OrderShippingAddressSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderShippingAddressSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderShippingAddressSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderShippingAddressSetMessagePayload>";
            }
        };
    }
}
