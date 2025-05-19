
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>A given field is not supported. This error occurs, for example, if the field <code>variants</code>, which is not supported by Product Import, is sent to the Product Import endpoint.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("InvalidField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidFieldErrorImpl.class)
public interface InvalidFieldError extends ErrorObject {

    /**
     * discriminator value for InvalidFieldError
     */
    String INVALID_FIELD = "InvalidField";

    /**
     *  <p>The name of the field.</p>
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *  <p>The invalid value.</p>
     * @return invalidValue
     */
    @NotNull
    @JsonProperty("invalidValue")
    public Object getInvalidValue();

    /**
     *  <p>The set of allowed values for the field, if any.</p>
     * @return allowedValues
     */

    @JsonProperty("allowedValues")
    public List<Object> getAllowedValues();

    /**
     *
     * @return resourceIndex
     */

    @JsonProperty("resourceIndex")
    public Long getResourceIndex();

    /**
     *  <p>The name of the field.</p>
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     *  <p>The invalid value.</p>
     * @param invalidValue value to be set
     */

    public void setInvalidValue(final Object invalidValue);

    /**
     *  <p>The set of allowed values for the field, if any.</p>
     * @param allowedValues values to be set
     */

    @JsonIgnore
    public void setAllowedValues(final Object... allowedValues);

    /**
     *  <p>The set of allowed values for the field, if any.</p>
     * @param allowedValues values to be set
     */

    public void setAllowedValues(final List<Object> allowedValues);

    /**
     * set resourceIndex
     * @param resourceIndex value to be set
     */

    public void setResourceIndex(final Long resourceIndex);

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
        instance.setField(template.getField());
        instance.setInvalidValue(template.getInvalidValue());
        instance.setAllowedValues(template.getAllowedValues());
        instance.setResourceIndex(template.getResourceIndex());
        return instance;
    }

    public InvalidFieldError copyDeep();

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
        instance.setField(template.getField());
        instance.setInvalidValue(template.getInvalidValue());
        instance.setAllowedValues(Optional.ofNullable(template.getAllowedValues()).map(ArrayList::new).orElse(null));
        instance.setResourceIndex(template.getResourceIndex());
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
