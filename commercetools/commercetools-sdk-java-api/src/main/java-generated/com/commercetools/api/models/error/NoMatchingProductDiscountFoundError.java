
package com.commercetools.api.models.error;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.NoMatchingProductDiscountFoundErrorImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = NoMatchingProductDiscountFoundErrorImpl.class)
public interface NoMatchingProductDiscountFoundError extends ErrorObject {

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
}
