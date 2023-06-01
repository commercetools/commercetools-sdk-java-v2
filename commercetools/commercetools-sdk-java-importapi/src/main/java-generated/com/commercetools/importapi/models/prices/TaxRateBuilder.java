package com.commercetools.importapi.models.prices;

import com.commercetools.importapi.models.prices.SubRate;
import com.commercetools.importapi.models.prices.TaxRate;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TaxRateBuilder implements Builder<TaxRate> {

    
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

    
    /**
     * set the value to the id
     * @param id value to be set
     * @return Builder
     */
    
    public TaxRateBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */
    
    public TaxRateBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     * set the value to the amount
     * @param amount value to be set
     * @return Builder
     */
    
    public TaxRateBuilder amount( final Double amount) {
        this.amount = amount;
        return this;
    }
    
    
    
    
    /**
     * set the value to the includedInPrice
     * @param includedInPrice value to be set
     * @return Builder
     */
    
    public TaxRateBuilder includedInPrice( final Boolean includedInPrice) {
        this.includedInPrice = includedInPrice;
        return this;
    }
    
    
    
    
    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param country value to be set
     * @return Builder
     */
    
    public TaxRateBuilder country( final String country) {
        this.country = country;
        return this;
    }
    
    
    
    
    /**
     * set the value to the state
     * @param state value to be set
     * @return Builder
     */
    
    public TaxRateBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }
    
    
    
    /**
     * set values to the subRates
     * @param subRates value to be set
     * @return Builder
     */
    
    public TaxRateBuilder subRates(@Nullable final com.commercetools.importapi.models.prices.SubRate ...subRates) {
        this.subRates = new ArrayList<>(Arrays.asList(subRates));
        return this;
    }
    
    /**
     * set value to the subRates
     * @param subRates value to be set
     * @return Builder
     */
    
    public TaxRateBuilder subRates(@Nullable final java.util.List<com.commercetools.importapi.models.prices.SubRate> subRates) {
        this.subRates = subRates;
        return this;
    }
    
    /**
     * add values to the subRates
     * @param subRates value to be set
     * @return Builder
     */
    
    public TaxRateBuilder plusSubRates(@Nullable final com.commercetools.importapi.models.prices.SubRate ...subRates) {
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
    
    public TaxRateBuilder plusSubRates(Function<com.commercetools.importapi.models.prices.SubRateBuilder, com.commercetools.importapi.models.prices.SubRateBuilder> builder) {
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
    
    public TaxRateBuilder withSubRates(Function<com.commercetools.importapi.models.prices.SubRateBuilder, com.commercetools.importapi.models.prices.SubRateBuilder> builder) {
        this.subRates = new ArrayList<>();
        this.subRates.add(builder.apply(com.commercetools.importapi.models.prices.SubRateBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the subRates using the builder function
     * @param builder function to build the subRates value
     * @return Builder
     */
    
    public TaxRateBuilder addSubRates(Function<com.commercetools.importapi.models.prices.SubRateBuilder, com.commercetools.importapi.models.prices.SubRate> builder) {
        return plusSubRates(builder.apply(com.commercetools.importapi.models.prices.SubRateBuilder.of()));
    }
    
    /**
     * set the value to the subRates using the builder function
     * @param builder function to build the subRates value
     * @return Builder
     */
    
    public TaxRateBuilder setSubRates(Function<com.commercetools.importapi.models.prices.SubRateBuilder, com.commercetools.importapi.models.prices.SubRate> builder) {
        return subRates(builder.apply(com.commercetools.importapi.models.prices.SubRateBuilder.of()));
    }
                    

    /**
     * value of id}
     * @return id
     */
    
    @Nullable
    public String getId(){
        return this.id;
    }
    
    /**
     * value of name}
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }
    
    /**
     * value of amount}
     * @return amount
     */
    
    
    public Double getAmount(){
        return this.amount;
    }
    
    /**
     * value of includedInPrice}
     * @return includedInPrice
     */
    
    
    public Boolean getIncludedInPrice(){
        return this.includedInPrice;
    }
    
    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @return country
     */
    
    
    public String getCountry(){
        return this.country;
    }
    
    /**
     * value of state}
     * @return state
     */
    
    @Nullable
    public String getState(){
        return this.state;
    }
    
    /**
     * value of subRates}
     * @return subRates
     */
    
    @Nullable
    public java.util.List<com.commercetools.importapi.models.prices.SubRate> getSubRates(){
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
