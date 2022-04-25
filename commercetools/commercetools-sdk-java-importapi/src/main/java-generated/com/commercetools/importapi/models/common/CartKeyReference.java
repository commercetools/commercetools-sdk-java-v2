
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>References a cart by key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartKeyReferenceImpl.class)
public interface CartKeyReference extends KeyReference {

    String CART = "cart";

    public static CartKeyReference of() {
        return new CartKeyReferenceImpl();
    }

    public static CartKeyReference of(final CartKeyReference template) {
        CartKeyReferenceImpl instance = new CartKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static CartKeyReferenceBuilder builder() {
        return CartKeyReferenceBuilder.of();
    }

    public static CartKeyReferenceBuilder builder(final CartKeyReference template) {
        return CartKeyReferenceBuilder.of(template);
    }

    default <T> T withCartKeyReference(Function<CartKeyReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<CartKeyReference>";
            }
        };
    }
}
