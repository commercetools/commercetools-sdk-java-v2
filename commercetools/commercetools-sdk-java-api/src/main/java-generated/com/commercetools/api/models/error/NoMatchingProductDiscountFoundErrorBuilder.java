
package com.commercetools.api.models.error;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.NoMatchingProductDiscountFoundError;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class NoMatchingProductDiscountFoundErrorBuilder {

    private String message;

    public NoMatchingProductDiscountFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public NoMatchingProductDiscountFoundError build() {
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
