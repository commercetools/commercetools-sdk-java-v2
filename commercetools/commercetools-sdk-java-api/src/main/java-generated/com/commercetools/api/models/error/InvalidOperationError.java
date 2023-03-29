
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when the resources involved in the request are not in a valid state for the operation.</p>
 *  <p>The client application should validate the constraints described in the error message before sending the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidOperationError invalidOperationError = InvalidOperationError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidOperationErrorImpl.class)
public interface InvalidOperationError extends ErrorObject {

    /**
     * discriminator value for InvalidOperationError
     */
    String INVALID_OPERATION = "InvalidOperation";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Plain text description of the error.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of InvalidOperationError
     */
    public static InvalidOperationError of() {
        return new InvalidOperationErrorImpl();
    }

    /**
     * factory method to create a shallow copy InvalidOperationError
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidOperationError of(final InvalidOperationError template) {
        InvalidOperationErrorImpl instance = new InvalidOperationErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of InvalidOperationError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InvalidOperationError deepCopy(@Nullable final InvalidOperationError template) {
        if (template == null) {
            return null;
        }
        InvalidOperationErrorImpl instance = new InvalidOperationErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for InvalidOperationError
     * @return builder
     */
    public static InvalidOperationErrorBuilder builder() {
        return InvalidOperationErrorBuilder.of();
    }

    /**
     * create builder for InvalidOperationError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidOperationErrorBuilder builder(final InvalidOperationError template) {
        return InvalidOperationErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidOperationError(Function<InvalidOperationError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidOperationError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidOperationError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidOperationError>";
            }
        };
    }
}
