
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = GenericErrorImpl.class)
public interface GenericError extends ErrorObject {

    String GENERIC = "Generic";

    public static GenericError of() {
        return new GenericErrorImpl();
    }

    public static GenericError of(final GenericError template) {
        GenericErrorImpl instance = new GenericErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static GenericErrorBuilder builder() {
        return GenericErrorBuilder.of();
    }

    public static GenericErrorBuilder builder(final GenericError template) {
        return GenericErrorBuilder.of(template);
    }

    default <T> T withGenericError(Function<GenericError, T> helper) {
        return helper.apply(this);
    }
}
