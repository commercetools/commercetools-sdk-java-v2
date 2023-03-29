
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.DiscountCodeState;
import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after the DiscountCodeState changes due to a recalculation.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderDiscountCodeStateSetMessagePayload orderDiscountCodeStateSetMessagePayload = OrderDiscountCodeStateSetMessagePayload.builder()
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .state(DiscountCodeState.NOT_ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderDiscountCodeStateSetMessagePayloadImpl.class)
public interface OrderDiscountCodeStateSetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderDiscountCodeStateSetMessagePayload
     */
    String ORDER_DISCOUNT_CODE_STATE_SET = "OrderDiscountCodeStateSet";

    /**
     *  <p>DiscountCode that changed due to the recalculation.</p>
     * @return discountCode
     */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    /**
     *  <p>DiscountCodeState after the recalculation.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public DiscountCodeState getState();

    /**
     *  <p>DiscountCodeState before the recalculation.</p>
     * @return oldState
     */

    @JsonProperty("oldState")
    public DiscountCodeState getOldState();

    /**
     *  <p>DiscountCode that changed due to the recalculation.</p>
     * @param discountCode value to be set
     */

    public void setDiscountCode(final DiscountCodeReference discountCode);

    /**
     *  <p>DiscountCodeState after the recalculation.</p>
     * @param state value to be set
     */

    public void setState(final DiscountCodeState state);

    /**
     *  <p>DiscountCodeState before the recalculation.</p>
     * @param oldState value to be set
     */

    public void setOldState(final DiscountCodeState oldState);

    /**
     * factory method
     * @return instance of OrderDiscountCodeStateSetMessagePayload
     */
    public static OrderDiscountCodeStateSetMessagePayload of() {
        return new OrderDiscountCodeStateSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderDiscountCodeStateSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderDiscountCodeStateSetMessagePayload of(final OrderDiscountCodeStateSetMessagePayload template) {
        OrderDiscountCodeStateSetMessagePayloadImpl instance = new OrderDiscountCodeStateSetMessagePayloadImpl();
        instance.setDiscountCode(template.getDiscountCode());
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderDiscountCodeStateSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderDiscountCodeStateSetMessagePayload deepCopy(
            @Nullable final OrderDiscountCodeStateSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderDiscountCodeStateSetMessagePayloadImpl instance = new OrderDiscountCodeStateSetMessagePayloadImpl();
        instance.setDiscountCode(
            com.commercetools.api.models.discount_code.DiscountCodeReference.deepCopy(template.getDiscountCode()));
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        return instance;
    }

    /**
     * builder factory method for OrderDiscountCodeStateSetMessagePayload
     * @return builder
     */
    public static OrderDiscountCodeStateSetMessagePayloadBuilder builder() {
        return OrderDiscountCodeStateSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderDiscountCodeStateSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderDiscountCodeStateSetMessagePayloadBuilder builder(
            final OrderDiscountCodeStateSetMessagePayload template) {
        return OrderDiscountCodeStateSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderDiscountCodeStateSetMessagePayload(
            Function<OrderDiscountCodeStateSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeStateSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeStateSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderDiscountCodeStateSetMessagePayload>";
            }
        };
    }
}
