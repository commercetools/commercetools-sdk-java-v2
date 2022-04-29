
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = WeakPasswordErrorImpl.class)
public interface WeakPasswordError extends ErrorObject {

    String WEAK_PASSWORD = "WeakPassword";

    public static WeakPasswordError of() {
        return new WeakPasswordErrorImpl();
    }

    public static WeakPasswordError of(final WeakPasswordError template) {
        WeakPasswordErrorImpl instance = new WeakPasswordErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static WeakPasswordErrorBuilder builder() {
        return WeakPasswordErrorBuilder.of();
    }

    public static WeakPasswordErrorBuilder builder(final WeakPasswordError template) {
        return WeakPasswordErrorBuilder.of(template);
    }

    default <T> T withWeakPasswordError(Function<WeakPasswordError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<WeakPasswordError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<WeakPasswordError>() {
            @Override
            public String toString() {
                return "TypeReference<WeakPasswordError>";
            }
        };
    }
}
