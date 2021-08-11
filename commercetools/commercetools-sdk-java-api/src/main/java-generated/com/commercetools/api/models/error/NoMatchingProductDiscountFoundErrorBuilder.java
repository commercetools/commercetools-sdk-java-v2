
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class NoMatchingProductDiscountFoundErrorBuilder implements Builder<NoMatchingProductDiscountFoundError> {

    private String message;

    public NoMatchingProductDiscountFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public NoMatchingProductDiscountFoundError build() {
        Objects.requireNonNull(message, NoMatchingProductDiscountFoundError.class + ": message is missing");
        return new NoMatchingProductDiscountFoundErrorImpl(message);
    }

    /**
     * builds NoMatchingProductDiscountFoundError without checking for non null required values
     */
    public NoMatchingProductDiscountFoundError buildUnchecked() {
        return new NoMatchingProductDiscountFoundErrorImpl(message);
    }

    public static NoMatchingProductDiscountFoundErrorBuilder of() {
        return new NoMatchingProductDiscountFoundErrorBuilder();
    }

    public static NoMatchingProductDiscountFoundErrorBuilder of(final NoMatchingProductDiscountFoundError template) {
        NoMatchingProductDiscountFoundErrorBuilder builder = new NoMatchingProductDiscountFoundErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
