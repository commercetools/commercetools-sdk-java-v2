package com.commercetools.api.models.cart;

import com.commercetools.api.models.tax_category.SubRate;
import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ExternalTaxRateDraftBuilder implements Builder<ExternalTaxRateDraft> {

    
    
    private String name;
    
    
    @Nullable
    private Double amount;
    
    
    @Nullable
    private Boolean includedInPrice;
    
    
    
    private String country;
    
    
    @Nullable
    private String state;
    
    
    @Nullable
    private java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates;

    
    /**
     *  <p>Name of the Tax Rate.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public ExternalTaxRateDraftBuilder name( final String name) {
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
     *  <p>Country for which the tax applies.</p>
     * @param country value to be set
     * @return Builder
     */
    
    public ExternalTaxRateDraftBuilder country( final String country) {
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
     *  <p>For countries (such as the US) where the total tax is a combination of multiple taxes (such as state and local taxes).</p>
     * @param subRates value to be set
     * @return Builder
     */
    
    public ExternalTaxRateDraftBuilder subRates(@Nullable final com.commercetools.api.models.tax_category.SubRate ...subRates) {
        this.subRates = new ArrayList<>(Arrays.asList(subRates));
        return this;
    }
    
    /**
     *  <p>For countries (such as the US) where the total tax is a combination of multiple taxes (such as state and local taxes).</p>
     * @param subRates value to be set
     * @return Builder
     */
    
    public ExternalTaxRateDraftBuilder subRates(@Nullable final java.util.List<com.commercetools.api.models.tax_category.SubRate> subRates) {
        this.subRates = subRates;
        return this;
    }
    
    /**
     *  <p>For countries (such as the US) where the total tax is a combination of multiple taxes (such as state and local taxes).</p>
     * @param subRates value to be set
     * @return Builder
     */
    
    public ExternalTaxRateDraftBuilder plusSubRates(@Nullable final com.commercetools.api.models.tax_category.SubRate ...subRates) {
        if (this.subRates == null) {
            this.subRates = new ArrayList<>();
        }
        this.subRates.addAll(Arrays.asList(subRates));
        return this;
    }
    
    
    
    /**
     *  <p>For countries (such as the US) where the total tax is a combination of multiple taxes (such as state and local taxes).</p>
     * @param builder function to build the subRates value
     * @return Builder
     */
    
    public ExternalTaxRateDraftBuilder plusSubRates(Function<com.commercetools.api.models.tax_category.SubRateBuilder, com.commercetools.api.models.tax_category.SubRateBuilder> builder) {
        if (this.subRates == null) {
            this.subRates = new ArrayList<>();
        }
        this.subRates.add(builder.apply(com.commercetools.api.models.tax_category.SubRateBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>For countries (such as the US) where the total tax is a combination of multiple taxes (such as state and local taxes).</p>
     * @param builder function to build the subRates value
     * @return Builder
     */
    
    public ExternalTaxRateDraftBuilder withSubRates(Function<com.commercetools.api.models.tax_category.SubRateBuilder, com.commercetools.api.models.tax_category.SubRateBuilder> builder) {
        this.subRates = new ArrayList<>();
        this.subRates.add(builder.apply(com.commercetools.api.models.tax_category.SubRateBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>For countries (such as the US) where the total tax is a combination of multiple taxes (such as state and local taxes).</p>
     * @param builder function to build the subRates value
     * @return Builder
     */
    
    public ExternalTaxRateDraftBuilder addSubRates(Function<com.commercetools.api.models.tax_category.SubRateBuilder, com.commercetools.api.models.tax_category.SubRate> builder) {
        return plusSubRates(builder.apply(com.commercetools.api.models.tax_category.SubRateBuilder.of()));
    }
    
    /**
     *  <p>For countries (such as the US) where the total tax is a combination of multiple taxes (such as state and local taxes).</p>
     * @param builder function to build the subRates value
     * @return Builder
     */
    
    public ExternalTaxRateDraftBuilder setSubRates(Function<com.commercetools.api.models.tax_category.SubRateBuilder, com.commercetools.api.models.tax_category.SubRate> builder) {
        return subRates(builder.apply(com.commercetools.api.models.tax_category.SubRateBuilder.of()));
    }
                    

    /**
     *  <p>Name of the Tax Rate.</p>
     * @return name
     */
    
    
    public String getName(){
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
    public Double getAmount(){
        return this.amount;
    }
    
    /**
     *  <ul>
     *   <li>If set to <code>false</code>, the related price is considered the net price and the provided <code>amount</code> is applied to calculate the gross price.</li>
     *   <li>If set to <code>true</code>, the related price is considered the gross price, and the provided <code>amount</code> is applied to calculate the net price.</li>
     *  </ul>
     * @return includedInPrice
     */
    
    @Nullable
    public Boolean getIncludedInPrice(){
        return this.includedInPrice;
    }
    
    /**
     *  <p>Country for which the tax applies.</p>
     * @return country
     */
    
    
    public String getCountry(){
        return this.country;
    }
    
    /**
     *  <p>State within the specified country.</p>
     * @return state
     */
    
    @Nullable
    public String getState(){
        return this.state;
    }
    
    /**
     *  <p>For countries (such as the US) where the total tax is a combination of multiple taxes (such as state and local taxes).</p>
     * @return subRates
     */
    
    @Nullable
    public java.util.List<com.commercetools.api.models.tax_category.SubRate> getSubRates(){
        return this.subRates;
    }

    /**
     * builds ExternalTaxRateDraft with checking for non-null required values
     * @return ExternalTaxRateDraft
     */
    public ExternalTaxRateDraft build() {
        Objects.requireNonNull(name, ExternalTaxRateDraft.class + ": name is missing");
        Objects.requireNonNull(country, ExternalTaxRateDraft.class + ": country is missing");
        return new ExternalTaxRateDraftImpl(name, amount, includedInPrice, country, state, subRates);
    }
    
    /**
     * builds ExternalTaxRateDraft without checking for non-null required values
     * @return ExternalTaxRateDraft
     */
    public ExternalTaxRateDraft buildUnchecked() {
        return new ExternalTaxRateDraftImpl(name, amount, includedInPrice, country, state, subRates);
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
        builder.includedInPrice = template.getIncludedInPrice();
        builder.country = template.getCountry();
        builder.state = template.getState();
        builder.subRates = template.getSubRates();
        return builder;
    }

}
