
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MaxCartDiscountsReachedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MaxCartDiscountsReachedError maxCartDiscountsReachedError = MaxCartDiscountsReachedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MaxCartDiscountsReachedErrorBuilder implements Builder<MaxCartDiscountsReachedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"Maximum number of active cart discounts reached ($max)."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public MaxCartDiscountsReachedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public MaxCartDiscountsReachedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public MaxCartDiscountsReachedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"Maximum number of active cart discounts reached ($max)."</code></p>
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
     * builds MaxCartDiscountsReachedError with checking for non-null required values
     * @return MaxCartDiscountsReachedError
     */
    public MaxCartDiscountsReachedError build() {
        Objects.requireNonNull(message, MaxCartDiscountsReachedError.class + ": message is missing");
        return new MaxCartDiscountsReachedErrorImpl(message, values);
    }

    /**
     * builds MaxCartDiscountsReachedError without checking for non-null required values
     * @return MaxCartDiscountsReachedError
     */
    public MaxCartDiscountsReachedError buildUnchecked() {
        return new MaxCartDiscountsReachedErrorImpl(message, values);
    }

    /**
     * factory method for an instance of MaxCartDiscountsReachedErrorBuilder
     * @return builder
     */
    public static MaxCartDiscountsReachedErrorBuilder of() {
        return new MaxCartDiscountsReachedErrorBuilder();
    }

    /**
     * create builder for MaxCartDiscountsReachedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MaxCartDiscountsReachedErrorBuilder of(final MaxCartDiscountsReachedError template) {
        MaxCartDiscountsReachedErrorBuilder builder = new MaxCartDiscountsReachedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
