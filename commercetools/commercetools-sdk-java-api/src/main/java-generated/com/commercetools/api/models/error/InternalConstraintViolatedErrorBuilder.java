
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InternalConstraintViolatedErrorBuilder
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
public class InternalConstraintViolatedErrorBuilder implements Builder<InternalConstraintViolatedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the constraints that were violated.</p>
     * @param message value to be set
     * @return Builder
     */

    public InternalConstraintViolatedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public InternalConstraintViolatedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public InternalConstraintViolatedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Plain text description of the constraints that were violated.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     * builds InternalConstraintViolatedError with checking for non-null required values
     * @return InternalConstraintViolatedError
     */
    public InternalConstraintViolatedError build() {
        Objects.requireNonNull(message, InternalConstraintViolatedError.class + ": message is missing");
        return new InternalConstraintViolatedErrorImpl(message, values);
    }

    /**
     * builds InternalConstraintViolatedError without checking for non-null required values
     * @return InternalConstraintViolatedError
     */
    public InternalConstraintViolatedError buildUnchecked() {
        return new InternalConstraintViolatedErrorImpl(message, values);
    }

    /**
     * factory method for an instance of InternalConstraintViolatedErrorBuilder
     * @return builder
     */
    public static InternalConstraintViolatedErrorBuilder of() {
        return new InternalConstraintViolatedErrorBuilder();
    }

    /**
     * create builder for InternalConstraintViolatedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InternalConstraintViolatedErrorBuilder of(final InternalConstraintViolatedError template) {
        InternalConstraintViolatedErrorBuilder builder = new InternalConstraintViolatedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
