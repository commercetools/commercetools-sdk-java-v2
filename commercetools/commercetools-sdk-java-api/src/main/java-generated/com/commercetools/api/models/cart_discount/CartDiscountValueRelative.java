
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountValueRelativeImpl.class)
public interface CartDiscountValueRelative extends CartDiscountValue {

    String RELATIVE = "relative";

    @NotNull
    @JsonProperty("permyriad")
    public Long getPermyriad();

    public void setPermyriad(final Long permyriad);

    public static CartDiscountValueRelative of() {
        return new CartDiscountValueRelativeImpl();
    }

    public static CartDiscountValueRelative of(final CartDiscountValueRelative template) {
        CartDiscountValueRelativeImpl instance = new CartDiscountValueRelativeImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    public static CartDiscountValueRelativeBuilder builder() {
        return CartDiscountValueRelativeBuilder.of();
    }

    public static CartDiscountValueRelativeBuilder builder(final CartDiscountValueRelative template) {
        return CartDiscountValueRelativeBuilder.of(template);
    }

    default <T> T withCartDiscountValueRelative(Function<CartDiscountValueRelative, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueRelative> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueRelative>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueRelative>";
            }
        };
    }
}
