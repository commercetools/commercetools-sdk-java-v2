
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetShippingAddressCustomTypeActionBuilder {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public StagedOrderSetShippingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public StagedOrderSetShippingAddressCustomTypeActionBuilder fields(
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

    public StagedOrderSetShippingAddressCustomTypeAction build() {
        return new StagedOrderSetShippingAddressCustomTypeActionImpl(type, fields);
    }

    public static StagedOrderSetShippingAddressCustomTypeActionBuilder of() {
        return new StagedOrderSetShippingAddressCustomTypeActionBuilder();
    }

    public static StagedOrderSetShippingAddressCustomTypeActionBuilder of(
            final StagedOrderSetShippingAddressCustomTypeAction template) {
        StagedOrderSetShippingAddressCustomTypeActionBuilder builder = new StagedOrderSetShippingAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
