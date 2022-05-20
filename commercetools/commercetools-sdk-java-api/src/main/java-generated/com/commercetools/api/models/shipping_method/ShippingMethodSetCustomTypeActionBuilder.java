
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShippingMethodSetCustomTypeActionBuilder implements Builder<ShippingMethodSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
    *  <p>Defines the Type that extends the ShippingMethod with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ShippingMethod.</p>
    */

    public ShippingMethodSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
    *  <p>Defines the Type that extends the ShippingMethod with Custom Fields. If absent, any existing Type and Custom Fields are removed from the ShippingMethod.</p>
    */

    public ShippingMethodSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
    *  <p>Sets the Custom Fields fields for the ShippingMethod.</p>
    */

    public ShippingMethodSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
    *  <p>Sets the Custom Fields fields for the ShippingMethod.</p>
    */

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

    /**
     * builds ShippingMethodSetCustomTypeAction without checking for non null required values
     */
    public ShippingMethodSetCustomTypeAction buildUnchecked() {
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
