
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodChangeValueBuilder implements Builder<ShippingMethodChangeValue> {

    private String id;

    private String name;

    public ShippingMethodChangeValueBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ShippingMethodChangeValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public ShippingMethodChangeValue build() {
        Objects.requireNonNull(id, ShippingMethodChangeValue.class + ": id is missing");
        Objects.requireNonNull(name, ShippingMethodChangeValue.class + ": name is missing");
        return new ShippingMethodChangeValueImpl(id, name);
    }

    /**
     * builds ShippingMethodChangeValue without checking for non null required values
     */
    public ShippingMethodChangeValue buildUnchecked() {
        return new ShippingMethodChangeValueImpl(id, name);
    }

    public static ShippingMethodChangeValueBuilder of() {
        return new ShippingMethodChangeValueBuilder();
    }

    public static ShippingMethodChangeValueBuilder of(final ShippingMethodChangeValue template) {
        ShippingMethodChangeValueBuilder builder = new ShippingMethodChangeValueBuilder();
        builder.id = template.getId();
        builder.name = template.getName();
        return builder;
    }

}
