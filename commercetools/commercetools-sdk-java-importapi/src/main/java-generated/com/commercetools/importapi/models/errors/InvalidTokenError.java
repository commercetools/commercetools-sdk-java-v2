
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidTokenError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidTokenError invalidTokenError = InvalidTokenError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidTokenErrorImpl.class)
public interface InvalidTokenError extends ErrorObject {

    /**
     * discriminator value for InvalidTokenError
     */
    String INVALID_TOKEN = "invalid_token";

    /**
     * factory method
     * @return instance of InvalidTokenError
     */
    public static InvalidTokenError of() {
        return new InvalidTokenErrorImpl();
    }

    /**
     * factory method to copy an instance of InvalidTokenError
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidTokenError of(final InvalidTokenError template) {
        InvalidTokenErrorImpl instance = new InvalidTokenErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for InvalidTokenError
     * @return builder
     */
    public static InvalidTokenErrorBuilder builder() {
        return InvalidTokenErrorBuilder.of();
    }

    /**
     * create builder for InvalidTokenError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidTokenErrorBuilder builder(final InvalidTokenError template) {
        return InvalidTokenErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidTokenError(Function<InvalidTokenError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidTokenError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidTokenError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidTokenError>";
            }
        };
    }
}
