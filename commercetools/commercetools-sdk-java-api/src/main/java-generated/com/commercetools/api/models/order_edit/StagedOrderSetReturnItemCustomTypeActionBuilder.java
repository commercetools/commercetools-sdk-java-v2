
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderSetReturnItemCustomTypeActionBuilder
        implements Builder<StagedOrderSetReturnItemCustomTypeAction> {

    private String returnItemId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public StagedOrderSetReturnItemCustomTypeActionBuilder returnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    public StagedOrderSetReturnItemCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public StagedOrderSetReturnItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public StagedOrderSetReturnItemCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public StagedOrderSetReturnItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getReturnItemId() {
        return this.returnItemId;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public StagedOrderSetReturnItemCustomTypeAction build() {
        Objects.requireNonNull(returnItemId,
            StagedOrderSetReturnItemCustomTypeAction.class + ": returnItemId is missing");
        return new StagedOrderSetReturnItemCustomTypeActionImpl(returnItemId, type, fields);
    }

    /**
     * builds StagedOrderSetReturnItemCustomTypeAction without checking for non null required values
     */
    public StagedOrderSetReturnItemCustomTypeAction buildUnchecked() {
        return new StagedOrderSetReturnItemCustomTypeActionImpl(returnItemId, type, fields);
    }

    public static StagedOrderSetReturnItemCustomTypeActionBuilder of() {
        return new StagedOrderSetReturnItemCustomTypeActionBuilder();
    }

    public static StagedOrderSetReturnItemCustomTypeActionBuilder of(
            final StagedOrderSetReturnItemCustomTypeAction template) {
        StagedOrderSetReturnItemCustomTypeActionBuilder builder = new StagedOrderSetReturnItemCustomTypeActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
