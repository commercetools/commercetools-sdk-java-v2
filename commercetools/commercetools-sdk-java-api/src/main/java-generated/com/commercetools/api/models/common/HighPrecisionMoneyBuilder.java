package com.commercetools.api.models.common;

import com.commercetools.api.models.common.MoneyType;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.common.HighPrecisionMoney;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * HighPrecisionMoneyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     HighPrecisionMoney highPrecisionMoney = HighPrecisionMoney.builder()
 *             .centAmount(0.3)
 *             .currencyCode("{currencyCode}")
 *             .fractionDigits(0.3)
 *             .preciseAmount(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class HighPrecisionMoneyBuilder implements Builder<HighPrecisionMoney> {

    
    
    private Long centAmount;
    
    
    
    private String currencyCode;
    
    
    
    private Integer fractionDigits;
    
    
    
    private Long preciseAmount;

    
    /**
     *  <p>Amount in the smallest indivisible unit of a currency, such as:</p>
     *  <ul>
     *   <li>Cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as <code>500</code>).</li>
     *   <li>The value in the major unit for currencies without minor units, like JPY (5 JPY is specified as <code>5</code>).</li>
     *  </ul>
     * @param centAmount value to be set
     * @return Builder
     */
    
    public HighPrecisionMoneyBuilder centAmount( final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }
    
    
    
    
    /**
     *  <p>Currency code compliant to ISO 4217.</p>
     * @param currencyCode value to be set
     * @return Builder
     */
    
    public HighPrecisionMoneyBuilder currencyCode( final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
    
    
    
    
    /**
     *  <p>Number of digits after the decimal separator, greater than the default number of fraction digits for a currency.</p>
     * @param fractionDigits value to be set
     * @return Builder
     */
    
    public HighPrecisionMoneyBuilder fractionDigits( final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
        return this;
    }
    
    
    
    
    /**
     *  <p>Amount in 1 / (10 ^ <code>fractionDigits</code>) of a currency.</p>
     * @param preciseAmount value to be set
     * @return Builder
     */
    
    public HighPrecisionMoneyBuilder preciseAmount( final Long preciseAmount) {
        this.preciseAmount = preciseAmount;
        return this;
    }
    
    

    /**
     *  <p>Amount in the smallest indivisible unit of a currency, such as:</p>
     *  <ul>
     *   <li>Cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as <code>500</code>).</li>
     *   <li>The value in the major unit for currencies without minor units, like JPY (5 JPY is specified as <code>5</code>).</li>
     *  </ul>
     * @return centAmount
     */
    
    
    public Long getCentAmount(){
        return this.centAmount;
    }
    
    /**
     *  <p>Currency code compliant to ISO 4217.</p>
     * @return currencyCode
     */
    
    
    public String getCurrencyCode(){
        return this.currencyCode;
    }
    
    /**
     *  <p>Number of digits after the decimal separator, greater than the default number of fraction digits for a currency.</p>
     * @return fractionDigits
     */
    
    
    public Integer getFractionDigits(){
        return this.fractionDigits;
    }
    
    /**
     *  <p>Amount in 1 / (10 ^ <code>fractionDigits</code>) of a currency.</p>
     * @return preciseAmount
     */
    
    
    public Long getPreciseAmount(){
        return this.preciseAmount;
    }

    /**
     * builds HighPrecisionMoney with checking for non-null required values
     * @return HighPrecisionMoney
     */
    public HighPrecisionMoney build() {
        Objects.requireNonNull(centAmount, HighPrecisionMoney.class + ": centAmount is missing");
        Objects.requireNonNull(currencyCode, HighPrecisionMoney.class + ": currencyCode is missing");
        Objects.requireNonNull(fractionDigits, HighPrecisionMoney.class + ": fractionDigits is missing");
        Objects.requireNonNull(preciseAmount, HighPrecisionMoney.class + ": preciseAmount is missing");
        return new HighPrecisionMoneyImpl(centAmount, currencyCode, fractionDigits, preciseAmount);
    }
    
    /**
     * builds HighPrecisionMoney without checking for non-null required values
     * @return HighPrecisionMoney
     */
    public HighPrecisionMoney buildUnchecked() {
        return new HighPrecisionMoneyImpl(centAmount, currencyCode, fractionDigits, preciseAmount);
    }

    /**
     * factory method for an instance of HighPrecisionMoneyBuilder
     * @return builder 
     */
    public static HighPrecisionMoneyBuilder of() {
        return new HighPrecisionMoneyBuilder();
    }

    /**
     * create builder for HighPrecisionMoney instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static HighPrecisionMoneyBuilder of(final HighPrecisionMoney template) {
        HighPrecisionMoneyBuilder builder = new HighPrecisionMoneyBuilder();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        builder.fractionDigits = template.getFractionDigits();
        builder.preciseAmount = template.getPreciseAmount();
        return builder;
    }

}
