
package com.commercetools.checkout.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when an invalid input has been sent.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidInputError invalidInputError = InvalidInputError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InvalidInput")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidInputErrorImpl.class)
public interface InvalidInputError extends ErrorObject {

    /**
     * discriminator value for InvalidInputError
     */
    String INVALID_INPUT = "InvalidInput";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Description of the invalid input error.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Description of the invalid input error.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of InvalidInputError
     */
    public static InvalidInputError of() {
        return new InvalidInputErrorImpl();
    }

    /**
     * factory method to create a shallow copy InvalidInputError
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidInputError of(final InvalidInputError template) {
        InvalidInputErrorImpl instance = new InvalidInputErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public InvalidInputError copyDeep();

    /**
     * factory method to create a deep copy of InvalidInputError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InvalidInputError deepCopy(@Nullable final InvalidInputError template) {
        if (template == null) {
            return null;
        }
        InvalidInputErrorImpl instance = new InvalidInputErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for InvalidInputError
     * @return builder
     */
    public static InvalidInputErrorBuilder builder() {
        return InvalidInputErrorBuilder.of();
    }

    /**
     * create builder for InvalidInputError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidInputErrorBuilder builder(final InvalidInputError template) {
        return InvalidInputErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidInputError(Function<InvalidInputError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidInputError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidInputError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidInputError>";
            }
        };
    }
}
