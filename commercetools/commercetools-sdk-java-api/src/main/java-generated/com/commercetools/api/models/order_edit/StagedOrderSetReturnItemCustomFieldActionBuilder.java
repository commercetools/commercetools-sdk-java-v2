
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderSetReturnItemCustomFieldActionBuilder
        implements Builder<StagedOrderSetReturnItemCustomFieldAction> {

    private String returnItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public StagedOrderSetReturnItemCustomFieldActionBuilder returnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    public StagedOrderSetReturnItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public StagedOrderSetReturnItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getReturnItemId() {
        return this.returnItemId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public StagedOrderSetReturnItemCustomFieldAction build() {
        Objects.requireNonNull(returnItemId,
            StagedOrderSetReturnItemCustomFieldAction.class + ": returnItemId is missing");
        Objects.requireNonNull(name, StagedOrderSetReturnItemCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetReturnItemCustomFieldActionImpl(returnItemId, name, value);
    }

    /**
     * builds StagedOrderSetReturnItemCustomFieldAction without checking for non null required values
     */
    public StagedOrderSetReturnItemCustomFieldAction buildUnchecked() {
        return new StagedOrderSetReturnItemCustomFieldActionImpl(returnItemId, name, value);
    }

    public static StagedOrderSetReturnItemCustomFieldActionBuilder of() {
        return new StagedOrderSetReturnItemCustomFieldActionBuilder();
    }

    public static StagedOrderSetReturnItemCustomFieldActionBuilder of(
            final StagedOrderSetReturnItemCustomFieldAction template) {
        StagedOrderSetReturnItemCustomFieldActionBuilder builder = new StagedOrderSetReturnItemCustomFieldActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
