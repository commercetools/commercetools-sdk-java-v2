
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxRateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxRate taxRate = TaxRate.builder()
 *             .id("{id}")
 *             .name("{name}")
 *             .amount(1)
 *             .includedInPrice(true)
 *             .country("{country}")
 *             .state("{state}")
 *             .plusSubRates(subRatesBuilder -> subRatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxRateBuilder implements Builder<TaxRate> {

    private String id;

    private String name;

    private Integer amount;

    private Boolean includedInPrice;

    private String country;

    private String state;

    private java.util.List<com.commercetools.history.models.common.SubRate> subRates;

    /**
     *  <p>The ID is always set if the tax rate is part of a TaxCategory. The external tax rates in a Cart do not contain an <code>id</code>.</p>
     * @param id value to be set
     * @return Builder
     */

    public TaxRateBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */

    public TaxRateBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Percentage in the range of [0..1]. The sum of the amounts of all <code>subRates</code>, if there are any.</p>
     * @param amount value to be set
     * @return Builder
     */

    public TaxRateBuilder amount(final Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * set the value to the includedInPrice
     * @param includedInPrice value to be set
     * @return Builder
     */

    public TaxRateBuilder includedInPrice(final Boolean includedInPrice) {
        this.includedInPrice = includedInPrice;
        return this;
    }

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param country value to be set
     * @return Builder
     */

    public TaxRateBuilder country(final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>The state in the country</p>
     * @param state value to be set
     * @return Builder
     */

    public TaxRateBuilder state(final String state) {
        this.state = state;
        return this;
    }

    /**
     * set values to the subRates
     * @param subRates value to be set
     * @return Builder
     */

    public TaxRateBuilder subRates(final com.commercetools.history.models.common.SubRate... subRates) {
        this.subRates = new ArrayList<>(Arrays.asList(subRates));
        return this;
    }

    /**
     * set value to the subRates
     * @param subRates value to be set
     * @return Builder
     */

    public TaxRateBuilder subRates(final java.util.List<com.commercetools.history.models.common.SubRate> subRates) {
        this.subRates = subRates;
        return this;
    }

    /**
     * add values to the subRates
     * @param subRates value to be set
     * @return Builder
     */

    public TaxRateBuilder plusSubRates(final com.commercetools.history.models.common.SubRate... subRates) {
        if (this.subRates == null) {
            this.subRates = new ArrayList<>();
        }
        this.subRates.addAll(Arrays.asList(subRates));
        return this;
    }

    /**
     * add the value to the subRates using the builder function
     * @param builder function to build the subRates value
     * @return Builder
     */

    public TaxRateBuilder plusSubRates(
            Function<com.commercetools.history.models.common.SubRateBuilder, com.commercetools.history.models.common.SubRateBuilder> builder) {
        if (this.subRates == null) {
            this.subRates = new ArrayList<>();
        }
        this.subRates.add(builder.apply(com.commercetools.history.models.common.SubRateBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the subRates using the builder function
     * @param builder function to build the subRates value
     * @return Builder
     */

    public TaxRateBuilder withSubRates(
            Function<com.commercetools.history.models.common.SubRateBuilder, com.commercetools.history.models.common.SubRateBuilder> builder) {
        this.subRates = new ArrayList<>();
        this.subRates.add(builder.apply(com.commercetools.history.models.common.SubRateBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the subRates using the builder function
     * @param builder function to build the subRates value
     * @return Builder
     */

    public TaxRateBuilder addSubRates(
            Function<com.commercetools.history.models.common.SubRateBuilder, com.commercetools.history.models.common.SubRate> builder) {
        return plusSubRates(builder.apply(com.commercetools.history.models.common.SubRateBuilder.of()));
    }

    /**
     * set the value to the subRates using the builder function
     * @param builder function to build the subRates value
     * @return Builder
     */

    public TaxRateBuilder setSubRates(
            Function<com.commercetools.history.models.common.SubRateBuilder, com.commercetools.history.models.common.SubRate> builder) {
        return subRates(builder.apply(com.commercetools.history.models.common.SubRateBuilder.of()));
    }

    /**
     *  <p>The ID is always set if the tax rate is part of a TaxCategory. The external tax rates in a Cart do not contain an <code>id</code>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * value of name}
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Percentage in the range of [0..1]. The sum of the amounts of all <code>subRates</code>, if there are any.</p>
     * @return amount
     */

    public Integer getAmount() {
        return this.amount;
    }

    /**
     * value of includedInPrice}
     * @return includedInPrice
     */

    public Boolean getIncludedInPrice() {
        return this.includedInPrice;
    }

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return country
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>The state in the country</p>
     * @return state
     */

    public String getState() {
        return this.state;
    }

    /**
     * value of subRates}
     * @return subRates
     */

    public java.util.List<com.commercetools.history.models.common.SubRate> getSubRates() {
        return this.subRates;
    }

    /**
     * builds TaxRate with checking for non-null required values
     * @return TaxRate
     */
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
     * builds TaxRate without checking for non-null required values
     * @return TaxRate
     */
    public TaxRate buildUnchecked() {
        return new TaxRateImpl(id, name, amount, includedInPrice, country, state, subRates);
    }

    /**
     * factory method for an instance of TaxRateBuilder
     * @return builder
     */
    public static TaxRateBuilder of() {
        return new TaxRateBuilder();
    }

    /**
     * create builder for TaxRate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
