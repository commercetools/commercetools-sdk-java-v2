
package com.commercetools.api.models.tax_category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxRateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxRate taxRate = TaxRate.builder()
 *             .name("{name}")
 *             .amount(0.3)
 *             .includedInPrice(true)
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxRateBuilder implements Builder<TaxRate> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    private String name;

    private Double amount;

    private Boolean includedInPrice;

    private String country;

    @Nullable
    private String state;

    @Nullable
    private java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates;

    /**
     *  <p>Present if the TaxRate is part of a TaxCategory. Absent for external TaxRates in LineItem, CustomLineItem, and ShippingInfo.</p>
     * @param id value to be set
     * @return Builder
     */

    public TaxRateBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the TaxRate. Present when set using TaxRateDraft. Not available for external TaxRates created using ExternalTaxRateDraft.</p>
     * @param key value to be set
     * @return Builder
     */

    public TaxRateBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the TaxRate.</p>
     * @param name value to be set
     * @return Builder
     */

    public TaxRateBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Tax rate. If subrates are used, the amount is the sum of all rates in <code>subRates</code>.</p>
     * @param amount value to be set
     * @return Builder
     */

    public TaxRateBuilder amount(final Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>If <code>true</code>, tax is included in Embedded Prices or Standalone Prices, and the <code>taxedPrice</code> is present on LineItems. In this case, the <code>totalNet</code> price on TaxedPrice includes the TaxRate.</p>
     * @param includedInPrice value to be set
     * @return Builder
     */

    public TaxRateBuilder includedInPrice(final Boolean includedInPrice) {
        this.includedInPrice = includedInPrice;
        return this;
    }

    /**
     *  <p>Country in which the tax rate is applied in ISO 3166-1 alpha-2 format.</p>
     * @param country value to be set
     * @return Builder
     */

    public TaxRateBuilder country(final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     * @param state value to be set
     * @return Builder
     */

    public TaxRateBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes). The total of all subrates equals the TaxRate <code>amount</code>.</p>
     * @param subRates value to be set
     * @return Builder
     */

    public TaxRateBuilder subRates(@Nullable final com.commercetools.api.models.tax_category.SubRate... subRates) {
        this.subRates = new ArrayList<>(Arrays.asList(subRates));
        return this;
    }

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes). The total of all subrates equals the TaxRate <code>amount</code>.</p>
     * @param subRates value to be set
     * @return Builder
     */

    public TaxRateBuilder subRates(
            @Nullable final java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates) {
        this.subRates = subRates;
        return this;
    }

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes). The total of all subrates equals the TaxRate <code>amount</code>.</p>
     * @param subRates value to be set
     * @return Builder
     */

    public TaxRateBuilder plusSubRates(@Nullable final com.commercetools.api.models.tax_category.SubRate... subRates) {
        if (this.subRates == null) {
            this.subRates = new ArrayList<>();
        }
        this.subRates.addAll(Arrays.asList(subRates));
        return this;
    }

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes). The total of all subrates equals the TaxRate <code>amount</code>.</p>
     * @param builder function to build the subRates value
     * @return Builder
     */

    public TaxRateBuilder plusSubRates(
            Function<com.commercetools.api.models.tax_category.SubRateBuilder, com.commercetools.api.models.tax_category.SubRateBuilder> builder) {
        if (this.subRates == null) {
            this.subRates = new ArrayList<>();
        }
        this.subRates.add(builder.apply(com.commercetools.api.models.tax_category.SubRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes). The total of all subrates equals the TaxRate <code>amount</code>.</p>
     * @param builder function to build the subRates value
     * @return Builder
     */

    public TaxRateBuilder withSubRates(
            Function<com.commercetools.api.models.tax_category.SubRateBuilder, com.commercetools.api.models.tax_category.SubRateBuilder> builder) {
        this.subRates = new ArrayList<>();
        this.subRates.add(builder.apply(com.commercetools.api.models.tax_category.SubRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes). The total of all subrates equals the TaxRate <code>amount</code>.</p>
     * @param builder function to build the subRates value
     * @return Builder
     */

    public TaxRateBuilder addSubRates(
            Function<com.commercetools.api.models.tax_category.SubRateBuilder, com.commercetools.api.models.tax_category.SubRate> builder) {
        return plusSubRates(builder.apply(com.commercetools.api.models.tax_category.SubRateBuilder.of()));
    }

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes). The total of all subrates equals the TaxRate <code>amount</code>.</p>
     * @param builder function to build the subRates value
     * @return Builder
     */

    public TaxRateBuilder setSubRates(
            Function<com.commercetools.api.models.tax_category.SubRateBuilder, com.commercetools.api.models.tax_category.SubRate> builder) {
        return subRates(builder.apply(com.commercetools.api.models.tax_category.SubRateBuilder.of()));
    }

    /**
     *  <p>Present if the TaxRate is part of a TaxCategory. Absent for external TaxRates in LineItem, CustomLineItem, and ShippingInfo.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the TaxRate. Present when set using TaxRateDraft. Not available for external TaxRates created using ExternalTaxRateDraft.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the TaxRate.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Tax rate. If subrates are used, the amount is the sum of all rates in <code>subRates</code>.</p>
     * @return amount
     */

    public Double getAmount() {
        return this.amount;
    }

    /**
     *  <p>If <code>true</code>, tax is included in Embedded Prices or Standalone Prices, and the <code>taxedPrice</code> is present on LineItems. In this case, the <code>totalNet</code> price on TaxedPrice includes the TaxRate.</p>
     * @return includedInPrice
     */

    public Boolean getIncludedInPrice() {
        return this.includedInPrice;
    }

    /**
     *  <p>Country in which the tax rate is applied in ISO 3166-1 alpha-2 format.</p>
     * @return country
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     * @return state
     */

    @Nullable
    public String getState() {
        return this.state;
    }

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes). The total of all subrates equals the TaxRate <code>amount</code>.</p>
     * @return subRates
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.tax_category.SubRate> getSubRates() {
        return this.subRates;
    }

    /**
     * builds TaxRate with checking for non-null required values
     * @return TaxRate
     */
    public TaxRate build() {
        Objects.requireNonNull(name, TaxRate.class + ": name is missing");
        Objects.requireNonNull(amount, TaxRate.class + ": amount is missing");
        Objects.requireNonNull(includedInPrice, TaxRate.class + ": includedInPrice is missing");
        Objects.requireNonNull(country, TaxRate.class + ": country is missing");
        return new TaxRateImpl(id, key, name, amount, includedInPrice, country, state, subRates);
    }

    /**
     * builds TaxRate without checking for non-null required values
     * @return TaxRate
     */
    public TaxRate buildUnchecked() {
        return new TaxRateImpl(id, key, name, amount, includedInPrice, country, state, subRates);
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
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.amount = template.getAmount();
        builder.includedInPrice = template.getIncludedInPrice();
        builder.country = template.getCountry();
        builder.state = template.getState();
        builder.subRates = template.getSubRates();
        return builder;
    }

}
