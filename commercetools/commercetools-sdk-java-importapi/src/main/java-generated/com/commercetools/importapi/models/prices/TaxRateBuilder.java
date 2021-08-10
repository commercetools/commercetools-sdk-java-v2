
package com.commercetools.importapi.models.prices;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxRateBuilder implements Builder<TaxRate> {

    @Nullable
    private String id;

    private String name;

    private Double amount;

    private Boolean includedInPrice;

    private String country;

    @Nullable
    private String state;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.prices.SubRate> subRates;

    public TaxRateBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public TaxRateBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public TaxRateBuilder amount(final Double amount) {
        this.amount = amount;
        return this;
    }

    public TaxRateBuilder includedInPrice(final Boolean includedInPrice) {
        this.includedInPrice = includedInPrice;
        return this;
    }

    public TaxRateBuilder country(final String country) {
        this.country = country;
        return this;
    }

    public TaxRateBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }

    public TaxRateBuilder subRates(@Nullable final com.commercetools.importapi.models.prices.SubRate... subRates) {
        this.subRates = new ArrayList<>(Arrays.asList(subRates));
        return this;
    }

    public TaxRateBuilder subRates(
            @Nullable final java.util.List<com.commercetools.importapi.models.prices.SubRate> subRates) {
        this.subRates = subRates;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

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
    public java.util.List<com.commercetools.importapi.models.prices.SubRate> getSubRates() {
        return this.subRates;
    }

    public TaxRate build() {
        Objects.requireNonNull(name);
        Objects.requireNonNull(amount);
        Objects.requireNonNull(includedInPrice);
        Objects.requireNonNull(country);
        return new TaxRateImpl(id, name, amount, includedInPrice, country, state, subRates);
    }

    /**
     * builds TaxRate without checking for non null required values
     */
    public TaxRate buildUnchecked() {
        return new TaxRateImpl(id, name, amount, includedInPrice, country, state, subRates);
    }

    public static TaxRateBuilder of() {
        return new TaxRateBuilder();
    }

    public static TaxRateBuilder of(final TaxRate template) {
        TaxRateBuilder builder = new TaxRateBuilder();
        builder.id = template.getId();
        builder.name = template.getName();
        builder.amount = template.getAmount();
        builder.includedInPrice = template.getIncludedInPrice();
        builder.country = template.getCountry();
        builder.state = template.getState();
        builder.subRates = template.getSubRates();
        return builder;
    }

}
