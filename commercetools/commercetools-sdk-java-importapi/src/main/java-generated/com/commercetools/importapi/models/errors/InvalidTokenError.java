
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InvalidTokenErrorImpl.class)
public interface InvalidTokenError extends ErrorObject {

    String INVALID_TOKEN = "invalid_token";

    public static InvalidTokenError of() {
        return new InvalidTokenErrorImpl();
    }

    public static InvalidTokenError of(final InvalidTokenError template) {
        InvalidTokenErrorImpl instance = new InvalidTokenErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static InvalidTokenErrorBuilder builder() {
        return InvalidTokenErrorBuilder.of();
    }

    public static InvalidTokenErrorBuilder builder(final InvalidTokenError template) {
        return InvalidTokenErrorBuilder.of(template);
    }

    default <T> T withInvalidTokenError(Function<InvalidTokenError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InvalidTokenError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidTokenError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidTokenError>";
            }
        };
    }
}
