
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExpiredCustomerPasswordTokenErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpiredCustomerPasswordTokenError expiredCustomerPasswordTokenError = ExpiredCustomerPasswordTokenError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExpiredCustomerPasswordTokenErrorBuilder implements Builder<ExpiredCustomerPasswordTokenError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"The given password token has expired."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ExpiredCustomerPasswordTokenErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ExpiredCustomerPasswordTokenErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ExpiredCustomerPasswordTokenErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"The given password token has expired."</code></p>
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
     * builds ExpiredCustomerPasswordTokenError with checking for non-null required values
     * @return ExpiredCustomerPasswordTokenError
     */
    public ExpiredCustomerPasswordTokenError build() {
        Objects.requireNonNull(message, ExpiredCustomerPasswordTokenError.class + ": message is missing");
        return new ExpiredCustomerPasswordTokenErrorImpl(message, values);
    }

    /**
     * builds ExpiredCustomerPasswordTokenError without checking for non-null required values
     * @return ExpiredCustomerPasswordTokenError
     */
    public ExpiredCustomerPasswordTokenError buildUnchecked() {
        return new ExpiredCustomerPasswordTokenErrorImpl(message, values);
    }

    /**
     * factory method for an instance of ExpiredCustomerPasswordTokenErrorBuilder
     * @return builder
     */
    public static ExpiredCustomerPasswordTokenErrorBuilder of() {
        return new ExpiredCustomerPasswordTokenErrorBuilder();
    }

    /**
     * create builder for ExpiredCustomerPasswordTokenError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpiredCustomerPasswordTokenErrorBuilder of(final ExpiredCustomerPasswordTokenError template) {
        ExpiredCustomerPasswordTokenErrorBuilder builder = new ExpiredCustomerPasswordTokenErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
