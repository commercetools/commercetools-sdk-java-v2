
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = GeneralErrorImpl.class)
public interface GeneralError extends ErrorObject {

    String GENERAL = "General";

    public static GeneralError of() {
        return new GeneralErrorImpl();
    }

    public static GeneralError of(final GeneralError template) {
        GeneralErrorImpl instance = new GeneralErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static GeneralErrorBuilder builder() {
        return GeneralErrorBuilder.of();
    }

    public static GeneralErrorBuilder builder(final GeneralError template) {
        return GeneralErrorBuilder.of(template);
    }

    default <T> T withGeneralError(Function<GeneralError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<GeneralError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GeneralError>() {
            @Override
            public String toString() {
                return "TypeReference<GeneralError>";
            }
        };
    }
}
