
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
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemImpl.class, name = CartDiscountValueGiftLineItem.GIFT_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.cart_discount.CartDiscountValueRelativeImpl.class, name = CartDiscountValueRelative.RELATIVE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = CartDiscountValueImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface CartDiscountValue {

    @NotNull
    @JsonProperty("type")
    public String getType();

    default <T> T withCartDiscountValue(Function<CartDiscountValue, T> helper) {
        return helper.apply(this);
    }
}
