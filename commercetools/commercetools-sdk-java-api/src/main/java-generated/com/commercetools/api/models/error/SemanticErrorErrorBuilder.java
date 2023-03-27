
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SemanticErrorErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SemanticErrorError semanticErrorError = SemanticErrorError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SemanticErrorErrorBuilder implements Builder<SemanticErrorError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error concerning the predicate. For example, <code>"Invalid country code $countryCode provided for the field $fieldDefinition."</code>.</p>
     * @param message value to be set
     * @return Builder
     */

    public SemanticErrorErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public SemanticErrorErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public SemanticErrorErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Plain text description of the error concerning the predicate. For example, <code>"Invalid country code $countryCode provided for the field $fieldDefinition."</code>.</p>
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
     * builds SemanticErrorError with checking for non-null required values
     * @return SemanticErrorError
     */
    public SemanticErrorError build() {
        Objects.requireNonNull(message, SemanticErrorError.class + ": message is missing");
        return new SemanticErrorErrorImpl(message, values);
    }

    /**
     * builds SemanticErrorError without checking for non-null required values
     * @return SemanticErrorError
     */
    public SemanticErrorError buildUnchecked() {
        return new SemanticErrorErrorImpl(message, values);
    }

    /**
     * factory method for an instance of SemanticErrorErrorBuilder
     * @return builder
     */
    public static SemanticErrorErrorBuilder of() {
        return new SemanticErrorErrorBuilder();
    }

    /**
     * create builder for SemanticErrorError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SemanticErrorErrorBuilder of(final SemanticErrorError template) {
        SemanticErrorErrorBuilder builder = new SemanticErrorErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
