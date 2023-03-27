
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * NoMatchingProductDiscountFoundErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NoMatchingProductDiscountFoundError noMatchingProductDiscountFoundError = NoMatchingProductDiscountFoundError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class NoMatchingProductDiscountFoundErrorBuilder implements Builder<NoMatchingProductDiscountFoundError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"Couldn't find a matching product discount for: productId=$productId, variantId=$variantId, price=$price."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public NoMatchingProductDiscountFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public NoMatchingProductDiscountFoundErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public NoMatchingProductDiscountFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"Couldn't find a matching product discount for: productId=$productId, variantId=$variantId, price=$price."</code></p>
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
     * builds NoMatchingProductDiscountFoundError with checking for non-null required values
     * @return NoMatchingProductDiscountFoundError
     */
    public NoMatchingProductDiscountFoundError build() {
        Objects.requireNonNull(message, NoMatchingProductDiscountFoundError.class + ": message is missing");
        return new NoMatchingProductDiscountFoundErrorImpl(message, values);
    }

    /**
     * builds NoMatchingProductDiscountFoundError without checking for non-null required values
     * @return NoMatchingProductDiscountFoundError
     */
    public NoMatchingProductDiscountFoundError buildUnchecked() {
        return new NoMatchingProductDiscountFoundErrorImpl(message, values);
    }

    /**
     * factory method for an instance of NoMatchingProductDiscountFoundErrorBuilder
     * @return builder
     */
    public static NoMatchingProductDiscountFoundErrorBuilder of() {
        return new NoMatchingProductDiscountFoundErrorBuilder();
    }

    /**
     * create builder for NoMatchingProductDiscountFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NoMatchingProductDiscountFoundErrorBuilder of(final NoMatchingProductDiscountFoundError template) {
        NoMatchingProductDiscountFoundErrorBuilder builder = new NoMatchingProductDiscountFoundErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
