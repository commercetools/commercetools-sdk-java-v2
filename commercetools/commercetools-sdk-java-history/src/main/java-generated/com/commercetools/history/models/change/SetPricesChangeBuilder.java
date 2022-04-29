
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SetPricesChangeBuilder implements Builder<SetPricesChange> {

    private String change;

    private String catalogData;

    private String variant;

    private java.util.List<com.commercetools.history.models.common.Price> previousValue;

    private java.util.List<com.commercetools.history.models.common.Price> nextValue;

    public SetPricesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetPricesChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public SetPricesChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    public SetPricesChangeBuilder previousValue(final com.commercetools.history.models.common.Price... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public SetPricesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Price> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetPricesChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.Price... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    public SetPricesChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build());
        return this;
    }

    public SetPricesChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build());
        return this;
    }

    public SetPricesChangeBuilder nextValue(final com.commercetools.history.models.common.Price... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public SetPricesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Price> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetPricesChangeBuilder plusNextValue(final com.commercetools.history.models.common.Price... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    public SetPricesChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build());
        return this;
    }

    public SetPricesChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build());
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

    public java.util.List<com.commercetools.history.models.common.Price> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.common.Price> getNextValue() {
        return this.nextValue;
    }

    public SetPricesChange build() {
        Objects.requireNonNull(change, SetPricesChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetPricesChange.class + ": catalogData is missing");
        Objects.requireNonNull(variant, SetPricesChange.class + ": variant is missing");
        Objects.requireNonNull(previousValue, SetPricesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetPricesChange.class + ": nextValue is missing");
        return new SetPricesChangeImpl(change, catalogData, variant, previousValue, nextValue);
    }

    /**
     * builds SetPricesChange without checking for non null required values
     */
    public SetPricesChange buildUnchecked() {
        return new SetPricesChangeImpl(change, catalogData, variant, previousValue, nextValue);
    }

    public static SetPricesChangeBuilder of() {
        return new SetPricesChangeBuilder();
    }

    public static SetPricesChangeBuilder of(final SetPricesChange template) {
        SetPricesChangeBuilder builder = new SetPricesChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.variant = template.getVariant();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
