
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodSetCustomTypeActionBuilder {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public ShippingMethodSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public ShippingMethodSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public ShippingMethodSetCustomTypeAction build() {
        return new ShippingMethodSetCustomTypeActionImpl(type, fields);
    }

    public static ShippingMethodSetCustomTypeActionBuilder of() {
        return new ShippingMethodSetCustomTypeActionBuilder();
    }

    public static ShippingMethodSetCustomTypeActionBuilder of(final ShippingMethodSetCustomTypeAction template) {
        ShippingMethodSetCustomTypeActionBuilder builder = new ShippingMethodSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
