
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxRateBuilder implements Builder<TaxRate> {

    private String id;

    private String name;

    private Integer amount;

    private Boolean includedInPrice;

    private String country;

    private String state;

    private java.util.List<com.commercetools.history.models.common.SubRate> subRates;

    public TaxRateBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public TaxRateBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public TaxRateBuilder amount(final Integer amount) {
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

    public TaxRateBuilder state(final String state) {
        this.state = state;
        return this;
    }

    public TaxRateBuilder subRates(final com.commercetools.history.models.common.SubRate... subRates) {
        this.subRates = new ArrayList<>(Arrays.asList(subRates));
        return this;
    }

    public TaxRateBuilder withSubRates(
            Function<com.commercetools.history.models.common.SubRateBuilder, com.commercetools.history.models.common.SubRateBuilder> builder) {
        this.subRates = new ArrayList<>();
        this.subRates.add(builder.apply(com.commercetools.history.models.common.SubRateBuilder.of()).build());
        return this;
    }

    public TaxRateBuilder plusSubRates(
            Function<com.commercetools.history.models.common.SubRateBuilder, com.commercetools.history.models.common.SubRateBuilder> builder) {
        if (this.subRates == null) {
            this.subRates = new ArrayList<>();
        }
        this.subRates.add(builder.apply(com.commercetools.history.models.common.SubRateBuilder.of()).build());
        return this;
    }

    public TaxRateBuilder subRates(final java.util.List<com.commercetools.history.models.common.SubRate> subRates) {
        this.subRates = subRates;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public Boolean getIncludedInPrice() {
        return this.includedInPrice;
    }

    public String getCountry() {
        return this.country;
    }

    public String getState() {
        return this.state;
    }

    public java.util.List<com.commercetools.history.models.common.SubRate> getSubRates() {
        return this.subRates;
    }

    public TaxRate build() {
        Objects.requireNonNull(id, TaxRate.class + ": id is missing");
        Objects.requireNonNull(name, TaxRate.class + ": name is missing");
        Objects.requireNonNull(amount, TaxRate.class + ": amount is missing");
        Objects.requireNonNull(includedInPrice, TaxRate.class + ": includedInPrice is missing");
        Objects.requireNonNull(country, TaxRate.class + ": country is missing");
        Objects.requireNonNull(state, TaxRate.class + ": state is missing");
        Objects.requireNonNull(subRates, TaxRate.class + ": subRates is missing");
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
