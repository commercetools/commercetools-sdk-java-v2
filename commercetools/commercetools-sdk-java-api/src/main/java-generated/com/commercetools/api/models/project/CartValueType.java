
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartValueTypeImpl.class)
public interface CartValueType extends ShippingRateInputType {

    String CART_VALUE = "CartValue";

    public static CartValueType of() {
        return new CartValueTypeImpl();
    }

    public static CartValueType of(final CartValueType template) {
        CartValueTypeImpl instance = new CartValueTypeImpl();
        return instance;
    }

    public static CartValueTypeBuilder builder() {
        return CartValueTypeBuilder.of();
    }

    public static CartValueTypeBuilder builder(final CartValueType template) {
        return CartValueTypeBuilder.of(template);
    }

    default <T> T withCartValueType(Function<CartValueType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartValueType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartValueType>() {
            @Override
            public String toString() {
                return "TypeReference<CartValueType>";
            }
        };
    }
}
