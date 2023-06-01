package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart.ExternalTaxAmountDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExternalTaxAmountDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExternalTaxAmountDraft externalTaxAmountDraft = ExternalTaxAmountDraft.builder()
 *             .totalGross(totalGrossBuilder -> totalGrossBuilder)
 *             .taxRate(taxRateBuilder -> taxRateBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ExternalTaxAmountDraftBuilder implements Builder<ExternalTaxAmountDraft> {

    
    
    private com.commercetools.api.models.common.Money totalGross;
    
    
    
    private com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate;

    
    /**
     *  <p>Total gross amount (<code>totalNet</code> + <code>taxPortions</code>) of the Line Item or Custom Line Item.</p>
     * @param builder function to build the totalGross value
     * @return Builder
     */
    
    public ExternalTaxAmountDraftBuilder totalGross(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalGross = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Total gross amount (<code>totalNet</code> + <code>taxPortions</code>) of the Line Item or Custom Line Item.</p>
     * @param builder function to build the totalGross value
     * @return Builder
     */
    
    public ExternalTaxAmountDraftBuilder withTotalGross(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.totalGross = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Total gross amount (<code>totalNet</code> + <code>taxPortions</code>) of the Line Item or Custom Line Item.</p>
     * @param totalGross value to be set
     * @return Builder
     */
    
    public ExternalTaxAmountDraftBuilder totalGross( final com.commercetools.api.models.common.Money totalGross) {
        this.totalGross = totalGross;
        return this;
    }
    
    
    
    
    /**
     *  <p>Tax Rates and subrates of states and countries.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */
    
    public ExternalTaxAmountDraftBuilder taxRate(Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Tax Rates and subrates of states and countries.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */
    
    public ExternalTaxAmountDraftBuilder withTaxRate(Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraft> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Tax Rates and subrates of states and countries.</p>
     * @param taxRate value to be set
     * @return Builder
     */
    
    public ExternalTaxAmountDraftBuilder taxRate( final com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate) {
        this.taxRate = taxRate;
        return this;
    }
    
    

    /**
     *  <p>Total gross amount (<code>totalNet</code> + <code>taxPortions</code>) of the Line Item or Custom Line Item.</p>
     * @return totalGross
     */
    
    
    public com.commercetools.api.models.common.Money getTotalGross(){
        return this.totalGross;
    }
    
    /**
     *  <p>Tax Rates and subrates of states and countries.</p>
     * @return taxRate
     */
    
    
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getTaxRate(){
        return this.taxRate;
    }

    /**
     * builds ExternalTaxAmountDraft with checking for non-null required values
     * @return ExternalTaxAmountDraft
     */
    public ExternalTaxAmountDraft build() {
        Objects.requireNonNull(totalGross, ExternalTaxAmountDraft.class + ": totalGross is missing");
        Objects.requireNonNull(taxRate, ExternalTaxAmountDraft.class + ": taxRate is missing");
        return new ExternalTaxAmountDraftImpl(totalGross, taxRate);
    }
    
    /**
     * builds ExternalTaxAmountDraft without checking for non-null required values
     * @return ExternalTaxAmountDraft
     */
    public ExternalTaxAmountDraft buildUnchecked() {
        return new ExternalTaxAmountDraftImpl(totalGross, taxRate);
    }

    /**
     * factory method for an instance of ExternalTaxAmountDraftBuilder
     * @return builder 
     */
    public static ExternalTaxAmountDraftBuilder of() {
        return new ExternalTaxAmountDraftBuilder();
    }

    /**
     * create builder for ExternalTaxAmountDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExternalTaxAmountDraftBuilder of(final ExternalTaxAmountDraft template) {
        ExternalTaxAmountDraftBuilder builder = new ExternalTaxAmountDraftBuilder();
        builder.totalGross = template.getTotalGross();
        builder.taxRate = template.getTaxRate();
        return builder;
    }

}
