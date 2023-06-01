package com.commercetools.history.models.common;

import com.commercetools.history.models.common.MoneyType;
import com.commercetools.history.models.common.Money;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MoneyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Money money = Money.builder()
 *             .currencyCode("{currencyCode}")
 *             .centAmount(1)
 *             .fractionDigits(1)
 *             .type(MoneyType.CENT_PRECISION)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MoneyBuilder implements Builder<Money> {

    
    
    private String currencyCode;
    
    
    
    private Integer centAmount;
    
    
    
    private Integer fractionDigits;
    
    
    
    private com.commercetools.history.models.common.MoneyType type;

    
    /**
     *  <p>Currency code compliant to ISO 4217.</p>
     * @param currencyCode value to be set
     * @return Builder
     */
    
    public MoneyBuilder currencyCode( final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
    
    
    
    
    /**
     * set the value to the centAmount
     * @param centAmount value to be set
     * @return Builder
     */
    
    public MoneyBuilder centAmount( final Integer centAmount) {
        this.centAmount = centAmount;
        return this;
    }
    
    
    
    
    /**
     * set the value to the fractionDigits
     * @param fractionDigits value to be set
     * @return Builder
     */
    
    public MoneyBuilder fractionDigits( final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
        return this;
    }
    
    
    
    
    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */
    
    public MoneyBuilder type( final com.commercetools.history.models.common.MoneyType type) {
        this.type = type;
        return this;
    }
    
    

    /**
     *  <p>Currency code compliant to ISO 4217.</p>
     * @return currencyCode
     */
    
    
    public String getCurrencyCode(){
        return this.currencyCode;
    }
    
    /**
     * value of centAmount}
     * @return centAmount
     */
    
    
    public Integer getCentAmount(){
        return this.centAmount;
    }
    
    /**
     * value of fractionDigits}
     * @return fractionDigits
     */
    
    
    public Integer getFractionDigits(){
        return this.fractionDigits;
    }
    
    /**
     * value of type}
     * @return type
     */
    
    
    public com.commercetools.history.models.common.MoneyType getType(){
        return this.type;
    }

    /**
     * builds Money with checking for non-null required values
     * @return Money
     */
    public Money build() {
        Objects.requireNonNull(currencyCode, Money.class + ": currencyCode is missing");
        Objects.requireNonNull(centAmount, Money.class + ": centAmount is missing");
        Objects.requireNonNull(fractionDigits, Money.class + ": fractionDigits is missing");
        Objects.requireNonNull(type, Money.class + ": type is missing");
        return new MoneyImpl(currencyCode, centAmount, fractionDigits, type);
    }
    
    /**
     * builds Money without checking for non-null required values
     * @return Money
     */
    public Money buildUnchecked() {
        return new MoneyImpl(currencyCode, centAmount, fractionDigits, type);
    }

    /**
     * factory method for an instance of MoneyBuilder
     * @return builder 
     */
    public static MoneyBuilder of() {
        return new MoneyBuilder();
    }

    /**
     * create builder for Money instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MoneyBuilder of(final Money template) {
        MoneyBuilder builder = new MoneyBuilder();
        builder.currencyCode = template.getCurrencyCode();
        builder.centAmount = template.getCentAmount();
        builder.fractionDigits = template.getFractionDigits();
        builder.type = template.getType();
        return builder;
    }

}
