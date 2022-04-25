
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ObjectNotFoundErrorImpl.class)
public interface ObjectNotFoundError extends ErrorObject {

    String OBJECT_NOT_FOUND = "ObjectNotFound";

    public static ObjectNotFoundError of() {
        return new ObjectNotFoundErrorImpl();
    }

    public static ObjectNotFoundError of(final ObjectNotFoundError template) {
        ObjectNotFoundErrorImpl instance = new ObjectNotFoundErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static ObjectNotFoundErrorBuilder builder() {
        return ObjectNotFoundErrorBuilder.of();
    }

    public static ObjectNotFoundErrorBuilder builder(final ObjectNotFoundError template) {
        return ObjectNotFoundErrorBuilder.of(template);
    }

    default <T> T withObjectNotFoundError(Function<ObjectNotFoundError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ObjectNotFoundError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ObjectNotFoundError>() {
            @Override
            public String toString() {
                return "TypeReference<ObjectNotFoundError>";
            }
        };
    }
}
