
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetVariantAvailabilityChangeBuilder implements Builder<SetVariantAvailabilityChange> {

    private String change;

    private String catalogData;

    private String variant;

    private com.commercetools.history.models.common.ProductVariantAvailability previousValue;

    private com.commercetools.history.models.common.ProductVariantAvailability nextValue;

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
            Function<com.commercetools.history.models.common.ProductVariantAvailabilityBuilder, com.commercetools.history.models.common.ProductVariantAvailabilityBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.common.ProductVariantAvailabilityBuilder.of())
                .build();
        return this;
    }

    public SetVariantAvailabilityChangeBuilder previousValue(
            final com.commercetools.history.models.common.ProductVariantAvailability previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetVariantAvailabilityChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ProductVariantAvailabilityBuilder, com.commercetools.history.models.common.ProductVariantAvailabilityBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ProductVariantAvailabilityBuilder.of())
                .build();
        return this;
    }

    public SetVariantAvailabilityChangeBuilder nextValue(
            final com.commercetools.history.models.common.ProductVariantAvailability nextValue) {
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

    public com.commercetools.history.models.common.ProductVariantAvailability getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.ProductVariantAvailability getNextValue() {
        return this.nextValue;
    }

    public SetVariantAvailabilityChange build() {
        Objects.requireNonNull(change, SetVariantAvailabilityChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetVariantAvailabilityChange.class + ": catalogData is missing");
        Objects.requireNonNull(variant, SetVariantAvailabilityChange.class + ": variant is missing");
        Objects.requireNonNull(previousValue, SetVariantAvailabilityChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetVariantAvailabilityChange.class + ": nextValue is missing");
        return new SetVariantAvailabilityChangeImpl(change, catalogData, variant, previousValue, nextValue);
    }

    /**
     * builds SetVariantAvailabilityChange without checking for non null required values
     */
    public SetVariantAvailabilityChange buildUnchecked() {
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
