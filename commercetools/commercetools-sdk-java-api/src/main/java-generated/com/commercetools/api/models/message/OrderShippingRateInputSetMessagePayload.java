package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.ShippingRateInput;
import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayloadImpl;

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
 *  <p>Generated after a successful Set ShippingRateInput update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderShippingRateInputSetMessagePayload orderShippingRateInputSetMessagePayload = OrderShippingRateInputSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderShippingRateInputSetMessagePayloadImpl.class)
public interface OrderShippingRateInputSetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderShippingRateInputSetMessagePayload
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
     * @return instance of OrderShippingRateInputSetMessagePayload
     */
    public static OrderShippingRateInputSetMessagePayload of(){
        return new OrderShippingRateInputSetMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderShippingRateInputSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderShippingRateInputSetMessagePayload of(final OrderShippingRateInputSetMessagePayload template) {
        OrderShippingRateInputSetMessagePayloadImpl instance = new OrderShippingRateInputSetMessagePayloadImpl();
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setOldShippingRateInput(template.getOldShippingRateInput());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderShippingRateInputSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderShippingRateInputSetMessagePayload deepCopy(@Nullable final OrderShippingRateInputSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderShippingRateInputSetMessagePayloadImpl instance = new OrderShippingRateInputSetMessagePayloadImpl();
        instance.setShippingRateInput(com.commercetools.api.models.cart.ShippingRateInput.deepCopy(template.getShippingRateInput()));
        instance.setOldShippingRateInput(com.commercetools.api.models.cart.ShippingRateInput.deepCopy(template.getOldShippingRateInput()));
        return instance;
    }

    /**
     * builder factory method for OrderShippingRateInputSetMessagePayload
     * @return builder
     */
    public static OrderShippingRateInputSetMessagePayloadBuilder builder() {
        return OrderShippingRateInputSetMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for OrderShippingRateInputSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderShippingRateInputSetMessagePayloadBuilder builder(final OrderShippingRateInputSetMessagePayload template) {
        return OrderShippingRateInputSetMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderShippingRateInputSetMessagePayload(Function<OrderShippingRateInputSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderShippingRateInputSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderShippingRateInputSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderShippingRateInputSetMessagePayload>";
            }
        };
    }
}
