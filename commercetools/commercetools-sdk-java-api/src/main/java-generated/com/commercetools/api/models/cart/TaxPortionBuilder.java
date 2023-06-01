package com.commercetools.api.models.cart;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.cart.TaxPortion;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxPortionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxPortion taxPortion = TaxPortion.builder()
 *             .rate(0.3)
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TaxPortionBuilder implements Builder<TaxPortion> {

    
    @Nullable
    private String name;
    
    
    
    private Double rate;
    
    
    
    private com.commercetools.api.models.common.CentPrecisionMoney amount;

    
    /**
     *  <p>Name of the tax portion.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public TaxPortionBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>A number in the range 0-1.</p>
     * @param rate value to be set
     * @return Builder
     */
    
    public TaxPortionBuilder rate( final Double rate) {
        this.rate = rate;
        return this;
    }
    
    
    
    
    /**
     *  <p>Money value of the tax portion.</p>
     * @param builder function to build the amount value
     * @return Builder
     */
    
    public TaxPortionBuilder amount(Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Money value of the tax portion.</p>
     * @param builder function to build the amount value
     * @return Builder
     */
    
    public TaxPortionBuilder withAmount(Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoney> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Money value of the tax portion.</p>
     * @param amount value to be set
     * @return Builder
     */
    
    public TaxPortionBuilder amount( final com.commercetools.api.models.common.CentPrecisionMoney amount) {
        this.amount = amount;
        return this;
    }
    
    

    /**
     *  <p>Name of the tax portion.</p>
     * @return name
     */
    
    @Nullable
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>A number in the range 0-1.</p>
     * @return rate
     */
    
    
    public Double getRate(){
        return this.rate;
    }
    
    /**
     *  <p>Money value of the tax portion.</p>
     * @return amount
     */
    
    
    public com.commercetools.api.models.common.CentPrecisionMoney getAmount(){
        return this.amount;
    }

    /**
     * builds TaxPortion with checking for non-null required values
     * @return TaxPortion
     */
    public TaxPortion build() {
        Objects.requireNonNull(rate, TaxPortion.class + ": rate is missing");
        Objects.requireNonNull(amount, TaxPortion.class + ": amount is missing");
        return new TaxPortionImpl(name, rate, amount);
    }
    
    /**
     * builds TaxPortion without checking for non-null required values
     * @return TaxPortion
     */
    public TaxPortion buildUnchecked() {
        return new TaxPortionImpl(name, rate, amount);
    }

    /**
     * factory method for an instance of TaxPortionBuilder
     * @return builder 
     */
    public static TaxPortionBuilder of() {
        return new TaxPortionBuilder();
    }

    /**
     * create builder for TaxPortion instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxPortionBuilder of(final TaxPortion template) {
        TaxPortionBuilder builder = new TaxPortionBuilder();
        builder.name = template.getName();
        builder.rate = template.getRate();
        builder.amount = template.getAmount();
        return builder;
    }

}
