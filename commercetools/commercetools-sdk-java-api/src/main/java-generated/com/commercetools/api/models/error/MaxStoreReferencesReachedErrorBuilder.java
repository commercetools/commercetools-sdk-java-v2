
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MaxStoreReferencesReachedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MaxStoreReferencesReachedError maxStoreReferencesReachedError = MaxStoreReferencesReachedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MaxStoreReferencesReachedErrorBuilder implements Builder<MaxStoreReferencesReachedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"Maximum number of store discounts on a single cart discount reached $max".</code></p>
     * @param message value to be set
     * @return Builder
     */

    public MaxStoreReferencesReachedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public MaxStoreReferencesReachedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public MaxStoreReferencesReachedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"Maximum number of store discounts on a single cart discount reached $max".</code></p>
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
     * builds MaxStoreReferencesReachedError with checking for non-null required values
     * @return MaxStoreReferencesReachedError
     */
    public MaxStoreReferencesReachedError build() {
        Objects.requireNonNull(message, MaxStoreReferencesReachedError.class + ": message is missing");
        return new MaxStoreReferencesReachedErrorImpl(message, values);
    }

    /**
     * builds MaxStoreReferencesReachedError without checking for non-null required values
     * @return MaxStoreReferencesReachedError
     */
    public MaxStoreReferencesReachedError buildUnchecked() {
        return new MaxStoreReferencesReachedErrorImpl(message, values);
    }

    /**
     * factory method for an instance of MaxStoreReferencesReachedErrorBuilder
     * @return builder
     */
    public static MaxStoreReferencesReachedErrorBuilder of() {
        return new MaxStoreReferencesReachedErrorBuilder();
    }

    /**
     * create builder for MaxStoreReferencesReachedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MaxStoreReferencesReachedErrorBuilder of(final MaxStoreReferencesReachedError template) {
        MaxStoreReferencesReachedErrorBuilder builder = new MaxStoreReferencesReachedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
