
package com.commercetools.importapi.models.errors;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidFieldErrorBuilder
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
public class InvalidFieldErrorBuilder implements Builder<InvalidFieldError> {

    private String message;

    private String field;

    private java.lang.Object invalidValue;

    @Nullable
    private java.util.List<java.lang.Object> allowedValues;

    @Nullable
    private Long resourceIndex;

    /**
     *  <p>A plain language description of the cause of an error.</p>
     * @param message value to be set
     * @return Builder
     */

    public InvalidFieldErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>The name of the field.</p>
     * @param field value to be set
     * @return Builder
     */

    public InvalidFieldErrorBuilder field(final String field) {
        this.field = field;
        return this;
    }

    /**
     *  <p>The invalid value.</p>
     * @param invalidValue value to be set
     * @return Builder
     */

    public InvalidFieldErrorBuilder invalidValue(final java.lang.Object invalidValue) {
        this.invalidValue = invalidValue;
        return this;
    }

    /**
     *  <p>The set of allowed values for the field, if any.</p>
     * @param allowedValues value to be set
     * @return Builder
     */

    public InvalidFieldErrorBuilder allowedValues(@Nullable final java.lang.Object... allowedValues) {
        this.allowedValues = new ArrayList<>(Arrays.asList(allowedValues));
        return this;
    }

    /**
     *  <p>The set of allowed values for the field, if any.</p>
     * @param allowedValues value to be set
     * @return Builder
     */

    public InvalidFieldErrorBuilder allowedValues(@Nullable final java.util.List<java.lang.Object> allowedValues) {
        this.allowedValues = allowedValues;
        return this;
    }

    /**
     *  <p>The set of allowed values for the field, if any.</p>
     * @param allowedValues value to be set
     * @return Builder
     */

    public InvalidFieldErrorBuilder plusAllowedValues(@Nullable final java.lang.Object... allowedValues) {
        if (this.allowedValues == null) {
            this.allowedValues = new ArrayList<>();
        }
        this.allowedValues.addAll(Arrays.asList(allowedValues));
        return this;
    }

    /**
     *  <p>The index of the resource in the import request that contains the invalid field.</p>
     * @param resourceIndex value to be set
     * @return Builder
     */

    public InvalidFieldErrorBuilder resourceIndex(@Nullable final Long resourceIndex) {
        this.resourceIndex = resourceIndex;
        return this;
    }

    /**
     *  <p>A plain language description of the cause of an error.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The name of the field.</p>
     * @return field
     */

    public String getField() {
        return this.field;
    }

    /**
     *  <p>The invalid value.</p>
     * @return invalidValue
     */

    public java.lang.Object getInvalidValue() {
        return this.invalidValue;
    }

    /**
     *  <p>The set of allowed values for the field, if any.</p>
     * @return allowedValues
     */

    @Nullable
    public java.util.List<java.lang.Object> getAllowedValues() {
        return this.allowedValues;
    }

    /**
     *  <p>The index of the resource in the import request that contains the invalid field.</p>
     * @return resourceIndex
     */

    @Nullable
    public Long getResourceIndex() {
        return this.resourceIndex;
    }

    /**
     * builds InvalidFieldError with checking for non-null required values
     * @return InvalidFieldError
     */
    public InvalidFieldError build() {
        Objects.requireNonNull(message, InvalidFieldError.class + ": message is missing");
        Objects.requireNonNull(field, InvalidFieldError.class + ": field is missing");
        Objects.requireNonNull(invalidValue, InvalidFieldError.class + ": invalidValue is missing");
        return new InvalidFieldErrorImpl(message, field, invalidValue, allowedValues, resourceIndex);
    }

    /**
     * builds InvalidFieldError without checking for non-null required values
     * @return InvalidFieldError
     */
    public InvalidFieldError buildUnchecked() {
        return new InvalidFieldErrorImpl(message, field, invalidValue, allowedValues, resourceIndex);
    }

    /**
     * factory method for an instance of InvalidFieldErrorBuilder
     * @return builder
     */
    public static InvalidFieldErrorBuilder of() {
        return new InvalidFieldErrorBuilder();
    }

    /**
     * create builder for InvalidFieldError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidFieldErrorBuilder of(final InvalidFieldError template) {
        InvalidFieldErrorBuilder builder = new InvalidFieldErrorBuilder();
        builder.message = template.getMessage();
        builder.field = template.getField();
        builder.invalidValue = template.getInvalidValue();
        builder.allowedValues = template.getAllowedValues();
        builder.resourceIndex = template.getResourceIndex();
        return builder;
    }

}
