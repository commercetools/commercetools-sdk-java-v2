
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderDiscountCodeAddedMessagePayload
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderDiscountCodeAddedMessagePayloadImpl.class)
public interface OrderDiscountCodeAddedMessagePayload extends OrderMessagePayload {

    String ORDER_DISCOUNT_CODE_ADDED = "OrderDiscountCodeAdded";

    /**
     <*  <p>Reference to a DiscountCode.</p>>
     */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    public void setDiscountCode(final DiscountCodeReference discountCode);

    public static OrderDiscountCodeAddedMessagePayload of() {
        return new OrderDiscountCodeAddedMessagePayloadImpl();
    }

    public static OrderDiscountCodeAddedMessagePayload of(final OrderDiscountCodeAddedMessagePayload template) {
        OrderDiscountCodeAddedMessagePayloadImpl instance = new OrderDiscountCodeAddedMessagePayloadImpl();
        instance.setDiscountCode(template.getDiscountCode());
        return instance;
    }

    public static OrderDiscountCodeAddedMessagePayloadBuilder builder() {
        return OrderDiscountCodeAddedMessagePayloadBuilder.of();
    }

    public static OrderDiscountCodeAddedMessagePayloadBuilder builder(
            final OrderDiscountCodeAddedMessagePayload template) {
        return OrderDiscountCodeAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderDiscountCodeAddedMessagePayload(Function<OrderDiscountCodeAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderDiscountCodeAddedMessagePayload>";
            }
        };
    }
}
