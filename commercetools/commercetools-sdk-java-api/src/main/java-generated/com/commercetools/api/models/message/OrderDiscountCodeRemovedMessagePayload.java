
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderDiscountCodeRemovedMessagePayloadImpl.class)
public interface OrderDiscountCodeRemovedMessagePayload extends OrderMessagePayload {

    String ORDER_DISCOUNT_CODE_REMOVED = "OrderDiscountCodeRemoved";

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:DiscountCode">DiscountCode</a>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    public void setDiscountCode(final DiscountCodeReference discountCode);

    public static OrderDiscountCodeRemovedMessagePayload of() {
        return new OrderDiscountCodeRemovedMessagePayloadImpl();
    }

    public static OrderDiscountCodeRemovedMessagePayload of(final OrderDiscountCodeRemovedMessagePayload template) {
        OrderDiscountCodeRemovedMessagePayloadImpl instance = new OrderDiscountCodeRemovedMessagePayloadImpl();
        instance.setDiscountCode(template.getDiscountCode());
        return instance;
    }

    public static OrderDiscountCodeRemovedMessagePayloadBuilder builder() {
        return OrderDiscountCodeRemovedMessagePayloadBuilder.of();
    }

    public static OrderDiscountCodeRemovedMessagePayloadBuilder builder(
            final OrderDiscountCodeRemovedMessagePayload template) {
        return OrderDiscountCodeRemovedMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderDiscountCodeRemovedMessagePayload(
            Function<OrderDiscountCodeRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderDiscountCodeRemovedMessagePayload>";
            }
        };
    }
}
