
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderSetParcelCustomTypeActionBuilder implements Builder<StagedOrderSetParcelCustomTypeAction> {

    private String parcelId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public StagedOrderSetParcelCustomTypeActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public StagedOrderSetParcelCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public StagedOrderSetParcelCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public StagedOrderSetParcelCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public StagedOrderSetParcelCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public StagedOrderSetParcelCustomTypeAction build() {
        Objects.requireNonNull(parcelId, StagedOrderSetParcelCustomTypeAction.class + ": parcelId is missing");
        return new StagedOrderSetParcelCustomTypeActionImpl(parcelId, type, fields);
    }

    /**
     * builds StagedOrderSetParcelCustomTypeAction without checking for non null required values
     */
    public StagedOrderSetParcelCustomTypeAction buildUnchecked() {
        return new StagedOrderSetParcelCustomTypeActionImpl(parcelId, type, fields);
    }

    public static StagedOrderSetParcelCustomTypeActionBuilder of() {
        return new StagedOrderSetParcelCustomTypeActionBuilder();
    }

    public static StagedOrderSetParcelCustomTypeActionBuilder of(final StagedOrderSetParcelCustomTypeAction template) {
        StagedOrderSetParcelCustomTypeActionBuilder builder = new StagedOrderSetParcelCustomTypeActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
