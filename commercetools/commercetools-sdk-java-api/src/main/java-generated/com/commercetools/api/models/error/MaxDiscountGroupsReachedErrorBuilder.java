
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MaxDiscountGroupsReachedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MaxDiscountGroupsReachedError maxDiscountGroupsReachedError = MaxDiscountGroupsReachedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MaxDiscountGroupsReachedErrorBuilder implements Builder<MaxDiscountGroupsReachedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"Maximum number of active discount groups reached ($max)."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public MaxDiscountGroupsReachedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public MaxDiscountGroupsReachedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public MaxDiscountGroupsReachedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"Maximum number of active discount groups reached ($max)."</code></p>
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
     * builds MaxDiscountGroupsReachedError with checking for non-null required values
     * @return MaxDiscountGroupsReachedError
     */
    public MaxDiscountGroupsReachedError build() {
        Objects.requireNonNull(message, MaxDiscountGroupsReachedError.class + ": message is missing");
        return new MaxDiscountGroupsReachedErrorImpl(message, values);
    }

    /**
     * builds MaxDiscountGroupsReachedError without checking for non-null required values
     * @return MaxDiscountGroupsReachedError
     */
    public MaxDiscountGroupsReachedError buildUnchecked() {
        return new MaxDiscountGroupsReachedErrorImpl(message, values);
    }

    /**
     * factory method for an instance of MaxDiscountGroupsReachedErrorBuilder
     * @return builder
     */
    public static MaxDiscountGroupsReachedErrorBuilder of() {
        return new MaxDiscountGroupsReachedErrorBuilder();
    }

    /**
     * create builder for MaxDiscountGroupsReachedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MaxDiscountGroupsReachedErrorBuilder of(final MaxDiscountGroupsReachedError template) {
        MaxDiscountGroupsReachedErrorBuilder builder = new MaxDiscountGroupsReachedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
