
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShippingMethodDoesNotMatchCartErrorBuilder implements Builder<ShippingMethodDoesNotMatchCartError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    public ShippingMethodDoesNotMatchCartErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public ShippingMethodDoesNotMatchCartErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

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
        Objects.requireNonNull(values, ShippingMethodDoesNotMatchCartError.class + ": values are missing");
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
