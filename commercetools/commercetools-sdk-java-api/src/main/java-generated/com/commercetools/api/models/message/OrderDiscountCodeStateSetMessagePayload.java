
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.DiscountCodeState;
import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderDiscountCodeStateSetMessagePayload
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

    String ORDER_DISCOUNT_CODE_STATE_SET = "OrderDiscountCodeStateSet";

    /**
     <*  <p>Reference to a DiscountCode.</p>>
     */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    /**
     <>
     */
    @NotNull
    @JsonProperty("state")
    public DiscountCodeState getState();

    /**
     <>
     */

    @JsonProperty("oldState")
    public DiscountCodeState getOldState();

    public void setDiscountCode(final DiscountCodeReference discountCode);

    public void setState(final DiscountCodeState state);

    public void setOldState(final DiscountCodeState oldState);

    public static OrderDiscountCodeStateSetMessagePayload of() {
        return new OrderDiscountCodeStateSetMessagePayloadImpl();
    }

    public static OrderDiscountCodeStateSetMessagePayload of(final OrderDiscountCodeStateSetMessagePayload template) {
        OrderDiscountCodeStateSetMessagePayloadImpl instance = new OrderDiscountCodeStateSetMessagePayloadImpl();
        instance.setDiscountCode(template.getDiscountCode());
        instance.setState(template.getState());
        instance.setOldState(template.getOldState());
        return instance;
    }

    public static OrderDiscountCodeStateSetMessagePayloadBuilder builder() {
        return OrderDiscountCodeStateSetMessagePayloadBuilder.of();
    }

    public static OrderDiscountCodeStateSetMessagePayloadBuilder builder(
            final OrderDiscountCodeStateSetMessagePayload template) {
        return OrderDiscountCodeStateSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderDiscountCodeStateSetMessagePayload(
            Function<OrderDiscountCodeStateSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeStateSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeStateSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderDiscountCodeStateSetMessagePayload>";
            }
        };
    }
}
