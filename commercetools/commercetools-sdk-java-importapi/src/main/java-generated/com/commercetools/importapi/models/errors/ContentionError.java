
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ContentionErrorImpl.class)
public interface ContentionError extends ErrorObject {

    String CONTENTION = "Contention";

    public static ContentionError of() {
        return new ContentionErrorImpl();
    }

    public static ContentionError of(final ContentionError template) {
        ContentionErrorImpl instance = new ContentionErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static ContentionErrorBuilder builder() {
        return ContentionErrorBuilder.of();
    }

    public static ContentionErrorBuilder builder(final ContentionError template) {
        return ContentionErrorBuilder.of(template);
    }

    default <T> T withContentionError(Function<ContentionError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ContentionError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ContentionError>() {
            @Override
            public String toString() {
                return "TypeReference<ContentionError>";
            }
        };
    }
}
