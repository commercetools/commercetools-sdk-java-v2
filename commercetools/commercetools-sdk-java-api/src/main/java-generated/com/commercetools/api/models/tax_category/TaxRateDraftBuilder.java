
package com.commercetools.api.models.tax_category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TaxRateDraftBuilder implements Builder<TaxRateDraft> {

    private String name;

    @Nullable
    private Double amount;

    private Boolean includedInPrice;

    private String country;

    @Nullable
    private String state;

    @Nullable
    private java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates;

    public TaxRateDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public TaxRateDraftBuilder amount(@Nullable final Double amount) {
        this.amount = amount;
        return this;
    }

    public TaxRateDraftBuilder includedInPrice(final Boolean includedInPrice) {
        this.includedInPrice = includedInPrice;
        return this;
    }

    public TaxRateDraftBuilder country(final String country) {
        this.country = country;
        return this;
    }

    public TaxRateDraftBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }

    public TaxRateDraftBuilder subRates(@Nullable final com.commercetools.api.models.tax_category.SubRate... subRates) {
        this.subRates = new ArrayList<>(Arrays.asList(subRates));
        return this;
    }

    public TaxRateDraftBuilder subRates(
            @Nullable final java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates) {
        this.subRates = subRates;
        return this;
    }

    public TaxRateDraftBuilder plusSubRates(
            @Nullable final com.commercetools.api.models.tax_category.SubRate... subRates) {
        if (this.subRates == null) {
            this.subRates = new ArrayList<>();
        }
        this.subRates.addAll(Arrays.asList(subRates));
        return this;
    }

    public TaxRateDraftBuilder plusSubRates(
            Function<com.commercetools.api.models.tax_category.SubRateBuilder, com.commercetools.api.models.tax_category.SubRateBuilder> builder) {
        if (this.subRates == null) {
            this.subRates = new ArrayList<>();
        }
        this.subRates.add(builder.apply(com.commercetools.api.models.tax_category.SubRateBuilder.of()).build());
        return this;
    }

    public TaxRateDraftBuilder withSubRates(
            Function<com.commercetools.api.models.tax_category.SubRateBuilder, com.commercetools.api.models.tax_category.SubRateBuilder> builder) {
        this.subRates = new ArrayList<>();
        this.subRates.add(builder.apply(com.commercetools.api.models.tax_category.SubRateBuilder.of()).build());
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public Double getAmount() {
        return this.amount;
    }

    public Boolean getIncludedInPrice() {
        return this.includedInPrice;
    }

    public String getCountry() {
        return this.country;
    }

    @Nullable
    public String getState() {
        return this.state;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.tax_category.SubRate> getSubRates() {
        return this.subRates;
    }

    public TaxRateDraft build() {
        Objects.requireNonNull(name, TaxRateDraft.class + ": name is missing");
        Objects.requireNonNull(includedInPrice, TaxRateDraft.class + ": includedInPrice is missing");
        Objects.requireNonNull(country, TaxRateDraft.class + ": country is missing");
        return new TaxRateDraftImpl(name, amount, includedInPrice, country, state, subRates);
    }

    /**
     * builds TaxRateDraft without checking for non null required values
     */
    public TaxRateDraft buildUnchecked() {
        return new TaxRateDraftImpl(name, amount, includedInPrice, country, state, subRates);
    }

    public static TaxRateDraftBuilder of() {
        return new TaxRateDraftBuilder();
    }

    public static TaxRateDraftBuilder of(final TaxRateDraft template) {
        TaxRateDraftBuilder builder = new TaxRateDraftBuilder();
        builder.name = template.getName();
        builder.amount = template.getAmount();
        builder.includedInPrice = template.getIncludedInPrice();
        builder.country = template.getCountry();
        builder.state = template.getState();
        builder.subRates = template.getSubRates();
        return builder;
    }

}
