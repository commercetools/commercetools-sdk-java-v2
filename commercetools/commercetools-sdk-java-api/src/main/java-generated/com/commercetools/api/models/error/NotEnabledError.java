
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = NotEnabledErrorImpl.class)
public interface NotEnabledError extends ErrorObject {

    String NOT_ENABLED = "NotEnabled";

    public static NotEnabledError of() {
        return new NotEnabledErrorImpl();
    }

    public static NotEnabledError of(final NotEnabledError template) {
        NotEnabledErrorImpl instance = new NotEnabledErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static NotEnabledErrorBuilder builder() {
        return NotEnabledErrorBuilder.of();
    }

    public static NotEnabledErrorBuilder builder(final NotEnabledError template) {
        return NotEnabledErrorBuilder.of(template);
    }

    default <T> T withNotEnabledError(Function<NotEnabledError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<NotEnabledError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<NotEnabledError>() {
            @Override
            public String toString() {
                return "TypeReference<NotEnabledError>";
            }
        };
    }
}
