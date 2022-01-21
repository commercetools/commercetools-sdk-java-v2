
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderSetParcelCustomFieldActionBuilder implements Builder<StagedOrderSetParcelCustomFieldAction> {

    private String parcelId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public StagedOrderSetParcelCustomFieldActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public StagedOrderSetParcelCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public StagedOrderSetParcelCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public StagedOrderSetParcelCustomFieldAction build() {
        Objects.requireNonNull(parcelId, StagedOrderSetParcelCustomFieldAction.class + ": parcelId is missing");
        Objects.requireNonNull(name, StagedOrderSetParcelCustomFieldAction.class + ": name is missing");
        return new StagedOrderSetParcelCustomFieldActionImpl(parcelId, name, value);
    }

    /**
     * builds StagedOrderSetParcelCustomFieldAction without checking for non null required values
     */
    public StagedOrderSetParcelCustomFieldAction buildUnchecked() {
        return new StagedOrderSetParcelCustomFieldActionImpl(parcelId, name, value);
    }

    public static StagedOrderSetParcelCustomFieldActionBuilder of() {
        return new StagedOrderSetParcelCustomFieldActionBuilder();
    }

    public static StagedOrderSetParcelCustomFieldActionBuilder of(
            final StagedOrderSetParcelCustomFieldAction template) {
        StagedOrderSetParcelCustomFieldActionBuilder builder = new StagedOrderSetParcelCustomFieldActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
