
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountResourceIdentifierImpl.class)
public interface CartDiscountResourceIdentifier extends ResourceIdentifier {

    String CART_DISCOUNT = "cart-discount";

    public static CartDiscountResourceIdentifier of() {
        return new CartDiscountResourceIdentifierImpl();
    }

    public static CartDiscountResourceIdentifier of(final CartDiscountResourceIdentifier template) {
        CartDiscountResourceIdentifierImpl instance = new CartDiscountResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static CartDiscountResourceIdentifierBuilder builder() {
        return CartDiscountResourceIdentifierBuilder.of();
    }

    public static CartDiscountResourceIdentifierBuilder builder(final CartDiscountResourceIdentifier template) {
        return CartDiscountResourceIdentifierBuilder.of(template);
    }

    default <T> T withCartDiscountResourceIdentifier(Function<CartDiscountResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
