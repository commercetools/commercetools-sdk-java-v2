
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetBillingAddressCustomTypeActionBuilder
        implements Builder<StagedOrderSetBillingAddressCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public StagedOrderSetBillingAddressCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public StagedOrderSetBillingAddressCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public StagedOrderSetBillingAddressCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public StagedOrderSetBillingAddressCustomTypeActionBuilder fields(
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

    public StagedOrderSetBillingAddressCustomTypeAction build() {
        return new StagedOrderSetBillingAddressCustomTypeActionImpl(type, fields);
    }

    /**
     * builds StagedOrderSetBillingAddressCustomTypeAction without checking for non null required values
     */
    public StagedOrderSetBillingAddressCustomTypeAction buildUnchecked() {
        return new StagedOrderSetBillingAddressCustomTypeActionImpl(type, fields);
    }

    public static StagedOrderSetBillingAddressCustomTypeActionBuilder of() {
        return new StagedOrderSetBillingAddressCustomTypeActionBuilder();
    }

    public static StagedOrderSetBillingAddressCustomTypeActionBuilder of(
            final StagedOrderSetBillingAddressCustomTypeAction template) {
        StagedOrderSetBillingAddressCustomTypeActionBuilder builder = new StagedOrderSetBillingAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
