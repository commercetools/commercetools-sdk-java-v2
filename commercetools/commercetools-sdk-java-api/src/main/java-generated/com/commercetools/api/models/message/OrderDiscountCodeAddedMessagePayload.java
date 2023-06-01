package com.commercetools.api.models.message;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayloadImpl;

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
 *  <p>Generated after a successful Add Discount Code update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderDiscountCodeAddedMessagePayload orderDiscountCodeAddedMessagePayload = OrderDiscountCodeAddedMessagePayload.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderDiscountCodeAddedMessagePayloadImpl.class)
public interface OrderDiscountCodeAddedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderDiscountCodeAddedMessagePayload
     */
    String ORDER_DISCOUNT_CODE_ADDED = "OrderDiscountCodeAdded";

    /**
     *  <p>DiscountCode that was added.</p>
     * @return discountCode
     */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    /**
     *  <p>DiscountCode that was added.</p>
     * @param discountCode value to be set
     */
    
    public void setDiscountCode(final DiscountCodeReference discountCode);
    

    /**
     * factory method
     * @return instance of OrderDiscountCodeAddedMessagePayload
     */
    public static OrderDiscountCodeAddedMessagePayload of(){
        return new OrderDiscountCodeAddedMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderDiscountCodeAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderDiscountCodeAddedMessagePayload of(final OrderDiscountCodeAddedMessagePayload template) {
        OrderDiscountCodeAddedMessagePayloadImpl instance = new OrderDiscountCodeAddedMessagePayloadImpl();
        instance.setDiscountCode(template.getDiscountCode());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderDiscountCodeAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderDiscountCodeAddedMessagePayload deepCopy(@Nullable final OrderDiscountCodeAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderDiscountCodeAddedMessagePayloadImpl instance = new OrderDiscountCodeAddedMessagePayloadImpl();
        instance.setDiscountCode(com.commercetools.api.models.discount_code.DiscountCodeReference.deepCopy(template.getDiscountCode()));
        return instance;
    }

    /**
     * builder factory method for OrderDiscountCodeAddedMessagePayload
     * @return builder
     */
    public static OrderDiscountCodeAddedMessagePayloadBuilder builder() {
        return OrderDiscountCodeAddedMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for OrderDiscountCodeAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderDiscountCodeAddedMessagePayloadBuilder builder(final OrderDiscountCodeAddedMessagePayload template) {
        return OrderDiscountCodeAddedMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderDiscountCodeAddedMessagePayload(Function<OrderDiscountCodeAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderDiscountCodeAddedMessagePayload>";
            }
        };
    }
}
