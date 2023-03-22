
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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

    public void setMessage(final String message);

    public void setField(final String field);

    public void setInvalidValue(final Object invalidValue);

    @JsonIgnore
    public void setAllowedValues(final Object... allowedValues);

    public void setAllowedValues(final List<Object> allowedValues);

    public static InvalidFieldError of() {
        return new InvalidFieldErrorImpl();
    }

    public static InvalidFieldError of(final InvalidFieldError template) {
        InvalidFieldErrorImpl instance = new InvalidFieldErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setField(template.getField());
        instance.setInvalidValue(template.getInvalidValue());
        instance.setAllowedValues(template.getAllowedValues());
        return instance;
    }

    public static InvalidFieldErrorBuilder builder() {
        return InvalidFieldErrorBuilder.of();
    }

    public static InvalidFieldErrorBuilder builder(final InvalidFieldError template) {
        return InvalidFieldErrorBuilder.of(template);
    }

    default <T> T withInvalidFieldError(Function<InvalidFieldError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InvalidFieldError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidFieldError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidFieldError>";
            }
        };
    }
}
