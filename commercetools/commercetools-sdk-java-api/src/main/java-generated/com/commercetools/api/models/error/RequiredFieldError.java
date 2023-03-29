
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
 *  <p>Returned when a value is not defined for a required field.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RequiredFieldError requiredFieldError = RequiredFieldError.builder()
 *             .message("{message}")
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RequiredFieldErrorImpl.class)
public interface RequiredFieldError extends ErrorObject {

    /**
     * discriminator value for RequiredFieldError
     */
    String REQUIRED_FIELD = "RequiredField";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"A value is required for field $field."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Name of the field missing the value.</p>
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *  <p><code>"A value is required for field $field."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Name of the field missing the value.</p>
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     * factory method
     * @return instance of RequiredFieldError
     */
    public static RequiredFieldError of() {
        return new RequiredFieldErrorImpl();
    }

    /**
     * factory method to create a shallow copy RequiredFieldError
     * @param template instance to be copied
     * @return copy instance
     */
    public static RequiredFieldError of(final RequiredFieldError template) {
        RequiredFieldErrorImpl instance = new RequiredFieldErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        return instance;
    }

    /**
     * factory method to create a deep copy of RequiredFieldError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RequiredFieldError deepCopy(@Nullable final RequiredFieldError template) {
        if (template == null) {
            return null;
        }
        RequiredFieldErrorImpl instance = new RequiredFieldErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        return instance;
    }

    /**
     * builder factory method for RequiredFieldError
     * @return builder
     */
    public static RequiredFieldErrorBuilder builder() {
        return RequiredFieldErrorBuilder.of();
    }

    /**
     * create builder for RequiredFieldError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RequiredFieldErrorBuilder builder(final RequiredFieldError template) {
        return RequiredFieldErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRequiredFieldError(Function<RequiredFieldError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RequiredFieldError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RequiredFieldError>() {
            @Override
            public String toString() {
                return "TypeReference<RequiredFieldError>";
            }
        };
    }
}
