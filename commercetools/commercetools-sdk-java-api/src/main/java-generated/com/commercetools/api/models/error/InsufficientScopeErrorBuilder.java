
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
     <>
     */

    public InsufficientScopeErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     <>
     */

    public InsufficientScopeErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     <>
     */

    public InsufficientScopeErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public InsufficientScopeError build() {
        Objects.requireNonNull(message, InsufficientScopeError.class + ": message is missing");
        Objects.requireNonNull(values, InsufficientScopeError.class + ": values are missing");
        return new InsufficientScopeErrorImpl(message, values);
    }

    /**
     * builds InsufficientScopeError without checking for non null required values
     */
    public InsufficientScopeError buildUnchecked() {
        return new InsufficientScopeErrorImpl(message, values);
    }

    public static InsufficientScopeErrorBuilder of() {
        return new InsufficientScopeErrorBuilder();
    }

    public static InsufficientScopeErrorBuilder of(final InsufficientScopeError template) {
        InsufficientScopeErrorBuilder builder = new InsufficientScopeErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
