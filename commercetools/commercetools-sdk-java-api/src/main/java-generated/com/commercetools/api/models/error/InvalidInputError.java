
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InvalidInputErrorImpl.class)
public interface InvalidInputError extends ErrorObject {

    String INVALID_INPUT = "InvalidInput";

    public static InvalidInputError of() {
        return new InvalidInputErrorImpl();
    }

    public static InvalidInputError of(final InvalidInputError template) {
        InvalidInputErrorImpl instance = new InvalidInputErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static InvalidInputErrorBuilder builder() {
        return InvalidInputErrorBuilder.of();
    }

    public static InvalidInputErrorBuilder builder(final InvalidInputError template) {
        return InvalidInputErrorBuilder.of(template);
    }

    default <T> T withInvalidInputError(Function<InvalidInputError, T> helper) {
        return helper.apply(this);
    }
}
