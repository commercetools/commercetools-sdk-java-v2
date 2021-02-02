
package com.commercetools.api.models.tax_category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxRateDraftBuilder {

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
