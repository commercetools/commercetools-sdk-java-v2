
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = NoMatchingProductDiscountFoundErrorImpl.class)
public interface NoMatchingProductDiscountFoundError extends ErrorObject {

    String NO_MATCHING_PRODUCT_DISCOUNT_FOUND = "NoMatchingProductDiscountFound";

    public static NoMatchingProductDiscountFoundError of() {
        return new NoMatchingProductDiscountFoundErrorImpl();
    }

    public static NoMatchingProductDiscountFoundError of(final NoMatchingProductDiscountFoundError template) {
        NoMatchingProductDiscountFoundErrorImpl instance = new NoMatchingProductDiscountFoundErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static NoMatchingProductDiscountFoundErrorBuilder builder() {
        return NoMatchingProductDiscountFoundErrorBuilder.of();
    }

    public static NoMatchingProductDiscountFoundErrorBuilder builder(
            final NoMatchingProductDiscountFoundError template) {
        return NoMatchingProductDiscountFoundErrorBuilder.of(template);
    }

    default <T> T withNoMatchingProductDiscountFoundError(Function<NoMatchingProductDiscountFoundError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<NoMatchingProductDiscountFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<NoMatchingProductDiscountFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<NoMatchingProductDiscountFoundError>";
            }
        };
    }
}
