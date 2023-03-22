
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
     * @param message
     * @return Builder
     */

    public ShippingMethodDoesNotMatchCartErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public ShippingMethodDoesNotMatchCartErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public ShippingMethodDoesNotMatchCartErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public ShippingMethodDoesNotMatchCartError build() {
        Objects.requireNonNull(message, ShippingMethodDoesNotMatchCartError.class + ": message is missing");
        return new ShippingMethodDoesNotMatchCartErrorImpl(message, values);
    }

    /**
     * builds ShippingMethodDoesNotMatchCartError without checking for non null required values
     */
    public ShippingMethodDoesNotMatchCartError buildUnchecked() {
        return new ShippingMethodDoesNotMatchCartErrorImpl(message, values);
    }

    public static ShippingMethodDoesNotMatchCartErrorBuilder of() {
        return new ShippingMethodDoesNotMatchCartErrorBuilder();
    }

    public static ShippingMethodDoesNotMatchCartErrorBuilder of(final ShippingMethodDoesNotMatchCartError template) {
        ShippingMethodDoesNotMatchCartErrorBuilder builder = new ShippingMethodDoesNotMatchCartErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
