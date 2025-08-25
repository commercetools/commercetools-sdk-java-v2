
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
     *  <p>Name of the Tax Rate.</p>
     * @param name value to be set
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Percentage in the range of 0-1.</p>
     *  <ul>
     *   <li>If no <code>subRates</code> are specified, a value must be defined.</li>
     *   <li>If <code>subRates</code> are specified, this can be omitted or its value must be the sum of all <code>subRates</code> amounts.</li>
     *  </ul>
     * @param amount value to be set
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder amount(@Nullable final Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>Country for which the tax applies.</p>
     * @param country value to be set
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder country(final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>State within the specified country.</p>
     * @param state value to be set
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Used when the total tax is a combination of multiple taxes (for example, local, state/provincial, and/or federal taxes). The total of all subrates must equal the TaxRate <code>amount</code>. These subrates are used to calculate the <code>taxPortions</code> field of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> and the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfos</a>.</p>
     * @param subRates value to be set
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder subRates(
            @Nullable final com.commercetools.importapi.models.prices.SubRate... subRates) {
        this.subRates = new ArrayList<>(Arrays.asList(subRates));
        return this;
    }

    /**
     *  <p>Used when the total tax is a combination of multiple taxes (for example, local, state/provincial, and/or federal taxes). The total of all subrates must equal the TaxRate <code>amount</code>. These subrates are used to calculate the <code>taxPortions</code> field of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> and the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfos</a>.</p>
     * @param subRates value to be set
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder subRates(
            @Nullable final java.util.List<com.commercetools.importapi.models.prices.SubRate> subRates) {
        this.subRates = subRates;
        return this;
    }

    /**
     *  <p>Used when the total tax is a combination of multiple taxes (for example, local, state/provincial, and/or federal taxes). The total of all subrates must equal the TaxRate <code>amount</code>. These subrates are used to calculate the <code>taxPortions</code> field of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> and the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfos</a>.</p>
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
     *  <p>Used when the total tax is a combination of multiple taxes (for example, local, state/provincial, and/or federal taxes). The total of all subrates must equal the TaxRate <code>amount</code>. These subrates are used to calculate the <code>taxPortions</code> field of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> and the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfos</a>.</p>
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
     *  <p>Used when the total tax is a combination of multiple taxes (for example, local, state/provincial, and/or federal taxes). The total of all subrates must equal the TaxRate <code>amount</code>. These subrates are used to calculate the <code>taxPortions</code> field of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> and the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfos</a>.</p>
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
     *  <p>Used when the total tax is a combination of multiple taxes (for example, local, state/provincial, and/or federal taxes). The total of all subrates must equal the TaxRate <code>amount</code>. These subrates are used to calculate the <code>taxPortions</code> field of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> and the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfos</a>.</p>
     * @param builder function to build the subRates value
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder addSubRates(
            Function<com.commercetools.importapi.models.prices.SubRateBuilder, com.commercetools.importapi.models.prices.SubRate> builder) {
        return plusSubRates(builder.apply(com.commercetools.importapi.models.prices.SubRateBuilder.of()));
    }

    /**
     *  <p>Used when the total tax is a combination of multiple taxes (for example, local, state/provincial, and/or federal taxes). The total of all subrates must equal the TaxRate <code>amount</code>. These subrates are used to calculate the <code>taxPortions</code> field of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> and the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfos</a>.</p>
     * @param builder function to build the subRates value
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder setSubRates(
            Function<com.commercetools.importapi.models.prices.SubRateBuilder, com.commercetools.importapi.models.prices.SubRate> builder) {
        return subRates(builder.apply(com.commercetools.importapi.models.prices.SubRateBuilder.of()));
    }

    /**
     *  <ul>
     *   <li>If set to <code>false</code>, the related price is considered the net price and the provided <code>amount</code> is applied to calculate the gross price.</li>
     *   <li>If set to <code>true</code>, the related price is considered the gross price, and the provided <code>amount</code> is applied to calculate the net price.</li>
     *  </ul>
     * @param includedInPrice value to be set
     * @return Builder
     */

    public ExternalTaxRateDraftBuilder includedInPrice(@Nullable final Boolean includedInPrice) {
        this.includedInPrice = includedInPrice;
        return this;
    }

    /**
     *  <p>Name of the Tax Rate.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Percentage in the range of 0-1.</p>
     *  <ul>
     *   <li>If no <code>subRates</code> are specified, a value must be defined.</li>
     *   <li>If <code>subRates</code> are specified, this can be omitted or its value must be the sum of all <code>subRates</code> amounts.</li>
     *  </ul>
     * @return amount
     */

    @Nullable
    public Double getAmount() {
        return this.amount;
    }

    /**
     *  <p>Country for which the tax applies.</p>
     * @return country
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>State within the specified country.</p>
     * @return state
     */

    @Nullable
    public String getState() {
        return this.state;
    }

    /**
     *  <p>Used when the total tax is a combination of multiple taxes (for example, local, state/provincial, and/or federal taxes). The total of all subrates must equal the TaxRate <code>amount</code>. These subrates are used to calculate the <code>taxPortions</code> field of a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> and the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfos</a>.</p>
     * @return subRates
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.prices.SubRate> getSubRates() {
        return this.subRates;
    }

    /**
     *  <ul>
     *   <li>If set to <code>false</code>, the related price is considered the net price and the provided <code>amount</code> is applied to calculate the gross price.</li>
     *   <li>If set to <code>true</code>, the related price is considered the gross price, and the provided <code>amount</code> is applied to calculate the net price.</li>
     *  </ul>
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
