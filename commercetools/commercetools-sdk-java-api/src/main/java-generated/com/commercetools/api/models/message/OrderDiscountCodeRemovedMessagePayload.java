
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Remove DiscountCode update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderDiscountCodeRemovedMessagePayload orderDiscountCodeRemovedMessagePayload = OrderDiscountCodeRemovedMessagePayload.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderDiscountCodeRemovedMessagePayloadImpl.class)
public interface OrderDiscountCodeRemovedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderDiscountCodeRemovedMessagePayload
     */
    String ORDER_DISCOUNT_CODE_REMOVED = "OrderDiscountCodeRemoved";

    /**
     *  <p>DiscountCode that was removed.</p>
     * @return discountCode
     */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    /**
     *  <p>DiscountCode that was removed.</p>
     * @param discountCode value to be set
     */

    public void setDiscountCode(final DiscountCodeReference discountCode);

    /**
     * factory method
     * @return instance of OrderDiscountCodeRemovedMessagePayload
     */
    public static OrderDiscountCodeRemovedMessagePayload of() {
        return new OrderDiscountCodeRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderDiscountCodeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderDiscountCodeRemovedMessagePayload of(final OrderDiscountCodeRemovedMessagePayload template) {
        OrderDiscountCodeRemovedMessagePayloadImpl instance = new OrderDiscountCodeRemovedMessagePayloadImpl();
        instance.setDiscountCode(template.getDiscountCode());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderDiscountCodeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderDiscountCodeRemovedMessagePayload deepCopy(
            @Nullable final OrderDiscountCodeRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderDiscountCodeRemovedMessagePayloadImpl instance = new OrderDiscountCodeRemovedMessagePayloadImpl();
        instance.setDiscountCode(
            com.commercetools.api.models.discount_code.DiscountCodeReference.deepCopy(template.getDiscountCode()));
        return instance;
    }

    /**
     * builder factory method for OrderDiscountCodeRemovedMessagePayload
     * @return builder
     */
    public static OrderDiscountCodeRemovedMessagePayloadBuilder builder() {
        return OrderDiscountCodeRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderDiscountCodeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderDiscountCodeRemovedMessagePayloadBuilder builder(
            final OrderDiscountCodeRemovedMessagePayload template) {
        return OrderDiscountCodeRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderDiscountCodeRemovedMessagePayload(
            Function<OrderDiscountCodeRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderDiscountCodeRemovedMessagePayload>";
            }
        };
    }
}
