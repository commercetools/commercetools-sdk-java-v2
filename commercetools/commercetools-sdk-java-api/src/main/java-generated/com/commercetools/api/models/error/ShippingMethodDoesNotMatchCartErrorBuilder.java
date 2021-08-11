
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodDoesNotMatchCartErrorBuilder implements Builder<ShippingMethodDoesNotMatchCartError> {

    private String message;

    public ShippingMethodDoesNotMatchCartErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public ShippingMethodDoesNotMatchCartError build() {
        Objects.requireNonNull(message, ShippingMethodDoesNotMatchCartError.class + ": message is missing");
        return new ShippingMethodDoesNotMatchCartErrorImpl(message);
    }

    /**
     * builds ShippingMethodDoesNotMatchCartError without checking for non null required values
     */
    public ShippingMethodDoesNotMatchCartError buildUnchecked() {
        return new ShippingMethodDoesNotMatchCartErrorImpl(message);
    }

    public static ShippingMethodDoesNotMatchCartErrorBuilder of() {
        return new ShippingMethodDoesNotMatchCartErrorBuilder();
    }

    public static ShippingMethodDoesNotMatchCartErrorBuilder of(final ShippingMethodDoesNotMatchCartError template) {
        ShippingMethodDoesNotMatchCartErrorBuilder builder = new ShippingMethodDoesNotMatchCartErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
