
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InsufficientScopeErrorImpl.class)
public interface InsufficientScopeError extends ErrorObject {

    String INSUFFICIENT_SCOPE = "insufficient_scope";

    public static InsufficientScopeError of() {
        return new InsufficientScopeErrorImpl();
    }

    public static InsufficientScopeError of(final InsufficientScopeError template) {
        InsufficientScopeErrorImpl instance = new InsufficientScopeErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static InsufficientScopeErrorBuilder builder() {
        return InsufficientScopeErrorBuilder.of();
    }

    public static InsufficientScopeErrorBuilder builder(final InsufficientScopeError template) {
        return InsufficientScopeErrorBuilder.of(template);
    }

    default <T> T withInsufficientScopeError(Function<InsufficientScopeError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InsufficientScopeError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InsufficientScopeError>() {
            @Override
            public String toString() {
                return "TypeReference<InsufficientScopeError>";
            }
        };
    }
}
