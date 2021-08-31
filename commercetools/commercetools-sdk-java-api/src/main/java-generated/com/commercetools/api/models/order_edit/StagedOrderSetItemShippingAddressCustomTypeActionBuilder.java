
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetItemShippingAddressCustomTypeActionBuilder
        implements Builder<StagedOrderSetItemShippingAddressCustomTypeAction> {

    private String addressKey;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public StagedOrderSetItemShippingAddressCustomTypeActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    public StagedOrderSetItemShippingAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public StagedOrderSetItemShippingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public StagedOrderSetItemShippingAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public StagedOrderSetItemShippingAddressCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public StagedOrderSetItemShippingAddressCustomTypeAction build() {
        Objects.requireNonNull(addressKey,
            StagedOrderSetItemShippingAddressCustomTypeAction.class + ": addressKey is missing");
        return new StagedOrderSetItemShippingAddressCustomTypeActionImpl(addressKey, type, fields);
    }

    /**
     * builds StagedOrderSetItemShippingAddressCustomTypeAction without checking for non null required values
     */
    public StagedOrderSetItemShippingAddressCustomTypeAction buildUnchecked() {
        return new StagedOrderSetItemShippingAddressCustomTypeActionImpl(addressKey, type, fields);
    }

    public static StagedOrderSetItemShippingAddressCustomTypeActionBuilder of() {
        return new StagedOrderSetItemShippingAddressCustomTypeActionBuilder();
    }

    public static StagedOrderSetItemShippingAddressCustomTypeActionBuilder of(
            final StagedOrderSetItemShippingAddressCustomTypeAction template) {
        StagedOrderSetItemShippingAddressCustomTypeActionBuilder builder = new StagedOrderSetItemShippingAddressCustomTypeActionBuilder();
        builder.addressKey = template.getAddressKey();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
