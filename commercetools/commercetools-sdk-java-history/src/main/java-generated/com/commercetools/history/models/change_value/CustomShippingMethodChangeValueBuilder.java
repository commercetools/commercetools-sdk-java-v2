
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomShippingMethodChangeValueBuilder implements Builder<CustomShippingMethodChangeValue> {

    private String name;

    public CustomShippingMethodChangeValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public CustomShippingMethodChangeValue build() {
        Objects.requireNonNull(name, CustomShippingMethodChangeValue.class + ": name is missing");
        return new CustomShippingMethodChangeValueImpl(name);
    }

    /**
     * builds CustomShippingMethodChangeValue without checking for non null required values
     */
    public CustomShippingMethodChangeValue buildUnchecked() {
        return new CustomShippingMethodChangeValueImpl(name);
    }

    public static CustomShippingMethodChangeValueBuilder of() {
        return new CustomShippingMethodChangeValueBuilder();
    }

    public static CustomShippingMethodChangeValueBuilder of(final CustomShippingMethodChangeValue template) {
        CustomShippingMethodChangeValueBuilder builder = new CustomShippingMethodChangeValueBuilder();
        builder.name = template.getName();
        return builder;
    }

}
