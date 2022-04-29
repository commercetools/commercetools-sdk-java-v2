
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>References a cart discount by key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountKeyReferenceImpl.class)
public interface CartDiscountKeyReference extends KeyReference {

    String CART_DISCOUNT = "cart-discount";

    public static CartDiscountKeyReference of() {
        return new CartDiscountKeyReferenceImpl();
    }

    public static CartDiscountKeyReference of(final CartDiscountKeyReference template) {
        CartDiscountKeyReferenceImpl instance = new CartDiscountKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static CartDiscountKeyReferenceBuilder builder() {
        return CartDiscountKeyReferenceBuilder.of();
    }

    public static CartDiscountKeyReferenceBuilder builder(final CartDiscountKeyReference template) {
        return CartDiscountKeyReferenceBuilder.of(template);
    }

    default <T> T withCartDiscountKeyReference(Function<CartDiscountKeyReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountKeyReference>";
            }
        };
    }
}
