
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TaxRateBuilder {

    private String id;

    private String name;

    private Integer amount;

    private Boolean includedInPrice;

    private String country;

    private String state;

    private com.commercetools.history.models.common.SubRate subRates;

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

    public TaxRateBuilder subRates(final com.commercetools.history.models.common.SubRate subRates) {
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

    public com.commercetools.history.models.common.SubRate getSubRates() {
        return this.subRates;
    }

    public TaxRate build() {
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
