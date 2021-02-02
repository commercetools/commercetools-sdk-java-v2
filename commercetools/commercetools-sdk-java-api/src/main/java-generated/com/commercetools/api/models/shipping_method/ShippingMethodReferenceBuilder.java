
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodReferenceBuilder {

    private String id;

    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethod obj;

    public ShippingMethodReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ShippingMethodReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethod obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethod getObj() {
        return this.obj;
    }

    public ShippingMethodReference build() {
        return new ShippingMethodReferenceImpl(id, obj);
    }

    public static ShippingMethodReferenceBuilder of() {
        return new ShippingMethodReferenceBuilder();
    }

    public static ShippingMethodReferenceBuilder of(final ShippingMethodReference template) {
        ShippingMethodReferenceBuilder builder = new ShippingMethodReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
