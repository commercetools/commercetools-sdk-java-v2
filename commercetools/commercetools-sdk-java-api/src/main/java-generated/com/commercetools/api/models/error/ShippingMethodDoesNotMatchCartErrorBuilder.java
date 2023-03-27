
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodDoesNotMatchCartErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodDoesNotMatchCartError shippingMethodDoesNotMatchCartError = ShippingMethodDoesNotMatchCartError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodDoesNotMatchCartErrorBuilder implements Builder<ShippingMethodDoesNotMatchCartError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"The predicate does not match the cart."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ShippingMethodDoesNotMatchCartErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ShippingMethodDoesNotMatchCartErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ShippingMethodDoesNotMatchCartErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>"The predicate does not match the cart."</code></p>
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
     * builds ShippingMethodDoesNotMatchCartError with checking for non-null required values
     * @return ShippingMethodDoesNotMatchCartError
     */
    public ShippingMethodDoesNotMatchCartError build() {
        Objects.requireNonNull(message, ShippingMethodDoesNotMatchCartError.class + ": message is missing");
        return new ShippingMethodDoesNotMatchCartErrorImpl(message, values);
    }

    /**
     * builds ShippingMethodDoesNotMatchCartError without checking for non-null required values
     * @return ShippingMethodDoesNotMatchCartError
     */
    public ShippingMethodDoesNotMatchCartError buildUnchecked() {
        return new ShippingMethodDoesNotMatchCartErrorImpl(message, values);
    }

    /**
     * factory method for an instance of ShippingMethodDoesNotMatchCartErrorBuilder
     * @return builder
     */
    public static ShippingMethodDoesNotMatchCartErrorBuilder of() {
        return new ShippingMethodDoesNotMatchCartErrorBuilder();
    }

    /**
     * create builder for ShippingMethodDoesNotMatchCartError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodDoesNotMatchCartErrorBuilder of(final ShippingMethodDoesNotMatchCartError template) {
        ShippingMethodDoesNotMatchCartErrorBuilder builder = new ShippingMethodDoesNotMatchCartErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
