
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExternalTaxRateDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExternalTaxRateDraft externalTaxRateDraft = ExternalTaxRateDraft.builder()
 *             .name("{name}")
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExternalTaxRateDraftBuilder implements Builder<ExternalTaxRateDraft> {

    private String name;

    @Nullable
    private Double amount;

    private String country;

    @Nullable
    private String state;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.prices.SubRate> subRates;

    @Nullable
    private Boolean includedInPrice;

    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     * set the value to the amount
     * @param amount value to be set
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder amount(@Nullable final Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * set the value to the country
     * @param country value to be set
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder country(final String country) {
        this.country = country;
        return this;
    }

    /**
     * set the value to the state
     * @param state value to be set
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }

    /**
     * set values to the subRates
     * @param subRates value to be set
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder subRates(
            @Nullable final com.commercetools.importapi.models.prices.SubRate... subRates) {
        this.subRates = new ArrayList<>(Arrays.asList(subRates));
        return this;
    }

    /**
     * set value to the subRates
     * @param subRates value to be set
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder subRates(
            @Nullable final java.util.List<com.commercetools.importapi.models.prices.SubRate> subRates) {
        this.subRates = subRates;
        return this;
    }

    /**
     * add values to the subRates
     * @param subRates value to be set
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder plusSubRates(
            @Nullable final com.commercetools.importapi.models.prices.SubRate... subRates) {
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

    public ExternalTaxRateDraftBuilder plusSubRates(
            Function<com.commercetools.importapi.models.prices.SubRateBuilder, com.commercetools.importapi.models.prices.SubRateBuilder> builder) {
        if (this.subRates == null) {
            this.subRates = new ArrayList<>();
        }
        this.subRates.add(builder.apply(com.commercetools.importapi.models.prices.SubRateBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the subRates using the builder function
     * @param builder function to build the subRates value
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder withSubRates(
            Function<com.commercetools.importapi.models.prices.SubRateBuilder, com.commercetools.importapi.models.prices.SubRateBuilder> builder) {
        this.subRates = new ArrayList<>();
        this.subRates.add(builder.apply(com.commercetools.importapi.models.prices.SubRateBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the includedInPrice
     * @param includedInPrice value to be set
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder includedInPrice(@Nullable final Boolean includedInPrice) {
        this.includedInPrice = includedInPrice;
        return this;
    }

    /**
     * value of name}
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * value of amount}
     * @return amount
     */

    @Nullable
    public Double getAmount() {
        return this.amount;
    }

    /**
     * value of country}
     * @return country
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * value of state}
     * @return state
     */

    @Nullable
    public String getState() {
        return this.state;
    }

    /**
     * value of subRates}
     * @return subRates
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.prices.SubRate> getSubRates() {
        return this.subRates;
    }

    /**
     * value of includedInPrice}
     * @return includedInPrice
     */

    @Nullable
    public Boolean getIncludedInPrice() {
        return this.includedInPrice;
    }

    /**
     * builds ExternalTaxRateDraft with checking for non-null required values
     * @return ExternalTaxRateDraft
     */
    public ExternalTaxRateDraft build() {
        Objects.requireNonNull(name, ExternalTaxRateDraft.class + ": name is missing");
        Objects.requireNonNull(country, ExternalTaxRateDraft.class + ": country is missing");
        return new ExternalTaxRateDraftImpl(name, amount, country, state, subRates, includedInPrice);
    }

    /**
     * builds ExternalTaxRateDraft without checking for non-null required values
     * @return ExternalTaxRateDraft
     */
    public ExternalTaxRateDraft buildUnchecked() {
        return new ExternalTaxRateDraftImpl(name, amount, country, state, subRates, includedInPrice);
    }

    /**
     * factory method for an instance of ExternalTaxRateDraftBuilder
     * @return builder
     */
    public static ExternalTaxRateDraftBuilder of() {
        return new ExternalTaxRateDraftBuilder();
    }

    /**
     * create builder for ExternalTaxRateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExternalTaxRateDraftBuilder of(final ExternalTaxRateDraft template) {
        ExternalTaxRateDraftBuilder builder = new ExternalTaxRateDraftBuilder();
        builder.name = template.getName();
        builder.amount = template.getAmount();
        builder.country = template.getCountry();
        builder.state = template.getState();
        builder.subRates = template.getSubRates();
        builder.includedInPrice = template.getIncludedInPrice();
        return builder;
    }

}
