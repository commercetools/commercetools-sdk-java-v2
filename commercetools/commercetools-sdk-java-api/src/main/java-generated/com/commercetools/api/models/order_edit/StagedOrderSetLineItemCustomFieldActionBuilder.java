
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetLineItemCustomFieldActionBuilder {

    private String lineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public StagedOrderSetLineItemCustomFieldActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public StagedOrderSetLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public StagedOrderSetLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public StagedOrderSetLineItemCustomFieldAction build() {
        return new StagedOrderSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    public static StagedOrderSetLineItemCustomFieldActionBuilder of() {
        return new StagedOrderSetLineItemCustomFieldActionBuilder();
    }

    public static StagedOrderSetLineItemCustomFieldActionBuilder of(
            final StagedOrderSetLineItemCustomFieldAction template) {
        StagedOrderSetLineItemCustomFieldActionBuilder builder = new StagedOrderSetLineItemCustomFieldActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
