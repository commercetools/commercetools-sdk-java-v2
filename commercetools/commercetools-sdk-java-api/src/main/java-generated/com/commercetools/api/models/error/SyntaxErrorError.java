
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SyntaxErrorErrorImpl.class)
public interface SyntaxErrorError extends ErrorObject {

    String SYNTAX_ERROR = "SyntaxError";

    public static SyntaxErrorError of() {
        return new SyntaxErrorErrorImpl();
    }

    public static SyntaxErrorError of(final SyntaxErrorError template) {
        SyntaxErrorErrorImpl instance = new SyntaxErrorErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static SyntaxErrorErrorBuilder builder() {
        return SyntaxErrorErrorBuilder.of();
    }

    public static SyntaxErrorErrorBuilder builder(final SyntaxErrorError template) {
        return SyntaxErrorErrorBuilder.of(template);
    }

    default <T> T withSyntaxErrorError(Function<SyntaxErrorError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SyntaxErrorError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SyntaxErrorError>() {
            @Override
            public String toString() {
                return "TypeReference<SyntaxErrorError>";
            }
        };
    }
}
