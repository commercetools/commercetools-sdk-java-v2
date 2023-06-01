package com.commercetools.api.models.common;

import com.commercetools.api.models.common.MoneyType;
import com.commercetools.api.models.common.TypedMoneyDraft;
import com.commercetools.api.models.common.CentPrecisionMoneyDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CentPrecisionMoneyDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CentPrecisionMoneyDraft centPrecisionMoneyDraft = CentPrecisionMoneyDraft.builder()
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
public class CentPrecisionMoneyDraftBuilder implements Builder<CentPrecisionMoneyDraft> {

    
    
    private Long centAmount;
    
    
    
    private String currencyCode;
    
    
    @Nullable
    private Integer fractionDigits;

    
    /**
     *  <p>Amount in the smallest indivisible unit of a currency, such as:</p>
     *  <ul>
     *   <li>Cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as <code>500</code>).</li>
     *   <li>The value in the major unit for currencies without minor units, like JPY (5 JPY is specified as <code>5</code>).</li>
     *  </ul>
     * @param centAmount value to be set
     * @return Builder
     */
    
    public CentPrecisionMoneyDraftBuilder centAmount( final Long centAmount) {
        this.centAmount = centAmount;
        return this;
    }
    
    
    
    
    /**
     *  <p>Currency code compliant to ISO 4217.</p>
     * @param currencyCode value to be set
     * @return Builder
     */
    
    public CentPrecisionMoneyDraftBuilder currencyCode( final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
    
    
    
    
    /**
     *  <p>This field is optional for cent precision. If provided, it must be equal to the default number of fraction digits for the specified currency.</p>
     * @param fractionDigits value to be set
     * @return Builder
     */
    
    public CentPrecisionMoneyDraftBuilder fractionDigits(@Nullable final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
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
     *  <p>This field is optional for cent precision. If provided, it must be equal to the default number of fraction digits for the specified currency.</p>
     * @return fractionDigits
     */
    
    @Nullable
    public Integer getFractionDigits(){
        return this.fractionDigits;
    }

    /**
     * builds CentPrecisionMoneyDraft with checking for non-null required values
     * @return CentPrecisionMoneyDraft
     */
    public CentPrecisionMoneyDraft build() {
        Objects.requireNonNull(centAmount, CentPrecisionMoneyDraft.class + ": centAmount is missing");
        Objects.requireNonNull(currencyCode, CentPrecisionMoneyDraft.class + ": currencyCode is missing");
        return new CentPrecisionMoneyDraftImpl(centAmount, currencyCode, fractionDigits);
    }
    
    /**
     * builds CentPrecisionMoneyDraft without checking for non-null required values
     * @return CentPrecisionMoneyDraft
     */
    public CentPrecisionMoneyDraft buildUnchecked() {
        return new CentPrecisionMoneyDraftImpl(centAmount, currencyCode, fractionDigits);
    }

    /**
     * factory method for an instance of CentPrecisionMoneyDraftBuilder
     * @return builder 
     */
    public static CentPrecisionMoneyDraftBuilder of() {
        return new CentPrecisionMoneyDraftBuilder();
    }

    /**
     * create builder for CentPrecisionMoneyDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CentPrecisionMoneyDraftBuilder of(final CentPrecisionMoneyDraft template) {
        CentPrecisionMoneyDraftBuilder builder = new CentPrecisionMoneyDraftBuilder();
        builder.centAmount = template.getCentAmount();
        builder.currencyCode = template.getCurrencyCode();
        builder.fractionDigits = template.getFractionDigits();
        return builder;
    }

}
