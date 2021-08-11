
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodSetCustomTypeActionBuilder implements Builder<ShippingMethodSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public ShippingMethodSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public ShippingMethodSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public ShippingMethodSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
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
