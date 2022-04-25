
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountCustomLineItemsTargetImpl.class, name = CartDiscountCustomLineItemsTarget.CUSTOM_LINE_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountLineItemsTargetImpl.class, name = CartDiscountLineItemsTarget.LINE_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountShippingCostTargetImpl.class, name = CartDiscountShippingCostTarget.SHIPPING),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.MultiBuyCustomLineItemsTargetImpl.class, name = MultiBuyCustomLineItemsTarget.MULTI_BUY_CUSTOM_LINE_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.MultiBuyLineItemsTargetImpl.class, name = MultiBuyLineItemsTarget.MULTI_BUY_LINE_ITEMS) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = CartDiscountTargetImpl.class, visible = true)
@JsonDeserialize(as = CartDiscountTargetImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface CartDiscountTarget {

    @NotNull
    @JsonProperty("type")
    public String getType();

    public static com.commercetools.api.models.cart_discount.CartDiscountCustomLineItemsTargetBuilder customLineItemsBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountCustomLineItemsTargetBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountLineItemsTargetBuilder lineItemsBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountLineItemsTargetBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountShippingCostTargetBuilder shippingBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountShippingCostTargetBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.MultiBuyCustomLineItemsTargetBuilder multiBuyCustomLineItemsBuilder() {
        return com.commercetools.api.models.cart_discount.MultiBuyCustomLineItemsTargetBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.MultiBuyLineItemsTargetBuilder multiBuyLineItemsBuilder() {
        return com.commercetools.api.models.cart_discount.MultiBuyLineItemsTargetBuilder.of();
    }

    default <T> T withCartDiscountTarget(Function<CartDiscountTarget, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountTarget> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountTarget>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountTarget>";
            }
        };
    }
}
