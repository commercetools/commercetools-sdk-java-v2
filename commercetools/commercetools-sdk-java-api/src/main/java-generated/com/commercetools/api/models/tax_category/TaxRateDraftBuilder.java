
package com.commercetools.api.models.tax_category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxRateDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxRateDraft taxRateDraft = TaxRateDraft.builder()
 *             .name("{name}")
 *             .includedInPrice(true)
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    @Nullable
    private String key;

    /**
     *  <p>Name of the TaxRate.</p>
     * @param name value to be set
     * @return Builder
     */

    public TaxRateDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Tax rate. Must be supplied if no <code>subRates</code> are specified. If <code>subRates</code> are specified, this field can be omitted or it must be the sum of amounts of all <code>subRates</code>.</p>
     * @param amount value to be set
     * @return Builder
     */

    public TaxRateDraftBuilder amount(@Nullable final Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>If <code>true</code>, tax is included in Embedded Prices or Standalone Prices, and the <code>taxedPrice</code> is present on LineItems. In this case, the <code>totalNet</code> price on TaxedPrice includes the TaxRate.</p>
     * @param includedInPrice value to be set
     * @return Builder
     */

    public TaxRateDraftBuilder includedInPrice(final Boolean includedInPrice) {
        this.includedInPrice = includedInPrice;
        return this;
    }

    /**
     *  <p>Country in which the tax rate is applied in ISO 3166-1 alpha-2 format.</p>
     * @param country value to be set
     * @return Builder
     */

    public TaxRateDraftBuilder country(final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>State within the country, such as Texas in the United States.</p>
     * @param state value to be set
     * @return Builder
     */

    public TaxRateDraftBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes).</p>
     * @param subRates value to be set
     * @return Builder
     */

    public TaxRateDraftBuilder subRates(@Nullable final com.commercetools.api.models.tax_category.SubRate... subRates) {
        this.subRates = new ArrayList<>(Arrays.asList(subRates));
        return this;
    }

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes).</p>
     * @param subRates value to be set
     * @return Builder
     */

    public TaxRateDraftBuilder subRates(
            @Nullable final java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates) {
        this.subRates = subRates;
        return this;
    }

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes).</p>
     * @param subRates value to be set
     * @return Builder
     */

    public TaxRateDraftBuilder plusSubRates(
            @Nullable final com.commercetools.api.models.tax_category.SubRate... subRates) {
        if (this.subRates == null) {
            this.subRates = new ArrayList<>();
        }
        this.subRates.addAll(Arrays.asList(subRates));
        return this;
    }

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes).</p>
     * @param builder function to build the subRates value
     * @return Builder
     */

    public TaxRateDraftBuilder plusSubRates(
            Function<com.commercetools.api.models.tax_category.SubRateBuilder, com.commercetools.api.models.tax_category.SubRateBuilder> builder) {
        if (this.subRates == null) {
            this.subRates = new ArrayList<>();
        }
        this.subRates.add(builder.apply(com.commercetools.api.models.tax_category.SubRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes).</p>
     * @param builder function to build the subRates value
     * @return Builder
     */

    public TaxRateDraftBuilder withSubRates(
            Function<com.commercetools.api.models.tax_category.SubRateBuilder, com.commercetools.api.models.tax_category.SubRateBuilder> builder) {
        this.subRates = new ArrayList<>();
        this.subRates.add(builder.apply(com.commercetools.api.models.tax_category.SubRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes).</p>
     * @param builder function to build the subRates value
     * @return Builder
     */

    public TaxRateDraftBuilder addSubRates(
            Function<com.commercetools.api.models.tax_category.SubRateBuilder, com.commercetools.api.models.tax_category.SubRate> builder) {
        return plusSubRates(builder.apply(com.commercetools.api.models.tax_category.SubRateBuilder.of()));
    }

    /**
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes).</p>
     * @param builder function to build the subRates value
     * @return Builder
     */

    public TaxRateDraftBuilder setSubRates(
            Function<com.commercetools.api.models.tax_category.SubRateBuilder, com.commercetools.api.models.tax_category.SubRate> builder) {
        return subRates(builder.apply(com.commercetools.api.models.tax_category.SubRateBuilder.of()));
    }

    /**
     *  <p>User-defined unique identifier of the TaxRate.</p>
     * @param key value to be set
     * @return Builder
     */

    public TaxRateDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the TaxRate.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Tax rate. Must be supplied if no <code>subRates</code> are specified. If <code>subRates</code> are specified, this field can be omitted or it must be the sum of amounts of all <code>subRates</code>.</p>
     * @return amount
     */

    @Nullable
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
     *  <p>Used to calculate the taxPortions field in a Cart or Order. It is useful if the total tax of a country (such as the US) is a combination of multiple taxes (such as state and local taxes).</p>
     * @return subRates
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.tax_category.SubRate> getSubRates() {
        return this.subRates;
    }

    /**
     *  <p>User-defined unique identifier of the TaxRate.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds TaxRateDraft with checking for non-null required values
     * @return TaxRateDraft
     */
    public TaxRateDraft build() {
        Objects.requireNonNull(name, TaxRateDraft.class + ": name is missing");
        Objects.requireNonNull(includedInPrice, TaxRateDraft.class + ": includedInPrice is missing");
        Objects.requireNonNull(country, TaxRateDraft.class + ": country is missing");
        return new TaxRateDraftImpl(name, amount, includedInPrice, country, state, subRates, key);
    }

    /**
     * builds TaxRateDraft without checking for non-null required values
     * @return TaxRateDraft
     */
    public TaxRateDraft buildUnchecked() {
        return new TaxRateDraftImpl(name, amount, includedInPrice, country, state, subRates, key);
    }

    /**
     * factory method for an instance of TaxRateDraftBuilder
     * @return builder
     */
    public static TaxRateDraftBuilder of() {
        return new TaxRateDraftBuilder();
    }

    /**
     * create builder for TaxRateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxRateDraftBuilder of(final TaxRateDraft template) {
        TaxRateDraftBuilder builder = new TaxRateDraftBuilder();
        builder.name = template.getName();
        builder.amount = template.getAmount();
        builder.includedInPrice = template.getIncludedInPrice();
        builder.country = template.getCountry();
        builder.state = template.getState();
        builder.subRates = template.getSubRates();
        builder.key = template.getKey();
        return builder;
    }

}
