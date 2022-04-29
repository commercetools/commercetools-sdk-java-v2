
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteImpl.class, name = CartDiscountValueAbsolute.ABSOLUTE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountValueFixedImpl.class, name = CartDiscountValueFixed.FIXED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemImpl.class, name = CartDiscountValueGiftLineItem.GIFT_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountValueRelativeImpl.class, name = CartDiscountValueRelative.RELATIVE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = CartDiscountValueImpl.class, visible = true)
@JsonDeserialize(as = CartDiscountValueImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface CartDiscountValue {

    @NotNull
    @JsonProperty("type")
    public String getType();

    public static com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteBuilder absoluteBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountValueFixedBuilder fixedBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueFixedBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemBuilder giftLineItemBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemBuilder.of();
    }

    public static com.commercetools.api.models.cart_discount.CartDiscountValueRelativeBuilder relativeBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueRelativeBuilder.of();
    }

    default <T> T withCartDiscountValue(Function<CartDiscountValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValue>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValue>";
            }
        };
    }
}
