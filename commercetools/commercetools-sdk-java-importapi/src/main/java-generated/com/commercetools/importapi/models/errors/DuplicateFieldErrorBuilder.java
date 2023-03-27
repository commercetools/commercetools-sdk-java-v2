
package com.commercetools.importapi.models.errors;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DuplicateFieldErrorBuilder
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
public class DuplicateFieldErrorBuilder implements Builder<DuplicateFieldError> {

    private String message;

    @Nullable
    private String field;

    @Nullable
    private java.lang.Object duplicateValue;

    /**
     * set the value to the message
     * @param message value to be set
     * @return Builder
     */

    public DuplicateFieldErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>The name of the field.</p>
     * @param field value to be set
     * @return Builder
     */

    public DuplicateFieldErrorBuilder field(@Nullable final String field) {
        this.field = field;
        return this;
    }

    /**
     *  <p>The offending duplicate value.</p>
     * @param duplicateValue value to be set
     * @return Builder
     */

    public DuplicateFieldErrorBuilder duplicateValue(@Nullable final java.lang.Object duplicateValue) {
        this.duplicateValue = duplicateValue;
        return this;
    }

    /**
     * value of message}
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The name of the field.</p>
     * @return field
     */

    @Nullable
    public String getField() {
        return this.field;
    }

    /**
     *  <p>The offending duplicate value.</p>
     * @return duplicateValue
     */

    @Nullable
    public java.lang.Object getDuplicateValue() {
        return this.duplicateValue;
    }

    /**
     * builds DuplicateFieldError with checking for non-null required values
     * @return DuplicateFieldError
     */
    public DuplicateFieldError build() {
        Objects.requireNonNull(message, DuplicateFieldError.class + ": message is missing");
        return new DuplicateFieldErrorImpl(message, field, duplicateValue);
    }

    /**
     * builds DuplicateFieldError without checking for non-null required values
     * @return DuplicateFieldError
     */
    public DuplicateFieldError buildUnchecked() {
        return new DuplicateFieldErrorImpl(message, field, duplicateValue);
    }

    /**
     * factory method for an instance of DuplicateFieldErrorBuilder
     * @return builder
     */
    public static DuplicateFieldErrorBuilder of() {
        return new DuplicateFieldErrorBuilder();
    }

    /**
     * create builder for DuplicateFieldError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DuplicateFieldErrorBuilder of(final DuplicateFieldError template) {
        DuplicateFieldErrorBuilder builder = new DuplicateFieldErrorBuilder();
        builder.message = template.getMessage();
        builder.field = template.getField();
        builder.duplicateValue = template.getDuplicateValue();
        return builder;
    }

}
