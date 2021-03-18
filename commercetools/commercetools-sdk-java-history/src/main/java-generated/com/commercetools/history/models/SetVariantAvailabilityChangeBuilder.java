
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetVariantAvailabilityChangeBuilder {

    private String change;

    private String catalogData;

    private String variant;

    private com.commercetools.history.models.ProductVariantAvailability previousValue;

    private com.commercetools.history.models.ProductVariantAvailability nextValue;

    public SetVariantAvailabilityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetVariantAvailabilityChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public SetVariantAvailabilityChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    public SetVariantAvailabilityChangeBuilder previousValue(
            final com.commercetools.history.models.ProductVariantAvailability previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetVariantAvailabilityChangeBuilder nextValue(
            final com.commercetools.history.models.ProductVariantAvailability nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public String getVariant() {
        return this.variant;
    }

    public com.commercetools.history.models.ProductVariantAvailability getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.ProductVariantAvailability getNextValue() {
        return this.nextValue;
    }

    public SetVariantAvailabilityChange build() {
        return new SetVariantAvailabilityChangeImpl(change, catalogData, variant, previousValue, nextValue);
    }

    public static SetVariantAvailabilityChangeBuilder of() {
        return new SetVariantAvailabilityChangeBuilder();
    }

    public static SetVariantAvailabilityChangeBuilder of(final SetVariantAvailabilityChange template) {
        SetVariantAvailabilityChangeBuilder builder = new SetVariantAvailabilityChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.variant = template.getVariant();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
