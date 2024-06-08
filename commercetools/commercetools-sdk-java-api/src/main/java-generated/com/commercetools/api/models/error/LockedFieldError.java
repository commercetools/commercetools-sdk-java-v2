
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
 *  <p>Returned when two Customers are simultaneously created or updated with the same email address.</p>
 *  <p>To confirm if the operation was successful, repeat the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LockedFieldError lockedFieldError = LockedFieldError.builder()
 *             .message("{message}")
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LockedFieldErrorImpl.class)
public interface LockedFieldError extends ErrorObject {

    /**
     * discriminator value for LockedFieldError
     */
    String LOCKED_FIELD = "LockedField";

    /**
     *  <p>Field that is currently locked.</p>
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"'$field' is locked by another request. Please try again later."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Field that is currently locked.</p>
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     *  <p><code>"'$field' is locked by another request. Please try again later."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of LockedFieldError
     */
    public static LockedFieldError of() {
        return new LockedFieldErrorImpl();
    }

    /**
     * factory method to create a shallow copy LockedFieldError
     * @param template instance to be copied
     * @return copy instance
     */
    public static LockedFieldError of(final LockedFieldError template) {
        LockedFieldErrorImpl instance = new LockedFieldErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        return instance;
    }

    /**
     * factory method to create a deep copy of LockedFieldError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LockedFieldError deepCopy(@Nullable final LockedFieldError template) {
        if (template == null) {
            return null;
        }
        LockedFieldErrorImpl instance = new LockedFieldErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        return instance;
    }

    /**
     * builder factory method for LockedFieldError
     * @return builder
     */
    public static LockedFieldErrorBuilder builder() {
        return LockedFieldErrorBuilder.of();
    }

    /**
     * create builder for LockedFieldError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LockedFieldErrorBuilder builder(final LockedFieldError template) {
        return LockedFieldErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLockedFieldError(Function<LockedFieldError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LockedFieldError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LockedFieldError>() {
            @Override
            public String toString() {
                return "TypeReference<LockedFieldError>";
            }
        };
    }
}
