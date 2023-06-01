package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.models.tax_category.TaxRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryAddTaxRateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryAddTaxRateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryAddTaxRateAction taxCategoryAddTaxRateAction = TaxCategoryAddTaxRateAction.builder()
 *             .taxRate(taxRateBuilder -> taxRateBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TaxCategoryAddTaxRateActionBuilder implements Builder<TaxCategoryAddTaxRateAction> {

    
    
    private com.commercetools.api.models.tax_category.TaxRateDraft taxRate;

    
    /**
     *  <p>Value to append to the <code>rates</code> array.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */
    
    public TaxCategoryAddTaxRateActionBuilder taxRate(Function<com.commercetools.api.models.tax_category.TaxRateDraftBuilder, com.commercetools.api.models.tax_category.TaxRateDraftBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to append to the <code>rates</code> array.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */
    
    public TaxCategoryAddTaxRateActionBuilder withTaxRate(Function<com.commercetools.api.models.tax_category.TaxRateDraftBuilder, com.commercetools.api.models.tax_category.TaxRateDraft> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to append to the <code>rates</code> array.</p>
     * @param taxRate value to be set
     * @return Builder
     */
    
    public TaxCategoryAddTaxRateActionBuilder taxRate( final com.commercetools.api.models.tax_category.TaxRateDraft taxRate) {
        this.taxRate = taxRate;
        return this;
    }
    
    

    /**
     *  <p>Value to append to the <code>rates</code> array.</p>
     * @return taxRate
     */
    
    
    public com.commercetools.api.models.tax_category.TaxRateDraft getTaxRate(){
        return this.taxRate;
    }

    /**
     * builds TaxCategoryAddTaxRateAction with checking for non-null required values
     * @return TaxCategoryAddTaxRateAction
     */
    public TaxCategoryAddTaxRateAction build() {
        Objects.requireNonNull(taxRate, TaxCategoryAddTaxRateAction.class + ": taxRate is missing");
        return new TaxCategoryAddTaxRateActionImpl(taxRate);
    }
    
    /**
     * builds TaxCategoryAddTaxRateAction without checking for non-null required values
     * @return TaxCategoryAddTaxRateAction
     */
    public TaxCategoryAddTaxRateAction buildUnchecked() {
        return new TaxCategoryAddTaxRateActionImpl(taxRate);
    }

    /**
     * factory method for an instance of TaxCategoryAddTaxRateActionBuilder
     * @return builder 
     */
    public static TaxCategoryAddTaxRateActionBuilder of() {
        return new TaxCategoryAddTaxRateActionBuilder();
    }

    /**
     * create builder for TaxCategoryAddTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryAddTaxRateActionBuilder of(final TaxCategoryAddTaxRateAction template) {
        TaxCategoryAddTaxRateActionBuilder builder = new TaxCategoryAddTaxRateActionBuilder();
        builder.taxRate = template.getTaxRate();
        return builder;
    }

}
