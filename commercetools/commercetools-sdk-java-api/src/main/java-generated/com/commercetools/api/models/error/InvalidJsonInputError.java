
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidJsonInputError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidJsonInputError invalidJsonInputError = InvalidJsonInputError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidJsonInputErrorImpl.class)
public interface InvalidJsonInputError extends ErrorObject {

    String INVALID_JSON_INPUT = "InvalidJsonInput";

    public static InvalidJsonInputError of() {
        return new InvalidJsonInputErrorImpl();
    }

    public static InvalidJsonInputError of(final InvalidJsonInputError template) {
        InvalidJsonInputErrorImpl instance = new InvalidJsonInputErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static InvalidJsonInputErrorBuilder builder() {
        return InvalidJsonInputErrorBuilder.of();
    }

    public static InvalidJsonInputErrorBuilder builder(final InvalidJsonInputError template) {
        return InvalidJsonInputErrorBuilder.of(template);
    }

    default <T> T withInvalidJsonInputError(Function<InvalidJsonInputError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InvalidJsonInputError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidJsonInputError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidJsonInputError>";
            }
        };
    }
}
