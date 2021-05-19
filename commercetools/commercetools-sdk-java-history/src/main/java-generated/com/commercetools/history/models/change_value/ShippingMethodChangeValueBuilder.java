
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodChangeValueBuilder {

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
