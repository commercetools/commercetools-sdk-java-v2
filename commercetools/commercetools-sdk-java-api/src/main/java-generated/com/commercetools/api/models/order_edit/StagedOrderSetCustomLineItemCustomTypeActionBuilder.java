
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetCustomLineItemCustomTypeActionBuilder {

    private String customLineItemId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public StagedOrderSetCustomLineItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public StagedOrderSetCustomLineItemCustomTypeAction build() {
        return new StagedOrderSetCustomLineItemCustomTypeActionImpl(customLineItemId, type, fields);
    }

    public static StagedOrderSetCustomLineItemCustomTypeActionBuilder of() {
        return new StagedOrderSetCustomLineItemCustomTypeActionBuilder();
    }

    public static StagedOrderSetCustomLineItemCustomTypeActionBuilder of(
            final StagedOrderSetCustomLineItemCustomTypeAction template) {
        StagedOrderSetCustomLineItemCustomTypeActionBuilder builder = new StagedOrderSetCustomLineItemCustomTypeActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
