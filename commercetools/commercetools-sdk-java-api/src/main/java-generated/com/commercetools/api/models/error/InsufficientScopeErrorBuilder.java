
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InsufficientScopeErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InsufficientScopeError insufficientScopeError = InsufficientScopeError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InsufficientScopeErrorBuilder implements Builder<InsufficientScopeError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"Insufficient scope. One of the following scopes is missing:"</code></p>
     * @param message value to be set
     * @return Builder
     */

    public InsufficientScopeErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public InsufficientScopeErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public InsufficientScopeErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"Insufficient scope. One of the following scopes is missing:"</code></p>
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
     * builds InsufficientScopeError with checking for non-null required values
     * @return InsufficientScopeError
     */
    public InsufficientScopeError build() {
        Objects.requireNonNull(message, InsufficientScopeError.class + ": message is missing");
        return new InsufficientScopeErrorImpl(message, values);
    }

    /**
     * builds InsufficientScopeError without checking for non-null required values
     * @return InsufficientScopeError
     */
    public InsufficientScopeError buildUnchecked() {
        return new InsufficientScopeErrorImpl(message, values);
    }

    /**
     * factory method for an instance of InsufficientScopeErrorBuilder
     * @return builder
     */
    public static InsufficientScopeErrorBuilder of() {
        return new InsufficientScopeErrorBuilder();
    }

    /**
     * create builder for InsufficientScopeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InsufficientScopeErrorBuilder of(final InsufficientScopeError template) {
        InsufficientScopeErrorBuilder builder = new InsufficientScopeErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
