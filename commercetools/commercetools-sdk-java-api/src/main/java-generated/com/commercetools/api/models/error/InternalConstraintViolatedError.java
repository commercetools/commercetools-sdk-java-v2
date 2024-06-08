
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when certain API-specific constraints were not met. For example, the specified Discount Code was never applied and cannot be updated.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InternalConstraintViolatedError internalConstraintViolatedError = InternalConstraintViolatedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InternalConstraintViolatedErrorImpl.class)
public interface InternalConstraintViolatedError extends ErrorObject {

    /**
     * discriminator value for InternalConstraintViolatedError
     */
    String INTERNAL_CONSTRAINT_VIOLATED = "InternalConstraintViolated";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Plain text description of the constraints that were violated.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Plain text description of the constraints that were violated.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of InternalConstraintViolatedError
     */
    public static InternalConstraintViolatedError of() {
        return new InternalConstraintViolatedErrorImpl();
    }

    /**
     * factory method to create a shallow copy InternalConstraintViolatedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static InternalConstraintViolatedError of(final InternalConstraintViolatedError template) {
        InternalConstraintViolatedErrorImpl instance = new InternalConstraintViolatedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of InternalConstraintViolatedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InternalConstraintViolatedError deepCopy(@Nullable final InternalConstraintViolatedError template) {
        if (template == null) {
            return null;
        }
        InternalConstraintViolatedErrorImpl instance = new InternalConstraintViolatedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for InternalConstraintViolatedError
     * @return builder
     */
    public static InternalConstraintViolatedErrorBuilder builder() {
        return InternalConstraintViolatedErrorBuilder.of();
    }

    /**
     * create builder for InternalConstraintViolatedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InternalConstraintViolatedErrorBuilder builder(final InternalConstraintViolatedError template) {
        return InternalConstraintViolatedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInternalConstraintViolatedError(Function<InternalConstraintViolatedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InternalConstraintViolatedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InternalConstraintViolatedError>() {
            @Override
            public String toString() {
                return "TypeReference<InternalConstraintViolatedError>";
            }
        };
    }
}
