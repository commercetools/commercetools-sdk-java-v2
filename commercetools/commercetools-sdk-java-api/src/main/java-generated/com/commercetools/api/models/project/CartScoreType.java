
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartScoreTypeImpl.class)
public interface CartScoreType extends ShippingRateInputType {

    String CART_SCORE = "CartScore";

    public static CartScoreType of() {
        return new CartScoreTypeImpl();
    }

    public static CartScoreType of(final CartScoreType template) {
        CartScoreTypeImpl instance = new CartScoreTypeImpl();
        return instance;
    }

    public static CartScoreTypeBuilder builder() {
        return CartScoreTypeBuilder.of();
    }

    public static CartScoreTypeBuilder builder(final CartScoreType template) {
        return CartScoreTypeBuilder.of(template);
    }

    default <T> T withCartScoreType(Function<CartScoreType, T> helper) {
        return helper.apply(this);
    }
}
