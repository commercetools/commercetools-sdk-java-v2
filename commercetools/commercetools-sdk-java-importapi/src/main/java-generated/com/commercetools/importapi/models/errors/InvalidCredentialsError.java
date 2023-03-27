
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidCredentialsError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidCredentialsError invalidCredentialsError = InvalidCredentialsError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidCredentialsErrorImpl.class)
public interface InvalidCredentialsError extends ErrorObject {

    /**
     * discriminator value for InvalidCredentialsError
     */
    String INVALID_CREDENTIALS = "InvalidCredentials";

    /**
     * factory method
     * @return instance of InvalidCredentialsError
     */
    public static InvalidCredentialsError of() {
        return new InvalidCredentialsErrorImpl();
    }

    /**
     * factory method to copy an instance of InvalidCredentialsError
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidCredentialsError of(final InvalidCredentialsError template) {
        InvalidCredentialsErrorImpl instance = new InvalidCredentialsErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for InvalidCredentialsError
     * @return builder
     */
    public static InvalidCredentialsErrorBuilder builder() {
        return InvalidCredentialsErrorBuilder.of();
    }

    /**
     * create builder for InvalidCredentialsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidCredentialsErrorBuilder builder(final InvalidCredentialsError template) {
        return InvalidCredentialsErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidCredentialsError(Function<InvalidCredentialsError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidCredentialsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidCredentialsError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidCredentialsError>";
            }
        };
    }
}
