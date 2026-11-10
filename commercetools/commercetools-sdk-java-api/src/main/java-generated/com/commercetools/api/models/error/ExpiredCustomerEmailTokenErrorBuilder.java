
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExpiredCustomerEmailTokenErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpiredCustomerEmailTokenError expiredCustomerEmailTokenError = ExpiredCustomerEmailTokenError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExpiredCustomerEmailTokenErrorBuilder implements Builder<ExpiredCustomerEmailTokenError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"The given email token has expired."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ExpiredCustomerEmailTokenErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ExpiredCustomerEmailTokenErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ExpiredCustomerEmailTokenErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"The given email token has expired."</code></p>
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
     * builds ExpiredCustomerEmailTokenError with checking for non-null required values
     * @return ExpiredCustomerEmailTokenError
     */
    public ExpiredCustomerEmailTokenError build() {
        Objects.requireNonNull(message, ExpiredCustomerEmailTokenError.class + ": message is missing");
        return new ExpiredCustomerEmailTokenErrorImpl(message, values);
    }

    /**
     * builds ExpiredCustomerEmailTokenError without checking for non-null required values
     * @return ExpiredCustomerEmailTokenError
     */
    public ExpiredCustomerEmailTokenError buildUnchecked() {
        return new ExpiredCustomerEmailTokenErrorImpl(message, values);
    }

    /**
     * factory method for an instance of ExpiredCustomerEmailTokenErrorBuilder
     * @return builder
     */
    public static ExpiredCustomerEmailTokenErrorBuilder of() {
        return new ExpiredCustomerEmailTokenErrorBuilder();
    }

    /**
     * create builder for ExpiredCustomerEmailTokenError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpiredCustomerEmailTokenErrorBuilder of(final ExpiredCustomerEmailTokenError template) {
        ExpiredCustomerEmailTokenErrorBuilder builder = new ExpiredCustomerEmailTokenErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
