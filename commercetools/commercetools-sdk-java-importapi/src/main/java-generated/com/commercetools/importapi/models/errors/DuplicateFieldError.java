
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The given value already exists for a field that is checked for unique values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateFieldError duplicateFieldError = DuplicateFieldError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DuplicateFieldErrorImpl.class)
public interface DuplicateFieldError extends ErrorObject {

    /**
     * discriminator value for DuplicateFieldError
     */
    String DUPLICATE_FIELD = "DuplicateField";

    /**
     *  <p>The name of the field.</p>
     * @return field
     */

    @JsonProperty("field")
    public String getField();

    /**
     *  <p>The offending duplicate value.</p>
     * @return duplicateValue
     */

    @JsonProperty("duplicateValue")
    public Object getDuplicateValue();

    /**
     *  <p>The name of the field.</p>
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     *  <p>The offending duplicate value.</p>
     * @param duplicateValue value to be set
     */

    public void setDuplicateValue(final Object duplicateValue);

    /**
     * factory method
     * @return instance of DuplicateFieldError
     */
    public static DuplicateFieldError of() {
        return new DuplicateFieldErrorImpl();
    }

    /**
     * factory method to copy an instance of DuplicateFieldError
     * @param template instance to be copied
     * @return copy instance
     */
    public static DuplicateFieldError of(final DuplicateFieldError template) {
        DuplicateFieldErrorImpl instance = new DuplicateFieldErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setField(template.getField());
        instance.setDuplicateValue(template.getDuplicateValue());
        return instance;
    }

    /**
     * builder factory method for DuplicateFieldError
     * @return builder
     */
    public static DuplicateFieldErrorBuilder builder() {
        return DuplicateFieldErrorBuilder.of();
    }

    /**
     * create builder for DuplicateFieldError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DuplicateFieldErrorBuilder builder(final DuplicateFieldError template) {
        return DuplicateFieldErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDuplicateFieldError(Function<DuplicateFieldError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DuplicateFieldError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicateFieldError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicateFieldError>";
            }
        };
    }
}
