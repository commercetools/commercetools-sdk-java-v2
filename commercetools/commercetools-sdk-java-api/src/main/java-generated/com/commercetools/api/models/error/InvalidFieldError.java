
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
 *  <p>Returned when a field has an invalid value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidFieldError invalidFieldError = InvalidFieldError.builder()
 *             .message("{message}")
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidFieldErrorImpl.class)
public interface InvalidFieldError extends ErrorObject {

    /**
     * discriminator value for InvalidFieldError
     */
    String INVALID_FIELD = "InvalidField";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The value $invalidValue is not valid for field $field."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Name of the field with the invalid value.</p>
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *  <p>Value invalid for the field.</p>
     * @return invalidValue
     */
    @NotNull
    @JsonProperty("invalidValue")
    public Object getInvalidValue();

    /**
     *  <p>Fixed set of allowed values for the field, if any.</p>
     * @return allowedValues
     */

    @JsonProperty("allowedValues")
    public List<Object> getAllowedValues();

    /**
     *  <p><code>"The value $invalidValue is not valid for field $field."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Name of the field with the invalid value.</p>
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     *  <p>Value invalid for the field.</p>
     * @param invalidValue value to be set
     */

    public void setInvalidValue(final Object invalidValue);

    /**
     *  <p>Fixed set of allowed values for the field, if any.</p>
     * @param allowedValues values to be set
     */

    @JsonIgnore
    public void setAllowedValues(final Object... allowedValues);

    /**
     *  <p>Fixed set of allowed values for the field, if any.</p>
     * @param allowedValues values to be set
     */

    public void setAllowedValues(final List<Object> allowedValues);

    /**
     * factory method
     * @return instance of InvalidFieldError
     */
    public static InvalidFieldError of() {
        return new InvalidFieldErrorImpl();
    }

    /**
     * factory method to create a shallow copy InvalidFieldError
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidFieldError of(final InvalidFieldError template) {
        InvalidFieldErrorImpl instance = new InvalidFieldErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        instance.setInvalidValue(template.getInvalidValue());
        instance.setAllowedValues(template.getAllowedValues());
        return instance;
    }

    /**
     * factory method to create a deep copy of InvalidFieldError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InvalidFieldError deepCopy(@Nullable final InvalidFieldError template) {
        if (template == null) {
            return null;
        }
        InvalidFieldErrorImpl instance = new InvalidFieldErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        instance.setInvalidValue(template.getInvalidValue());
        instance.setAllowedValues(Optional.ofNullable(template.getAllowedValues()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for InvalidFieldError
     * @return builder
     */
    public static InvalidFieldErrorBuilder builder() {
        return InvalidFieldErrorBuilder.of();
    }

    /**
     * create builder for InvalidFieldError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidFieldErrorBuilder builder(final InvalidFieldError template) {
        return InvalidFieldErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidFieldError(Function<InvalidFieldError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidFieldError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidFieldError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidFieldError>";
            }
        };
    }
}
