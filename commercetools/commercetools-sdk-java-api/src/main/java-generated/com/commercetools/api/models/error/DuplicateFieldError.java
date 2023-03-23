
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a field value conflicts with an existing value causing a duplicate.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateFieldError duplicateFieldError = DuplicateFieldError.builder()
 *             .message("{message}")
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DuplicateFieldErrorImpl.class)
public interface DuplicateFieldError extends ErrorObject {

    String DUPLICATE_FIELD = "DuplicateField";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"A duplicate value $duplicateValue exists for field $field."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Name of the conflicting field.</p>
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *  <p>Conflicting duplicate value.</p>
     * @return duplicateValue
     */
    @NotNull
    @JsonProperty("duplicateValue")
    public Object getDuplicateValue();

    public void setMessage(final String message);

    public void setField(final String field);

    public void setDuplicateValue(final Object duplicateValue);

    public static DuplicateFieldError of() {
        return new DuplicateFieldErrorImpl();
    }

    public static DuplicateFieldError of(final DuplicateFieldError template) {
        DuplicateFieldErrorImpl instance = new DuplicateFieldErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setField(template.getField());
        instance.setDuplicateValue(template.getDuplicateValue());
        return instance;
    }

    public static DuplicateFieldErrorBuilder builder() {
        return DuplicateFieldErrorBuilder.of();
    }

    public static DuplicateFieldErrorBuilder builder(final DuplicateFieldError template) {
        return DuplicateFieldErrorBuilder.of(template);
    }

    default <T> T withDuplicateFieldError(Function<DuplicateFieldError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DuplicateFieldError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicateFieldError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicateFieldError>";
            }
        };
    }
}
