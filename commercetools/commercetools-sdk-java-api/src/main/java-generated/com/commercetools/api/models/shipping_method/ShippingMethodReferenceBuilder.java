
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShippingMethodReferenceBuilder implements Builder<ShippingMethodReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethod obj;

    /**
    *  <p>Platform-generated unique identifier of the referenced ShippingMethod.</p>
    */

    public ShippingMethodReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
    *  <p>Contains the representation of the expanded Review. Only present in responses to requests with Reference Expansion for ShippingMethods.</p>
    */

    public ShippingMethodReferenceBuilder obj(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodBuilder, com.commercetools.api.models.shipping_method.ShippingMethodBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.shipping_method.ShippingMethodBuilder.of()).build();
        return this;
    }

    /**
    *  <p>Contains the representation of the expanded Review. Only present in responses to requests with Reference Expansion for ShippingMethods.</p>
    */

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
        Objects.requireNonNull(id, ShippingMethodReference.class + ": id is missing");
        return new ShippingMethodReferenceImpl(id, obj);
    }

    /**
     * builds ShippingMethodReference without checking for non null required values
     */
    public ShippingMethodReference buildUnchecked() {
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
