package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.MoneyType;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.common.Money;
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
 *             .centAmount(0.3)
 *             .currencyCode("{currencyCode}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MoneyBuilder implements Builder<Money> {

    
    @Nullable
    private Integer fractionDigits;
    
    
    
    private Long centAmount;
    
    
    
    private String currencyCode;

    
    /**
     * set the value to the fractionDigits
     * @param fractionDigits value to be set
     * @return Builder
     */
    
    public MoneyBuilder fractionDigits(@Nullable final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
        return this;
    }
    
    
    
    
    /**
     * set the value to the centAmount
     * @param centAmount value to be set
     * @return Builder
     */
    
    public MoneyBuilder centAmount( final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }
    
    
    
    
    /**
     *  <p>The currency code compliant to ISO 4217.</p>
     * @param currencyCode value to be set
     * @return Builder
     */
    
    public MoneyBuilder currencyCode( final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
    
    

    /**
     * value of fractionDigits}
     * @return fractionDigits
     */
    
    @Nullable
    public Integer getFractionDigits(){
        return this.fractionDigits;
    }
    
    /**
     * value of centAmount}
     * @return centAmount
     */
    
    
    public Long getCentAmount(){
        return this.centAmount;
    }
    
    /**
     *  <p>The currency code compliant to ISO 4217.</p>
     * @return currencyCode
     */
    
    
    public String getCurrencyCode(){
        return this.currencyCode;
    }

    /**
     * builds Money with checking for non-null required values
     * @return Money
     */
    public Money build() {
        Objects.requireNonNull(centAmount, Money.class + ": centAmount is missing");
        Objects.requireNonNull(currencyCode, Money.class + ": currencyCode is missing");
        return new MoneyImpl(fractionDigits, centAmount, currencyCode);
    }
    
    /**
     * builds Money without checking for non-null required values
     * @return Money
     */
    public Money buildUnchecked() {
        return new MoneyImpl(fractionDigits, centAmount, currencyCode);
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
        builder.fractionDigits = template.getFractionDigits();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        return builder;
    }

}
